package com.example.cakes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Berry Cake");
        arrayList.add("Molten Cake");
        arrayList.add("Tart");
        arrayList.add("Cafe Site");
        listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.txtViewId, arrayList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this, CakeActivity1.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, CakeActivity2.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, CakeActivity3.class));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chocolatharlem.com/")));
                        break;
                }
            }
        });
    }
}