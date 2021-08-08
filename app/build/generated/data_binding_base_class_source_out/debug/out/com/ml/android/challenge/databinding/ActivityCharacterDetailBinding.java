// Generated by data binding compiler. Do not edit!
package com.ml.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ml.android.challenge.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCharacterDetailBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton characterFavorite;

  @NonNull
  public final TextView characterGenderLabel;

  @NonNull
  public final ImageView characterImage;

  @NonNull
  public final TextView characterName;

  @NonNull
  public final TextView characterSpeciesLabel;

  @NonNull
  public final TextView characterStatusLabel;

  @NonNull
  public final ProgressBar episodeProgressBar;

  @NonNull
  public final NestedScrollView parent;

  @NonNull
  public final CardView parentLocation;

  @NonNull
  public final CardView parentOrigin;

  @NonNull
  public final RecyclerView rvEpisodeList;

  @Bindable
  protected String mCharacterDataImage;

  @Bindable
  protected String mCharacterDataName;

  @Bindable
  protected String mCharacterDataStatus;

  @Bindable
  protected String mCharacterDataSpecies;

  @Bindable
  protected String mCharacterDataGender;

  @Bindable
  protected String mCharacterDataOriginName;

  @Bindable
  protected String mCharacterDataLocationName;

  protected ActivityCharacterDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FloatingActionButton characterFavorite, TextView characterGenderLabel,
      ImageView characterImage, TextView characterName, TextView characterSpeciesLabel,
      TextView characterStatusLabel, ProgressBar episodeProgressBar, NestedScrollView parent,
      CardView parentLocation, CardView parentOrigin, RecyclerView rvEpisodeList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.characterFavorite = characterFavorite;
    this.characterGenderLabel = characterGenderLabel;
    this.characterImage = characterImage;
    this.characterName = characterName;
    this.characterSpeciesLabel = characterSpeciesLabel;
    this.characterStatusLabel = characterStatusLabel;
    this.episodeProgressBar = episodeProgressBar;
    this.parent = parent;
    this.parentLocation = parentLocation;
    this.parentOrigin = parentOrigin;
    this.rvEpisodeList = rvEpisodeList;
  }

  public abstract void setCharacterDataImage(@Nullable String characterDataImage);

  @Nullable
  public String getCharacterDataImage() {
    return mCharacterDataImage;
  }

  public abstract void setCharacterDataName(@Nullable String characterDataName);

  @Nullable
  public String getCharacterDataName() {
    return mCharacterDataName;
  }

  public abstract void setCharacterDataStatus(@Nullable String characterDataStatus);

  @Nullable
  public String getCharacterDataStatus() {
    return mCharacterDataStatus;
  }

  public abstract void setCharacterDataSpecies(@Nullable String characterDataSpecies);

  @Nullable
  public String getCharacterDataSpecies() {
    return mCharacterDataSpecies;
  }

  public abstract void setCharacterDataGender(@Nullable String characterDataGender);

  @Nullable
  public String getCharacterDataGender() {
    return mCharacterDataGender;
  }

  public abstract void setCharacterDataOriginName(@Nullable String characterDataOriginName);

  @Nullable
  public String getCharacterDataOriginName() {
    return mCharacterDataOriginName;
  }

  public abstract void setCharacterDataLocationName(@Nullable String characterDataLocationName);

  @Nullable
  public String getCharacterDataLocationName() {
    return mCharacterDataLocationName;
  }

  @NonNull
  public static ActivityCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_character_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCharacterDetailBinding>inflateInternal(inflater, R.layout.activity_character_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCharacterDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_character_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCharacterDetailBinding>inflateInternal(inflater, R.layout.activity_character_detail, null, false, component);
  }

  public static ActivityCharacterDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCharacterDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityCharacterDetailBinding)bind(component, view, R.layout.activity_character_detail);
  }
}