package com.example.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailCategoryFragment extends Fragment {
    Button btnHome;
    TextView tvName, tvStock;
    public DetailCategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnHome = view.findViewById(R.id.btn_home);
        tvName = view.findViewById(R.id.tv_name);
        tvStock = view.findViewById(R.id.tv_stock);

        String dataName = getArguments().getString(CategoryFragment.EXTRA_NAME);
        long dataStock = getArguments().getLong(CategoryFragment.EXTRA_STOCK);

        tvName.setText(dataName);
        tvStock.setText("Stock " + dataStock);
    }
}
