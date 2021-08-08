package com.ml.android.challenge;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ml.android.challenge.databinding.ActivityCharacterDetailBindingImpl;
import com.ml.android.challenge.databinding.FragmentCharacterListBindingImpl;
import com.ml.android.challenge.databinding.FragmentFavoriteListBindingImpl;
import com.ml.android.challenge.databinding.ItemGridCharacterBindingImpl;
import com.ml.android.challenge.databinding.ItemGridFavoriteCharacterBindingImpl;
import com.ml.android.challenge.databinding.ItemListEpisodeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCHARACTERDETAIL = 1;

  private static final int LAYOUT_FRAGMENTCHARACTERLIST = 2;

  private static final int LAYOUT_FRAGMENTFAVORITELIST = 3;

  private static final int LAYOUT_ITEMGRIDCHARACTER = 4;

  private static final int LAYOUT_ITEMGRIDFAVORITECHARACTER = 5;

  private static final int LAYOUT_ITEMLISTEPISODE = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ml.android.challenge.R.layout.activity_character_detail, LAYOUT_ACTIVITYCHARACTERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ml.android.challenge.R.layout.fragment_character_list, LAYOUT_FRAGMENTCHARACTERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ml.android.challenge.R.layout.fragment_favorite_list, LAYOUT_FRAGMENTFAVORITELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ml.android.challenge.R.layout.item_grid_character, LAYOUT_ITEMGRIDCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ml.android.challenge.R.layout.item_grid_favorite_character, LAYOUT_ITEMGRIDFAVORITECHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ml.android.challenge.R.layout.item_list_episode, LAYOUT_ITEMLISTEPISODE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCHARACTERDETAIL: {
          if ("layout/activity_character_detail_0".equals(tag)) {
            return new ActivityCharacterDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_character_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERLIST: {
          if ("layout/fragment_character_list_0".equals(tag)) {
            return new FragmentCharacterListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITELIST: {
          if ("layout/fragment_favorite_list_0".equals(tag)) {
            return new FragmentFavoriteListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGRIDCHARACTER: {
          if ("layout/item_grid_character_0".equals(tag)) {
            return new ItemGridCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_grid_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGRIDFAVORITECHARACTER: {
          if ("layout/item_grid_favorite_character_0".equals(tag)) {
            return new ItemGridFavoriteCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_grid_favorite_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTEPISODE: {
          if ("layout/item_list_episode_0".equals(tag)) {
            return new ItemListEpisodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_episode is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "character");
      sKeys.put(2, "characterDataGender");
      sKeys.put(3, "characterDataImage");
      sKeys.put(4, "characterDataLocationName");
      sKeys.put(5, "characterDataName");
      sKeys.put(6, "characterDataOriginName");
      sKeys.put(7, "characterDataSpecies");
      sKeys.put(8, "characterDataStatus");
      sKeys.put(9, "episode");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_character_detail_0", com.ml.android.challenge.R.layout.activity_character_detail);
      sKeys.put("layout/fragment_character_list_0", com.ml.android.challenge.R.layout.fragment_character_list);
      sKeys.put("layout/fragment_favorite_list_0", com.ml.android.challenge.R.layout.fragment_favorite_list);
      sKeys.put("layout/item_grid_character_0", com.ml.android.challenge.R.layout.item_grid_character);
      sKeys.put("layout/item_grid_favorite_character_0", com.ml.android.challenge.R.layout.item_grid_favorite_character);
      sKeys.put("layout/item_list_episode_0", com.ml.android.challenge.R.layout.item_list_episode);
    }
  }
}
