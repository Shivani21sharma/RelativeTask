package com.shivani.relativetask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.shivani.relativetask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var etCamera: EditText
    lateinit var etSetting: EditText
    lateinit var etTextDescription: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Discard.setOnClickListener {
            if (binding.etCamera.text.isEmpty()) {
                binding.etCamera.error = "Enter Data"
            } else if (binding.etSetting.text.isEmpty()) {
                binding.etSetting.error = "Enter Setting"
            } else {
                System.out.println("Discard")
            }
        }
    }
}