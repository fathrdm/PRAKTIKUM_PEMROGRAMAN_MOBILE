package com.example.tiptimer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            calculateTip()
        }
    }
    private fun calculateTip() {
        val cost: Double = binding.costOfService.text.toString().toDoubleOrNull() ?: 0.0
        val selectedId: Int = binding.radioGroup.checkedRadioButtonId
        val tipPercentage: Double = when (selectedId) {
            R.id.radioButton -> 0.20
            R.id.radioButton2 -> 0.18
            R.id.radioButton3 -> 0.15
            else -> 0.0
        }
        val tip: Double = cost * tipPercentage
        binding.result.text = "Tip Amount: $${String.format("%.2f", tip)}"
    }
}
