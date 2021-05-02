package com.example.datanovel;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcv = (RecyclerView) getView().findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new myadapter(dataqueue(), getActivity());
        rcv.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("1. Selena-Tere Liye");
        ob1.setDesc("Novel Selena akan menjelaskan beberapa hal yang menjadi pertanyaan pembaca pada seri Bumi sebelumnya.");
        ob1.setImgname(R.drawable.selena);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("2. Nebula-Tere Liye");
        ob2.setDesc("Nebula adalah pelengkap puzzle dari kisah masa lalu Selena. Masih melanjutkan kisah antara Selena dengan sahabat-sahabatnya di Akademi Bayangan Tingkat Tinggi  yaitu Mata dan Tazk, dan petualangan mereka di klan Nebula.");
        ob2.setImgname(R.drawable.nebula);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("3. Misteri Terakhir #1-S. Mara Gd.");
        ob3.setDesc("Misteri Terakhir adalah novel karya S. Mara Gd, yang berkisah tentang rangkaian misteri pembunuhan yang diusut Kapten Polisi Kosasih & Gozali.");
        ob3.setImgname(R.drawable.misteriterakhir);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("4. After The Funeral-Agatha Christie");
        ob4.setDesc("Hercule Poirot, sang detektif ternama dalam novel Agatha Christie, kembali melanjutkan petualangannya dalam buku ini.");
        ob4.setImgname(R.drawable.afterthefuneral);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("5. Ganjil Genap-Almira Bestari");
        ob5.setDesc("Ganjil Genap menceritakan betapa pahitnya kisah asmara Gala, yang sudah menjalani hubungan yang serius selama 13 tahun, namun diputuskan begitu saja di sebuah parkiran mobil.");
        ob5.setImgname(R.drawable.metropop);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("6. Tokyo dan Perayaan Kesedihan-Ruth Priscilia Angelina");
        ob6.setDesc("Beberapa pertanyaan tentang makna kehidupan dalam novel ini sangat relate dengan kehidupan nyata.");
        ob6.setImgname(R.drawable.tokyo);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("7. Segi Tiga-Sapardi Djoko Damono\n");
        ob7.setDesc("Segi Tiga merupakan karya terbaru Sapardi Djoko Damono yang bercerita mengenai betapa ganas dan ruwetnya cinta pertama.");
        ob7.setImgname(R.drawable.segitiga);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("8. Ibuk-Iwan Setyawan");
        ob8.setDesc("Ibuk yang ditulis oleh Iwan Setyawan ini menceritakan sosok ibuk bernama Tinah. Tinah telah hidup berkeluarga dan memiliki lima orang anak dalam kondisi keterbatasan.");
        ob8.setImgname(R.drawable.ibuk);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("9. Laut Bercerita-Leila S. Chudori");
        ob9.setDesc("Meski novel ini adalah fiksi, Laut Bercerita menunjukkan kepada pembacanya bahwa negeri ini pernah memasuki masa pemerintahan yang kelam. Suara aktivis dibatasi, serta diberantas habis.");
        ob9.setImgname(R.drawable.lautbercerita);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("10. Defending Jacob-William Landay");
        ob10.setDesc("Defending Jacob bercerita tentang asisten jaksa wilayah yang dihormati bernama Andy Barber. Ia hidup bahagia bersama Laurie, istrinya, dan juga Jacob, anaknya.");
        ob10.setImgname(R.drawable.defendingjacob);
        holder.add(ob10);

        return holder;
    }

}