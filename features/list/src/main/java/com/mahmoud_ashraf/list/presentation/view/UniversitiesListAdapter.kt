package com.mahmoud_ashraf.list.presentation.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.list.databinding.ItemUniversityBinding

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesListAdapter(private val onItemClicked : (University)-> Unit) : RecyclerView.Adapter<UniversitiesListAdapter.UniversityViewHolder>() {

  val data: MutableList<University> = mutableListOf()


  override fun onBindViewHolder(holder: UniversityViewHolder, position: Int) {
    holder.bind(data[position])
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder =
    parent.context
      .let { ItemUniversityBinding.inflate(LayoutInflater.from(it), parent, false) }
      .let(::UniversityViewHolder)

  override fun getItemCount(): Int = data.size

  fun submitList(list: List<University>) {
    this.data.clear()
    this.data.addAll(list)
    notifyDataSetChanged()
  }


  inner class UniversityViewHolder(
    private val binding: ItemUniversityBinding,
  ) : RecyclerView.ViewHolder(binding.root) {
    fun bind(university: University) {
      with(binding) {
        binding.root.setOnClickListener { onItemClicked(university) }
        tvName.text = university.name
        tvState.text = university.stateProvince
      }
    }
  }
}