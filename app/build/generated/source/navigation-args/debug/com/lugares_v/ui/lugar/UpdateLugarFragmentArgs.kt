package com.lugares_v.ui.lugar

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.lugares_v.model.Lugar
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class UpdateLugarFragmentArgs(
  public val lugar: Lugar
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Lugar::class.java)) {
      result.set("lugar", this.lugar as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Lugar::class.java)) {
      result.set("lugar", this.lugar as Serializable)
    } else {
      throw UnsupportedOperationException(Lugar::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): UpdateLugarFragmentArgs {
      bundle.setClassLoader(UpdateLugarFragmentArgs::class.java.classLoader)
      val __lugar : Lugar?
      if (bundle.containsKey("lugar")) {
        if (Parcelable::class.java.isAssignableFrom(Lugar::class.java) ||
            Serializable::class.java.isAssignableFrom(Lugar::class.java)) {
          __lugar = bundle.get("lugar") as Lugar?
        } else {
          throw UnsupportedOperationException(Lugar::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__lugar == null) {
          throw IllegalArgumentException("Argument \"lugar\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"lugar\" is missing and does not have an android:defaultValue")
      }
      return UpdateLugarFragmentArgs(__lugar)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): UpdateLugarFragmentArgs {
      val __lugar : Lugar?
      if (savedStateHandle.contains("lugar")) {
        if (Parcelable::class.java.isAssignableFrom(Lugar::class.java) ||
            Serializable::class.java.isAssignableFrom(Lugar::class.java)) {
          __lugar = savedStateHandle.get<Lugar?>("lugar")
        } else {
          throw UnsupportedOperationException(Lugar::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__lugar == null) {
          throw IllegalArgumentException("Argument \"lugar\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"lugar\" is missing and does not have an android:defaultValue")
      }
      return UpdateLugarFragmentArgs(__lugar)
    }
  }
}
