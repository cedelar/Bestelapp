package com.example.bestelapp.fragments.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.bestelapp.data.datawrapper.Order;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class ConfirmationFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ConfirmationFragmentArgs() {
  }

  private ConfirmationFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ConfirmationFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ConfirmationFragmentArgs __result = new ConfirmationFragmentArgs();
    bundle.setClassLoader(ConfirmationFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("orders")) {
      Order[] orders;
      Parcelable[] __array = bundle.getParcelableArray("orders");
      if (__array != null) {
        orders = new Order[__array.length];
        System.arraycopy(__array, 0, orders, 0, __array.length);
      } else {
        orders = null;
      }
      if (orders == null) {
        throw new IllegalArgumentException("Argument \"orders\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("orders", orders);
    } else {
      throw new IllegalArgumentException("Required argument \"orders\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("table")) {
      int table;
      table = bundle.getInt("table");
      __result.arguments.put("table", table);
    } else {
      throw new IllegalArgumentException("Required argument \"table\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("control")) {
      int control;
      control = bundle.getInt("control");
      __result.arguments.put("control", control);
    } else {
      throw new IllegalArgumentException("Required argument \"control\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Order[] getOrders() {
    return (Order[]) arguments.get("orders");
  }

  @SuppressWarnings("unchecked")
  public int getTable() {
    return (int) arguments.get("table");
  }

  @SuppressWarnings("unchecked")
  public int getControl() {
    return (int) arguments.get("control");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("orders")) {
      Order[] orders = (Order[]) arguments.get("orders");
      __result.putParcelableArray("orders", orders);
    }
    if (arguments.containsKey("table")) {
      int table = (int) arguments.get("table");
      __result.putInt("table", table);
    }
    if (arguments.containsKey("control")) {
      int control = (int) arguments.get("control");
      __result.putInt("control", control);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ConfirmationFragmentArgs that = (ConfirmationFragmentArgs) object;
    if (arguments.containsKey("orders") != that.arguments.containsKey("orders")) {
      return false;
    }
    if (getOrders() != null ? !getOrders().equals(that.getOrders()) : that.getOrders() != null) {
      return false;
    }
    if (arguments.containsKey("table") != that.arguments.containsKey("table")) {
      return false;
    }
    if (getTable() != that.getTable()) {
      return false;
    }
    if (arguments.containsKey("control") != that.arguments.containsKey("control")) {
      return false;
    }
    if (getControl() != that.getControl()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + java.util.Arrays.hashCode(getOrders());
    result = 31 * result + getTable();
    result = 31 * result + getControl();
    return result;
  }

  @Override
  public String toString() {
    return "ConfirmationFragmentArgs{"
        + "orders=" + getOrders()
        + ", table=" + getTable()
        + ", control=" + getControl()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ConfirmationFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Order[] orders, int table, int control) {
      if (orders == null) {
        throw new IllegalArgumentException("Argument \"orders\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orders", orders);
      this.arguments.put("table", table);
      this.arguments.put("control", control);
    }

    @NonNull
    public ConfirmationFragmentArgs build() {
      ConfirmationFragmentArgs result = new ConfirmationFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setOrders(@NonNull Order[] orders) {
      if (orders == null) {
        throw new IllegalArgumentException("Argument \"orders\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orders", orders);
      return this;
    }

    @NonNull
    public Builder setTable(int table) {
      this.arguments.put("table", table);
      return this;
    }

    @NonNull
    public Builder setControl(int control) {
      this.arguments.put("control", control);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Order[] getOrders() {
      return (Order[]) arguments.get("orders");
    }

    @SuppressWarnings("unchecked")
    public int getTable() {
      return (int) arguments.get("table");
    }

    @SuppressWarnings("unchecked")
    public int getControl() {
      return (int) arguments.get("control");
    }
  }
}
