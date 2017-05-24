package com.sopherwang.kotlinlist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_message.view.*

class ListAdapter(context: Context) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    private val mContext = context
    private val mMessages = ArrayList<Message>()

    fun setMessages(messages: ArrayList<Message>) {
        mMessages.clear()
        mMessages.addAll(messages)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item_message, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val message = mMessages[position]
        holder?.viewName?.text = message.name
        holder?.viewMessage?.text = message.message
    }

    override fun getItemCount(): Int {
        return mMessages.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var viewName = view.name;
        var viewMessage = view.message;
    }
}
