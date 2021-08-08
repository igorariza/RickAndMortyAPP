package com.ml.android.challenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/ml/android/challenge/ui/CharacterDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/ml/android/challenge/databinding/ActivityCharacterDetailBinding;", "characterDetailComponent", "Lcom/ml/android/challenge/di/CharacterDetailComponent;", "characterDetailViewModel", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel;", "getCharacterDetailViewModel", "()Lcom/ml/android/challenge/presentation/CharacterDetailViewModel;", "characterDetailViewModel$delegate", "Lkotlin/Lazy;", "episodeListAdapter", "Lcom/ml/android/challenge/adapters/EpisodeListAdapter;", "loadCharacter", "", "character", "Lcom/ml/android/challenge/domain/Character;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "updateFavoriteIcon", "isFavorite", "(Ljava/lang/Boolean;)V", "validateEvents", "event", "Lcom/ml/android/challenge/presentation/utils/Event;", "Lcom/ml/android/challenge/presentation/CharacterDetailViewModel$CharacterDetailNavigation;", "app_debug"})
public final class CharacterDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.ml.android.challenge.adapters.EpisodeListAdapter episodeListAdapter;
    private com.ml.android.challenge.databinding.ActivityCharacterDetailBinding binding;
    private com.ml.android.challenge.di.CharacterDetailComponent characterDetailComponent;
    private final kotlin.Lazy characterDetailViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ml.android.challenge.presentation.CharacterDetailViewModel getCharacterDetailViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void loadCharacter(com.ml.android.challenge.domain.Character character) {
    }
    
    private final void updateFavoriteIcon(java.lang.Boolean isFavorite) {
    }
    
    private final void validateEvents(com.ml.android.challenge.presentation.utils.Event<? extends com.ml.android.challenge.presentation.CharacterDetailViewModel.CharacterDetailNavigation> event) {
    }
    
    public CharacterDetailActivity() {
        super();
    }
}