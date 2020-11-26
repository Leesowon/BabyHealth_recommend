package com.example.babyhealth_recommend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton im_btn_cate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im_btn_cate = (ImageButton)findViewById(R.id.im_btn_cate);
        im_btn_cate.setOnClickListener(new View.OnClickListener()
        }
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }

    }
}