package com.example.android.WaiYu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Word> Trans = new ArrayList<Word>();

        Trans.add(new Word("你去哪儿？","Where are you going?"));
        Trans.add(new Word("你叫什么名字？","What is your name?"));
        Trans.add(new Word("我的名字是...","My name is..."));
        Trans.add(new Word("你感觉怎么样？","How are you feeling?"));
        Trans.add(new Word("我感觉很好。","I’m feeling good."));
        Trans.add(new Word("你要来吗？","Are you coming?"));
        Trans.add(new Word("是的，我会来","Yes, I’m coming."));
        Trans.add(new Word("你好","How are you?"));
        Trans.add(new Word("走吧","Let’s go."));
        Trans.add(new Word("过来","Come here."));

        WordAdapter adapter = new WordAdapter(this,Trans,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
