package com.ishom.latexandroid

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.ishom.jlatexmath.JLatexMathDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageview: ImageView = findViewById(R.id.imageView)

        val latex = "\\frac{\\require{circle}\\enclose{circle}{?}}{2}"
        val drawable = JLatexMathDrawable.builder(latex)
            .textSize(20f)
            .align(JLatexMathDrawable.ALIGN_CENTER)
            .background(ColorDrawable(0x4000ff00))
            .build()

        imageview.setImageDrawable(drawable)
    }
}