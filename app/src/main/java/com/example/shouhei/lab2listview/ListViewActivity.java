package com.example.shouhei.lab2listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_view);

    String[] arr = {"Apple", "Banana", "Grape"};
    ArrayAdapter<String> adapter =
        new ArrayAdapter<>(ListViewActivity.this, android.R.layout.simple_list_item_1, arr);

    ListView listView = findViewById(R.id.listview);
    listView.setAdapter(adapter);

    listView.setOnItemClickListener(
        new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String item = (String) parent.getAdapter().getItem(position);
            Toast.makeText(ListViewActivity.this, item, Toast.LENGTH_SHORT).show();
          }
        });
  }
}
