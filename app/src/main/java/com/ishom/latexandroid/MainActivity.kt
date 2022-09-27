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

        val latex = """
            \begin{align*} \r\n\small (\text {scale factor})^2 &= \textstyle
                \frac {\text {Area of YPQ}}{\text {Area of YWX}} \\\\ \textstyle
                (\frac {5}{2})^2 &= \textstyle \frac {25}{4} \\\\ \small \text
                {Area of}\ \triangle YPQ &: \small \text {Area of}\ \small
                \triangle YWX \\\\ \small 25 &: \small 4 \end{align*}

            \small\overrightarrow {OE}  = \left( {\begin{array}{*{20}{c}}2\\\\0\end{array}} \right)
            \small \left( \begin{matrix}<br>   6 & 12 & 14  \\<br>   5 & 18 & 9  \\<br>\end{matrix} \right)\left( \begin{align}<br>  & 3 \\ <br> & 2 \\ <br> & 4 \\ <br>\end{align} \right)
        """.trimIndent()
        val drawable = JLatexMathDrawable.builder(latex)
            .textSize(20f)
            .align(JLatexMathDrawable.ALIGN_CENTER)
            .background(ColorDrawable(0x4000ff00))
            .build()

        imageview.setImageDrawable(drawable)
    }
}