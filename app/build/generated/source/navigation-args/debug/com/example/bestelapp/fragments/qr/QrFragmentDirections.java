package com.example.bestelapp.fragments.qr;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.bestelapp.R;

public class QrFragmentDirections {
  private QrFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionQrFragmentToTitleFragment() {
    return new ActionOnlyNavDirections(R.id.action_qrFragment_to_titleFragment);
  }
}
