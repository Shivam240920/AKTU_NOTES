package com.example.aktunotes

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class branchAdapter(private var mlist:ArrayList<branch>): RecyclerView.Adapter<branchAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.branchrecyclerview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.branchicon.setImageResource(mlist[position].img)
        holder.branchcontainer.setBackgroundResource(mlist[position].branchcolor)
        holder.branchname.text = mlist[position].branchname

        holder.branchcontainer.setOnClickListener {
            val context = holder.branchcontainer.context
            val intent = Intent(context,Year::class.java)
            intent.putExtra("position","$position")
            context.startActivity(intent)
       }
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var branchname: TextView = itemView.findViewById(R.id.branchname)
        var branchicon = itemView.findViewById<ImageView>(R.id.branchimage)
        var branchcontainer = itemView.findViewById<LinearLayout>(R.id.branchcontainer)
    }
}

