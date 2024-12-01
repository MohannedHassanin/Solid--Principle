package presentation.smartetic.kotlinSolidPrinciples.solid.ISP.before

import android.view.MotionEvent
import android.view.View


interface OnClickListener {
    fun onClick(v: View?)
    fun onLongClick(v: View?)
    fun onTouch(v: View?, event: MotionEvent?)
}