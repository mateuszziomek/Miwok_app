package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PC on 2016-07-08.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource ID for the background color for the list of words
     */
    private int mColorResourceId;

    /**
     * @param context         is the current context(i.e. Activity) that adapter is being created in.
     * @param words           is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for the list of words
     */

    // custom constructor
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get the Word object located at current position
        Word currentWord = getItem(position);

        currentWord.setmPlayImageID(R.drawable.ic_play_arrow);

        // find the TextView in the list_item.xml with ID miwok_text - which is miwok translation
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        // get the text from Word object and set it as a text in TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // find the TextView in the list_item.xlm with ID english_text - whick is english_translation
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text);
        // get the text from Word object and set it as a text to TextView
        englishTextView.setText(currentWord.getmEnglishTranslation());


        //find the Image in the list_item.xml
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.isHasImage()) {
            // get the image from drawable and set it to the image var.
            image.setImageResource(currentWord.getmImageResourceID());
            image.setVisibility(View.VISIBLE);
        } else image.setVisibility(View.GONE);

        // assigning color to the background of LinearLayout - which depends on the category
        View background = listItemView.findViewById(R.id.id_background);
        // getting a color delivered via constructor
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // setting the color as a parameter
        background.setBackgroundColor(color);

        ImageView playImage = (ImageView) listItemView.findViewById(R.id.playImageId);
        playImage.setImageResource(currentWord.getmPlayImageID());

        // return the whole list_item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
