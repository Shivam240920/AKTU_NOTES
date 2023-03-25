package com.example.aktunotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val branchrecyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        branchrecyclerview.layoutManager = LinearLayoutManager(this)

        val branch = ArrayList<branch>()
        branch.add(branch("Civil Engineering",R.color.yellow,R.drawable.civilicon))
        branch.add(branch("Mechanical" , R.color.red,R.drawable.mechanicalicon))
        branch.add(branch("Electronics" , R.color.purple_200,R.drawable.elctronicsicon))
        branch.add(branch("Computer Science & IT" , R.color.teal_700,R.drawable.softwareengineericon))
        branch.add(branch("Electrical",R.color.purple_500,R.drawable.electricalicon))
        branch.add(branch("Civil Engineering",R.color.yellow,R.drawable.civilicon))
        branch.add(branch("Mechanical" , R.color.red,R.drawable.mechanicalicon))
        branch.add(branch("Electronics" , R.color.purple_200,R.drawable.elctronicsicon))
        branch.add(branch("Computer Science & IT" , R.color.teal_700,R.drawable.softwareengineericon))
        branch.add(branch("Electrical",R.color.purple_500,R.drawable.electricalicon))

        val branchadapter = branchAdapter(branch)
        branchrecyclerview.adapter = branchadapter
    }
}