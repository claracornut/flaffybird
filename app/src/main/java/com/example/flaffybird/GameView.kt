package com.example.flappybird

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceView

class GameView @JvmOverloads
constructor(context: Context,
            attributes: AttributeSet? = null,
            defStyleAttr: Int = 0):
    SurfaceView(context, attributes,defStyleAttr),
    SurfaceHolder.Callback,
    Runnable{
    lateinit var canvas: Canvas
    val textPaint = Paint()
    var screenWidth = 0f
    var screenHeight = 0f
    var drawing = false
    //var gameOver = false
    lateinit var thread: Thread

    fun pause(){
        drawing = false
        thread.join()
    }

    fun resume(){
        drawing = true
        thread = Thread(this)
        thread.start()
    }


    override fun run() {
        TODO("Not yet implemented")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }

    override fun surfaceCreated(holder: SurfaceHolder) {}

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {}

    override fun surfaceDestroyed(holder: SurfaceHolder) {}

}
