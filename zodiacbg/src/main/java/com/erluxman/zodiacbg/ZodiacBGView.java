package com.erluxman.zodiacbg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by Laxman Bhattarai on 6/2/17.
 * erluxman@gmail.com
 * https://github.com/erluxman
 * https://twitter.com/erluxman
 */

public class ZodiacBGView extends FrameLayout implements ZodiacBGPresenter {
    ImageView zodiacSign;

    public ZodiacBGView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ZodiacBGView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.rashifal_bg_view, this, true);
        zodiacSign = (ImageView) findViewById(R.id.rashifal_zodaic_sign);
    }


    @Override
    public void setZodiacSignVisibility(boolean visibility) {
        Utils.setVisibility(zodiacSign, visibility);
    }

    @Override
    public void setZodiacNumber(int zodiacNumber) {
        zodiacSign.setImageResource(new ZodiacImageFactory(getContext()).getZodiacSignWithConstellation(zodiacNumber));
    }

    @Override
    public void setZodiacNumberWithoutConstellation(int zodiacNumber) {
        zodiacSign.setImageResource(new ZodiacImageFactory(getContext()).getZodiacSign(zodiacNumber));
    }

    private int getZodiacConstellationByZodiacNumber(int zodiacNumber) {
        return 0;
    }


}
