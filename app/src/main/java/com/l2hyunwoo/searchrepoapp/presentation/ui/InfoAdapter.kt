package com.l2hyunwoo.searchrepoapp.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.l2hyunwoo.searchrepoapp.R
import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User
import com.l2hyunwoo.searchrepoapp.databinding.ItemRepoBinding
import com.l2hyunwoo.searchrepoapp.databinding.ItemUserBinding

class InfoAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var user: User = User("", "")
    private var repoList: List<Repo> = listOf()

    class UserViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.user = user
        }
    }

    class RepoViewHolder(private val binding: ItemRepoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(repo: Repo) {
            binding.repo = repo
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> USER
            else -> REPO
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            USER -> {
                val binding: ItemUserBinding =
                    DataBindingUtil.inflate(layoutInflater, R.layout.item_user, parent, false)
                UserViewHolder(binding)
            }
            else -> {
                val binding: ItemRepoBinding =
                    DataBindingUtil.inflate(layoutInflater, R.layout.item_repo, parent, false)
                RepoViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is UserViewHolder -> holder.bind(user)
            is RepoViewHolder -> holder.bind(repoList[position - 1])
        }
    }

    override fun getItemCount(): Int = repoList.size + 1

    fun replaceUser(user: User) {
        this.user = user
        notifyDataSetChanged()
    }

    fun replaceList(newList: List<Repo>) {
        repoList = newList.toList()
        notifyDataSetChanged()
    }

    companion object {
        private const val USER = 1
        private const val REPO = 2
    }
}