package uz.jaxadev.advancedandroidkotlintrainingcanvas

import CanvasView
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import uz.jaxadev.advancedandroidkotlintrainingcanvas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val canvasView = CanvasView(this)

        binding.rootLayout.addView(canvasView)

        binding.btnBlack.setOnClickListener {

            canvasView.setColor(getColor(R.color.black))

        }

        binding.btnBlue.setOnClickListener {

            canvasView.setColor(getColor(R.color.blue))

        }

        binding.btnGreen.setOnClickListener {

            canvasView.setColor(getColor(R.color.green))

        }

        binding.btnRed.setOnClickListener {

            canvasView.setColor(getColor(R.color.red))

        }

    }
}