package com.getdefault.task9

import androidx.lifecycle.ViewModel

class DisplayViewModel : ViewModel() {

    private val _personList = ArrayList<Person>()
    val personList: ArrayList<Person>
        get() = _personList

    init {
        _personList.add(Person(1, "Saurav", "saurav@getdefault.in", "108", "41"))
        _personList.add(Person(2, "Rishabh", "rishabh@getdefault.in", "911", "25"))
        _personList.add(Person(3, "Sahil", "sahil@getdefault.in", "101", "51"))
        _personList.add(Person(4, "Varun", "varun@getdefault.in", "201", "83"))
        _personList.add(Person(5, "Tarang", "tarang@getdefault.in", "842", "9"))

        _personList.sortWith { p1, p2 ->
            when {
                Integer.valueOf(p1.age) > Integer.valueOf(p2.age) -> 1
                else -> -1
            }
        }
    }
}