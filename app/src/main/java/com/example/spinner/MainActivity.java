package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private String[] country_names;
    private Spinner spinner;
    private int[] flags ={R.drawable.bangladesh,R.drawable.hong_kong,R.drawable.thailand,R.drawable.cambodia,R.drawable.india,R.drawable.vieatnam,R.drawable.singapur,R.drawable.malaysia,R.drawable.indonesia};
    private boolean firsSelection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_names = getResources().getStringArray(R.array.country_names);
        spinner = findViewById(R.id.spinnerId);

        MyAdapter adapter = new MyAdapter(this,flags, country_names);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (firsSelection == true){
                    firsSelection = false;

                }else {
                    Intent intent = new Intent(getApplicationContext(),Details.class);
                    intent.putExtra("image_key",flags[position]);
                    intent.putExtra("name_key",country_names[position]);
                    startActivity(intent);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
