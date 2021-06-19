package com.helplinepdf.pdfhelpline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<PDFView>(R.id.pdfview).fromAsset("medicallist.pdf").show()

    }
}