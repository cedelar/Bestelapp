package com.example.bestelapp.fragments.orderlist;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class OrderlistFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private OrderlistFragmentArgs() {
  }

  private OrderlistFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static OrderlistFragmentArgs fromBundle(@NonNull Bundle bundle) {
    OrderlistFragmentArgs __result = new OrderlistFragmentArgs();
    bundle.setClassLoader(OrderlistFragmentArgs.class.getClassLoader());
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
    OrderlistFragmentArgs that = (OrderlistFragmentArgs) object;
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
    result = 31 * result + getTable();
    result = 31 * result + getControl();
    return result;
  }

  @Override
  public String toString() {
    return "OrderlistFragmentArgs{"
        + "table=" + getTable()
        + ", control=" + getControl()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(OrderlistFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int table, int control) {
      this.arguments.put("table", table);
      this.arguments.put("control", control);
    }

    @NonNull
    public OrderlistFragmentArgs build() {
      OrderlistFragmentArgs result = new OrderlistFragmentArgs(arguments);
      return result;
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
    public int getTable() {
      return (int) arguments.get("table");
    }

    @SuppressWarnings("unchecked")
    public int getControl() {
      return (int) arguments.get("control");
    }
  }
}
