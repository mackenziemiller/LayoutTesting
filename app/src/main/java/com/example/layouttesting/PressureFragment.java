package com.example.layouttesting;
import androidx.appcompat.app.AppCompatActivity;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PressureFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PressureFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public PressureFragment() {

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PressureFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PressureFragment newInstance(String param1, String param2) {
        PressureFragment fragment = new PressureFragment();
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
        super.onCreate(savedInstanceState);




        //View view = inflater.inflate(R.layout.fragment_pressure, container, false);
        GraphView graph = (GraphView)getActivity().findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<>();
        double x,y;
        x =0;

        int numDataPoint = 500; //this is the number of data points we are plotting
        for(int i =0; i < numDataPoint ; i++) {
            //0.1 gives the graph a nice continuous look
            x = x + 0.1;
            y = Math.sin(x);
            series1.appendData(new DataPoint(x, y), true, 100);
        }
        graph.addSeries(series1);
        // Inflate the layout for this fragment
        //FrameLayout layout = view.findViewById(R.id.graph);
        return inflater.inflate(R.layout.fragment_pressure, container, false);
    }
}