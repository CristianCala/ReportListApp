package com.example.reportlistsystem.ui.adduser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.reportlistsystem.databinding.FragmentAddUserBinding

class AddUserFragment : Fragment() {

    private var _binding: FragmentAddUserBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val addUserViewModel =
                ViewModelProvider(this).get(AddUserViewModel::class.java)

        _binding = FragmentAddUserBinding.inflate(inflater, container, false)
        //val root: View = binding.root

        //val textView: TextView = binding.textAddUser
        //addUserViewModel.text.observe(viewLifecycleOwner) {
        //    textView.text = it
        //}
        //return root
        return binding.root
    }
}