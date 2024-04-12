package com.msaggik.thirdlessonalbum10;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void LinearLayout (Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        init();
    }

    private Paint paint = new Paint();

    public void LineView(Context context) {
        init();
    }

    public void LineView(Context context, AttributeSet attrs) {
        init();
    }

    public void LineView(Context context, AttributeSet attrs, int defStyleAttr) {
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void LineView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        init();
    }

    private void init() {
        // Установка свойств для рисования линии
        paint.setColor(Color.BLACK); // Цвет линии
        paint.setStrokeWidth(5);     // Толщина линии
        paint.setStyle(Paint.Style.STROKE); // Рисуем линию, а не заполняем область
        paint.setAntiAlias(true);   // Сглаживание краев
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Координаты начала и конца линии
        float startX = 0;
        float startY = 0;
        float endX = getWidth();
        float endY = getHeight();

        // Рисование линии
        canvas.drawLine(startX, startY, endX, endY, paint);
    }
}

