package inc.droidflick.kotlintutorial.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import inc.droidflick.kotlintutorial.R
import inc.droidflick.kotlintutorial.model.User

/**
 * Created by Muhammad Atif on 3/8/2018.
 */

class RecyclerExampleAdapter(
        private val context: Context,
        private var list: ArrayList<User>) : RecyclerView.Adapter<RecyclerExampleAdapter.ViewHolder>() {


    fun updateAdapter(list: ArrayList<User>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    fun insert(user:User) {
        this.list.add(user)
        notifyItemInserted(this.list.size-1)

    }

    fun remove() {
        this.list.removeAt(0)
        notifyItemRemoved(0)
    }



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        var user = list[position]

        holder!!.title.setText(user.name)


    }

    //A class may be marked as inner to be able to access members of outer class.
    // Inner classes carry a reference to an object of an outer class:
    //The internal visibility modifier means that the member is visible within the same module
    inner class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {

        internal var title: TextView


        init {
            title = view?.findViewById<TextView>(R.id.label) as TextView
        }


    }


}


