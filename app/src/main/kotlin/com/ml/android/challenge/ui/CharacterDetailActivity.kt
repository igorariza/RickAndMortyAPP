package com.ml.android.challenge.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.ml.android.challenge.R
import com.ml.android.challenge.adapters.EpisodeListAdapter
import com.ml.android.challenge.databinding.ActivityCharacterDetailBinding
import com.ml.android.challenge.di.CharacterDetailComponent
import com.ml.android.challenge.di.CharacterDetailModule
import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.imagemanager.bindCircularImageUrl
import com.ml.android.challenge.parcelables.CharacterParcelable
import com.ml.android.challenge.parcelables.toCharacterDomain
import com.ml.android.challenge.presentation.CharacterDetailViewModel
import com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation
import com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation.*
import com.ml.android.challenge.presentation.utils.Event
import com.ml.android.challenge.utils.Constants
import com.ml.android.challenge.utils.app
import com.ml.android.challenge.utils.getViewModel
import com.ml.android.challenge.utils.showLongToast
import kotlinx.android.synthetic.main.activity_character_detail.*

class CharacterDetailActivity: AppCompatActivity() {

    //region Fields

    private lateinit var episodeListAdapter: EpisodeListAdapter
    private lateinit var binding: ActivityCharacterDetailBinding
    private lateinit var characterDetailComponent: CharacterDetailComponent

    private val characterDetailViewModel: CharacterDetailViewModel by lazy {
        getViewModel { characterDetailComponent.characterDetailViewModel }
    }

    //endregion

    //region Override Methods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        characterDetailComponent = app.component.inject(CharacterDetailModule(
            intent.getParcelableExtra<CharacterParcelable>(Constants.EXTRA_CHARACTER)?.toCharacterDomain()
        ))

        binding = DataBindingUtil.setContentView(this, R.layout.activity_character_detail)
        binding.lifecycleOwner = this@CharacterDetailActivity

        episodeListAdapter = EpisodeListAdapter { episode ->
            this@CharacterDetailActivity.showLongToast("Episode -> $episode")
        }
        rvEpisodeList.adapter = episodeListAdapter

        characterFavorite.setOnClickListener { characterDetailViewModel.onUpdateFavoriteCharacterStatus() }

        characterDetailViewModel.characterValues.observe(this, Observer(this::loadCharacter))
        characterDetailViewModel.isFavorite.observe(this, Observer(this::updateFavoriteIcon))
        characterDetailViewModel.events.observe(this, Observer(this::validateEvents))

        characterDetailViewModel.onCharacterValidation()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    //endregion

    //region Private Methods

    private fun loadCharacter(character: Character){
        binding.characterImage.bindCircularImageUrl(
            url = character.image,
            placeholder = R.drawable.ic_camera_alt_black,
            errorPlaceholder = R.drawable.ic_broken_image_black
        )
        binding.characterDataName = character.name
        binding.characterDataStatus = character.status
        binding.characterDataSpecies = character.species
        binding.characterDataGender = character.gender
    }

    private fun updateFavoriteIcon(isFavorite: Boolean?){
        characterFavorite.setImageResource(
            if (isFavorite != null && isFavorite) {
                R.drawable.ic_favorite
            } else {
                R.drawable.ic_favorite_border
            }
        )
    }

    private fun validateEvents(event: Event<CharacterDetailNavigation>?) {
        event?.getContentIfNotHandled()?.let { navigation ->
            when (navigation) {
                is ShowEpisodeError -> navigation.run {
                    this@CharacterDetailActivity.showLongToast("Error**** -> ${error.message}")
                }
                is ShowEpisodeList -> navigation.run {
                    episodeListAdapter.updateData(episodeList)
                }
                CloseActivity -> {
                    this@CharacterDetailActivity.showLongToast(R.string.error_no_character_data)
                    finish()
                }
                HideEpisodeListLoading -> {
                    episodeProgressBar.isVisible = false
                }
                ShowEpisodeListLoading -> {
                    episodeProgressBar.isVisible = true
                }
            }
        }
    }

    //endregion
}
