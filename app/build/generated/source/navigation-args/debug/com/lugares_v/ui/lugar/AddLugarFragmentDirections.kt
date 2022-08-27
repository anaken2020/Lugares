package com.lugares_v.ui.lugar

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.lugares_v.R

public class AddLugarFragmentDirections private constructor() {
  public companion object {
    public fun actionAddLugarFragmentToNavLugar(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addLugarFragment_to_nav_lugar)
  }
}
