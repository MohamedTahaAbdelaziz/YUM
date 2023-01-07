package com.example.yum_rafid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

import androidx.recyclerview.widget.RecyclerView;

public class RestaurantAdapter extends FirestoreRecyclerAdapter<Restaurant, RestaurantAdapter.RestaurantHolder>{

    public RestaurantAdapter(@NonNull FirestoreRecyclerOptions<Restaurant> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull RestaurantHolder holder, int position, @NonNull Restaurant model) {
        holder.txtViewName.setText(model.getName());
        holder.txtViewRating.setText(String.valueOf(model.getRating()));

    }

    public class RestaurantHolder extends RecyclerView.ViewHolder{
        TextView txtViewName, txtViewRating;

        public RestaurantHolder (View itemView){
            super(itemView);
            txtViewName = itemView.findViewById(R.id.restaurant_name);
            txtViewRating =  itemView.findViewById(R.id.restaurant_rating);

        }
    }

    @NonNull
    @Override
    public RestaurantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new RestaurantHolder(v);
    }


}
