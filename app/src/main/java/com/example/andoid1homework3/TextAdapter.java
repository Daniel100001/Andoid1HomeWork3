package com.example.andoid1homework3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.TextHolder> {
    private List<String> listForText;

    public void setListForText(List<String> listForText) {
        this.listForText = listForText;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TextHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TextHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TextHolder holder, int position) {
        holder.onBind(listForText.get(position));
    }

    @Override
    public int getItemCount() {
        return listForText.size();
    }

    public class TextHolder extends RecyclerView.ViewHolder {
        private TextView textJF;
        public TextHolder(@NonNull View itemView) {
            super(itemView);
            textJF = itemView.findViewById(R.id.text1);
        }

        public void onBind(String text) {
            textJF.setText(text);
        }
    }
}
