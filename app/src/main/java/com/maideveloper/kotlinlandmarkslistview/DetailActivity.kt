package com.maideveloper.kotlinlandmarkslistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var name=intent.getStringExtra("name")
        textView.text=name

        var chosenImage=Globals.Chosen
        var image=chosenImage.returnImage()
        imageView.setImageBitmap(image)
    }
}
