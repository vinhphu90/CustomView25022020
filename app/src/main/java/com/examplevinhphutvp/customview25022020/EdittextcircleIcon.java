package com.examplevinhphutvp.customview25022020;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EdittextcircleIcon extends RelativeLayout {
    private TextView mTvTitle;
    private ImageView mImgIcon;
    private String mTextTitle;
    private int mRedId;
    private View mView ;


    public EdittextcircleIcon(Context context) {
        super(context);
        initLayout(null , null);
    }

    public EdittextcircleIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout( context , attrs);
    }

    public EdittextcircleIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private void initLayout(@Nullable Context context, AttributeSet attrs) {
        if (context != null && attrs != null){
            initLayout(context);
            TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.EdittextcircleIcon);
            mTextTitle = typedArray.getString(R.styleable.EdittextcircleIcon_title);
            mRedId = typedArray.getResourceId(R.styleable.EdittextcircleIcon_icon_left,0);
            typedArray.recycle();
            mapview();
            setupView();
        }
    }


    private void initLayout(Context context) {
        LayoutInflater inflater = (LayoutInflater) context. getSystemService(context.LAYOUT_INFLATER_SERVICE);
        mView= inflater.inflate(R.layout.layout_edittext_red_circle,this,true);
    }

    private void mapview() {
        mTvTitle= mView. findViewById(R.id.tvtTitle);
        mImgIcon= mView. findViewById(R.id.imgIcon);
    }

    private void setupView() {
        mTvTitle.setText(mTextTitle);
        mImgIcon.setImageResource(mRedId);
    }
    public void setOnClickTitle(final OnClistener onClickTitle){
        mTvTitle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickTitle.onClick();
            }
        });
    }
    interface OnClistener{
        void onClick();
    }
}
