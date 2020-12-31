package com.example.bestelapp.databinding;
import com.example.bestelapp.R;
import com.example.bestelapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConfirmationBindingImpl extends FragmentConfirmationBinding implements com.example.bestelapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sc_confirmation, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentConfirmationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentConfirmationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.ScrollView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.btnConfirmationConfirm.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvConfirmationProducts.setTag(null);
        this.tvConfirmationTotalamount.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.example.bestelapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.confirmationViewModel == variableId) {
            setConfirmationViewModel((com.example.bestelapp.fragments.confirmation.ConfirmationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConfirmationViewModel(@Nullable com.example.bestelapp.fragments.confirmation.ConfirmationViewModel ConfirmationViewModel) {
        this.mConfirmationViewModel = ConfirmationViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.confirmationViewModel);
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
        com.example.bestelapp.fragments.confirmation.ConfirmationViewModel confirmationViewModel = mConfirmationViewModel;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnConfirmationConfirm.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.bestelapp.fragments.confirmation.BindingUtilsKt.setProducts(this.tvConfirmationProducts, confirmationViewModel);
            com.example.bestelapp.fragments.confirmation.BindingUtilsKt.setTotal(this.tvConfirmationTotalamount, confirmationViewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // confirmationViewModel != null
        boolean confirmationViewModelJavaLangObjectNull = false;
        // confirmationViewModel
        com.example.bestelapp.fragments.confirmation.ConfirmationViewModel confirmationViewModel = mConfirmationViewModel;



        confirmationViewModelJavaLangObjectNull = (confirmationViewModel) != (null);
        if (confirmationViewModelJavaLangObjectNull) {


            confirmationViewModel.onNextClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): confirmationViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}