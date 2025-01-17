package com.detmir.recycli.adapters

import android.util.Log
import androidx.recyclerview.widget.DiffUtil

class RecyclerDiffCallback(
    private val old: MutableList<RecyclerItem>,
    private val aNew: MutableList<RecyclerItem>
) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        Log.d("sdasd","sdasd same=${old[oldItemPosition].provideId() == aNew[newItemPosition].provideId()}")
        return old[oldItemPosition].provideId() == aNew[newItemPosition].provideId()
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        Log.d("sdasd","sdasd  contetn same=${old[oldItemPosition].areContentsTheSame(aNew[newItemPosition])}")
        return old[oldItemPosition].areContentsTheSame(aNew[newItemPosition])
    }

    override fun getOldListSize(): Int {
        return old.size
    }

    override fun getNewListSize(): Int {
        return aNew.size
    }
}