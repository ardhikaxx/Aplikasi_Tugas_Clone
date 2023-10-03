package com.example.aplikasitugasclone.CardviewActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.widget.TextView;
import com.example.aplikasitugasclone.DetailActivity;
import com.example.aplikasitugasclone.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;


public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private List<Mahasiswa> dataList;
    private Context context;

    public MahasiswaAdapter(Context context, List<Mahasiswa> dataList) {
        this.context = context;
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        final Mahasiswa mahasiswa = dataList.get(position);
        holder.namaTextView.setText(mahasiswa.getNama());
        holder.nimTextView.setText(mahasiswa.getNim());
        holder.jurusanProdiTextView.setText(mahasiswa.getJurusan() + " - " + mahasiswa.getProdi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Konfirmasi");
                builder.setMessage("Apakah Anda ingin melihat detailnya?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, DetailActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("nama", mahasiswa.getNama());
                        bundle.putString("nim", mahasiswa.getNim());
                        bundle.putString("jurusan", mahasiswa.getJurusan());
                        bundle.putString("prodi", mahasiswa.getProdi());
                        bundle.putString("alamat", mahasiswa.getAlamat());
                        bundle.putString("nomorWhatsApp", mahasiswa.getNomorWhatsApp());
                        bundle.putString("namaInstagram", mahasiswa.getNamaInstagram());
                        intent.putExtras(bundle);
                        context.startActivity(intent);
                    }
                });
                builder.setNegativeButton("Tidak", null);
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        TextView namaTextView, nimTextView, jurusanProdiTextView;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            namaTextView = itemView.findViewById(R.id.namaTextView);
            nimTextView = itemView.findViewById(R.id.nimTextView);
            jurusanProdiTextView = itemView.findViewById(R.id.jurusanProdiTextView);
        }
    }
}