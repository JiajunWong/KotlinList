package com.sopherwang.kotlinlist

/**
 * Created by Jiajun Wang on 5/23/17.
 * Copyright (c) 2017. All rights reserved.
 */
class DummyData {
    fun createData() : ArrayList<Message> {
        val list = ArrayList<Message>()
        val m1 = Message("jiajun", "Hi")
        val m2 = Message("ad", "dafadsfad")
        val m3 = Message("cc", "Hadsfasdfi")
        list.add(m1)
        list.add(m2)
        list.add(m3)
        return list
    }
}