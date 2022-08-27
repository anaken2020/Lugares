package com.lugares_v.ui.lugar

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.lugares_v.R

public class UpdateLugarFragmentDirections private constructor() {
  public companion object {
    public fun actionUpdateLugarFragmentToNavLugar(): NavDirections =
        ActionOnlyNavDirections(R.id.action_updateLugarFragment_to_nav_lugar)
  }
}
