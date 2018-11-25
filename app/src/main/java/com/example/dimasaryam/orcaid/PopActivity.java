package com.example.dimasaryam.orcaid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class PopActivity extends AppCompatActivity {

    Button sms;
    Button panggil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.7),(int)(height*.3));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);

        panggil = (Button) findViewById(R.id.panggil);

        panggil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPanggil = new Intent(Intent.ACTION_DIAL);
                iPanggil.setData(Uri.parse("tel:085640460124"));
                startActivity(iPanggil);
            }
        });

        sms = (Button) findViewById(R.id.sms);

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSMS = new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms","085640460124",null));
                iSMS.putExtra("sms_body","Pengen PESEN DUMS");
                startActivity(iSMS);
            }
        });
    }
}
