package com.spirovski.natparks.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.spirovski.natparks.R;

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter{
    private Context context;
    private View view;
    private LayoutInflater layoutInflater;
    public CustomInfoWindow(Context context) {
    this.context = context;
    this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    view = layoutInflater.inflate(R.layout.custom_info_window, null);
    }

    @Nullable
    @Override
    public View getInfoContents(@NonNull Marker marker) {
        return null;
    }


    @Nullable
    @Override
    public View getInfoWindow(@NonNull Marker marker) {
        TextView parkName = view.findViewById(R.id.info_title);
        TextView parkState = view.findViewById(R.id.info_state);

        parkName.setText(marker.getTitle());
        parkState.setText(marker.getSnippet() );
        return view;
    }
}
