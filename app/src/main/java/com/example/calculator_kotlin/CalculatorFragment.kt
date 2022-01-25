package com.example.calculator_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculator_kotlin.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding
    private val list = arrayListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)

        binding.buttonClear.setOnClickListener {
            setClear()
        }

        binding.buttonAdd.setOnClickListener {
            addNums()
        }

        binding.buttonEqual.setOnClickListener {
            list.add(binding.editTextCalculateField.text.toString().toInt())
            var result = 0

            for (num in list) {
                result += num
            }

            binding.textViewResult.text = result.toString()
        }

        binding.one.setOnClickListener {
            val one = binding.editTextCalculateField.text.toString() + "1"
            binding.editTextCalculateField.setText(one)
        }

        binding.two.setOnClickListener {
            val two = binding.editTextCalculateField.text.toString() + "2"
            binding.editTextCalculateField.setText(two)
        }

        binding.three.setOnClickListener {
            val three = binding.editTextCalculateField.text.toString() + "3"
            binding.editTextCalculateField.setText(three)
        }

        binding.four.setOnClickListener {
            val four = binding.editTextCalculateField.text.toString() + "4"
            binding.editTextCalculateField.setText(four)
        }

        binding.five.setOnClickListener {
            val five = binding.editTextCalculateField.text.toString() + "5"
            binding.editTextCalculateField.setText(five)
        }

        binding.six.setOnClickListener {
            val six = binding.editTextCalculateField.text.toString() + "6"
            binding.editTextCalculateField.setText(six)
        }

        binding.seven.setOnClickListener {
            val seven = binding.editTextCalculateField.text.toString() + "7"
            binding.editTextCalculateField.setText(seven)
        }

        binding.eight.setOnClickListener {
            val eight = binding.editTextCalculateField.text.toString() + "8"
            binding.editTextCalculateField.setText(eight)
        }

        binding.nine.setOnClickListener {
            val nine = binding.editTextCalculateField.text.toString() + "9"
            binding.editTextCalculateField.setText(nine)
        }

        binding.zero.setOnClickListener {
            val zero = binding.editTextCalculateField.text.toString() + "0"
            binding.editTextCalculateField.setText(zero)
        }
        return binding.root
    }

    private fun addNums() {
        list.add(binding.editTextCalculateField.text.toString().toInt())
        binding.editTextCalculateField.text.clear()
    }

    private fun setClear() {
        binding.editTextCalculateField.text.clear()
        binding.textViewResult.text = "0"
        list.clear()
    }
}