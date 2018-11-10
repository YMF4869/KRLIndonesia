package com.a4869.yazidmf.krlindonesia;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TM6000 extends AppCompatActivity {
    EditText editTextTM6000;
    Button bt_proses;
    TextView hasil;
    String benar = "tm6000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tm6000);

        editTextTM6000 = (EditText)findViewById(R.id.edt_krl_tm6000);
        bt_proses = (Button)findViewById(R.id.bt_proses_tm6000);
        hasil = (TextView)findViewById(R.id.hasil_tm6000);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextTM6000.length()==0){
                    Toast.makeText(getApplicationContext(),"Jawab dulu, Gan...",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextTM6000.getText().toString(); //mengambil nilai dari editTextAlpukat
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
