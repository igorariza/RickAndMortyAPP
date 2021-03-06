package com.ml.android.challenge.data

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.given
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
class CharacterRepositoryTest {

    @Mock
    private lateinit var localCharacterDataSource: LocalCharacterDataSource

    @Mock
    private lateinit var remoteCharacterDataSource: RemoteCharacterDataSource

    private lateinit var characterRepository: CharacterRepository

    @Before
    fun setUp(){
        characterRepository = CharacterRepository(remoteCharacterDataSource, localCharacterDataSource)
    }

    @Test
    fun `getAllCharacters should return an expected list of characters given a page number`() {
        //GIVEN
        val expectedResult = listOf(mockedCharacter.copy(id = "1"))
        given(remoteCharacterDataSource.getAllCharacters(any())).willReturn(Single.just(expectedResult))

        //WHEN
        characterRepository.getAllCharacters(page = 1)
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
