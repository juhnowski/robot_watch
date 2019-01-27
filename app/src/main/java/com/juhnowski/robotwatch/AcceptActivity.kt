package com.juhnowski.robotwatch

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.util.Log
import android.view.View
import android.widget.ImageView

class AcceptActivity : WearableActivity() {
    val TAG = "AcceptActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accept)

        // Enables Always-on
        setAmbientEnabled()
    }

    public fun accept(v: View?){
        startActivity(Intent(this, StatusActivity::class.java))
    }

    public fun star(v: View?){
        val tag = v?.tag.toString().toInt()
        setStars(tag)
    }


    fun setStars(i:Int?) {

        var stars: ArrayList<ImageView> = ArrayList<ImageView>()
        stars.add(findViewById<ImageView>(R.id.imgStar1))
        stars.add(findViewById<ImageView>(R.id.imgStar2))
        stars.add(findViewById<ImageView>(R.id.imgStar3))
        stars.add(findViewById<ImageView>(R.id.imgStar4))
        stars.add(findViewById<ImageView>(R.id.imgStar5))

        for (s in stars){
            val index = s.tag.toString().toInt()
            if (index <= i!!) {
                Log.d(TAG, "on index = $index")
                s.setImageResource(android.R.drawable.btn_star_big_on);

            } else {
                Log.d(TAG, "off index = $index")
                s.setImageResource(android.R.drawable.btn_star_big_off);
            }
        }

    }
}
