package com.example.bestelapp.databinding;
import com.example.bestelapp.R;
import com.example.bestelapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTitleBindingImpl extends FragmentTitleBinding implements com.example.bestelapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title_welcomemessage, 5);
        sViewsWithIds.put(R.id.gl_title_top, 6);
        sViewsWithIds.put(R.id.iv_title_banner, 7);
        sViewsWithIds.put(R.id.gl_title_bottom, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTitleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentTitleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.btnTitleOrder.setTag(null);
        this.btnTitleQr.setTag(null);
        this.btnTitleSponsor.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitleTablenumber.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.bestelapp.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.example.bestelapp.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.example.bestelapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.titleViewModel == variableId) {
            setTitleViewModel((com.example.bestelapp.fragments.title.TitleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitleViewModel(@Nullable com.example.bestelapp.fragments.title.TitleViewModel TitleViewModel) {
        this.mTitleViewModel = TitleViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.titleViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTitleViewModelQrInDatabase((androidx.lifecycle.LiveData<com.example.bestelapp.data.qr.Qr>) object, fieldId);
            case 1 :
                return onChangeTitleViewModelOrderButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTitleViewModelQrInDatabase(androidx.lifecycle.LiveData<com.example.bestelapp.data.qr.Qr> TitleViewModelQrInDatabase, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTitleViewModelOrderButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> TitleViewModelOrderButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        androidx.lifecycle.LiveData<com.example.bestelapp.data.qr.Qr> titleViewModelQrInDatabase = null;
        com.example.bestelapp.fragments.title.TitleViewModel titleViewModel = mTitleViewModel;
        com.example.bestelapp.data.qr.Qr titleViewModelQrInDatabaseGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> titleViewModelOrderButtonVisible = null;
        java.lang.Boolean titleViewModelOrderButtonVisibleGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxTitleViewModelOrderButtonVisibleGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (titleViewModel != null) {
                        // read titleViewModel.qrInDatabase
                        titleViewModelQrInDatabase = titleViewModel.getQrInDatabase();
                    }
                    updateLiveDataRegistration(0, titleViewModelQrInDatabase);


                    if (titleViewModelQrInDatabase != null) {
                        // read titleViewModel.qrInDatabase.getValue()
                        titleViewModelQrInDatabaseGetValue = titleViewModelQrInDatabase.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (titleViewModel != null) {
                        // read titleViewModel.orderButtonVisible
                        titleViewModelOrderButtonVisible = titleViewModel.getOrderButtonVisible();
                    }
                    updateLiveDataRegistration(1, titleViewModelOrderButtonVisible);


                    if (titleViewModelOrderButtonVisible != null) {
                        // read titleViewModel.orderButtonVisible.getValue()
                        titleViewModelOrderButtonVisibleGetValue = titleViewModelOrderButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(titleViewModel.orderButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxTitleViewModelOrderButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(titleViewModelOrderButtonVisibleGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.btnTitleOrder.setEnabled(androidxDatabindingViewDataBindingSafeUnboxTitleViewModelOrderButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnTitleOrder.setOnClickListener(mCallback2);
            this.btnTitleQr.setOnClickListener(mCallback3);
            this.btnTitleSponsor.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.bestelapp.fragments.title.BindingUtilsKt.setTable(this.tvTitleTablenumber, titleViewModelQrInDatabase);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // titleViewModel != null
                boolean titleViewModelJavaLangObjectNull = false;
                // titleViewModel
                com.example.bestelapp.fragments.title.TitleViewModel titleViewModel = mTitleViewModel;



                titleViewModelJavaLangObjectNull = (titleViewModel) != (null);
                if (titleViewModelJavaLangObjectNull) {


                    titleViewModel.onQrClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // titleViewModel != null
                boolean titleViewModelJavaLangObjectNull = false;
                // titleViewModel
                com.example.bestelapp.fragments.title.TitleViewModel titleViewModel = mTitleViewModel;



                titleViewModelJavaLangObjectNull = (titleViewModel) != (null);
                if (titleViewModelJavaLangObjectNull) {


                    titleViewModel.onSponsorClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // titleViewModel != null
                boolean titleViewModelJavaLangObjectNull = false;
                // titleViewModel
                com.example.bestelapp.fragments.title.TitleViewModel titleViewModel = mTitleViewModel;



                titleViewModelJavaLangObjectNull = (titleViewModel) != (null);
                if (titleViewModelJavaLangObjectNull) {


                    titleViewModel.onOrderClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): titleViewModel.qrInDatabase
        flag 1 (0x2L): titleViewModel.orderButtonVisible
        flag 2 (0x3L): titleViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}