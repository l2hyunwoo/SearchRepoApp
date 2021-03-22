package com.l2hyunwoo.searchrepoapp.presentation.ui

import android.os.Bundle
import androidx.activity.viewModels
import com.l2hyunwoo.searchrepoapp.R
import com.l2hyunwoo.searchrepoapp.base.BindingActivity
import com.l2hyunwoo.searchrepoapp.databinding.ActivityMainBinding
import com.l2hyunwoo.searchrepoapp.presentation.viewmodel.InfoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val infoViewModel: InfoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
    }
}