package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class ProcessActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun done(v: View){
        startActivity(Intent(this, DoneActivity::class.java))
    }

}
