package com.sample.dashboard;


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
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.ScaleInAnimator;


/**
 * A simple {@link Fragment} subclass.
 */
public class Progress extends Fragment {

    ArrayList<OnGoingChaptersModel> list = new ArrayList<>();

    CircleDisplay cdc,cdp,cdch,cdm;

    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    Switch switchBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_progress, container, false);

        cdp = (CircleDisplay) view.findViewById(R.id.circleDisplayPhy);
        cdch = (CircleDisplay) view.findViewById(R.id.circleDisplayChem);
        cdm = (CircleDisplay) view.findViewById(R.id.circleDisplayMath);
        cdc = (CircleDisplay) view.findViewById(R.id.circleDisplayCourse);
        recyclerView = (RecyclerView) view.findViewById(R.id.ongoingRecyclerView);
        switchBtn = (Switch) view.findViewById(R.id.switchBtn);

        mAdapter = new MoviesAdapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);


        recyclerView.setItemAnimator(new ScaleInAnimator(new OvershootInterpolator(1f)));
        recyclerView.setNestedScrollingEnabled(false);

        ScaleInAnimationAdapter adapter = new ScaleInAnimationAdapter(mAdapter);
        adapter.setDuration(400);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemViewCacheSize(200);

        prepareData();


        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                        prepare100();
                }else{
                        prepareData();
                }
            }
        });



        cdp.setAnimDuration(1000);
        cdp.setValueWidthPercent(5f);
        cdp.setTextSize(18f);
        cdp.setTextColor(Color.parseColor("#7A93FF"));
        cdp.setColor(Color.parseColor("#7A93FF"));
        cdp.setDrawText(true);
        cdp.setFormatDigits(1);
        cdp.setUnit("%");
        cdp.setStepSize(0.5f);
        cdp.showValue(25f, 100f, true);



        cdch.setAnimDuration(1000);
        cdch.setValueWidthPercent(5f);
        cdch.setTextSize(18f);
        cdch.setTextColor(Color.parseColor("#E4A55C"));
        cdch.setColor(Color.parseColor("#E4A55C"));
        cdch.setDrawText(true);
        cdch.setFormatDigits(1);
        cdch.setUnit("%");
        cdch.setStepSize(0.5f);
        cdch.showValue(39f, 100f, true);

        cdm.setAnimDuration(1000);
        cdm.setValueWidthPercent(5f);
        cdm.setTextSize(18f);
        cdm.setTextColor(Color.parseColor("#A8C9D9"));
        cdm.setColor(Color.parseColor("#A8C9D9"));
        cdm.setDrawText(true);
        cdm.setFormatDigits(1);
        cdm.setUnit("%");
        cdm.setStepSize(0.5f);
        cdm.showValue(89f, 100f, true);

        cdc.setAnimDuration(1000);
        cdc.setValueWidthPercent(5f);
        cdc.setTextSize(18f);
        cdc.setTextColor(Color.parseColor("#EA7296"));
        cdc.setColor(Color.parseColor("#EA7296"));
        cdc.setDrawText(true);
        cdc.setFormatDigits(1);
        cdc.setUnit("%");
        cdc.setStepSize(0.5f);
        cdc.showValue(55f, 100f, true);



        return view;


    }

    void prepare100(){

        list.clear();
        OnGoingChaptersModel model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Gravitation");
        model.setId("123");
        list.add(model);

        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Chemistry");
        model.setChapName("Equilibrium");
        model.setId("123");
        list.add(model);

        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Chemistry");
        model.setChapName("P block elements");
        model.setId("123");
        list.add(model);

        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Mathematics");
        model.setChapName("Trigonometry");
        model.setId("123");
        list.add(model);




        mAdapter.notifyDataSetChanged();

    }

    void prepareData(){

        list.clear();
        OnGoingChaptersModel model  = new OnGoingChaptersModel();
        model.setPercentage(56+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Rotational Dynamics");
        model.setId("123");
        list.add(model);

        model  = new OnGoingChaptersModel();
        model.setPercentage(65+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Work, Power,Energy");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Gravitation");
        model.setId("123");
        list.add(model);

        model  = new OnGoingChaptersModel();
        model.setPercentage(95+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Motion in One Dimension");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Chemistry");
        model.setChapName("Equilibrium");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(56+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Rotational Dynamics");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(31+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Mathematics");
        model.setChapName("Logarithms");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(12+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Rotational Dynamics");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(65+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Motion in Two Dimension");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Chemistry");
        model.setChapName("P-block elements");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(29+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Mathematics");
        model.setChapName("Properties of triangle");
        model.setId("123");
        list.add(model);

        model  = new OnGoingChaptersModel();
        model.setPercentage(36+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Laws of motion");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(77+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Physics");
        model.setChapName("Gravitation");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(100+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Mathematics");
        model.setChapName("Trigonometry");
        model.setId("123");
        list.add(model);


        model  = new OnGoingChaptersModel();
        model.setPercentage(96+"");
        model.setDate("21 May 2017");
        model.setSubjectName("Chemistry");
        model.setChapName("Acids and Bases");
        model.setId("123");
        list.add(model);

        mAdapter.notifyDataSetChanged();

    }


    public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

        private List<OnGoingChaptersModel> testList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView chapName,dateTv,percentageTv,percentDisplay;
            ImageView img;
            RelativeLayout dateContainer;
            CardView cardView;

            public MyViewHolder(View view) {
                super(view);
                chapName = (TextView) view.findViewById(R.id.chapName);
                dateTv = (TextView) view.findViewById(R.id.dateTv);
                percentageTv = (TextView) view.findViewById(R.id.percentageTv);
                percentDisplay = (TextView) view.findViewById(R.id.percentDisplay);

                img = (ImageView) view.findViewById(R.id.chapImage);
                dateContainer = (RelativeLayout) view.findViewById(R.id.dateContainer);
                cardView = (CardView) view.findViewById(R.id.card_view);
            }
        }


        public MoviesAdapter(List<OnGoingChaptersModel> testList) {
            this.testList = testList;
        }

        @Override
        public MoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.ongoing_chapters_row, parent, false);

            return new MoviesAdapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MoviesAdapter.MyViewHolder holder, int position) {
            final OnGoingChaptersModel model = testList.get(position);

            holder.chapName.setText(model.getChapName());
            holder.dateTv.setText(model.getDate());
            holder.percentageTv.setText(model.getPercentage());

            if(model.getSubjectName().equalsIgnoreCase("Physics")){
                holder.chapName.setTextColor(getResources().getColor(R.color.physics));
                holder.dateTv.setTextColor(getResources().getColor(R.color.white));
                holder.percentageTv.setTextColor(getResources().getColor(R.color.physics));
                holder.percentDisplay.setTextColor(getResources().getColor(R.color.physics));
                holder.dateContainer.setBackground(getResources().getDrawable(R.drawable.phycircle));
               holder.img.setImageResource(R.drawable.physics_subject);
            }else if(model.getSubjectName().equalsIgnoreCase("Chemistry")){
                holder.chapName.setTextColor(getResources().getColor(R.color.chemistry));
                holder.dateTv.setTextColor(getResources().getColor(R.color.white));
                holder.percentageTv.setTextColor(getResources().getColor(R.color.chemistry));
                holder.percentDisplay.setTextColor(getResources().getColor(R.color.chemistry));
                holder.dateContainer.setBackground(getResources().getDrawable(R.drawable.chemcircle));
                holder.img.setImageResource(R.drawable.chem_subject);
            }else{
                holder.chapName.setTextColor(getResources().getColor(R.color.maths));
                holder.dateTv.setTextColor(getResources().getColor(R.color.white));
                holder.percentageTv.setTextColor(getResources().getColor(R.color.maths));
                holder.percentDisplay.setTextColor(getResources().getColor(R.color.maths));
                holder.dateContainer.setBackground(getResources().getDrawable(R.drawable.mathcircle));
                holder.img.setImageResource(R.drawable.math_subject);
            }

        }

        @Override
        public int getItemCount() {
            return testList.size();
        }
    }


}
