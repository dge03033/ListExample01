package com.example.listexample01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        //simple_list_item_1: 안드로이드에서 기본으로 제굥하는 list form UI를 쓸거임.
        //listview에 adapter적용하기.
        list.setAdapter(adapter);
        
        //연결은 됏는데 아이템 추가가 필요.
        data.add("홍드로이드");
        data.add("안드로이드");
        data.add("사과");
        adapter.notifyDataSetChanged();//상태저장완료
    }
}