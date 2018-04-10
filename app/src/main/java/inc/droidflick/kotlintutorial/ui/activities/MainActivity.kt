package inc.droidflick.kotlintutorial.ui.activities


import android.content.Intent
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.ListView
import android.widget.Toast
import inc.droidflick.kotlintutorial.R
import inc.droidflick.kotlintutorial.adapter.ListExampleAdapter
import inc.droidflick.kotlintutorial.adapter.RecyclerAdapterExampleWithInterface
import inc.droidflick.kotlintutorial.adapter.RecyclerExampleAdapter
import kotlinx.android.synthetic.main.activity_main.*
import inc.droidflick.kotlintutorial.databinding.ActivityMainBinding
import inc.droidflick.kotlintutorial.model.User
import inc.droidflick.kotlintutorial.ui.interfaces.MeraOnClickListener
import inc.droidflick.kotlintutorial.utils.Utils


/*
* //, View.OnClickListener //Implements(,) // extends(:)
* */

class MainActivity : BaseActivity<ActivityMainBinding>() {

    /*
        //private var  number:Int //Error
        //var are mutable(Read and Write)
        */
    private var counter: Int = 0

    /*
    // val are immutable(Read only)
    //if not null then set empty string
    */
    private val testString: String? = ""


    /*
    * // val are immutable(Read only)
    * */
    private lateinit var value: String

    private lateinit var listView: ListView

    private lateinit var recyclerView: RecyclerView


    lateinit var listExampleAdapter: ListExampleAdapter

    lateinit var recyclerExampleAdapter: RecyclerExampleAdapter

    lateinit var recyclerAdapterExampleWithInterface: RecyclerAdapterExampleWithInterface


    private lateinit var userArrayList: ArrayList<User>

    /*

    private lateinit var listView as ListView
    private lateinit var textViewDisplayMessage: TextView
    private lateinit var editTextView: EditText  //lateinit is for nullability.!
    private lateinit var clickMeButton: Button;

    */

    /*
    * val property is similar to final property in Java. You are allowed to assign it a value only
    * for one time. When you try to reassign it with a value for second time you will get a
    * compilation error. Whereas var property is mutable which you are free to reassign it when you
    * wish and for any times you want.
    *
    * */


    /*
    *
    * where should I use var and where val ?

      use var where value is changing frequently. For example while getting location of android device

      var integerVariable : Int? = null
      use val where there is no change in value in whole class. For example you want set textview or button's text programmatically.


        var is as a general variable

        We can initialize later by using lateinit modifier

        [lateinit also use for global variable we can not use it for local variable]

        value can be changed or reassign but not in global scope


      val stringVariables : String = "Button's Constant or final Text"

      val use to declare final variable. Characteristics of val variables

       1) Must be initialized
        2)value can not be changed or reassign
    *
    *
    * */


    private val recyclerViewString: String? = "recyclerView"
    private val listViewString: String? = "listView"


    private var check: Boolean = false


    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    override fun onFinish() {
    }


    /*
    *
    *
    * private lateinit var textViewDisplayMessage: TextView
      private lateinit var editTextView: EditText  //lateinit is for nullability.!
      private lateinit var clickMeButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Kotlin", "HelloWorld")

    }

    lateinit var listExampleAdapter: ListExampleAdapter

     */

    override fun initViews() {


        /*

        ways to initialize  Views

        displayView.setText("")
        textViewDisplayMessage = findViewById<TextView>(R.id.displayView)
        textViewDisplayMessage = findViewById(R.id.displayView) as TextView //Error.!
        textViewDisplayMessage = findViewById(R.id.displayView)

       textViewDisplayMessage = view?.findViewById<TextView>(R.id.displayView) as TextView

        editTextView = findViewById(R.id.ediText)

        clickMeButton = findViewById(R.id.btnClickMe)

        Log.d("Kotlin", "initViews()")

        listView = findViewById(R.id.listView)


        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)
        listView.adapter = adapter

        listView = findViewById<ListView>(R.id.listView) //as ListView

        */

        listView = findViewById<ListView>(R.id.listView)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


//       listViewString
        showViews(recyclerViewString!!)

        Log.d("Kotlin", "initViews()")

    }

    override fun initViewsListeners() {


        btnClickMe.setOnClickListener(object : MeraOnClickListener, View.OnClickListener {
            override fun onClick(view: View) {

//                displayView.setText(ediText.text.toString())
//
//                if (ediText.text.toString().length > 0) {
//
//                    value = ediText.text.toString()
//
//                    if (check) {
//
//                        listExampleAdapter.updateAdapter(value)
//                    } else {
//
//                        var user: User
//
////                        if (counter == 0) {
////                            if (userArrayList == null) {
////                                userArrayList = ArrayList<User>()
////                            }
////                            userArrayList.clear()
////                        }
//
//                        counter++;
//
//                        user = User(counter, value)
//
//                        //userArrayList.add(user)
//
////                    recyclerExampleAdapter.remove()
//
//                        recyclerExampleAdapter.insert(user)
//                        //recyclerExampleAdapter.updateAdapter(userArrayList)
//                    }
//
//
//                }


                Utils.startNewActivity(this@MainActivity, SecondActivity::class.java)

//                Utils.startNewActivity(view.context, SecondActivity::class.java)




                /**
                 * @param throws Exception
                 *
                 * Utils.startNewActivityUsingAny(view.context, SecondActivity::class.java.javaClass)
                 *
                 */





                Log.d("Kotlin", "Mera Click")
            }

        })


        /*
        btnClickMe.setOnClickListener({


            displayView.setText(ediText.text.toString())

            if (ediText.text.toString().length > 0) {

                value = ediText.text.toString()

                if (check) {

                    listExampleAdapter.updateAdapter(value)
                } else {

                    var user: User

                    if (counter == 0) {
                        userArrayList.clear()
                    }

                    counter++;

                    user = User(counter, value)

                    //userArrayList.add(user)

                    recyclerExampleAdapter.remove()

                 //   recyclerExampleAdapter.insert(user)
                    //recyclerExampleAdapter.updateAdapter(userArrayList)
                }


            }
            Log.d("Kotlin", "Click")
        })

        */

        Log.d("Kotlin", "initViewsListeners()")

    }


    fun showViews(viewName: String) {

        when (viewName) { //switch(viewName)
            recyclerViewString -> showRecyclerView()
            listViewString -> showListView()

        }


    }

    fun showRecyclerView() {

        listView.visibility = View.GONE
        recyclerView.visibility = View.VISIBLE
        val mLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = mLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerExampleAdapter = RecyclerExampleAdapter(this, ArrayList<User>())
        recyclerView.adapter = recyclerExampleAdapter
        //loadUserData()

    }

    fun showListView() {
        listView.visibility = View.VISIBLE
        recyclerView.visibility = View.GONE
        listView.visibility = View.VISIBLE
        listExampleAdapter = ListExampleAdapter(this)
        listView.adapter = listExampleAdapter
    }


    fun loadUserData() {

        var user: User

        userArrayList = ArrayList<User>()

        user = User(1, "name 1")
        userArrayList.add(user)

        user = User(2, "name 2")
        userArrayList.add(user)

        user = User(3, "name 3")
        userArrayList.add(user)

        user = User(4, "name 4")
        userArrayList.add(user)

        user = User(5, "name 5")
        userArrayList.add(user)

        recyclerExampleAdapter.updateAdapter(userArrayList)

    }


}


