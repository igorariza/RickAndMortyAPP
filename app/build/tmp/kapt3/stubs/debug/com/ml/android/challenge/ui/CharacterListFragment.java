package com.ml.android.challenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0002\'(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010#\u001a\u00020\u00152\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/ml/android/challenge/ui/CharacterListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "characterGridAdapter", "Lcom/ml/android/challenge/adapters/CharacterGridAdapter;", "characterListComponent", "Lcom/ml/android/challenge/di/CharacterListComponent;", "characterListViewModel", "Lcom/ml/android/challenge/presentation/CharacterListViewModel;", "getCharacterListViewModel", "()Lcom/ml/android/challenge/presentation/CharacterListViewModel;", "characterListViewModel$delegate", "Lkotlin/Lazy;", "listener", "Lcom/ml/android/challenge/ui/CharacterListFragment$OnCharacterListFragmentListener;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getOnScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollListener$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "validateEvents", "event", "Lcom/ml/android/challenge/presentation/utils/Event;", "Lcom/ml/android/challenge/presentation/CharacterListViewModel$CharacterListNavigation;", "Companion", "OnCharacterListFragmentListener", "app_debug"})
public final class CharacterListFragment extends androidx.fragment.app.Fragment {
    private com.ml.android.challenge.adapters.CharacterGridAdapter characterGridAdapter;
    private com.ml.android.challenge.ui.CharacterListFragment.OnCharacterListFragmentListener listener;
    private com.ml.android.challenge.di.CharacterListComponent characterListComponent;
    private final kotlin.Lazy characterListViewModel$delegate = null;
    private final kotlin.Lazy onScrollListener$delegate = null;
    public static final com.ml.android.challenge.ui.CharacterListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ml.android.challenge.presentation.CharacterListViewModel getCharacterListViewModel() {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener getOnScrollListener() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void validateEvents(com.ml.android.challenge.presentation.utils.Event<? extends com.ml.android.challenge.presentation.CharacterListViewModel.CharacterListNavigation> event) {
    }
    
    public CharacterListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ml/android/challenge/ui/CharacterListFragment$OnCharacterListFragmentListener;", "", "openCharacterDetail", "", "character", "Lcom/ml/android/challenge/domain/Character;", "app_debug"})
    public static abstract interface OnCharacterListFragmentListener {
        
        public abstract void openCharacterDetail(@org.jetbrains.annotations.NotNull()
        com.ml.android.challenge.domain.Character character);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ml/android/challenge/ui/CharacterListFragment$Companion;", "", "()V", "newInstance", "Lcom/ml/android/challenge/ui/CharacterListFragment;", "args", "Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ml.android.challenge.ui.CharacterListFragment newInstance(@org.jetbrains.annotations.Nullable()
        android.os.Bundle args) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}