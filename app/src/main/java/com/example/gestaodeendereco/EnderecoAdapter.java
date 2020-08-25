package com.example.gestaodeendereco;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EnderecoAdapter extends RecyclerView.Adapter <EnderecoAdapter.EnderecoViewHolder> {

    private List<Endereco> listaEndereco;
    private Context mContext;
    private String enderecoScolido;

    private String selecao = "nao";

    public EnderecoAdapter(List<Endereco> listaEndereco, Context mContext) {
        this.listaEndereco = listaEndereco;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public EnderecoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_endereco,
                parent, false);
        return new EnderecoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final EnderecoViewHolder holder, int position) {

        holder.ivEndEscolhido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.ivEndEscolhido.isClickable()){

                    if(selecao.equals("nao") ){
                        holder.ivEndEscolhido.setImageResource(R.drawable.ic_baseline_check_box_24);



                    }
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return listaEndereco.size();
    }

    class EnderecoViewHolder extends RecyclerView.ViewHolder {

        TextView tvLogradouro, tvIdEnd;
        ImageView ivEndEscolhido;

        public EnderecoViewHolder(@NonNull View itemView) {
            super(itemView);

            tvLogradouro = itemView.findViewById(R.id.tvLogradouro);
            tvIdEnd = itemView.findViewById(R.id.tvIdEnd);
            ivEndEscolhido = itemView.findViewById(R.id.ivEndEscolhido);
        }
    }


}
