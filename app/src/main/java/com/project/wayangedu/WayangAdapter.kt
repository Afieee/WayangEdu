package com.project.wayangedu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.wayangedu.databinding.ItemWayangBinding
import com.project.wayangedu.model.Wayang

class WayangAdapter(
    private val listWayang: List<Wayang>,
    private val onClick: (Wayang) -> Unit
) : RecyclerView.Adapter<WayangAdapter.WayangViewHolder>() {

    inner class WayangViewHolder(val binding: ItemWayangBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(wayang: Wayang) {
            binding.ivWayang.setImageResource(wayang.gambar)
            binding.tvNamaWayang.text = wayang.nama
            binding.root.setOnClickListener {
                onClick(wayang)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WayangViewHolder {
        val binding = ItemWayangBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WayangViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WayangViewHolder, position: Int) {
        holder.bind(listWayang[position])
    }

    override fun getItemCount(): Int = listWayang.size
}
