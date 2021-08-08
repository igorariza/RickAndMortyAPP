package com.ml.android.challenge.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.verify
import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Location
import com.ml.android.challenge.domain.Origin
import com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation
import com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation.ShowCharacterList
import com.ml.android.challenge.presentation.utils.Event
import com.ml.android.challenge.usecases.GetAllCharactersUseCase
import io.reactivex.Single
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CharacterListViewModelTest() {

    @get:Rule
    val rule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val rxSchedulerRule = RxSchedulerRule()

    @Mock
    lateinit var getAllCharactersUseCase: GetAllCharactersUseCase

    @Mock
    lateinit var eventObserver: Observer<Event<CharacterListNavigation>>

    private lateinit var characterListViewModel: CharacterListViewModel

    @Before
    fun setUp() {
        characterListViewModel = CharacterListViewModel(
            getAllCharactersUseCase
        )
    }

    @Test
    fun `onGetAllCharacters should return an expected success list of characters`() {
        //GIVEN
        val expectedResult = listOf(mockedCharacter.copy(id = "1"))
        given(getAllCharactersUseCase.invoke(any())).willReturn(Single.just(expectedResult))

        characterListViewModel.events.observeForever(eventObserver)

        //WHEN
        characterListViewModel.onGetAllCharacters()

        //THEN
        verify(eventObserver).onChanged(Event(ShowCharacterList(expectedResult)))
    }
}

val mockedOrigin = Origin(
    "",
    ""
)

val mockedLocation = Location(
    "",
    ""
)

val mockedCharacter = Character(
    "",
    "",
    null,
    "",
    "",
    "",
    mockedOrigin,
    mockedLocation,
    listOf("")
)
