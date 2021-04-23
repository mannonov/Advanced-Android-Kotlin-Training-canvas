package uz.jaxadev.advancedandroidkotlintrainingcanvas

import CanvasView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.jaxadev.advancedandroidkotlintrainingcanvas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val canvasView = CanvasView(this)

        binding.rootLayout.addView(canvasView)


    }
}