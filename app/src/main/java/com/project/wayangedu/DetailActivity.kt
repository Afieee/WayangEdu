package com.project.wayangedu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.wayangedu.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("NAMA")
        val deskripsi = intent.getStringExtra("DESKRIPSI")
        val gambar = intent.getIntExtra("GAMBAR", 0)

        binding.tvNamaDetail.text = nama
        binding.tvDeskripsiDetail.text = deskripsi
        binding.ivWayangDetail.setImageResource(gambar)
    }
}
