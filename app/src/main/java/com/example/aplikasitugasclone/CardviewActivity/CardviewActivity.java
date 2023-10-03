package com.example.aplikasitugasclone.CardviewActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aplikasitugasclone.R;
import java.util.ArrayList;
import java.util.List;

public class CardviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private List<Mahasiswa> dataList;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        recyclerView = findViewById(R.id.recyclerView);

        dataList = initDataMahasiswa();
        adapter = new MahasiswaAdapter(this, dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<Mahasiswa> initDataMahasiswa() {
        List<Mahasiswa> data = new ArrayList<>();

        data.add(new Mahasiswa("Fayzatul Alfissyahrina Hidayat", "E41220614", "Teknologi Informasi", "Teknik Informatika", "Jember, Jawa Timur", "+62 812-5912-6593", "fayz_alf"));
        data.add(new Mahasiswa("Yanuar Ardhika Rahmadhani Ubaidillah", "E41220665", "Teknologi Informasi", "Teknik Informatika", "Bondowoso, Jawa Timur", "+62 859-3364-8537", "ardxhk_"));
        data.add(new Mahasiswa("Reiky Ananda Saifani", "E41220679", "Teknologi Informasi", "Teknik Informatika", "Banyuwangi, Jawa Timur", "+62 831-8987-5656", "reikyandsfn_"));
        data.add(new Mahasiswa("Bayu Krisna Dwihadi Fahrizal", "E41220691", "Teknologi Informasi", "Teknik Informatika", "Jember, Jawa Timur", "+62 895-3997-57207", "bayukrisna_df7"));
        data.add(new Mahasiswa("Greta Wahyu Dhita Mehdaliya", "E41220693", "Teknologi Informasi", "Teknik Informatika", "Bondowoso, Jawa Timur", "+62 813-5996-3568", "grt_wdm"));
        data.add(new Mahasiswa("Farach Ishbachi", "E41220701", "Teknologi Informasi", "Teknik Informatika", "Pasuruan, Jawa Timur", "+62 858-5096-1108", "spell.efeiareisieij"));
        data.add(new Mahasiswa("Yohanes Krisna Desantho", "E41220709", "Teknologi Informasi", "Teknik Informatika", "Jember, Jawa Timur", "+62 812-3065-9694", "desantho"));
        data.add(new Mahasiswa("Fattahur Rohim", "E41220724", "Teknologi Informasi", "Teknik Informatika", "Banyuwangi, Jawa Timur", "+62 823-9727-1373", "b_lankon"));
        data.add(new Mahasiswa("Febri Ardiyanto", "E41220760", "Teknologi Informasi", "Teknik Informatika", "Banyuwangi, Jawa Timur", "+62 817-7414-9256", "fbri_ar6"));
        data.add(new Mahasiswa("Nike Wulan Avrilia", "E41220772", "Teknologi Informasi", "Teknik Informatika", "Situbondo, Jawa Timur", "+62 852-0496-7688", "nike_wulan.a"));
        data.add(new Mahasiswa("Sevri Vendrian Achmad Jordan", "E41220783", "Teknologi Informasi", "Teknik Informatika", "Bondowoso, Jawa Timur", "+62 859-6423-7704", "vendri14"));
        data.add(new Mahasiswa("Rafika Dwi Shefira", "E41220791", "Teknologi Informasi", "Teknik Informatika", "Bondowoso, Jawa Timur", "+62 895-3891-61198", "_rafikadw"));
        data.add(new Mahasiswa("Rodiyah", "E41220797", "Teknologi Informasi", "Teknik Informatika", "Situbondo, Jawa Timur", "+62 889-8939-2566", "rodiyahaa_"));
        data.add(new Mahasiswa("Mochamad Alfan Muawad", "E41220817", "Teknologi Informasi", "Teknik Informatika", "Ciamis, Jawa Barat", "+62 813-2448-9371", "moch_alfannn"));
        data.add(new Mahasiswa("Insan Hidayah", "E41220849", "Teknologi Informasi", "Teknik Informatika", "Jember, Jawa Timur", "+62 812-3856-5634", "insan_hdyh"));
        data.add(new Mahasiswa("Arya Fadillah Agustin Ningrum", "E41220852", "Teknologi Informasi", "Teknik Informatika", "Sragen, Jawa Tengah", "+62 858-1667-4950", "aryafadd"));
        data.add(new Mahasiswa("Rama Diputra", "E41220854", "Teknologi Informasi", "Teknik Informatika", "Banyuwangi, Jawa Timur", "+62 822-4445-1081", "ramaa.dt"));
        data.add(new Mahasiswa("Fathur Rachman Hakim", "E41220875", "Teknologi Informasi", "Teknik Informatika", "Banyuwangi, Jawa Timur", "+62 852-3676-5510", "hakimfrh"));
        data.add(new Mahasiswa("Dania Angga Barry Lana", "E41220884", "Teknologi Informasi", "Teknik Informatika", "Jember, Jawa Timur", "+62 858-1270-8713", "d.angga3"));
        data.add(new Mahasiswa("Naufal I'mal Maulana", "E41220886", "Teknologi Informasi", "Teknik Informatika", "Jember, Jawa Timur", "+62 852-3026-8970", "masnopang"));
        data.add(new Mahasiswa("Lubna Jamila", "E41220950", "Teknologi Informasi", "Teknik Informatika", "Banyuwangi, Jawa Timur", "+62 823-3170-9956", "lubna._alkaaf"));
        data.add(new Mahasiswa("Pramudya Luhung Kusuma", "E41220957", "Teknologi Informasi", "Teknik Informatika", "Blitar, Jawa Timur", "+62 857-9066-3258", "lewd_chan_55"));
        data.add(new Mahasiswa("Kholis Abdullah Adi Putra", "E41220989", "Teknologi Informasi", "Teknik Informatika", "Bondowoso, Jawa Timur", "+62 812-5218-1674", "saipul_rsd19"));
        data.add(new Mahasiswa("Saiful Rasid", "E41220998", "Teknologi Informasi", "Teknik Informatika", "Bondowoso, Jawa Timur", "+62 857-0703-8940", "-"));
        data.add(new Mahasiswa("Moh. Miqdad Nidhom Fahmi", "E41221004", "Teknologi Informasi", "Teknik Informatika", "Madura, Jawa Timur", "+62 852-5928-0966", "fahmi_vollerey"));
        return data;
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Apakah Anda ingin keluar?")
                    .setPositiveButton("Ya", (dialog, which) -> finish())
                    .setNegativeButton("Tidak", null)
                    .show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}