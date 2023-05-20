package com.example.listviewproject



import android.os.Bundle

import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList : ArrayList<Users>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        var names = arrayOf("Andrewtate", "Tristan", " Kratos", "Adam","Thor")

        var numbers = arrayOf("3894834789", "23234624624", "734789234", "3782347234", "2342342343")

        var images = intArrayOf(R.drawable.topg,  R.drawable.tristan,  R.drawable.kratos, R.drawable.adam, R.drawable.thor)
        var time = arrayOf("3:35", "3:54", "2:22", "1:55", "6:33")

        userArrayList = ArrayList()

        for(eachindex in names.indices)
        {
            val user = Users(names[eachindex], numbers[eachindex],time[eachindex], images[eachindex])
            userArrayList.add(user)
        }

        val listview  = findViewById<ListView>(R.id.listview)
        listview.isClickable = true
        listview.adapter = MyAdapterreal(this, userArrayList)

        



    }
}