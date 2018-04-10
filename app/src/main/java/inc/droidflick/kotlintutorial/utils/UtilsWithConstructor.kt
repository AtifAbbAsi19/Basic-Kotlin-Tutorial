package inc.droidflick.kotlintutorial.utils

import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * Created by Atif Arif on 4/10/2018.
 */

class UtilsWithConstructor(private val context: Context) {

    fun startNewActivity(clazz: Class<*>, extras: Bundle) {

        val intent = Intent(context, clazz)
        // To pass any data to next activity
        intent.putExtra("keyIdentifier", extras)
        // start your next activity
        context?.startActivity(intent)

    }


    fun startNewActivity(clazz: Class<*>) {

        val intent = Intent(context, clazz)
        // start your next activity
        context?.startActivity(intent)

    }


}





