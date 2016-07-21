package com.example.android.miwok;

/**
 * Created by PC on 2016-07-08.
 */
public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceID;
    private int mMusicResourceID;
    private int mPlayImageID;
    private boolean hasImage;

    public Word(String mMiwokTranslation, String mEnglishTranslation, int mMusicResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mMusicResourceID = mMusicResourceID;
        hasImage = false;
    }

    public Word(String mMiwokTranslation, String mEnglishTranslation, int mImageResourceID, int mMusicResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mMusicResourceID = mMusicResourceID;
        hasImage = true;

    }

    public int getmMusicResourceID() {
        return mMusicResourceID;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmEnglishTranslation() {
        return mEnglishTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public void setmPlayImageID(int mPlayImageID) {
        this.mPlayImageID = mPlayImageID;
    }

    public int getmPlayImageID() {
        return mPlayImageID;
    }
}
