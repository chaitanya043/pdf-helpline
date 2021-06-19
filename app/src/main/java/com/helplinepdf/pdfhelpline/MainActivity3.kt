package com.helplinepdf.pdfhelpline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<PDFView>(R.id.pdfview2).fromAsset("coronvavirushelplinenumber.pdf").show()

    }
}