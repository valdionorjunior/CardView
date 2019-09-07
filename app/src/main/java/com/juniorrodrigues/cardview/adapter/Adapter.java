package com.juniorrodrigues.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juniorrodrigues.cardview.R;
import com.juniorrodrigues.cardview.model.CardModel;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder>{

    private List<CardModel> carsPostagem;

    public Adapter(List<CardModel> carsPostagem) {
        this.carsPostagem = carsPostagem;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemCardList = LayoutInflater.from(parent.getContext()).inflate(R.layout.meu_layout_card, parent,false);

        return new MyHolder(itemCardList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        CardModel card = carsPostagem.get(position);
//        holder.ivImage.setImageResource(R.drawable.imagem3);
        holder.ivImage.setImageResource(card.getImage());

//        holder.txtPostated.setText("Teste de Postagem");
        holder.txtPostated.setText(card.getPostated());

//        holder.txtUserName.setText("Teste de Nome Jhosep");
        holder.txtUserName.setText(card.getUserName());

    }

    @Override
    public int getItemCount() {
        return carsPostagem.size();
    }

    //Classe View Holder Custom
    public class MyHolder extends RecyclerView.ViewHolder{
        //Componentes de Layout
        TextView txtUserName;
        TextView txtPostated;
        ImageView ivImage;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            txtUserName = itemView.findViewById(R.id.txtUserName);
            txtPostated = itemView.findViewById(R.id.txtPostagem);
            ivImage = itemView.findViewById(R.id.ivImage);
        }
    }
}
