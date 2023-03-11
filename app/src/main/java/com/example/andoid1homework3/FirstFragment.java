package com.example.andoid1homework3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class FirstFragment extends Fragment {
    MaterialButton button;
    EditText editText;
    private final String PASSWORD = "admin";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.editText);
        goToRecyclerViewFragemnt();
    }


    private void goToRecyclerViewFragemnt() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                RecyclerViewFragment recyclerViewFragment = new RecyclerViewFragment();
                if(editText.getText().toString().equals(PASSWORD) && !editText.getText().toString().isEmpty()){
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, recyclerViewFragment)
                            .addToBackStack(null)
                            .commit();
                }else{
                    Toast.makeText(getContext(), "Пароль не верный", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
