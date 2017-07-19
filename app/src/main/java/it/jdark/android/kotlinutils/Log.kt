package it.jdark.android.kotlinutils

import android.content.Context
import android.util.Log

/**
 * Created on 18/07/17.
 * @Autor jDark
 */

class Log {

    fun Context.debugLog(TAG: String, message: String) = Log.d(TAG, message)
    fun Context.errorLog(TAG: String, message: String) = Log.e(TAG, message)
    fun Context.infoLog(TAG: String, message: String) = Log.i(TAG, message)
    fun Context.warningLog(TAG: String, message: String) = Log.w(TAG, message)
    fun Context.verboseLog(TAG: String, message: String) = Log.v(TAG, message)
}
