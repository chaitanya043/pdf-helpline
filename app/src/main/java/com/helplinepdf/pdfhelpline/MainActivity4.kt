package com.helplinepdf.pdfhelpline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdfview.PDFView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        findViewById<PDFView>(R.id.pdfview1).fromAsset("Network Hospital List Treating Covid-19.pdf").show()

    }
}