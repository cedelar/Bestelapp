package com.example.bestelapp.fragments.orderlist;

import java.lang.System;

/**
 * The [ListAdapter] class for a recyclerview displaying [ModelProduct]s
 *
 * @param clickListener A [ProductItemListener] detailing what to do when the buttons on the listitem are clicked.
 * @author Cedric Delaruelle
 * @see [OrderlistFragment] [OrderlistViewModel]
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/bestelapp/fragments/orderlist/ProductAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/bestelapp/data/product/ModelProduct;", "Lcom/example/bestelapp/fragments/orderlist/ProductAdapter$ViewHolder;", "clickListener", "Lcom/example/bestelapp/fragments/orderlist/ProductItemListener;", "(Lcom/example/bestelapp/fragments/orderlist/ProductItemListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.bestelapp.data.product.ModelProduct, com.example.bestelapp.fragments.orderlist.ProductAdapter.ViewHolder> {
    private final com.example.bestelapp.fragments.orderlist.ProductItemListener clickListener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.fragments.orderlist.ProductAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.bestelapp.fragments.orderlist.ProductAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.fragments.orderlist.ProductItemListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/bestelapp/fragments/orderlist/ProductAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/bestelapp/databinding/ListitemOrderlistProductBinding;", "(Lcom/example/bestelapp/databinding/ListitemOrderlistProductBinding;)V", "getBinding", "()Lcom/example/bestelapp/databinding/ListitemOrderlistProductBinding;", "bind", "", "clickListener", "Lcom/example/bestelapp/fragments/orderlist/ProductItemListener;", "item", "Lcom/example/bestelapp/data/product/ModelProduct;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.bestelapp.databinding.ListitemOrderlistProductBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.bestelapp.fragments.orderlist.ProductAdapter.ViewHolder.Companion Companion = null;
        
        /**
         * Function to bind the [ModelProduct] and [ProductItemListener] to a [ViewHolder]
         *
         * @param clickListener A [ProductItemListener] detailing what to do when the buttons in the [ViewHolder] are clicked.
         * @param item The [ModelProduct] to bind to the [ViewHolder]
         */
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.bestelapp.fragments.orderlist.ProductItemListener clickListener, @org.jetbrains.annotations.NotNull()
        com.example.bestelapp.data.product.ModelProduct item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.bestelapp.databinding.ListitemOrderlistProductBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.example.bestelapp.databinding.ListitemOrderlistProductBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bestelapp/fragments/orderlist/ProductAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/example/bestelapp/fragments/orderlist/ProductAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            /**
             * Function creating a new [ViewHolder] with a specified [ViewGroup] as parent, and inflating it.
             *
             * @param parent The specified [ViewGroup]
             * @return The requested [ViewHolder]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.example.bestelapp.fragments.orderlist.ProductAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}