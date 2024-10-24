package com.likobehruz.imtihon11

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.likobehruz.imtihon11.databinding.ActivityMain2Binding
import com.likobehruz.imtihon11.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //val matn =intent.getStringExtra("keytext")
        // binding.btn1.text=matn

        // val anim = AnimationUtils.loadAnimation(this, R.anim.animatsiya)

        // binding.btn1.setOnClickListener {
        //   binding.tv1.startAnimation(anim)
        //}
    }
}
