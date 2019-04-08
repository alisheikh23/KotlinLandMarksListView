package com.maideveloper.kotlinlandmarkslistview

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landMarkNames=ArrayList<String>()
        landMarkNames.add("Pisa")
        landMarkNames.add("Colosseum")
        landMarkNames.add("LondonBridge")
        landMarkNames.add("LondonEye")


        val pisa=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val colosseum=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.colloseum)
        val londonBridge=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.londonbridge)
        val londonEye=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.londoneye)

        var landMarkImages=ArrayList<Bitmap>()
        landMarkImages.add(pisa)
        landMarkImages.add(colosseum)
        landMarkImages.add(londonBridge)
        landMarkImages.add(londonEye)



        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landMarkNames)
        listView.adapter=arrayAdapter

        listView.onItemClickListener=AdapterView.OnItemClickListener { adapterView, view, position, id ->

            var intent= Intent(applicationContext,DetailActivity::class.java)
            intent.putExtra("name",landMarkNames[position])
            startActivity(intent)

            var bitmap=landMarkImages[position]
            var chosenImage=Globals.Chosen
            chosenImage.chosenImage=bitmap
        }

        }
    }

