package com.partokiya.k2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
//regionNav
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    //endregion
}