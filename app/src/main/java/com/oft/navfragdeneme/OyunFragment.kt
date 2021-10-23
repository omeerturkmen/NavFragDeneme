package com.oft.navfragdeneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.oft.navfragdeneme.databinding.FragmentOyunBinding

class OyunFragment : Fragment() {
    private var denemeGit = ""

    private lateinit var binding: FragmentOyunBinding
    private var kalantahmin: Int = 10
    private var randomSayi: Int = 0
    private var girilenSayi: Int = 0
    private var durum = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_oyun, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentOyunBinding.bind(view)

        randomSayifonkisyonu()
        binding.buttonTahmin.setOnClickListener {

            girilenSayi = binding.editTextTextPersonName.text.toString().toInt()

            if (girilenSayi > randomSayi) {
                binding.tvYardim.text = "Azaltmalısın."
                kalantahmin -= 1
                binding.tvKalanhak.text = "Kalan Hak $kalantahmin"

            } else if (girilenSayi < randomSayi) {
                binding.tvYardim.text = "Arttırmalısın."
                kalantahmin -= 1
                binding.tvKalanhak.text = "Kalan Hak $kalantahmin"

            } else if (girilenSayi == randomSayi){
                durum = "Kazandın"
                val action = OyunFragmentDirections.actionOyunFragmentToSonucFragment(durum)
                Navigation.findNavController(it).navigate(action)

            } else if (kalantahmin == 0){
                durum = "Kaybettin"
                val action = OyunFragmentDirections.actionOyunFragmentToSonucFragment(durum)
                Navigation.findNavController(it).navigate(action)
            }

        }
    }

    fun randomSayifonkisyonu() {
        randomSayi = (1..20).random()
    }



}