package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class RunActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_run)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun load(v: View?){
        startActivity(Intent(this, LoadActivity::class.java))
    }

    //TODO: cncel call
}
