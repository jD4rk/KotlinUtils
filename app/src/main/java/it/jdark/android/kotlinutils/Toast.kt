package it.jdark.android.kotlinutils

import android.content.Context
import android.widget.Toast

/**
 * Created on 18/07/17.
 * @Autor jDark
 */
class Toast {

    fun Context.shortToast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    fun Context.longToast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
