package com.example.bestelapp.databinding;
import com.example.bestelapp.R;
import com.example.bestelapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListitemOrderlistProductBindingImpl extends ListitemOrderlistProductBinding implements com.example.bestelapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListitemOrderlistProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListitemOrderlistProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.btnOrderlistProductDownbutton.setTag(null);
        this.btnOrderlistProductUpbutton.setTag(null);
        this.glOrderlistProductProductimage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOrderlistProductAmount.setTag(null);
        this.tvOrderlistProductProductdescription.setTag(null);
        this.tvOrderlistProductProductname.setTag(null);
        this.tvOrderlistProductProductprice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.bestelapp.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.example.bestelapp.generated.callback.OnClickListener(this, 2);
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
        if (BR.clickListener == variableId) {
            setClickListener((com.example.bestelapp.fragments.orderlist.ProductItemListener) variable);
        }
        else if (BR.product == variableId) {
            setProduct((com.example.bestelapp.data.product.ModelProduct) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable com.example.bestelapp.fragments.orderlist.ProductItemListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setProduct(@Nullable com.example.bestelapp.data.product.ModelProduct Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.product);
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
        com.example.bestelapp.fragments.orderlist.ProductItemListener clickListener = mClickListener;
        com.example.bestelapp.data.product.ModelProduct product = mProduct;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnOrderlistProductDownbutton.setOnClickListener(mCallback8);
            this.btnOrderlistProductUpbutton.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.bestelapp.fragments.orderlist.BindingUtilsKt.setProductImage(this.glOrderlistProductProductimage, product);
            com.example.bestelapp.fragments.orderlist.BindingUtilsKt.setProductAmount(this.tvOrderlistProductAmount, product);
            com.example.bestelapp.fragments.orderlist.BindingUtilsKt.setProductDescription(this.tvOrderlistProductProductdescription, product);
            com.example.bestelapp.fragments.orderlist.BindingUtilsKt.setProductName(this.tvOrderlistProductProductname, product);
            com.example.bestelapp.fragments.orderlist.BindingUtilsKt.setProductPrice(this.tvOrderlistProductProductprice, product);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // product
                com.example.bestelapp.data.product.ModelProduct product = mProduct;
                // clickListener
                com.example.bestelapp.fragments.orderlist.ProductItemListener clickListener = mClickListener;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {



                    clickListener.onUpClick(product);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // product
                com.example.bestelapp.data.product.ModelProduct product = mProduct;
                // clickListener
                com.example.bestelapp.fragments.orderlist.ProductItemListener clickListener = mClickListener;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {



                    clickListener.onDownClick(product);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): product
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}