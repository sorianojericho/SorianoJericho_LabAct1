package com.example.labactivity1

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.labactivity1.R.layout.activity_main

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
    }

    fun showUstPlaces(v: View) {
        val i = Intent(this, Main2Activity::class.java)
        startActivity(i)
    }

    fun showCatalog(view: View) {
        for (i in 1..10)
            Log.d("Greetings", "Good Day!: $i")
    }
}
