package com.example.midtermproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.midtermproject.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            computingConversion() // calling conversion from button press
        }
    }

    private fun computingConversion() {
        val input = binding.inputLiters.text.toString()
        val liters = input.toDoubleOrNull() //if not doub, convert, or null, then err handle below

        // if liters is null or <= 0 then go to error handling
        if (liters == null || liters <= 0) {
            showInputErrors(liters)
        } else { //else do the conversion
            val cups = liters * 4.22 // conversion rate from assignment
            binding.textviewSecond.text = getString(R.string.conversion_result, cups)
        }

    }

    // adding some error handling, just display toast with error
    // TODO add for no input, less than or equal to zero, and for integer not decimal etc.
    private fun showInputErrors(liters: Double?) {
        val errorMessage = if (liters == null) {
            getString(R.string.input_error_all_wrong)
        } else {
            getString(R.string.input_error_zero)
        }
        Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}