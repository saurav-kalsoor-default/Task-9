package com.getdefault.task9

import androidx.lifecycle.ViewModel

class DisplayViewModel : ViewModel() {

    val personList = ArrayList<Person>()

    init {
        personList.add(Person(1, "Saurav", "saurav@getdefault.in", "8073894026", "41"))
        personList.add(Person(2, "Rishabh", "rishabh@getdefault.in", "9810056269", "25"))
        personList.add(Person(3, "Sahil", "sahil@getdefault.in", "9728901357", "51"))
        personList.add(Person(4, "Varun", "varun@getdefault.in", "8073894026", "83"))
        personList.add(Person(5, "Tarang", "tarang@getdefault.in", "8073894026", "9"))

        personList.sortWith { p1, p2 ->
            when {
                Integer.valueOf(p1.age) > Integer.valueOf(p2.age) -> 1
                else -> -1
            }
        }
    }
}