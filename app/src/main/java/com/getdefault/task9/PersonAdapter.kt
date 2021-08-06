package com.getdefault.task9

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.getdefault.task9.databinding.PersonItemBinding

class PersonAdapter : ListAdapter<Person, PersonAdapter.PersonViewHolder>(DiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = getItem(position)
        holder.bind(person)
    }

    class PersonViewHolder(private val binding : PersonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(person : Person){
            binding.model = person
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): PersonViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = PersonItemBinding.inflate(layoutInflater, parent, false)
                return PersonViewHolder(binding)
            }
        }
    }

}

class DiffCallBack : DiffUtil.ItemCallback<Person>(){
    override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
        return oldItem.id == newItem.id
    }

}