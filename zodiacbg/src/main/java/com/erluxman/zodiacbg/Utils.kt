package com.erluxman.zodiacbg

import android.view.View

/**
 * Created by Laxman Bhattarai on 6/5/17.
 * erluxman@gmail.com
 * https://github.com/erluxman
 * https://twitter.com/erluxman
 */

class Utils {
    companion object {
        fun setVisibility(v: View, visible: Boolean) {
            if (visible) v.visibility = View.VISIBLE else v.visibility = View.GONE
        }
    }
}
