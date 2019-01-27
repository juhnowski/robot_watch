package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import android.widget.TextView

class MessageActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun process(v: View?){
        startActivity(Intent(this, ProcessActivity::class.java))
    }

    public fun users(v:View?){
        startActivity(Intent(this, UserActivity::class.java))
    }

    override fun onResume() {
        super.onResume()
        val user = findViewById<TextView>(R.id.textUser)
        if(mPosition_user == -1){
            user.text = "Кому..."
        } else {
            user.text =Storage.USERS.get(mPosition_user).name
        }
    }
}
