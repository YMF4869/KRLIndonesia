package com.a4869.yazidmf.krlindonesia;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TM05 extends AppCompatActivity {
    EditText editTextTM05;
    Button bt_proses;
    TextView hasil;
    String benar = "tm05";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tm05);

        editTextTM05 = (EditText)findViewById(R.id.edt_krl_tm05);
        bt_proses = (Button)findViewById(R.id.bt_proses_tm05);
        hasil = (TextView)findViewById(R.id.hasil_tm05);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextTM05.length()==0){
                    Toast.makeText(getApplicationContext(),"Jawab dulu, Gan...",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextTM05.getText().toString(); //mengambil nilai dari editTextAlpukat
                    if (jawaban.equals(benar)){ // membandingkat masukan dengan ketentuan benar  ".equals()" membandingkan nilai String yang tersimpan.
                        String keterangan = "Benar, Gan...!!!";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan = "Salah nih, Gan...!!!";
                        hasil.setText(keterangan);
                    }
                }
            }
        });
    }
}
