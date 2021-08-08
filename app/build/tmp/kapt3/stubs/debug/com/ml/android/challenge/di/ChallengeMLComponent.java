package com.ml.android.challenge.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/ml/android/challenge/di/ChallengeMLComponent;", "", "inject", "Lcom/ml/android/challenge/di/CharacterDetailComponent;", "module", "Lcom/ml/android/challenge/di/CharacterDetailModule;", "Lcom/ml/android/challenge/di/CharacterListComponent;", "Lcom/ml/android/challenge/di/CharacterListModule;", "Lcom/ml/android/challenge/di/FavoriteListComponent;", "Lcom/ml/android/challenge/di/FavoriteListModule;", "Factory", "app_debug"})
@dagger.Component(modules = {com.ml.android.challenge.requestmanager.di.APIModule.class, com.ml.android.challenge.databasemanager.di.DatabaseModule.class, com.ml.android.challenge.data.di.RepositoryModule.class, com.ml.android.challenge.usecases.di.UseCaseModule.class})
@javax.inject.Singleton()
public abstract interface ChallengeMLComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ml.android.challenge.di.CharacterListComponent inject(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.di.CharacterListModule module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ml.android.challenge.di.FavoriteListComponent inject(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.di.FavoriteListModule module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ml.android.challenge.di.CharacterDetailComponent inject(@org.jetbrains.annotations.NotNull()
    com.ml.android.challenge.di.CharacterDetailModule module);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ml/android/challenge/di/ChallengeMLComponent$Factory;", "", "create", "Lcom/ml/android/challenge/di/ChallengeMLComponent;", "app", "Landroid/app/Application;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ml.android.challenge.di.ChallengeMLComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.app.Application app);
    }
}