package com.ml.android.challenge.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/ml/android/challenge/adapters/CharacterGridAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ml/android/challenge/adapters/CharacterGridAdapter$CharacterGridViewHolder;", "listener", "Lkotlin/Function1;", "Lcom/ml/android/challenge/domain/Character;", "", "(Lkotlin/jvm/functions/Function1;)V", "characterList", "", "addData", "newData", "", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CharacterGridViewHolder", "app_debug"})
public final class CharacterGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ml.android.challenge.adapters.CharacterGridAdapter.CharacterGridViewHolder> {
    private final java.util.List<com.ml.android.challenge.domain.Character> characterList = null;
    private final kotlin.jvm.functions.Function1<com.ml.android.challenge.domain.Character, kotlin.Unit> listener = null;
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ml.android.challenge.domain.Character> newData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ml.android.challenge.adapters.CharacterGridAdapter.CharacterGridViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.adapters.CharacterGridAdapter.CharacterGridViewHolder holder, int position) {
    }
    
    public CharacterGridAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.android.challenge.domain.Character, kotlin.Unit> listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ml/android/challenge/adapters/CharacterGridAdapter$CharacterGridViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dataBinding", "Lcom/ml/android/challenge/databinding/ItemGridCharacterBinding;", "listener", "Lkotlin/Function1;", "Lcom/ml/android/challenge/domain/Character;", "", "(Lcom/ml/android/challenge/databinding/ItemGridCharacterBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "app_debug"})
    public static final class CharacterGridViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.ml.android.challenge.databinding.ItemGridCharacterBinding dataBinding = null;
        private final kotlin.jvm.functions.Function1<com.ml.android.challenge.domain.Character, kotlin.Unit> listener = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ml.android.challenge.domain.Character item) {
        }
        
        public CharacterGridViewHolder(@org.jetbrains.annotations.NotNull()
        com.ml.android.challenge.databinding.ItemGridCharacterBinding dataBinding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.ml.android.challenge.domain.Character, kotlin.Unit> listener) {
            super(null);
        }
    }
}