package com.example.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calismayapisi.databinding.ActivityOyunEkraniBinding
import android.content.Intent as Intent

class OyunEkraniActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityOyunEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim=ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val gelenAd=intent.getStringExtra("ad")
        val gelenyas=intent.getIntExtra("yas",0)
        val gelenboy=intent.getDoubleExtra("boy",0.0)
        val gelenBekar=intent.getBooleanExtra("bekar",false)

        Log.e("Gelen Ad",gelenAd!!)
        Log.e("Gelen yas",gelenyas.toString())
        Log.e("Gelen boy",gelenboy.toString())
        Log.e("Gelen bekar",gelenBekar.toString())

        val gelennesne=intent.getSerializableExtra("nesne") as Kisiler

        Log.e("Gelen Nesne Ad",gelennesne.adi)
        Log.e("Gelen Nesne yas",gelennesne.yas.toString())
        Log.e("Gelen Nesne boy",gelennesne.boy.toString())
        Log.e("Gelen Nesne bekar",gelennesne.bekar.toString())




        tasarim.buttonBitir.setOnClickListener {

            val intent = Intent(this@OyunEkraniActivity,SonucEkraniActivity::class.java)
            startActivity(intent)
            finish()
            //  Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
        }




    }
}