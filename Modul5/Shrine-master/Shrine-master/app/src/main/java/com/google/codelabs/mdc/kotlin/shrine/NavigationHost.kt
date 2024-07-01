package com.google.codelabs.mdc.kotlin.shrine
import androidx.fragment.app.Fragment
interface NavigationHost {
    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
}
