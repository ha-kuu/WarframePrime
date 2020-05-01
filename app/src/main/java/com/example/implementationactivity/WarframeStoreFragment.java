package com.example.implementationactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.implementationactivity.databinding.FragmentWarframeStoreBinding;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WarframeStoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WarframeStoreFragment extends Fragment {
    FragmentWarframeStoreBinding binding;
    private int valueblueprint=0, valuechassis=0, valueneuroptics=0, valuesystem=0;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WarframeStoreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WarframeStoreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WarframeStoreFragment newInstance(String param1, String param2) {
        WarframeStoreFragment fragment = new WarframeStoreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_warframe_store, container, false);
        binding = FragmentWarframeStoreBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController = Navigation.findNavController(view);

        binding.weaponbuttononwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_warframeStoreFragment_to_weaponStoreFragment);
            }
        });
        binding.companionbuttononwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_warframeStoreFragment_to_companionStoreFragment);
            }
        });
        binding.applybuttononwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_warframeStoreFragment_to_mainFragment);
            }
        });

        binding.implementbuttononwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.warframeblueprintname.setText(binding.warframenametext.getText()+" Prime Blueprint");
                binding.warframechassisname.setText(binding.warframenametext.getText()+" Prime Chassis");
                binding.warframeneuropticsname.setText(binding.warframenametext.getText()+" Prime Neuroptics");
                binding.warframesystemname.setText(binding.warframenametext.getText()+" Prime System");
            }
        });

        binding.minusblueprintonwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueblueprint!=0)
                    valueblueprint--;
                else valueblueprint = 0;
                binding.warframeblueprintnumber.setText(String.valueOf(valueblueprint));
            }
        });
        binding.plusblueprintonwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueblueprint++;
                binding.warframeblueprintnumber.setText(String.valueOf(valueblueprint));
            }
        });

        binding.minuschassisonwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valuechassis!=0)
                    valuechassis--;
                else valuechassis = 0;
                binding.warframechassisnumber.setText(String.valueOf(valuechassis));
            }
        });
        binding.pluschassisonwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuechassis++;
                binding.warframechassisnumber.setText(String.valueOf(valuechassis));
            }
        });

        binding.minusneuropticswarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueneuroptics!=0)
                    valueneuroptics--;
                else valueneuroptics = 0;
                binding.warframeneuropticsnumber.setText(String.valueOf(valueneuroptics));
            }
        });
        binding.plusneuropticswarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueneuroptics++;
                binding.warframeneuropticsnumber.setText(String.valueOf(valueneuroptics));
            }
        });

        binding.minussystemonwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valuesystem!=0)
                    valuesystem--;
                else valuesystem = 0;
                binding.warframesystemnumber.setText(String.valueOf(valuesystem));
            }
        });
        binding.plussystemonwarframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesystem++;
                binding.warframesystemnumber.setText(String.valueOf(valuesystem));
            }
        });
    }
}
