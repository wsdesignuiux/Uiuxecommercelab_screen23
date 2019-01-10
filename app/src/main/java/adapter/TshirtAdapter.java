package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vaibhav.screen23.R;

import java.util.ArrayList;

import model.TshirtModel;

public class TshirtAdapter extends RecyclerView.Adapter<TshirtAdapter.ViewHolder>{
    Context context;
    ArrayList<TshirtModel>tshirtModels;

    public TshirtAdapter(Context context, ArrayList<TshirtModel> tshirtModels) {
        this.context = context;
        this.tshirtModels = tshirtModels;
    }

    @NonNull
    @Override
    public TshirtAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tshirt,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TshirtAdapter.ViewHolder holder, int position) {

        holder.tshirt.setImageResource(tshirtModels.get(position).getTshirt());
        holder.tv1.setText(tshirtModels.get(position).getTv1());
        holder.tv2.setText(tshirtModels.get(position).getTv2());
        holder.tv3.setText(tshirtModels.get(position).getTv3());
    }
    @Override
    public int getItemCount() {
        return tshirtModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView tshirt;
        TextView tv1,tv2,tv3;
        public ViewHolder(View itemView) {
            super(itemView);

            tshirt = itemView.findViewById(R.id.tshirt);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            tv3 = itemView.findViewById(R.id.tv3);
        }
    }
}
