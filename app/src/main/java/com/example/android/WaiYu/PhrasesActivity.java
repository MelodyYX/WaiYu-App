package com.example.android.WaiYu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_list);
        ArrayList<Word> Trans = new ArrayList<Word>();

        Trans.add(new Word("你去哪儿？","Where are you going?",0));
        Trans.add(new Word("你叫什么名字？","What is your name?",0));
        Trans.add(new Word("我的名字是...","My name is...",0));
        Trans.add(new Word("你感觉怎么样？","How are you feeling?",0));
        Trans.add(new Word("我感觉很好。","I’m feeling good.",0));
        Trans.add(new Word("你要来吗？","Are you coming?",0));
        Trans.add(new Word("是的，我会来","Yes, I’m coming.",0));
        Trans.add(new Word("你好","How are you?",0));
        Trans.add(new Word("走吧","Let’s go.",0));
        Trans.add(new Word("过来","Come here.",0));

        WordAdapter adapter = new WordAdapter(this, Trans);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
