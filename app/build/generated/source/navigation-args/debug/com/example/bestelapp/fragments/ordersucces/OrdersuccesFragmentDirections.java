package com.example.bestelapp.fragments.ordersucces;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.bestelapp.R;

public class OrdersuccesFragmentDirections {
  private OrdersuccesFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOrdersuccesFragmentToTitleFragment() {
    return new ActionOnlyNavDirections(R.id.action_ordersuccesFragment_to_titleFragment);
  }
}
