package com.oft.navfragdeneme

import android.os.Bundle
import android.system.Os.bind
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.oft.navfragdeneme.databinding.ActivityMainBinding.bind
import com.oft.navfragdeneme.databinding.FragmentAnaBinding


class AnaFragment : Fragment() {

    private lateinit var binding: FragmentAnaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ana, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAnaBinding.bind(view)

        binding.buttonAna.setOnClickListener {
            val action = AnaFragmentDirections.actionAnaFragmentToOyunFragment()
            Navigation.findNavController(it).navigate(action)

        }

    }
}