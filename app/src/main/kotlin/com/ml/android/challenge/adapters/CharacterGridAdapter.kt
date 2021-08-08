package com.ml.android.challenge.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ml.android.challenge.R
import com.ml.android.challenge.databinding.ItemGridCharacterBinding
import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.imagemanager.bindImageUrl
import com.ml.android.challenge.utils.bindingInflate
import kotlinx.android.synthetic.main.item_grid_character.view.*


class CharacterGridAdapter(
    private val listener: (Character) -> Unit
): RecyclerView.Adapter<CharacterGridAdapter.CharacterGridViewHolder>() {

    private val characterList: MutableList<Character> = mutableListOf()

    fun addData(newData: List<Character>) {
        characterList.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CharacterGridViewHolder(
            parent.bindingInflate(R.layout.item_grid_character, false),
            listener
        )

    override fun getItemCount() = characterList.size

    override fun getItemId(position: Int): Long = characterList[position].id.toLong()

    override fun onBindViewHolder(holder: CharacterGridViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    class CharacterGridViewHolder(
        private val dataBinding: ItemGridCharacterBinding,
        private val listener: (Character) -> Unit
    ): RecyclerView.ViewHolder(dataBinding.root) {

        //region Public Methods
        fun bind(item: Character){
            dataBinding.character = item
            itemView.character_image.bindImageUrl(
                url = item.image,
                placeholder = R.drawable.ic_camera_alt_black,
                errorPlaceholder = R.drawable.ic_broken_image_black
            )
            itemView.setOnClickListener { listener(item) }
        }

    }
}
