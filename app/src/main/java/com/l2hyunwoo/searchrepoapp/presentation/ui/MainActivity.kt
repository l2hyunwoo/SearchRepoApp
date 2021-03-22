package com.l2hyunwoo.searchrepoapp.presentation.ui

import android.os.Bundle
import com.l2hyunwoo.searchrepoapp.R
import com.l2hyunwoo.searchrepoapp.base.BindingActivity
import com.l2hyunwoo.searchrepoapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}