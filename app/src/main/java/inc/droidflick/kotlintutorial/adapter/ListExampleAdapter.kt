package inc.droidflick.kotlintutorial.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import inc.droidflick.kotlintutorial.R

/**
 * Created by Muhammad Atif  on 3/8/2018.
 */
class ListExampleAdapter(context: Context) : BaseAdapter() {


    private  val mInflator: LayoutInflater //val is final
    var sList = ArrayList<String>() //init //var can be change


    fun updateAdapter(value: String) {
        this.sList.add(value)

    }

    init {
        this.mInflator = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return sList.size
    }

    override fun getItem(position: Int): Any {
        return sList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val view: View?
        val vh: ListRowHolder
        if (convertView == null) {
            view = this.mInflator.inflate(R.layout.list_row, parent, false)
            vh = ListRowHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as ListRowHolder
        }

        vh.label.text = sList[position]
        return view
    }
}

class ListRowHolder(row: View?) {
    val label: TextView

    init {
        this.label = row?.findViewById<TextView>(R.id.label) as TextView
    }

}