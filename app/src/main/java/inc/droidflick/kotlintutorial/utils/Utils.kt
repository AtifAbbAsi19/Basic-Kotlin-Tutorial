package inc.droidflick.kotlintutorial.utils

import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * Created by Atif Arif on 4/10/2018.
 */


/**
 *
 * @param Object for Singleton pattren
 *
 * @static object
 *
 *
 */


object Utils {

    //https://stackoverflow.com/questions/49745488/how-to-start-a-new-activity-from-a-non-activity-class-in-android-kotlin/49746041#49746041

    fun startNewActivity(context: Context, clazz: Class<*>, extras: Bundle) {

        val intent = Intent(context, clazz)
        // To pass any data to next activity
        intent.putExtra("keyIdentifier", extras)
        // start your next activity
        context.startActivity(intent)

    }


    fun startNewActivity(context: Context, clazz: Class<*>) {

        val intent = Intent(context, clazz)
        // start your next activity
        context.startActivity(intent)

    }

    fun startNewActivityUsingAny(context: Context, clazz: Class<Any>) {

        val intent = Intent(context, clazz)
        // start your next activity
        context.startActivity(intent)

    }




    //Utils.startNewActivity(context,yourclass::class.java as Class<T>)

//    fun startNewActivity(context:Context, cls: Class<T>){
//        context.startActivity(Intent(context,cls))
//    }


//    companion object {
//        fun startActivity(context: Context, clazz: Class<*>) {
//
//            val intent = Intent(context, clazz)
//            // To pass any data to next activity
//            //            intent.putExtra("keyIdentifier", value)
//            // start your next activity
//            context.startActivity(intent)
//
//        }
//    }


}