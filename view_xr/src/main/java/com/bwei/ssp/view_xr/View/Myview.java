package com.bwei.ssp.view_xr.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lenovo on 2017/11/30.
 */

public class Myview extends View {


    public Myview(Context context) {
        super(context);
    }

    public Myview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Myview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        RadialGradient mRadialGradient = new RadialGradient(240, 240, 240, new int[]{
                Color.YELLOW, Color.GREEN, Color.TRANSPARENT, Color.RED,Color.GRAY}, null,
                Shader.TileMode.REPEAT);
        paint.setShader(mRadialGradient);
        canvas.drawCircle(300,500,200,paint);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(getContext(),"点击了",Toast.LENGTH_LONG).show();
        return  true;
    }
}
