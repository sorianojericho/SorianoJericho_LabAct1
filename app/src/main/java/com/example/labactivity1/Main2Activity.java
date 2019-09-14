package com.example.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("LAB ACTIVITY 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showTapsi(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/Tapsi-Asturias-St-Ust/509555495732165/"));
        startActivity(i);
    }

    public void showTigerWinx(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/manila/tiger-winx-sampaloc-manila/"));
        startActivity(i);
    }

    public void showFusebox(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/manila/quick-bites?group_id=41564/"));
        startActivity(i);
    }
}
