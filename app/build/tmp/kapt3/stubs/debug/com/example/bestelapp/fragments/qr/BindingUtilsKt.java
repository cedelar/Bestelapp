package com.example.bestelapp.fragments.qr;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"setInfo", "", "Landroid/widget/TextView;", "item", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class BindingUtilsKt {
    
    /**
     * A [BindingAdapter] to set the message under the Qr code scanner.
     *
     * @param item The used [LiveData] of the amount of Qr codes in the database.
     * @see [Qr] [QrDatabaseDao] [QrFragment] [QrViewModel]
     */
    @androidx.databinding.BindingAdapter(value = {"qrInfo"})
    public static final void setInfo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setInfo, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.lang.Integer> item) {
    }
}