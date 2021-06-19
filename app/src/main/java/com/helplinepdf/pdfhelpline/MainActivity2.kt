package com.helplinepdf.pdfhelpline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.TextView
import com.pdfview.PDFView

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv1 = findViewById(R.id.tv1) as TextView
        val tv2 = findViewById(R.id.tv2) as TextView
        val tv3 = findViewById(R.id.tv3) as TextView


        tv1.setOnClickListener {

        intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tv2.setOnClickListener {

            intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        tv3.setOnClickListener {

            intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
    }