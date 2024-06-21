package com.example.lesson2.ui.fragments.onborad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lesson2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding: FragmentFirstBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToFragment()

    }

    private fun goToFragment() = with(binding) {
        binding.btnSignUp.setOnClickListener{
            val model = Model(
                name = etName.text.toString().trim(),
                password = etPassword.text.toString().trim(),
                email = etEmail.text.toString().trim() ,
            )
            findNavController().navigate(FirstFragmentDirections.actionFirstFragment2ToSecondFragment2(model))

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.root
    }
}