package com.a4869.yazidmf.krlindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt_jr203(View view) {
        Intent jr203 = new Intent(MainActivity.this,JR203.class);
        startActivity(jr203);
    }
    public void bt_jr205(View view) {
        Intent jr205 = new Intent(MainActivity.this,JR205.class);
        startActivity(jr205);
    }
    public void bt_tm6000(View view) {
        Intent tm6000 = new Intent(MainActivity.this,TM6000.class);
        startActivity(tm6000);
    }
    public void bt_tm05(View view) {
        Intent tm05 = new Intent(MainActivity.this,TM05.class);
        startActivity(tm05);
    }
    public void bt_tentang(View view) {
        Intent tentang = new Intent(MainActivity.this,Tentang.class);
        startActivity(tentang);
    }
}
