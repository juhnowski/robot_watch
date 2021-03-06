package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class DoneActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun done(v: View){
        startActivity(Intent(this, StatusActivity::class.java))
    }
}
