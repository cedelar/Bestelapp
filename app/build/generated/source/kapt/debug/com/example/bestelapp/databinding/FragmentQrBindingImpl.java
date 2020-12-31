package com.example.bestelapp.databinding;
import com.example.bestelapp.R;
import com.example.bestelapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentQrBindingImpl extends FragmentQrBinding implements com.example.bestelapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.qr_qr, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentQrBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentQrBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (me.dm7.barcodescanner.zxing.ZXingScannerView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.btnQrBack.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvQrInfo.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.bestelapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.qrViewModel == variableId) {
            setQrViewModel((com.example.bestelapp.fragments.qr.QrViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQrViewModel(@Nullable com.example.bestelapp.fragments.qr.QrViewModel QrViewModel) {
        this.mQrViewModel = QrViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.qrViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeQrViewModelTableNumber((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeQrViewModelTableNumber(androidx.lifecycle.LiveData<java.lang.Integer> QrViewModelTableNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.Integer qrViewModelTableNumberGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> qrViewModelTableNumber = null;
        com.example.bestelapp.fragments.qr.QrViewModel qrViewModel = mQrViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (qrViewModel != null) {
                    // read qrViewModel.tableNumber
                    qrViewModelTableNumber = qrViewModel.getTableNumber();
                }
                updateLiveDataRegistration(0, qrViewModelTableNumber);


                if (qrViewModelTableNumber != null) {
                    // read qrViewModel.tableNumber.getValue()
                    qrViewModelTableNumberGetValue = qrViewModelTableNumber.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnQrBack.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.bestelapp.fragments.qr.BindingUtilsKt.setInfo(this.tvQrInfo, qrViewModelTableNumber);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // qrViewModel != null
        boolean qrViewModelJavaLangObjectNull = false;
        // qrViewModel
        com.example.bestelapp.fragments.qr.QrViewModel qrViewModel = mQrViewModel;



        qrViewModelJavaLangObjectNull = (qrViewModel) != (null);
        if (qrViewModelJavaLangObjectNull) {


            qrViewModel.onBackClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): qrViewModel.tableNumber
        flag 1 (0x2L): qrViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}