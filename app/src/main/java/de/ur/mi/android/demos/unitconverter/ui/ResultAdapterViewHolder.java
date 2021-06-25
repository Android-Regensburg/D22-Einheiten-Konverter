package de.ur.mi.android.demos.unitconverter.ui;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.ur.mi.android.demos.unitconverter.R;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class ResultAdapterViewHolder extends RecyclerView.ViewHolder {

    private final TextView resultValue;
    private final TextView resultUnit;

    public ResultAdapterViewHolder(View resultView) {
        super(resultView);
        resultValue = resultView.findViewById(R.id.result_value);
        resultUnit = resultView.findViewById(R.id.result_unit);
    }

    public void bindView(SIValue result) {
        resultValue.setText(String.valueOf(result.value));
        resultUnit.setText(result.unit.label);
    }
}
