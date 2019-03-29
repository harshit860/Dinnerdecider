package com.example.harshitgakhar.dinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodlist = arrayListOf("chinese","hamburger","mcdonald","king","pizzahut")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decide.setOnClickListener {
  val random =  Random()
            val randomfood= random.nextInt(foodlist.count())
            Selectedfood.text =foodlist[randomfood]
        }
        addfoodbtn.setOnClickListener {

            val newfood= addfood.text.toString()
            foodlist.add(newfood)
            addfood.text.clear()
        }
    }
}
