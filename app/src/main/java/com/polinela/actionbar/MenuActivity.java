package com.polinela.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void Instagram (View view) {
        String url = "https://instagram.com/bts.bighitofficial?igshid=YmMyMTA2M2Y=" ;
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }
}