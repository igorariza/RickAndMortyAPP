package com.ml.android.challenge.usecases

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.given
import com.ml.android.challenge.data.CharacterRepository
import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Location
import com.ml.android.challenge.domain.Origin
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetAllCharactersUseCaseTest {

    @Mock
    private lateinit var characterRepository: CharacterRepository

    private lateinit var getAllCharactersUseCase: GetAllCharactersUseCase

    @Before
    fun setUp(){
        getAllCharactersUseCase = GetAllCharactersUseCase(characterRepository)
    }

    @Test
    fun `get all character use case should return a list of characters given a page number`() {
        //GIVEN
        val expectedResult = listOf(mockedCharacter.copy(id = "1"))
        given(characterRepository.getAllCharacters(any())).willReturn(Single.just(expectedResult))

        //WHEN
        getAllCharactersUseCase.invoke(currentPage = 1)
            .test()
        //THEN
            .assertComplete()
            .assertNoErrors()
            .assertValueCount(1)
            .assertValue(expectedResult)
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
