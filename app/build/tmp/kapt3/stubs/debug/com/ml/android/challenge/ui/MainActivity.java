package com.ml.android.challenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ml/android/challenge/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "Lcom/ml/android/challenge/ui/CharacterListFragment$OnCharacterListFragmentListener;", "Lcom/ml/android/challenge/ui/FavoriteListFragment$OnFavoriteListFragmentListener;", "()V", "homeStatePageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "openCharacterDetail", "character", "Lcom/ml/android/challenge/domain/Character;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener, com.ml.android.challenge.ui.CharacterListFragment.OnCharacterListFragmentListener, com.ml.android.challenge.ui.FavoriteListFragment.OnFavoriteListFragmentListener {
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback homeStatePageChangeCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void openCharacterDetail(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.domain.Character character) {
    }
    
    public MainActivity() {
        super();
    }
}