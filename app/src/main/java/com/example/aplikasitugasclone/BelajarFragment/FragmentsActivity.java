package com.example.aplikasitugasclone.BelajarFragment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasitugasclone.R;


public class FragmentsActivity extends AppCompatActivity {
    private Button buttonFirstFragment;
    private Button buttonSecondFragment;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        buttonFirstFragment = findViewById(R.id.buttonFirstFragment);
        buttonSecondFragment = findViewById(R.id.buttonSecondFragment);

        buttonFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFirstFragment();
            }
        });

        buttonSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSecondFragment();
            }
        });
    }

    private void loadFirstFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Frame_Fragment, new FirstFragment())
                .addToBackStack(null)
                .commit();
    }

    private void loadSecondFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Frame_Fragment, new SecondFragment())
                .addToBackStack(null)
                .commit();
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