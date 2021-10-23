package com.oft.navfragdeneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.oft.navfragdeneme.databinding.FragmentSonucBinding


class SonucFragment : Fragment() {

    private val args: SonucFragmentArgs by navArgs()
    private lateinit var binding: FragmentSonucBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sonuc, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gelen = args.sonucArg
        binding = FragmentSonucBinding.bind(view)
        binding.tvSonuc.text = gelen







    }
}








