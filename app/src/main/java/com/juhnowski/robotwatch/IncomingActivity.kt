package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class IncomingActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.incoming)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun accept(v:View?){
        startActivity(Intent(this, AcceptActivity::class.java))
    }
}
