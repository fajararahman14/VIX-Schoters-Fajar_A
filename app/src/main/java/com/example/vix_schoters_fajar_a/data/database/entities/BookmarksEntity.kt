package com.example.vix_schoters_fajar_a.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.vix_schoters_fajar_a.model.Article
import com.example.vix_schoters_fajar_a.util.Constant.BOOKMARKS_NEWS_TABLE

@Entity(tableName = BOOKMARKS_NEWS_TABLE)
class BookmarksEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var article: Article
)