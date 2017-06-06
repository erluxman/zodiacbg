package com.erluxman.zodiacbg;

import android.content.Context;
import android.support.annotation.DrawableRes;

/**
 * Created by Laxman Bhattarai on 6/6/17.
 * erluxman@gmail.com
 * https://github.com/erluxman
 * https://twitter.com/erluxman
 */

public class ZodiacImageFactory {
    private Context context;
    public ZodiacImageFactory(Context context) {
        this.context = context;
    }


    /**
     *
     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    public int getZodiacSign(int zodiacNumber){
        return getIconInt(zodiacNumber,this.context);
    }


    /**
     *
     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * @param c -> context of calling activity
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    private int getIconInt ( int zodiacNumber, Context c ) {
        String name = "zod_" +Integer.toString(zodiacNumber);
        return c.getResources ().getIdentifier ( name, "drawable", c.getPackageName () );
    }
    /**
     *
     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    public int getZodiacSignWithConstellation(int zodiacNumber){
        return getIconIntWithConstellation(zodiacNumber,this.context);
    }


    /**
     *
     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * @param c -> context of calling activity
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    private int getIconIntWithConstellation ( int zodiacNumber, Context c ) {
        String name = "cons" +Integer.toString(zodiacNumber);
        return c.getResources ().getIdentifier ( name, "drawable", c.getPackageName () );
    }
}
