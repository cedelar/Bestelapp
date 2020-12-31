package com.example.bestelapp.fragments.sponsor;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.bestelapp.R;

public class SponsorFragmentDirections {
  private SponsorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSponsorFragmentToTitleFragment() {
    return new ActionOnlyNavDirections(R.id.action_sponsorFragment_to_titleFragment);
  }
}
