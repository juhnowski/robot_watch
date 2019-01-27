package com.juhnowski.robotwatch

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

var mPosition_user = -1

class UserHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var name: TextView

    init {
        name = itemView.findViewById(R.id.item_user_text_view)
    }

    fun bind(user:User){
        name.setText(user.name)
    }

}

class User(val id:Int, val name:String, val addr: String)

open class UsersListAdapter(private val context: Context, private val userList: List<User>):
RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val view:View
        view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, position: Int) {
        val user = userList[position]
        val holder: RecyclerView.ViewHolder = p0
        (holder as UserHolder).bind(user)

        if (mPosition_user === position) {
            p0.itemView.setBackgroundResource(R.color.colorText);
        } else {
            p0.itemView.setBackgroundResource(R.color.colorWhite);
        }

        p0.itemView.setOnClickListener(View.OnClickListener {
            mPosition_user = position
            notifyDataSetChanged()
        })
    }



}