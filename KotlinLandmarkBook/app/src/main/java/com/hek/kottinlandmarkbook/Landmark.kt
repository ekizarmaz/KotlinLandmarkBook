package com.hek.kottinlandmarkbook

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_landmark.*

class Landmark : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landmark)

        val intent = intent
        val name = intent.getStringExtra("name")
        textView.text = name

        val chosen = Globals.Chosen
        val selectedImage = chosen.returnImage()

        imageView.setImageBitmap(selectedImage)


    }
}
