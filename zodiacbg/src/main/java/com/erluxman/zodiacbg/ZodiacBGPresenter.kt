package com.erluxman.zodiacbg

internal interface ZodiacBGPresenter {
    fun setZodiacSignVisibility(visibility: Boolean)
    fun setZodiacNumber(zodiacNumber: Int)
    fun setZodiacNumberWithoutConstellation(zodiacNumber: Int)
}