package com.example.demo3;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class AddFragment extends Fragment {
    private EditText edtName;
    private EditText edtDate;

    DatePickerDialog.OnDateSetListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_add, container, false);

        View v = inflater.inflate(R.layout.fragment_add,container,false);

        edtName = v.findViewById(R.id.add_edt_name);
        edtDate = v.findViewById(R.id.add_edt_date);

        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog( getContext(),android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String datetime = dayOfMonth + "/" + month + "/" + year;
                        edtDate.setText(datetime);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        return v;
    }
}