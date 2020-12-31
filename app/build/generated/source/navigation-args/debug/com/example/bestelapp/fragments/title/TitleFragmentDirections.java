package com.example.bestelapp.fragments.title;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.bestelapp.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TitleFragmentDirections {
  private TitleFragmentDirections() {
  }

  @NonNull
  public static ActionTitleFragmentToOrderlistFragment actionTitleFragmentToOrderlistFragment(
      int table, int control) {
    return new ActionTitleFragmentToOrderlistFragment(table, control);
  }

  @NonNull
  public static NavDirections actionTitleFragmentToQrFragment() {
    return new ActionOnlyNavDirections(R.id.action_titleFragment_to_qrFragment);
  }

  @NonNull
  public static NavDirections actionTitleFragmentToSponsorFragment() {
    return new ActionOnlyNavDirections(R.id.action_titleFragment_to_sponsorFragment);
  }

  public static class ActionTitleFragmentToOrderlistFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTitleFragmentToOrderlistFragment(int table, int control) {
      this.arguments.put("table", table);
      this.arguments.put("control", control);
    }

    @NonNull
    public ActionTitleFragmentToOrderlistFragment setTable(int table) {
      this.arguments.put("table", table);
      return this;
    }

    @NonNull
    public ActionTitleFragmentToOrderlistFragment setControl(int control) {
      this.arguments.put("control", control);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_titleFragment_to_orderlistFragment;
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
      ActionTitleFragmentToOrderlistFragment that = (ActionTitleFragmentToOrderlistFragment) object;
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
      result = 31 * result + getTable();
      result = 31 * result + getControl();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTitleFragmentToOrderlistFragment(actionId=" + getActionId() + "){"
          + "table=" + getTable()
          + ", control=" + getControl()
          + "}";
    }
  }
}
