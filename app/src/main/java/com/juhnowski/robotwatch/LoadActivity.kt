package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class LoadActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun message(v: View?){
        startActivity(Intent(this, MessageActivity::class.java))
    }
}
