package com.sample.dashboard;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.ScaleInAnimator;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestResults extends Fragment {

    private ArrayList<TestResultsModel> list = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test_results, container, false);

        prepareData();

        recyclerView = (RecyclerView) view.findViewById(R.id.testresultsrecyclerview);


        mAdapter = new MoviesAdapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);


        recyclerView.setItemAnimator(new ScaleInAnimator(new OvershootInterpolator(1f)));

        ScaleInAnimationAdapter adapter = new ScaleInAnimationAdapter(mAdapter);
        adapter.setDuration(400);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemViewCacheSize(200);

        return view;
    }

    void prepareData(){

        list.clear();


        TestResultsModel model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("29-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("45");
        model.setTotalMarks("100");
        model.setPercent(45f);
        model.setPass(true);
        model.setChapter("Work, Power,Energy");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("18");
        model.setTotalMarks("100");
        model.setPercent(18f);
        model.setPass(false);
        model.setChapter("Gravitation");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Jee Main");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("78");
        model.setTotalMarks("100");
        model.setPercent(78f);
        model.setPass(true);
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Jee Advanced");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("8");
        model.setTotalMarks("100");
        model.setPercent(8f);
        model.setPass(false);
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("86");
        model.setTotalMarks("100");
        model.setPercent(86f);
        model.setPass(true);
        model.setChapter("Motion in One Dimension");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Jee Advanced");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("100");
        model.setTotalMarks("100");
        model.setPercent(100f);
        model.setPass(true);
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("35");
        model.setTotalMarks("100");
        model.setPercent(35f);
        model.setPass(true);
        model.setChapter("Equilibrium");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("44");
        model.setTotalMarks("100");
        model.setPercent(44f);
        model.setPass(true);
        model.setChapter("Logarithms");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("78");
        model.setTotalMarks("100");
        model.setPercent(78f);
        model.setPass(true);
        model.setChapter("Motion in Two Dimension");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("P-block elements");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("56");
        model.setTotalMarks("100");
        model.setPercent(56f);
        model.setPass(true);
        model.setChapter("Properties of triangle");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("10");
        model.setTotalMarks("100");
        model.setPercent(10f);
        model.setPass(false);
        model.setChapter("Laws of motion");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Jee Main");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("48");
        model.setTotalMarks("100");
        model.setPercent(48f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("43");
        model.setTotalMarks("100");
        model.setPercent(43f);
        model.setPass(true);
        model.setChapter("Trigonometry");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Rotational Dynamics");
        list.add(model);


        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("98");
        model.setTotalMarks("100");
        model.setPercent(98f);
        model.setPass(true);
        model.setChapter("Alkanes,Alkenes,Alkynes");
        list.add(model);



        model = new TestResultsModel();

        model.setTitle("Chapter Test");
        model.setId("123");
        model.setdate("21-05-2017");
        model.setMarks("100");
        model.setTotalMarks("100");
        model.setPercent(100f);
        model.setPass(true);
        model.setChapter("Hyperbola");
        list.add(model);



    }






    public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

        private List<TestResultsModel> testList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView testName, score, examDate;
            ImageView img;
            CircleDisplay cd;
            CardView cardView;

            public MyViewHolder(View view) {
                super(view);
                testName = (TextView) view.findViewById(R.id.testName);
                score = (TextView) view.findViewById(R.id.score);
                examDate = (TextView) view.findViewById(R.id.examdate);
                cd = (CircleDisplay) view.findViewById(R.id.circleResultDisplay);
                img = (ImageView) view.findViewById(R.id.chapImg);
                // imgView = (ImageView) view.findViewById(R.id.chapImgView);
                cardView = (CardView) view.findViewById(R.id.TRCardView);
            }
        }


        public MoviesAdapter(List<TestResultsModel> testList) {
            this.testList = testList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.test_results_row, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            final TestResultsModel model = testList.get(position);

            if(model.getTitle().equalsIgnoreCase("Chapter test")){
                holder.testName.setText((position+1)+". "+model.getTitle()+"("+model.getChapter()+")");
            }else {
                holder.testName.setText((position+1)+". "+model.getTitle());
            }


            holder.score.setText(model.getMarks()+"/"+model.getTotalMarks());
            holder.examDate.setText(model.getDate());

            holder.cd.setAnimDuration(500);
            holder.cd.setValueWidthPercent(5f);
            holder.cd.setTextSize(14f);

            if(model.getPass()){
                holder.cd.setTextColor(Color.parseColor("#35A924"));
                holder.cd.setColor(Color.parseColor("#35A924"));
            }else{
                holder.cd.setTextColor(Color.parseColor("#D02520"));
                holder.cd.setColor(Color.parseColor("#D02520"));
                 }

            holder.cd.setDrawText(true);
            holder.cd.setFormatDigits(1);
            holder.cd.setUnit("%");
            holder.cd.setStepSize(0.5f);
            holder.cd.showValue(model.getPercent(), 100f, true);
        }

        @Override
        public int getItemCount() {
            return testList.size();
        }
    }





}
