package com.ml.android.challenge.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ml/android/challenge/presentation/FavoriteListViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllFavoriteCharactersUseCase", "Lcom/ml/android/challenge/usecases/GetAllFavoriteCharactersUseCase;", "(Lcom/ml/android/challenge/usecases/GetAllFavoriteCharactersUseCase;)V", "_events", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ml/android/challenge/presentation/utils/Event;", "Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "events", "Landroidx/lifecycle/LiveData;", "getEvents", "()Landroidx/lifecycle/LiveData;", "favoriteCharacterList", "", "Lcom/ml/android/challenge/domain/Character;", "getFavoriteCharacterList", "onCleared", "", "onFavoriteCharacterList", "FavoriteListNavigation", "app_debug"})
public final class FavoriteListViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<com.ml.android.challenge.presentation.utils.Event<com.ml.android.challenge.presentation.FavoriteListViewModel.FavoriteListNavigation>> _events = null;
    private final com.ml.android.challenge.usecases.GetAllFavoriteCharactersUseCase getAllFavoriteCharactersUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ml.android.challenge.presentation.utils.Event<com.ml.android.challenge.presentation.FavoriteListViewModel.FavoriteListNavigation>> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ml.android.challenge.domain.Character>> getFavoriteCharacterList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onFavoriteCharacterList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ml.android.challenge.domain.Character> favoriteCharacterList) {
    }
    
    public FavoriteListViewModel(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.GetAllFavoriteCharactersUseCase getAllFavoriteCharactersUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation;", "", "()V", "ShowCharacterList", "ShowEmptyListMessage", "Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation$ShowCharacterList;", "Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation$ShowEmptyListMessage;", "app_debug"})
    public static abstract class FavoriteListNavigation {
        
        private FavoriteListNavigation() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation$ShowCharacterList;", "Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation;", "characterList", "", "Lcom/ml/android/challenge/domain/Character;", "(Ljava/util/List;)V", "getCharacterList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowCharacterList extends com.ml.android.challenge.presentation.FavoriteListViewModel.FavoriteListNavigation {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.ml.android.challenge.domain.Character> characterList = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.ml.android.challenge.domain.Character> getCharacterList() {
                return null;
            }
            
            public ShowCharacterList(@org.jetbrains.annotations.NotNull()
            java.util.List<com.ml.android.challenge.domain.Character> characterList) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.ml.android.challenge.domain.Character> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.ml.android.challenge.presentation.FavoriteListViewModel.FavoriteListNavigation.ShowCharacterList copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.ml.android.challenge.domain.Character> characterList) {
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
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation$ShowEmptyListMessage;", "Lcom/ml/android/challenge/presentation/FavoriteListViewModel$FavoriteListNavigation;", "()V", "app_debug"})
        public static final class ShowEmptyListMessage extends com.ml.android.challenge.presentation.FavoriteListViewModel.FavoriteListNavigation {
            public static final com.ml.android.challenge.presentation.FavoriteListViewModel.FavoriteListNavigation.ShowEmptyListMessage INSTANCE = null;
            
            private ShowEmptyListMessage() {
                super();
            }
        }
    }
}