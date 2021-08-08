package com.ml.android.challenge.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001%B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\"H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "character", "Lcom/ml/android/challenge/domain/Character;", "getEpisodeFromCharacterUseCase", "Lcom/ml/android/challenge/usecases/GetEpisodeFromCharacterUseCase;", "getFavoriteCharacterStatusUseCase", "Lcom/ml/android/challenge/usecases/GetFavoriteCharacterStatusUseCase;", "updateFavoriteCharacterStatusUseCase", "Lcom/ml/android/challenge/usecases/UpdateFavoriteCharacterStatusUseCase;", "(Lcom/ml/android/challenge/domain/Character;Lcom/ml/android/challenge/usecases/GetEpisodeFromCharacterUseCase;Lcom/ml/android/challenge/usecases/GetFavoriteCharacterStatusUseCase;Lcom/ml/android/challenge/usecases/UpdateFavoriteCharacterStatusUseCase;)V", "_characterValues", "Landroidx/lifecycle/MutableLiveData;", "_events", "Lcom/ml/android/challenge/presentation/utils/Event;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "_isFavorite", "", "characterValues", "Landroidx/lifecycle/LiveData;", "getCharacterValues", "()Landroidx/lifecycle/LiveData;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "events", "getEvents", "isFavorite", "onCharacterValidation", "", "onCleared", "onUpdateFavoriteCharacterStatus", "requestShowEpisodeList", "episodeUrlList", "", "", "validateFavoriteCharacterStatus", "characterId", "CharacterDetailNavigation", "app_debug"})
public final class CharacterDetailViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<com.ml.android.challenge.domain.Character> _characterValues = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isFavorite = null;
    private final androidx.lifecycle.MutableLiveData<com.ml.android.challenge.presentation.utils.Event<com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation>> _events = null;
    private final com.ml.android.challenge.domain.Character character = null;
    private final com.ml.android.challenge.usecases.GetEpisodeFromCharacterUseCase getEpisodeFromCharacterUseCase = null;
    private final com.ml.android.challenge.usecases.GetFavoriteCharacterStatusUseCase getFavoriteCharacterStatusUseCase = null;
    private final com.ml.android.challenge.usecases.UpdateFavoriteCharacterStatusUseCase updateFavoriteCharacterStatusUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ml.android.challenge.domain.Character> getCharacterValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ml.android.challenge.presentation.utils.Event<com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation>> getEvents() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onCharacterValidation() {
    }
    
    public final void onUpdateFavoriteCharacterStatus() {
    }
    
    private final void validateFavoriteCharacterStatus(java.lang.String characterId) {
    }
    
    private final void requestShowEpisodeList(java.util.List<java.lang.String> episodeUrlList) {
    }
    
    public CharacterDetailViewModel(@org.jetbrains.annotations.Nullable()
    com.ml.android.challenge.domain.Character character, @org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.GetEpisodeFromCharacterUseCase getEpisodeFromCharacterUseCase, @org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.GetFavoriteCharacterStatusUseCase getFavoriteCharacterStatusUseCase, @org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.UpdateFavoriteCharacterStatusUseCase updateFavoriteCharacterStatusUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "", "()V", "CloseActivity", "HideEpisodeListLoading", "ShowEpisodeError", "ShowEpisodeList", "ShowEpisodeListLoading", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$ShowEpisodeError;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$ShowEpisodeList;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$CloseActivity;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$HideEpisodeListLoading;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$ShowEpisodeListLoading;", "app_debug"})
    public static abstract class CharacterDetailNavigation {
        
        private CharacterDetailNavigation() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$ShowEpisodeError;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowEpisodeError extends com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public ShowEpisodeError(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation.ShowEpisodeError copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$ShowEpisodeList;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "episodeList", "", "Lcom/ml/android/challenge/domain/Episode;", "(Ljava/util/List;)V", "getEpisodeList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowEpisodeList extends com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.ml.android.challenge.domain.Episode> episodeList = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.ml.android.challenge.domain.Episode> getEpisodeList() {
                return null;
            }
            
            public ShowEpisodeList(@org.jetbrains.annotations.NotNull()
            java.util.List<com.ml.android.challenge.domain.Episode> episodeList) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.ml.android.challenge.domain.Episode> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation.ShowEpisodeList copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.ml.android.challenge.domain.Episode> episodeList) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$CloseActivity;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "()V", "app_debug"})
        public static final class CloseActivity extends com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation {
            public static final com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation.CloseActivity INSTANCE = null;
            
            private CloseActivity() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$HideEpisodeListLoading;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "()V", "app_debug"})
        public static final class HideEpisodeListLoading extends com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation {
            public static final com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation.HideEpisodeListLoading INSTANCE = null;
            
            private HideEpisodeListLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation$ShowEpisodeListLoading;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "()V", "app_debug"})
        public static final class ShowEpisodeListLoading extends com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation {
            public static final com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation.ShowEpisodeListLoading INSTANCE = null;
            
            private ShowEpisodeListLoading() {
                super();
            }
        }
    }
}