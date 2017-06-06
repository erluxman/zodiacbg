package com.erluxman.zodiacbg

import android.content.Context
import android.support.annotation.DrawableRes

/**
 * Created by Laxman Bhattarai on 6/6/17.
 * erluxman@gmail.com
 * https://github.com/erluxman
 * https://twitter.com/erluxman
 */

class ZodiacImageFactory(private val context: Context) {


    /**

     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * *
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    fun getZodiacSign(zodiacNumber: Int): Int {
        return getIconInt(zodiacNumber, this.context)
    }


    /**

     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * *
     * @param c -> context of calling activity
     * *
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    private fun getIconInt(zodiacNumber: Int, c: Context): Int {
        val name = "zod_" + Integer.toString(zodiacNumber)
        return c.resources.getIdentifier(name, "drawable", c.packageName)
    }

    /**

     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * *
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    fun getZodiacSignWithConstellation(zodiacNumber: Int): Int {
        return getIconIntWithConstellation(zodiacNumber, this.context)
    }


    /**

     * @param zodiacNumber -> zodiac number for each rashi and number will range from 0 to 11
     * *
     * @param c -> context of calling activity
     * *
     * @return -> the drawable for the zodiac sign of that particular zodiac number
     */
    @DrawableRes
    private fun getIconIntWithConstellation(zodiacNumber: Int, c: Context): Int {
        val name = "cons" + Integer.toString(zodiacNumber)
        return c.resources.getIdentifier(name, "drawable", c.packageName)
    }
}
