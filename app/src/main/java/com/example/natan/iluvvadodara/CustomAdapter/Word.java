package com.example.natan.iluvvadodara.CustomAdapter;

/**
 * Created by natan on 8/14/2017.
 */

public class Word {

    /*for the upper txt box */
    private String mtitle;

    /*for the lower txt box */
    private String mdescription;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String title, String description) {
        mtitle = title;
        mdescription = description;
    }


    public Word(String title, String description, int imageResourceId) {
        mtitle = title;
        mdescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the title.
     */
    public String getMtitle() {
        return mtitle;
    }

    /**
     * Get the description.
     */
    public String getMdescription() {
        return mdescription;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}