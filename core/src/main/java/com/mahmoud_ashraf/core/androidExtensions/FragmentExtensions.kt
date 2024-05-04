package com.mahmoud_ashraf.core.androidExtensions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mahmoud_ashraf.core.navigator.AddressableFragment

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
var fragmentContainerId : Int = -1
fun AppCompatActivity.replaceFragment(
  addressableFragment: AddressableFragment,
  containerId: Int = fragmentContainerId,
  bundle: Bundle? = null
) {
  val fragment: Fragment = fragmentOf(addressableFragment)
  fragment.arguments = bundle
  supportFragmentManager.beginTransaction()
    .replace(containerId, fragment)
    .commit()
}
private fun <T : Fragment> fragmentOf(addressableFragment: AddressableFragment): T {
  return Class.forName(addressableFragment.className).newInstance() as T
}

fun Fragment.replaceFragment(
  addressableFragment: AddressableFragment,
  containerId: Int = fragmentContainerId,
  bundle: Bundle? = null,
  addToBackStack: Boolean = true
) {
  val fragment: Fragment = fragmentOf(addressableFragment)
  fragment.arguments = bundle
  val ft = this.activity?.supportFragmentManager?.beginTransaction()
    ?.replace(containerId, fragment)
  if (addToBackStack)
    ft?.addToBackStack(addressableFragment.className)?.commit()
  else
    ft?.commit()

}