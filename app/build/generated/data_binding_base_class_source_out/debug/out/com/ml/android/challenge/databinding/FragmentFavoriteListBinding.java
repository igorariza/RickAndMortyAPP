// Generated by data binding compiler. Do not edit!
package com.ml.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ml.android.challenge.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFavoriteListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvFavoriteList;

  @NonNull
  public final TextView tvEmptyListMessage;

  protected FragmentFavoriteListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvFavoriteList, TextView tvEmptyListMessage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvFavoriteList = rvFavoriteList;
    this.tvEmptyListMessage = tvEmptyListMessage;
  }

  @NonNull
  public static FragmentFavoriteListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_favorite_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFavoriteListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFavoriteListBinding>inflateInternal(inflater, R.layout.fragment_favorite_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFavoriteListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_favorite_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFavoriteListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFavoriteListBinding>inflateInternal(inflater, R.layout.fragment_favorite_list, null, false, component);
  }

  public static FragmentFavoriteListBinding bind(@NonNull View view) {
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
  public static FragmentFavoriteListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFavoriteListBinding)bind(component, view, R.layout.fragment_favorite_list);
  }
}
