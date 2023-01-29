package com.example.vix_schoters_fajar_a.bindingadapter

import android.util.Log
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import androidx.navigation.findNavController
import coil.load
import com.example.vix_schoters_fajar_a.R
import com.example.vix_schoters_fajar_a.model.Article
import com.example.vix_schoters_fajar_a.ui.fragment.news.NewsFragmentDirections

class NewsRowBinding {
    companion object {

        @BindingAdapter("onNewsClickListener")
        @JvmStatic
        fun onNewsClickListener(newsRowLayout: ConstraintLayout, article: Article){
            newsRowLayout.setOnClickListener {
                try {
                    val action =
                        NewsFragmentDirections.actionNewsFragmentToDetailsActivity2(article)
                    newsRowLayout.findNavController().navigate(action)
                }catch (e: Exception){
                    Log.d("TAG", "onNewsClickListener: ${e.toString()}")
                }
            }
        }

        @BindingAdapter("loadImageFromUrl")
        @JvmStatic
        fun loadImageFromUrl(imageView: ImageView, imageUrl: String?) {
            imageView.load(imageUrl) {
                crossfade(600)
                error(R.drawable.baseline_image_24)
            }
        }
    }
}