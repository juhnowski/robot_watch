package com.juhnowski.robotwatch

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.wearable.activity.WearableActivity
import android.util.Log
import android.view.View

class UserActivity : WearableActivity() {

    val TAG = "UserActivity"
    private var recycler: RecyclerView? = null
    private var adapter: UsersListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)

        // Enables Always-on
        setAmbientEnabled()

        recycler = findViewById<View>(R.id.recycler_view_users) as RecyclerView?
        adapter = UsersListAdapter(this, Storage.USERS)
        recycler!!.layoutManager = LinearLayoutManager(this)
        recycler!!.adapter = adapter

        Log.d(TAG,"size = ${Storage.USERS.size}")
    }
}
