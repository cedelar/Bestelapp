package com.example.bestelapp.fragments.confirmation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.bestelapp.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ConfirmationFragmentDirections {
  private ConfirmationFragmentDirections() {
  }

  @NonNull
  public static ActionConfirmationFragmentToOrdersuccesFragment actionConfirmationFragmentToOrdersuccesFragment(
      @NonNull String message) {
    return new ActionConfirmationFragmentToOrdersuccesFragment(message);
  }

  public static class ActionConfirmationFragmentToOrdersuccesFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionConfirmationFragmentToOrdersuccesFragment(@NonNull String message) {
      if (message == null) {
        throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("message", message);
    }

    @NonNull
    public ActionConfirmationFragmentToOrdersuccesFragment setMessage(@NonNull String message) {
      if (message == null) {
        throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("message", message);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("message")) {
        String message = (String) arguments.get("message");
        __result.putString("message", message);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_confirmationFragment_to_ordersuccesFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getMessage() {
      return (String) arguments.get("message");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionConfirmationFragmentToOrdersuccesFragment that = (ActionConfirmationFragmentToOrdersuccesFragment) object;
      if (arguments.containsKey("message") != that.arguments.containsKey("message")) {
        return false;
      }
      if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null) {
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
      result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionConfirmationFragmentToOrdersuccesFragment(actionId=" + getActionId() + "){"
          + "message=" + getMessage()
          + "}";
    }
  }
}
