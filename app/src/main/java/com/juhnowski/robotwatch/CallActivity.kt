package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class CallActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun run(v: View?){
        startActivity(Intent(this, RunActivity::class.java))
    }
}
