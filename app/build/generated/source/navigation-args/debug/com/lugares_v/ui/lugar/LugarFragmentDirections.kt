package com.lugares_v.ui.lugar

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.lugares_v.R
import com.lugares_v.model.Lugar
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class LugarFragmentDirections private constructor() {
  private data class ActionNavLugarToUpdateLugarFragment(
    public val lugar: Lugar
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_lugar_to_updateLugarFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Lugar::class.java)) {
          result.putParcelable("lugar", this.lugar as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Lugar::class.java)) {
          result.putSerializable("lugar", this.lugar as Serializable)
        } else {
          throw UnsupportedOperationException(Lugar::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionNavLugarToAddLugarFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_lugar_to_addLugarFragment)

    public fun actionNavLugarToUpdateLugarFragment(lugar: Lugar): NavDirections =
        ActionNavLugarToUpdateLugarFragment(lugar)
  }
}
