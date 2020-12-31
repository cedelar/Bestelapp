package com.example.bestelapp.fragments.confirmation;

import java.lang.System;

/**
 * The Factory class for the [ConfirmationViewModel]
 *
 * @author Cedric Delaruelle
 * @see [ConfirmationFragment]
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\f\u001a\u0002H\r\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bestelapp/fragments/confirmation/ConfirmationViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "orders", "", "Lcom/example/bestelapp/data/datawrapper/Order;", "table", "", "control", "application", "Landroid/app/Application;", "([Lcom/example/bestelapp/data/datawrapper/Order;IILandroid/app/Application;)V", "[Lcom/example/bestelapp/data/datawrapper/Order;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class ConfirmationViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final com.example.bestelapp.data.datawrapper.Order[] orders = null;
    private final int table = 0;
    private final int control = 0;
    private final android.app.Application application = null;
    
    @kotlin.Suppress(names = {"unchecked_cast"})
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public ConfirmationViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.datawrapper.Order[] orders, int table, int control, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}