package com.ml.android.challenge.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 !2\u00020\u0001:\u0002 !B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\u0006\u0010\u001b\u001a\u00020\u0015J\u001e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\nJ\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllCharactersUseCase", "Lcom/ml/android/challenge/usecases/GetAllCharactersUseCase;", "(Lcom/ml/android/challenge/usecases/GetAllCharactersUseCase;)V", "_events", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ml/android/challenge/presentation/utils/Event;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "currentPage", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "events", "Landroidx/lifecycle/LiveData;", "getEvents", "()Landroidx/lifecycle/LiveData;", "isLastPage", "", "isLoading", "hideLoading", "", "isInFooter", "visibleItemCount", "firstVisibleItemPosition", "totalItemCount", "onCleared", "onGetAllCharacters", "onLoadMoreItems", "onRetryGetAllCharacter", "itemCount", "showLoading", "CharacterListNavigation", "Companion", "app_debug"})
public final class CharacterListViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<com.ml.android.challenge.presentation.utils.Event<com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation>> _events = null;
    private int currentPage = 1;
    private boolean isLastPage = false;
    private boolean isLoading = false;
    private final com.ml.android.challenge.usecases.GetAllCharactersUseCase getAllCharactersUseCase = null;
    private static final int PAGE_SIZE = 20;
    public static final com.ml.android.challenge.presentation.CharacterListViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ml.android.challenge.presentation.utils.Event<com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation>> getEvents() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onLoadMoreItems(int visibleItemCount, int firstVisibleItemPosition, int totalItemCount) {
    }
    
    public final void onRetryGetAllCharacter(int itemCount) {
    }
    
    public final void onGetAllCharacters() {
    }
    
    private final boolean isInFooter(int visibleItemCount, int firstVisibleItemPosition, int totalItemCount) {
        return false;
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    public CharacterListViewModel(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.usecases.GetAllCharactersUseCase getAllCharactersUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "", "()V", "HideLoading", "ShowCharacterError", "ShowCharacterList", "ShowLoading", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$ShowCharacterError;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$ShowCharacterList;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$HideLoading;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$ShowLoading;", "app_debug"})
    public static abstract class CharacterListNavigation {
        
        private CharacterListNavigation() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$ShowCharacterError;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowCharacterError extends com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public ShowCharacterError(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation.ShowCharacterError copy(@org.jetbrains.annotations.NotNull()
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
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$ShowCharacterList;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "characterList", "", "Lcom/ml/android/challenge/domain/Character;", "(Ljava/util/List;)V", "getCharacterList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowCharacterList extends com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation {
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
            public final com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation.ShowCharacterList copy(@org.jetbrains.annotations.NotNull()
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
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$HideLoading;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "()V", "app_debug"})
        public static final class HideLoading extends com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation {
            public static final com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation.HideLoading INSTANCE = null;
            
            private HideLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation$ShowLoading;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "()V", "app_debug"})
        public static final class ShowLoading extends com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation {
            public static final com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation.ShowLoading INSTANCE = null;
            
            private ShowLoading() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ml/android/challenge/presentation/CharacterListViewModel$Companion;", "", "()V", "PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}