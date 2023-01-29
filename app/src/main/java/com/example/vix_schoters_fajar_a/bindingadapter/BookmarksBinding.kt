package com.example.vix_schoters_fajar_a.bindingadapter

import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.vix_schoters_fajar_a.adapter.BookmarksAdapter
import com.example.vix_schoters_fajar_a.data.database.entities.BookmarksEntity

class BookmarksBinding {
    companion object {
        @BindingAdapter("setVisibility", "setData", requireAll = false)
        @JvmStatic
        fun setVisibility(view: View, bookmarksEntity: List<BookmarksEntity>?, mAdapter: BookmarksAdapter?) {
            when (view) {
                is RecyclerView -> {
                    val dataCheck = bookmarksEntity.isNullOrEmpty()
                    view.isInvisible = dataCheck
                    if(!dataCheck){
                        bookmarksEntity?.let { mAdapter?.setData(it) }
                    }
                }
                else -> view.isVisible = bookmarksEntity.isNullOrEmpty()
            }
        }
    }
}