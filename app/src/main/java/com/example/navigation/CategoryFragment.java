package com.example.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    Button btnDetail;
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_STOCK = "extra_stock";

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnDetail = view.findViewById(R.id.btn_detail);

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(EXTRA_NAME, "Lifestyle");
                bundle.putLong(EXTRA_STOCK, 8);
                Navigation.findNavController(view).navigate(R.id.action_categoryFragment_to_detailCategoryFragment, bundle);
            }
        });
    }
}
