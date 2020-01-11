package com.example.my_card_view;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.BikeStationViewHolder> {



    public static class BikeStationViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView bikeStationName;
        TextView bikeStationLocation;
        TextView bikeStationNumber;
        ImageView bikeStationImage;

        BikeStationViewHolder(View itemView){
            super(itemView);

            cv = (CardView)itemView.findViewById(R.id.card_view);
            bikeStationName = (TextView)itemView.findViewById(R.id.card_name);
            bikeStationLocation = (TextView)itemView.findViewById(R.id.card_location);
            bikeStationNumber = (TextView)itemView.findViewById(R.id.card_number);
            bikeStationImage = (ImageView)itemView.findViewById(R.id.card_image);

        }
    }


    List<BikeStation> bikeStations;

    RVAdapter(List<BikeStation> bikeStations){
        this.bikeStations = bikeStations;
    }

    public void onAttachedtoRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public BikeStationViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        BikeStationViewHolder bsvh = new BikeStationViewHolder(v);
        return bsvh;
    }

    @Override
    public void onBindViewHolder(BikeStationViewHolder bikeStationViewHolder, int i){
        bikeStationViewHolder.bikeStationName.setText(bikeStations.get(i).name);
        bikeStationViewHolder.bikeStationLocation.setText(bikeStations.get(i).location);
        bikeStationViewHolder.bikeStationNumber.setText(bikeStations.get(i).number);
        bikeStationViewHolder.bikeStationImage.setImageResource(bikeStations.get(i).photo);
    }

    @Override
    public int getItemCount(){
        return bikeStations.size();
    }

}
