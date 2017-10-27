package com.example.android.WaiYu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> Trans = new ArrayList<Word>();

        Trans.add(new Word("红","red",R.drawable.color_red));
        Trans.add(new Word("绿","green",R.drawable.color_green));
        Trans.add(new Word("蓝","blue",R.drawable.color_blue));
        Trans.add(new Word("天蓝","sky blue",R.drawable.color_sky_blue));
        Trans.add(new Word("紫","purple",R.drawable.color_purple));
        Trans.add(new Word("金","gold",R.drawable.color_gold));
        Trans.add(new Word("综","brown",R.drawable.color_brown));
        Trans.add(new Word("灰","gray",R.drawable.color_gray));
        Trans.add(new Word("黑","black",R.drawable.color_black));
        Trans.add(new Word("白","white",R.drawable.color_white));
        Trans.add(new Word("土黄","dusty yellow",R.drawable.color_dusty_yellow));
        Trans.add(new Word("芥末黄","mustard yellow",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,Trans,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
