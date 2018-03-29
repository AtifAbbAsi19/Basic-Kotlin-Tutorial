package inc.droidflick.kotlintutorial.ui.activities


import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


/**
 * Created by Muhammad Atif  on 3/7/2018.
 */

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {


//    http://javasampleapproach.com/android/kotlin-listview-example-android
//    https://android.jlelse.eu/android-paging-library-make-your-lists-as-efficient-as-possible-literally-in-just-an-hour-5abf797585bd
//    https://medium.com/@anvith/paging-android-architecture-components-3134212b83bb

    private lateinit var mViewDataBinding: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayout())

        mViewDataBinding = DataBindingUtil.setContentView(this, setLayout())


    }


    abstract fun setLayout(): Int
    override fun onStart() {
        super.onStart()
        initViews()
        initViewsListeners()
    }


    abstract fun initViews()

    abstract fun initViewsListeners()

    abstract fun onFinish()

    override fun onDestroy() {
        System.runFinalization() //The java.lang.System.runFinalization()
        // method runs the finalization methods of any objects pending finalization.
        System.gc() //garbage collector to remove object
        onFinish() //on finish method
        super.onDestroy()
    }
}