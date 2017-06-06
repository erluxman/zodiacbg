package com.example.zodiacbg;

import android.view.View;

/**
 * Created by Laxman Bhattarai on 6/5/17.
 * erluxman@gmail.com
 * https://github.com/erluxman
 * https://twitter.com/erluxman
 */

public class Utils {
    public static void setVisibilty(View v , boolean visible){
        if(visible)v.setVisibility(View.VISIBLE);else v.setVisibility(View.GONE);
    }
}
