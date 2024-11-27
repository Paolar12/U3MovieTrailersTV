package com.example.movietrailerstv

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.devexperto.movietrailerstv.R

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}