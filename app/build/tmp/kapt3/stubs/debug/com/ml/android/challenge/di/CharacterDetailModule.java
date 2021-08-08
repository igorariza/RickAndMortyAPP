package com.ml.android.challenge.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ml/android/challenge/di/CharacterDetailModule;", "", "character", "Lcom/ml/android/challenge/domain/Character;", "(Lcom/ml/android/challenge/domain/Character;)V", "characterDetailViewModelProvider", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel;", "getEpisodeFromCharacterUseCase", "Lcom/ml/android/challenge/usecases/GetEpisodeFromCharacterUseCase;", "getFavoriteCharacterStatusUseCase", "Lcom/ml/android/challenge/usecases/GetFavoriteCharacterStatusUseCase;", "updateFavoriteCharacterStatusUseCase", "Lcom/ml/android/challenge/usecases/UpdateFavoriteCharacterStatusUseCase;", "app_debug"})
@dagger.Module()
public final class CharacterDetailModule {
    private final com.ml.android.challenge.domain.Character character = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ml.android.challenge.presentation.CharacterDetailViewModel characterDetailViewModelProvider(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.GetEpisodeFromCharacterUseCase getEpisodeFromCharacterUseCase, @org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.GetFavoriteCharacterStatusUseCase getFavoriteCharacterStatusUseCase, @org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.UpdateFavoriteCharacterStatusUseCase updateFavoriteCharacterStatusUseCase) {
        return null;
    }
    
    public CharacterDetailModule(@org.jetbrains.annotations.Nullable()
    com.ml.android.challenge.domain.Character character) {
        super();
    }
}