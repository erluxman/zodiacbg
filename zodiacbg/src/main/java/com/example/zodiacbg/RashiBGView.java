package com.example.zodiacbg;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
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

public class RashiBGView extends FrameLayout implements RashifalBGPresenter {
    ImageView constellation;
    ImageView zodiacSign;
    public RashiBGView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RashiBGView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.rashifal_bg_view, this, true);
        constellation = (ImageView) findViewById(R.id.rashifal_constellation);
        zodiacSign = (ImageView) findViewById(R.id.rashifal_zodaic_sign);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            /// (rashifalBG).setImageBitmap(blur(rashifalBG.getDrawingCache(),0.5f));
        }
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private Bitmap blur(Bitmap original, Float radius) {
        Bitmap bitmap = Bitmap.createBitmap(
                original.getWidth(), original.getHeight(),
                Bitmap.Config.ARGB_8888);

        RenderScript rs = RenderScript.create(this.getContext());

        Allocation allocIn = Allocation.createFromBitmap(rs, original);
        Allocation allocOut = Allocation.createFromBitmap(rs, bitmap);

        ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(
                rs, Element.U8_4(rs));
        blur.setInput(allocIn);
        blur.setRadius(radius);
        blur.forEach(allocOut);

        allocOut.copyTo(bitmap);
        rs.destroy();
        return bitmap;
    }

    @Override
    public void setZodiacSignVisibility(boolean visibility) {
        Utils.setVisibilty(zodiacSign,visibility);
    }

    @Override
    public void setConstellationVisibility(boolean visibility) {
        Utils.setVisibilty(constellation,visibility);
    }

    @Override
    public void setZodiacNumber(int zodiacNumber) {
        zodiacSign.setImageResource(getZodiacSignByZodiacNumber(zodiacNumber));
        constellation.setImageResource(getZodiacConstellationByZodiacNumber(zodiacNumber));
    }

    private int getZodiacConstellationByZodiacNumber(int zodiacNumber) {
        return 0;
    }

    private int getZodiacSignByZodiacNumber(int zodiacNumber) {
        return 0;
    }


}
