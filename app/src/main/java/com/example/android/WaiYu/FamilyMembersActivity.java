package com.example.android.WaiYu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Word> Trans = new ArrayList<Word>();

        Trans.add(new Word("父亲","father",R.drawable.family_father));
        Trans.add(new Word("母亲","mother",R.drawable.family_mother));
        Trans.add(new Word("儿子","son",R.drawable.family_son));
        Trans.add(new Word("女儿","daughter",R.drawable.family_daughter));
        Trans.add(new Word("哥哥","older brother",R.drawable.family_older_brother));
        Trans.add(new Word("弟弟","younger brother",R.drawable.family_younger_brother));
        Trans.add(new Word("姐姐","older sister",R.drawable.family_older_sister));
        Trans.add(new Word("妹妹","younger sister",R.drawable.family_younger_sister));
        Trans.add(new Word("外/祖母","grandmother",R.drawable.family_grandmother));
        Trans.add(new Word("外/祖父","grandfather",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,Trans,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
