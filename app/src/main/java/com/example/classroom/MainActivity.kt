package com.example.classroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: ClassRoomListAdapter
    private lateinit var manager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.classroom_list_recycler)
        recyclerView.setHasFixedSize(true)
        manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager
        adapter = ClassRoomListAdapter(
            listOf(
                Classroom("Computer Architecture", "Yamuna Vickraman"),
                Classroom("Compiler Design", "C. Jerin Mahibha"),
                Classroom("Cryptography and network Security", "Dr. M.K. Sandhya"),
                Classroom("Cloud Computing", "Dr. B. Monica Jenefer"),
                Classroom("Operating System", "M.R. Nithya"),
                Classroom("Distributed Systems", "Dr. M.K. Sandhya"),
                Classroom("Software Engineering", "Aarthi Gopinath"),
                Classroom("Artificial Intelligence", "Sumithra"),
                Classroom("Design and Analysis of Algorithm", "Sundari Kamalakkannan"),
                Classroom("Database Management Systems", "R. Venkatesh")
            )
        )
        recyclerView.adapter = adapter
    }
}