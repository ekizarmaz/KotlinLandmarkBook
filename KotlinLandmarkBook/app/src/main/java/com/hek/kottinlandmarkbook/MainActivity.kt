package com.hek.kottinlandmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val liste= ArrayList<String>()

        liste.add("Pisa")
        liste.add("Colloseum")
        liste.add("Eiffel")
        liste.add("London Bridge")

        val pisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val colloseum = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.colloseum)
        val eiffel= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eiffel)
        val lb = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.lb)


        val landmarkImages = ArrayList<Bitmap>()

        landmarkImages.add(pisa)
        landmarkImages.add(colloseum)
        landmarkImages.add(eiffel)
        landmarkImages.add(lb)


        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,liste)

        listView.adapter = arrayAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(applicationContext,Landmark::class.java)

            intent.putExtra("name", liste[i])

            val bitmap = landmarkImages[i]

            val chosen = Globals.Chosen
            chosen.chosenImage = bitmap


            startActivity(intent)

        }







    }
}
