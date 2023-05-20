package com.example.listviewproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapterreal(private var context : Activity, private var userArrayList: ArrayList<Users>) : ArrayAdapter<Users>(context, R.layout.eachrow, userArrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.eachrow, null)

        var image = view.findViewById<CircleImageView>(R.id.profile_image)
        var name = view.findViewById<TextView>(R.id.tvname)
        var number = view.findViewById<TextView>(R.id.tvnumber)
        var time = view.findViewById<TextView>(R.id.tvtime)

        name.text = userArrayList[position].name
        number.text = userArrayList[position].number
        time.text = userArrayList[position].time
        image.setImageResource(userArrayList[position].imageId)


        return view
    }
}


