package com.ml.android.challenge.databinding;
import com.ml.android.challenge.R;
import com.ml.android.challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCharacterDetailBindingImpl extends ActivityCharacterDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.parent, 6);
        sViewsWithIds.put(R.id.characterImage, 7);
        sViewsWithIds.put(R.id.characterStatusLabel, 8);
        sViewsWithIds.put(R.id.characterSpeciesLabel, 9);
        sViewsWithIds.put(R.id.characterGenderLabel, 10);
        sViewsWithIds.put(R.id.parentOrigin, 11);
        sViewsWithIds.put(R.id.parentLocation, 12);
        sViewsWithIds.put(R.id.episodeProgressBar, 13);
        sViewsWithIds.put(R.id.rvEpisodeList, 14);
        sViewsWithIds.put(R.id.characterFavorite, 15);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCharacterDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityCharacterDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[15]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ProgressBar) bindings[13]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            );
        this.characterName.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.characterDataImage == variableId) {
            setCharacterDataImage((java.lang.String) variable);
        }
        else if (BR.characterDataOriginName == variableId) {
            setCharacterDataOriginName((java.lang.String) variable);
        }
        else if (BR.characterDataLocationName == variableId) {
            setCharacterDataLocationName((java.lang.String) variable);
        }
        else if (BR.characterDataStatus == variableId) {
            setCharacterDataStatus((java.lang.String) variable);
        }
        else if (BR.characterDataGender == variableId) {
            setCharacterDataGender((java.lang.String) variable);
        }
        else if (BR.characterDataName == variableId) {
            setCharacterDataName((java.lang.String) variable);
        }
        else if (BR.characterDataSpecies == variableId) {
            setCharacterDataSpecies((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacterDataImage(@Nullable java.lang.String CharacterDataImage) {
        this.mCharacterDataImage = CharacterDataImage;
    }
    public void setCharacterDataOriginName(@Nullable java.lang.String CharacterDataOriginName) {
        this.mCharacterDataOriginName = CharacterDataOriginName;
    }
    public void setCharacterDataLocationName(@Nullable java.lang.String CharacterDataLocationName) {
        this.mCharacterDataLocationName = CharacterDataLocationName;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.characterDataLocationName);
        super.requestRebind();
    }
    public void setCharacterDataStatus(@Nullable java.lang.String CharacterDataStatus) {
        this.mCharacterDataStatus = CharacterDataStatus;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.characterDataStatus);
        super.requestRebind();
    }
    public void setCharacterDataGender(@Nullable java.lang.String CharacterDataGender) {
        this.mCharacterDataGender = CharacterDataGender;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.characterDataGender);
        super.requestRebind();
    }
    public void setCharacterDataName(@Nullable java.lang.String CharacterDataName) {
        this.mCharacterDataName = CharacterDataName;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.characterDataName);
        super.requestRebind();
    }
    public void setCharacterDataSpecies(@Nullable java.lang.String CharacterDataSpecies) {
        this.mCharacterDataSpecies = CharacterDataSpecies;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.characterDataSpecies);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String characterDataLocationName = mCharacterDataLocationName;
        java.lang.String characterDataStatus = mCharacterDataStatus;
        java.lang.String characterDataGender = mCharacterDataGender;
        java.lang.String characterDataName = mCharacterDataName;
        java.lang.String characterDataSpecies = mCharacterDataSpecies;

        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.characterName, characterDataName);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, characterDataStatus);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, characterDataSpecies);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, characterDataGender);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, characterDataLocationName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): characterDataImage
        flag 1 (0x2L): characterDataOriginName
        flag 2 (0x3L): characterDataLocationName
        flag 3 (0x4L): characterDataStatus
        flag 4 (0x5L): characterDataGender
        flag 5 (0x6L): characterDataName
        flag 6 (0x7L): characterDataSpecies
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}