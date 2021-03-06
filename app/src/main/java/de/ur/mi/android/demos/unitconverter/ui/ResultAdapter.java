package de.ur.mi.android.demos.unitconverter.ui;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.ur.mi.android.demos.unitconverter.R;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapterViewHolder> {

    private List<SIValue> results;

    public ResultAdapter() {
        this.results = new ArrayList<>();
    }

    public void setResults(List<SIValue> results) {
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
        SIValue result = results.get(position);
        holder.bindView(result);
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
