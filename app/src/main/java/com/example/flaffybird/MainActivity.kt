package com.example.flappybird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    lateinit var gameView: GameView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        gameView = findViewById<GameView>(R.id.vMain)
    }

    override fun onPause(){
        super.onPause()
        gameView.pause()
    }

    override fun onResume(){
        super.onResume()
        gameView.resume()
    }
}
