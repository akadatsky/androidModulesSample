package com.akadatsky.mudulessample

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yalantis.ucrop.UCrop
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cropImage(view: View) {
        val uri = Uri.parse(BuildConfig.SERVER_URL)
        val uCrop = UCrop.of(uri, Uri.fromFile(File(cacheDir, "sample.jpg")))
        uCrop.start(this)
    }

}