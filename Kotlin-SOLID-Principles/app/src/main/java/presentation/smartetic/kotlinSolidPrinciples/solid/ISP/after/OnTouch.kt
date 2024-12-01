package presentation.smartetic.kotlinSolidPrinciples.solid.ISP.after

import android.view.MotionEvent
import android.view.View

interface OnTouch {

    fun onTouch(v: View?, event: MotionEvent?)
}