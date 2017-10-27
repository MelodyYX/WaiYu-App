package com.example.android.WaiYu;

import android.media.Image;

/**
 * Created by Melody on 25/10/2017.
 */

public class Word {
    private String mChTranslation;
    private String mEngTranslation;
    private int mImageRes;

    public Word(String chTranslation,String engTranslation,int itemImageRes){
        mChTranslation = chTranslation;
        mEngTranslation = engTranslation;
        mImageRes = itemImageRes ;

    }

    public String getChTranslation(){
        return mChTranslation;
    }

    public String getEngTranslation(){
        return mEngTranslation;
    }

    public int getImageRes(){
        return mImageRes;
    }

}
