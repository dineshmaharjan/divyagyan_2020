package edu.divyagyan.listviewexmpales;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class SimpleListViewActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    //data source
    private String[] datas = {"Ram", "Shyam", "Hari", "Harish", "Gita", "Sita", "Ramma", "Ghanshyam"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        listView = findViewById(R.id.simpleListView);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(arrayAdapter);
    }
}
