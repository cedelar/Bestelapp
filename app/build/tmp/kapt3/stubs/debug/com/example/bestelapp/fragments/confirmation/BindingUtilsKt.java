package com.example.bestelapp.fragments.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"setProducts", "", "Landroid/widget/TextView;", "item", "Lcom/example/bestelapp/fragments/confirmation/ConfirmationViewModel;", "setTotal", "app_debug"})
public final class BindingUtilsKt {
    
    /**
     * A [BindingAdapter] to set the ordered products and amounts to be confirmed.
     *
     * @param item The used [ConfirmationViewModel]
     * @see [ModelProduct] [ConfirmationFragment]
     */
    @androidx.databinding.BindingAdapter(value = {"confirmationProducts"})
    public static final void setProducts(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setProducts, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.fragments.confirmation.ConfirmationViewModel item) {
    }
    
    /**
     * A [BindingAdapter] to set the total price of the products to be confirmed.
     *
     * @param item The used [ConfirmationViewModel]
     * @see [ModelProduct] [ConfirmationFragment]
     */
    @androidx.databinding.BindingAdapter(value = {"confirmationTotal"})
    public static final void setTotal(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTotal, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.fragments.confirmation.ConfirmationViewModel item) {
    }
}