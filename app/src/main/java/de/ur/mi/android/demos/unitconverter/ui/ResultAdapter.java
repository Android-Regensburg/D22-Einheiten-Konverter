package de.ur.mi.android.demos.unitconverter.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.ur.mi.android.demos.unitconverter.R;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapterViewHolder> {

    private ArrayList<UnitWrapper> results;

    public ResultAdapter() {
        this.results = new ArrayList<>();
    }

    public void setResults(ArrayList<UnitWrapper> results) {
        this.results = results;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ResultAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_value_result, parent, false);
        return new ResultAdapterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultAdapterViewHolder holder, int position) {
        UnitWrapper result = results.get(position);
        holder.bindView(result);
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
