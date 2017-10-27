package com.example.android.WaiYu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

import static com.example.android.WaiYu.R.drawable.number_one;

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_list);

        ArrayList<Word> Trans = new ArrayList<Word>();

        Trans.add(new Word("1","One",R.drawable.number_one));
        Trans.add(new Word("2","Two",R.drawable.number_two));
        Trans.add(new Word("3","Three",R.drawable.number_three));
        Trans.add(new Word("4","Four",R.drawable.number_four));
        Trans.add(new Word("5","Five",R.drawable.number_five));
        Trans.add(new Word("6","Six",R.drawable.number_six));
        Trans.add(new Word("7","Seven",R.drawable.number_seven));
        Trans.add(new Word("8","Eight",R.drawable.number_eight));
        Trans.add(new Word("9","Nine",R.drawable.number_nine));
        Trans.add(new Word("10","Ten",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, Trans);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
