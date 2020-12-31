package com.example.bestelapp.databinding;
import com.example.bestelapp.R;
import com.example.bestelapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderlistBindingImpl extends FragmentOrderlistBinding implements com.example.bestelapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_orderlist_showorders, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderlistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentOrderlistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.btnOrderlistOrder.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.example.bestelapp.generated.callback.OnClickListener(this, 1);
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
        if (BR.orderListViewModel == variableId) {
            setOrderListViewModel((com.example.bestelapp.fragments.orderlist.OrderlistViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderListViewModel(@Nullable com.example.bestelapp.fragments.orderlist.OrderlistViewModel OrderListViewModel) {
        this.mOrderListViewModel = OrderListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.orderListViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOrderListViewModelConfirmButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOrderListViewModelConfirmButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> OrderListViewModelConfirmButtonVisible, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxOrderListViewModelConfirmButtonVisibleGetValue = false;
        java.lang.Boolean orderListViewModelConfirmButtonVisibleGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> orderListViewModelConfirmButtonVisible = null;
        com.example.bestelapp.fragments.orderlist.OrderlistViewModel orderListViewModel = mOrderListViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (orderListViewModel != null) {
                    // read orderListViewModel.confirmButtonVisible
                    orderListViewModelConfirmButtonVisible = orderListViewModel.getConfirmButtonVisible();
                }
                updateLiveDataRegistration(0, orderListViewModelConfirmButtonVisible);


                if (orderListViewModelConfirmButtonVisible != null) {
                    // read orderListViewModel.confirmButtonVisible.getValue()
                    orderListViewModelConfirmButtonVisibleGetValue = orderListViewModelConfirmButtonVisible.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(orderListViewModel.confirmButtonVisible.getValue())
                androidxDatabindingViewDataBindingSafeUnboxOrderListViewModelConfirmButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(orderListViewModelConfirmButtonVisibleGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.btnOrderlistOrder.setEnabled(androidxDatabindingViewDataBindingSafeUnboxOrderListViewModelConfirmButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnOrderlistOrder.setOnClickListener(mCallback10);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // orderListViewModel
        com.example.bestelapp.fragments.orderlist.OrderlistViewModel orderListViewModel = mOrderListViewModel;
        // orderListViewModel != null
        boolean orderListViewModelJavaLangObjectNull = false;



        orderListViewModelJavaLangObjectNull = (orderListViewModel) != (null);
        if (orderListViewModelJavaLangObjectNull) {


            orderListViewModel.onConfirmClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orderListViewModel.confirmButtonVisible
        flag 1 (0x2L): orderListViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}