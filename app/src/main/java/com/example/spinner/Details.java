package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle("Details Activity");

        textView = findViewById(R.id.details_tvId);
        imageView = findViewById(R.id.details_ivId);

        Bundle bundle = getIntent().getExtras();
        if (!bundle.equals(null)){
            textView.setText(bundle.getString("name_key"));
            imageView.setImageResource(bundle.getInt("image_key"));
        }
    }
}
