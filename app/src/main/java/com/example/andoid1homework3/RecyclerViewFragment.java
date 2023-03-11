package com.example.andoid1homework3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {


    private TextAdapter adapter = new TextAdapter();
    private List<String> ListForTextPro = new ArrayList<>();
    private RecyclerView ListPOnText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListPOnText = view.findViewById(R.id.recyclerviewText);
        ListForTextPro.add("Почка");
        ListForTextPro.add("Данчик");
        ListForTextPro.add("Селезенка");
        ListForTextPro.add("Легкие");
        ListForTextPro.add("руки");
        ListForTextPro.add("Ноги");
        ListForTextPro.add("Нерв");
        ListForTextPro.add("Пон");
        ListForTextPro.add("Поджелудочная железа");
        ListForTextPro.add("Мозг");
        ListForTextPro.add("Печень");
        ListForTextPro.add("Печень");
        ListForTextPro.add("Воллейбол");
        ListForTextPro.add("Баскетбол");
        ListForTextPro.add("Бейсбол");
        ListForTextPro.add("Стрит Бол");
        ListForTextPro.add("Футбол");
        ListForTextPro.add("Теннис");
        ListForTextPro.add("Печень");
        ListForTextPro.add("Печень");
        ListForTextPro.add("Печень");
        initialize();
        adapter.setListForText(ListForTextPro);
    }

    private void initialize() {
        ListPOnText.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        ListPOnText.setAdapter(adapter);
    }


}