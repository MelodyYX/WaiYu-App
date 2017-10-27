package com.example.android.WaiYu;

import android.media.Image;

/**
 * Created by Melody on 25/10/2017.
 */

public class Word {
    private String mChTranslation;
    private String mEngTranslation;
    private static final int NO_IMAGE =-1;
    private int mImageRes=NO_IMAGE;

    public Word(String chTranslation,String engTranslation){
        mChTranslation = chTranslation;
        mEngTranslation = engTranslation;
    }

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

    public boolean hasImage(){
        return mImageRes!=NO_IMAGE;
    }

}
