package com.milkywaylhy.ex46fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Page3Fragment extends Fragment {

    ArrayList<String>datas= new ArrayList<>(0);
    ListView listView;
    ArrayAdapter adapter;
    //프레그먼트가 생성될때 1번 호출되는 메소드

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentpage3,container,false);
        //대량의 대이터 추가 - 화면에 보일때마다 실행되어 중복데이터가 추가됨
//        datas.add(new String("aaa"));
//        datas.add(new String("bbb"));
//        datas.add(new String("ccc"));
//

        return view;
    }
    //onCreateView()메소드가 실행 된 후 만들어진 뷰(리턴된 뷰)의
    //자식뷰들을 참조하는 자겅ㅂ을 위한

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //만들어진뷰(View)안에 있는 Listview참조\
        listView= view.findViewById(R.id.listview);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(adapter);
    }
}
