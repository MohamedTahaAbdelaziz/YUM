package com.example.yum;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;



import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder>{

    private final Context context;
    private final LayoutInflater inflater;
    private final List<Restaurant> restaurantList;

    public RestaurantAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantAdapter.RestaurantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.choices, parent, false);
        return new RestaurantHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.RestaurantHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public class RestaurantHolder extends RecyclerView.ViewHolder {
        public  TextView name;
        public ImageView image;
        public  TextView fav;
        public  TextView address;
        public  TextView rating;

        public RestaurantHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            fav = itemView.findViewById(R.id.fav);
            address = itemView.findViewById(R.id.address);
            rating = itemView.findViewById(R.id.rating);

        }
    }
}
