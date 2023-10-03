package com.example.aplikasitugasclone.CardviewActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.aplikasitugasclone.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String nama = bundle.getString("nama");
            String nim = bundle.getString("nim");
            String jurusan = bundle.getString("jurusan");
            String prodi = bundle.getString("prodi");
            String alamat = getIntent().getStringExtra("alamat");
            String nomorWhatsApp = getIntent().getStringExtra("nomorWhatsApp");
            String namaInstagram = getIntent().getStringExtra("namaInstagram");

            TextView namaTextView = findViewById(R.id.namaDetailTextView);
            TextView nimTextView = findViewById(R.id.nimDetailTextView);
            TextView jurusanTextView = findViewById(R.id.jurusanDetailTextView);
            TextView prodiTextView = findViewById(R.id.prodiDetailTextView);
            TextView alamatTextView = findViewById(R.id.alamatDetailTextView);
            TextView nomorWhatsAppTextView = findViewById(R.id.nomorWhatsAppDetailTextView); // TextView untuk nomor WhatsApp
            TextView namaInstagramTextView = findViewById(R.id.namaInstagramDetailTextView);

            namaTextView.setText(nama);
            nimTextView.setText(nim);
            jurusanTextView.setText(jurusan);
            prodiTextView.setText(prodi);
            alamatTextView.setText("Asal Kota: " + alamat);
            nomorWhatsAppTextView.setText("WhatsApp: " + nomorWhatsApp);
            namaInstagramTextView.setText("Instagram: @" + namaInstagram);
        }
    }
}