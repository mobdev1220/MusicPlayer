package uz.gita.musicplayer.mobdev20.utils

import android.widget.SeekBar


fun SeekBar.setChangeProgress(block: (Int) -> Unit) {
    this.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

        }

        override fun onStartTrackingTouch(p0: SeekBar?) {
            p0?.let {
                block.invoke(it.progress)
            }
        }

        override fun onStopTrackingTouch(p0: SeekBar?) {
            p0?.let {
                block.invoke(it.progress)
            }
        }
    })
}