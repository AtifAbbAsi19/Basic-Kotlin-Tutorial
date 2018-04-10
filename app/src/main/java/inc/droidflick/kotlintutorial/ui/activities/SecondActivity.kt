package inc.droidflick.kotlintutorial.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import inc.droidflick.kotlintutorial.R
import inc.droidflick.kotlintutorial.databinding.ActivityMainBinding
import inc.droidflick.kotlintutorial.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>() {


    override fun setLayout(): Int {
        return R.layout.activity_second
    }


    override fun initViews() {
    }

    override fun initViewsListeners() {

    }

    override fun onFinish() {

    }   //: AppCompatActivity() {



//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
//    }
}
