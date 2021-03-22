package com.l2hyunwoo.searchrepoapp.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:setSrcFromUrl")
fun ImageView.setSrcFromUrl(url: String?) {
    if (!url.isNullOrEmpty()) {
        Glide.with(this.context)
            .load(url)
            .into(this)
    }
}

@BindingAdapter("app:setStarCount")
fun TextView.setStars(starCount: Int) {
    this.text = starCount.toString()
}