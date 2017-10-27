package com.example.android.WaiYu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Melody on 25/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> word){
        super(context,0,word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);
        TextView chText = (TextView) listItemView.findViewById(R.id.ch_text);
        chText.setText(currentWord.getChTranslation());

        TextView engText = (TextView) listItemView.findViewById(R.id.eng_text);
        engText.setText(currentWord.getEngTranslation());

        ImageView itemImage =(ImageView) listItemView.findViewById(R.id.item_image);
        itemImage.setImageResource(currentWord.getImageRes());

        return listItemView;
    }
}
