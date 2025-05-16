package com.arsoft.adaptersapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- AdapterView: ListView
        listView = findViewById(R.id.listView);

        // 2- Data Source: String Array
        String[] countries = {"USA", "Germany", "Saudi Arabia", "France", "Australia"};

        // 3- Adapter: acts as a bridge between the
        //          'data source' and the 'AdapterView'

        MyCustomAdapter adapter = new MyCustomAdapter(countries, this);




        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                countries
        );*/

        // Link ListView with the Adapter
        listView.setAdapter(adapter);






    }
}