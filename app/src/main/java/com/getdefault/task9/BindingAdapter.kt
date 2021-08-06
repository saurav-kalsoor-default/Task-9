package com.getdefault.task9

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

@BindingAdapter("personData")
fun bindRecyclerview(rv: RecyclerView, list: ArrayList<Person>) {
    val adapter = rv.adapter as PersonAdapter
    adapter.submitList(list)
}

@BindingAdapter("personName")
fun bindName(tv: TextView, name: String) {
    tv.text = "Name : $name"
}

@BindingAdapter("personEmail")
fun bindEmail(tv: TextView, email: String) {
    tv.text = "Email : $email"
}

@BindingAdapter("personPhone")
fun bindPhone(tv: TextView, phone: String) {
    tv.text = "Phone No : $phone"
}

@BindingAdapter("personAge")
fun bindAge(tv: TextView, age: String) {
    tv.text = "Age : $age"
}