package de.ur.mi.android.demos.unitconverter.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.ur.mi.android.demos.unitconverter.R;
import de.ur.mi.android.demos.unitconverter.units.Quantity;
import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class BaseFragment extends Fragment {

    private final static double DEFAULT_VALUE = 1.0;
    private final Unit[] units;
    private EditText valueInput;
    private Unit selectedUnit;
    private ResultAdapter resultAdapter;

    public BaseFragment(Quantity quantity) {
        this.units = Unit.getUnitsForQuantity(quantity);
        selectedUnit = units[0];
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_converter, container, false);
        initResultList(fragmentView);
        initUnitSelector(fragmentView);
        initValueInput(fragmentView);
        valueInput.setText(String.valueOf(DEFAULT_VALUE));
        return fragmentView;
    }

    private void initResultList(View fragmentView) {
        RecyclerView resultView = fragmentView.findViewById(R.id.result_list);
        resultAdapter = new ResultAdapter();
        resultView.setAdapter(resultAdapter);
    }

    private void initUnitSelector(View fragmentView) {
        ArrayList<String> labels = new ArrayList<>();
        for (Unit unit : units) {
            labels.add(unit.label);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = fragmentView.findViewById(R.id.unit_select);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedUnit = units[position];
                onInputValueChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initValueInput(View fragmentView) {
        valueInput = fragmentView.findViewById(R.id.value_input);
        valueInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                onInputValueChanged();
            }
        });
    }

    private void onInputValueChanged() {
        String newInput = valueInput.getText().toString();
        if(newInput.isEmpty()) {
            return;
        }
        double value = Double.parseDouble(newInput);
        UnitWrapper wrappedValue = selectedUnit.wrapValue(value);
        ArrayList<UnitWrapper> convertedValues = getConvertedValuesFromInput(wrappedValue);
        resultAdapter.setResults(convertedValues);
    }

    private ArrayList<UnitWrapper> getConvertedValuesFromInput(UnitWrapper unitWrapper) {
        UnitWrapper wrappedBaseValue = ((SICompatibleUnit) unitWrapper).toBaseUnit(unitWrapper);
        ArrayList<UnitWrapper> convertedUnits = new ArrayList<>();
        for (Unit unit : units) {
            convertedUnits.add(unit.wrapFromBaseValueWrapper(wrappedBaseValue));
        }
        return convertedUnits;
    }


}
