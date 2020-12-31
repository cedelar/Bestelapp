package com.example.bestelapp.fragments.orderlist;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.bestelapp.R;
import com.example.bestelapp.data.datawrapper.Order;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class OrderlistFragmentDirections {
  private OrderlistFragmentDirections() {
  }

  @NonNull
  public static ActionOrderlistFragmentToConfirmationFragment actionOrderlistFragmentToConfirmationFragment(
      @NonNull Order[] orders, int table, int control) {
    return new ActionOrderlistFragmentToConfirmationFragment(orders, table, control);
  }

  public static class ActionOrderlistFragmentToConfirmationFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionOrderlistFragmentToConfirmationFragment(@NonNull Order[] orders, int table,
        int control) {
      if (orders == null) {
        throw new IllegalArgumentException("Argument \"orders\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orders", orders);
      this.arguments.put("table", table);
      this.arguments.put("control", control);
    }

    @NonNull
    public ActionOrderlistFragmentToConfirmationFragment setOrders(@NonNull Order[] orders) {
      if (orders == null) {
        throw new IllegalArgumentException("Argument \"orders\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orders", orders);
      return this;
    }

    @NonNull
    public ActionOrderlistFragmentToConfirmationFragment setTable(int table) {
      this.arguments.put("table", table);
      return this;
    }

    @NonNull
    public ActionOrderlistFragmentToConfirmationFragment setControl(int control) {
      this.arguments.put("control", control);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_orderlistFragment_to_confirmationFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionOrderlistFragmentToConfirmationFragment that = (ActionOrderlistFragmentToConfirmationFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionOrderlistFragmentToConfirmationFragment(actionId=" + getActionId() + "){"
          + "orders=" + getOrders()
          + ", table=" + getTable()
          + ", control=" + getControl()
          + "}";
    }
  }
}
