package edu.divyagyan.listviewexmpales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button simpleListViewButton;
    private Button customListViewButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListViewButton = findViewById(R.id.simpleListViewButton);
        customListViewButton = findViewById(R.id.customListViewButton);

        simpleListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleListViewActivity.class);
                startActivity(intent);
            }
        });

        customListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}