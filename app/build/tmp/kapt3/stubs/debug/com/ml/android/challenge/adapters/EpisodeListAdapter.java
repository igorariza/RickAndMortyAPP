package com.ml.android.challenge.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ml/android/challenge/adapters/EpisodeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ml/android/challenge/adapters/EpisodeListAdapter$EpisodeListViewHolder;", "listener", "Lkotlin/Function1;", "Lcom/ml/android/challenge/domain/Episode;", "", "(Lkotlin/jvm/functions/Function1;)V", "episodeList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newData", "", "EpisodeListViewHolder", "app_debug"})
public final class EpisodeListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ml.android.challenge.adapters.EpisodeListAdapter.EpisodeListViewHolder> {
    private final java.util.List<com.ml.android.challenge.domain.Episode> episodeList = null;
    private final kotlin.jvm.functions.Function1<com.ml.android.challenge.domain.Episode, kotlin.Unit> listener = null;
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ml.android.challenge.domain.Episode> newData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ml.android.challenge.adapters.EpisodeListAdapter.EpisodeListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.adapters.EpisodeListAdapter.EpisodeListViewHolder holder, int position) {
    }
    
    public EpisodeListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.android.challenge.domain.Episode, kotlin.Unit> listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ml/android/challenge/adapters/EpisodeListAdapter$EpisodeListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dataBinding", "Lcom/ml/android/challenge/databinding/ItemListEpisodeBinding;", "listener", "Lkotlin/Function1;", "Lcom/ml/android/challenge/domain/Episode;", "", "(Lcom/ml/android/challenge/databinding/ItemListEpisodeBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "app_debug"})
    public static final class EpisodeListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.ml.android.challenge.databinding.ItemListEpisodeBinding dataBinding = null;
        private final kotlin.jvm.functions.Function1<com.ml.android.challenge.domain.Episode, kotlin.Unit> listener = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ml.android.challenge.domain.Episode item) {
        }
        
        public EpisodeListViewHolder(@org.jetbrains.annotations.NotNull()
        com.ml.android.challenge.databinding.ItemListEpisodeBinding dataBinding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.ml.android.challenge.domain.Episode, kotlin.Unit> listener) {
            super(null);
        }
    }
}