package com.example.bt_tablayout_viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FlowerAdapter_104 extends RecyclerView.Adapter<FlowerAdapter_104.FlowerViewHolder_104> {

    private Context context_104;
    private List<FlowerModel_104> flowerList_104;
    private int layoutResId_104;

    public FlowerAdapter_104(Context context, List<FlowerModel_104> flowerList, int layoutResId) {
        this.context_104 = context;
        this.flowerList_104 = flowerList;
        this.layoutResId_104 = layoutResId;
    }

    @NonNull
    @Override
    public FlowerViewHolder_104 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_104 = LayoutInflater.from(context_104).inflate(layoutResId_104, parent, false);
        return new FlowerViewHolder_104(view_104);
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder_104 holder, int position) {
        FlowerModel_104 currentFlower_104 = flowerList_104.get(position);

        holder.nameTextView_104.setText(currentFlower_104.getName_104());
        holder.priceTextView_104.setText(currentFlower_104.getPrice_104());

        String imageName = currentFlower_104.getImageUrl_104();
        int imageId = context_104.getResources().getIdentifier(imageName, "drawable", context_104.getPackageName());
        if (imageId != 0) {
            holder.flowerImageView_104.setImageResource(imageId);
        } else {
            holder.flowerImageView_104.setImageResource(R.drawable.placeholder_flower);
        }

        if (position % 3 == 0) {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context_104, R.color.pink_light_104));
        } else if (position % 3 == 1) {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context_104, R.color.orange_pink_104));
        } else {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context_104, R.color.red_pink_104));
        }
    }

    @Override
    public int getItemCount() {
        return flowerList_104.size();
    }

    public static class FlowerViewHolder_104 extends RecyclerView.ViewHolder {
        public ImageView flowerImageView_104;
        public TextView nameTextView_104;
        public TextView priceTextView_104;

        public FlowerViewHolder_104(@NonNull View itemView) {
            super(itemView);
            flowerImageView_104 = itemView.findViewById(R.id.flowerImage_104);
            nameTextView_104 = itemView.findViewById(R.id.flowerName_104);
            priceTextView_104 = itemView.findViewById(R.id.flowerPrice_104);
        }
    }
}