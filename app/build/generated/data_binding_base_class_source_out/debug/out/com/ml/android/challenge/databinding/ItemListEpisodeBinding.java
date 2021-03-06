// Generated by data binding compiler. Do not edit!
package com.ml.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ml.android.challenge.R;
import com.ml.android.challenge.domain.Episode;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemListEpisodeBinding extends ViewDataBinding {
  @Bindable
  protected Episode mEpisode;

  protected ItemListEpisodeBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setEpisode(@Nullable Episode episode);

  @Nullable
  public Episode getEpisode() {
    return mEpisode;
  }

  @NonNull
  public static ItemListEpisodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list_episode, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemListEpisodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemListEpisodeBinding>inflateInternal(inflater, R.layout.item_list_episode, root, attachToRoot, component);
  }

  @NonNull
  public static ItemListEpisodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list_episode, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemListEpisodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemListEpisodeBinding>inflateInternal(inflater, R.layout.item_list_episode, null, false, component);
  }

  public static ItemListEpisodeBinding bind(@NonNull View view) {
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
  public static ItemListEpisodeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemListEpisodeBinding)bind(component, view, R.layout.item_list_episode);
  }
}
