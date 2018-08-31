package com.example.ayylmao.fortnitegunrangev20;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.*;
import android.content.DialogInterface;
import android.app.AlertDialog;

import br.com.bloder.magic.view.MagicButton;

public class GunList extends AppCompatActivity {
    TextView GName1;

    MagicButton btnStat1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun_list);
        btnStat1 = (MagicButton) findViewById(R.id.magic_button1);
        GName1 = (TextView)findViewById(R.id.gunName1);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/burbankbig.otf");

        GName1.setTypeface(myCustomFont);


        btnStat1.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent scarPage = new Intent(GunList.this, Scar_stats.class);
                    startActivity(scarPage);

            }
        });
    }
}

