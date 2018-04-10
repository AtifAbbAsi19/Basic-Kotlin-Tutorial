package inc.droidflick.kotlintutorial.utils

import android.content.Context
import android.content.Intent

/**
 * Created by Atif Arif on 4/10/2018.
 */


object Utils {

     fun startNewActivity(context: Context, clazz: Class<*>) {

            val intent = Intent(context, clazz)
// To pass any data to next activity
//            intent.putExtra("keyIdentifier", value)
// start your next activity
            context.startActivity(intent)

        }


}