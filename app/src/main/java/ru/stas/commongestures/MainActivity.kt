package ru.stas.commongestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import ru.stas.commongestures.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
    GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private lateinit var binding: ActivityMainBinding
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        binding.gestureStatusText.text = "onDown"
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        binding.gestureStatusText.text = "onDown"
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        binding.gestureStatusText.text = "onSingleTapUp"
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        binding.gestureStatusText.text = "onScroll"
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        binding.gestureStatusText.text = "onLongPress"
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        binding.gestureStatusText.text = "onFling"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        binding.gestureStatusText.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        binding.gestureStatusText.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        binding.gestureStatusText.text = "onDoubleTapEvent"
        return true
    }
}