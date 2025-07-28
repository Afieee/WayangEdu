package com.project.wayangedu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.wayangedu.adapter.WayangAdapter
import com.project.wayangedu.databinding.ActivityMainBinding
import com.project.wayangedu.model.Wayang

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listWayang = listOf(
        Wayang("Gatotkaca", "Putra dari Bimasena, terkenal dengan kekuatan dan kemampuan terbang.", R.drawable.gatotkaca),
        Wayang("Bima", "Salah satu dari Pandawa Lima yang terkenal dengan kekuatan luar biasa.", R.drawable.bima),
        Wayang("Arjuna", "Pandawa yang terkenal tampan, sakti, dan ahli memanah.", R.drawable.arjuna),
        Wayang("Yudhistira", "Pemimpin Pandawa yang jujur dan adil.", R.drawable.yudhistira),
        Wayang("Kresna", "Dewa penyelamat dan penasihat Pandawa, bijaksana dan sakti.", R.drawable.kresna),
        Wayang("Karna", "Saudara Pandawa yang berada di pihak Kurawa, pemberani dan ahli memanah.", R.drawable.karna),
        Wayang("Srikandi", "Pejuang wanita dari pihak Pandawa, istri Arjuna.", R.drawable.srikandi),
        Wayang("Semar", "Tokoh punakawan yang bijak dan lucu, pelayan Pandawa.", R.drawable.semar)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = WayangAdapter(listWayang) { wayang ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("NAMA", wayang.nama)
                putExtra("DESKRIPSI", wayang.deskripsi)
                putExtra("GAMBAR", wayang.gambar)
            }
            startActivity(intent)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}
