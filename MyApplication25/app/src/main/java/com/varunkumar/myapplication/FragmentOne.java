package com.varunkumar.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button button1= (Button) view.findViewById(R.id.button1);
        Button button2 = (Button) view.findViewById(R.id.button2);
        Button button3 = (Button) view.findViewById(R.id.button3);
        Button button4 = (Button) view.findViewById(R.id.button4);

        ButtonClickListener listener = new ButtonClickListener();
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        return view;
    }

    class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.button1:
                    ((MainActivity) getActivity()).changeTitle("Layout1");
                    break;
                case R.id.button2:
                    ((MainActivity) getActivity()).changeTitle("Layout2");
                    break;
                case R.id.button3:
                    ((MainActivity) getActivity()).changeTitle("Layout3");
                    break;
                case R.id.button4:
                    ((MainActivity) getActivity()).changeTitle("Layout4");
                    break;
            }
        }
    }
}
