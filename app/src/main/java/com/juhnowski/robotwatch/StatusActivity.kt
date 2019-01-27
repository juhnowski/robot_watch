package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class StatusActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun accept(v: View?){
        startActivity(Intent(this, CallActivity::class.java))
    }
}
