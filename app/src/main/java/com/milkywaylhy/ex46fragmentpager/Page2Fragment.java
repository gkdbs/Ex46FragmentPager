package com.milkywaylhy.ex46fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Page2Fragment extends Fragment {
    ImageView iv;
    Button btn;

    //프레그먼트 객체가 생성될 때 호출되는 것이 아니라!!
    //프레그먼트가 화면에 노출되어야할때 발동됨
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentpage2,container,false);
        iv= view.findViewById(R.id.iv);
        btn= view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(R.drawable.moana1);
            }
        });
        return view;
    }
}
