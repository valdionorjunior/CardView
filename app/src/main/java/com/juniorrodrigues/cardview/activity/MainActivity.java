package com.juniorrodrigues.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juniorrodrigues.cardview.R;
import com.juniorrodrigues.cardview.adapter.Adapter;
import com.juniorrodrigues.cardview.model.CardModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListCard;
    private List<CardModel> carsPostagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListCard = findViewById(R.id.rvListCard);

        //Definindo layout para o Recycler
//        rvListCard.setLayoutManager(new LinearLayoutManager(this));
        //Horizontal
//        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL); // faz com que a listagem fique horizontal com ose fosse um carrosel
        //Grid
        RecyclerView.LayoutManager linearLayoutManager = new GridLayoutManager(this, 2); //primeiro parametro contexto, segundo quantas colunas na grade

        rvListCard.setLayoutManager(linearLayoutManager);

        montaCardList();

        //definir o adapter
        rvListCard.setAdapter( new Adapter(carsPostagem));//passo o adpter criado por mim, veja que ele vem do meu pacote, dentro do projeto.

    }

    public void montaCardList(){
        CardModel card1 = new CardModel("Junior Rodrigues", "#Viagem AE", R.drawable.imagem2);
        this.carsPostagem.add(card1);

        card1 = new CardModel("Carlos Braga", "#TBT_vamos_nos", R.drawable.imagem4);
        this.carsPostagem.add(card1);

        card1 = new CardModel("Valdionor Rodrigues", "#OPA aee", R.drawable.imagem1);
        this.carsPostagem.add(card1);

        card1 = new CardModel("Rodrigues Gil", "#TESTE_sem_ideias", R.drawable.imagem3);
        this.carsPostagem.add(card1);

    }
}
