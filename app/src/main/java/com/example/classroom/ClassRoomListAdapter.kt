package com.example.classroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ClassRoomListAdapter(var classroomList:List<Classroom>):RecyclerView.Adapter<ClassRoomListAdapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val classRoomName:TextView
        val classTeacherName:TextView
        init {
            classRoomName=view.findViewById(R.id.classroom_name)
            classTeacherName=view.findViewById(R.id.classTeacher_name)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.classroom_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.classRoomName.text=classroomList[position].className
        holder.classTeacherName.text=classroomList[position].teacher
    }

    override fun getItemCount(): Int {
        return classroomList.size
    }
}