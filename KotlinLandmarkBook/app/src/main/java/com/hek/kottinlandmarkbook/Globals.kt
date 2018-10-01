package com.hek.kottinlandmarkbook

import android.graphics.Bitmap

/**
 * Created by HEK on 7.03.2018.
 */
class Globals {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage() : Bitmap {

            return chosenImage!!


        }
    }

}