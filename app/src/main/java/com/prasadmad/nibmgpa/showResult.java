package com.prasadmad.nibmgpa;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.DecoDrawEffect;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;

/**
 * Created by Prasad on 4/21/17.
 */

public class showResult extends AppCompatActivity {

    private Bundle bundle;
    private DecoView mDecoView;
    private int mBackIndex;
    private int mSeries1Index;
    private int mSeries2Index;
    private int mSeries3Index;

    private final float mSeriesMax = 100f;
    private float var_GPA;
    private TextView currentPercentage, currentGPA, GPA1, Percentage1, GPA2, Percentage2;
    private TextView first, mid, last;
    private ImageView imgFirst, imgMid, imgLast;
    private int var_Flag = 0;
    private float var_Temp_GPA1 = 0, var_Temp_GPA2 = 0, pass_score = 0, distinction = 0;
    float var_temp_myGpa1, var_temp_myGpa2;

    private common numberFormat;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransitionExit();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gpa);

        try {

            bundle = getIntent().getExtras();
            currentPercentage = (TextView) findViewById(R.id.curentPercentage);
            currentGPA = (TextView) findViewById(R.id.currentGPA);
            currentPercentage.setTextColor(Color.parseColor("#FF03C8EF"));
            currentGPA.setTextColor(Color.parseColor("#FF03C8EF"));

            first = (TextView) findViewById(R.id.first);
            mid = (TextView) findViewById(R.id.mid);
            last = (TextView) findViewById(R.id.last);

            imgFirst = (ImageView) findViewById(R.id.imgFirst);
            imgMid = (ImageView) findViewById(R.id.imgMid);
            imgLast = (ImageView) findViewById(R.id.imgLast);

            imgFirst.setVisibility(View.INVISIBLE);
            imgLast.setVisibility(View.INVISIBLE);
            imgMid.setVisibility(View.INVISIBLE);

            GPA1 = (TextView) findViewById(R.id.GPA1);
            Percentage1 = (TextView) findViewById(R.id.Percentage1);
            GPA1.setTextColor(Color.parseColor("#FFFFBB00"));
            Percentage1.setTextColor(Color.parseColor("#FFFFBB00"));

            GPA2 = (TextView) findViewById(R.id.GPA2);
            Percentage2 = (TextView) findViewById(R.id.Percentage2);
            GPA2.setTextColor(Color.parseColor("#FFF95F00"));
            Percentage2.setTextColor(Color.parseColor("#FFF95F00"));

            numberFormat = new common();


            mDecoView = (DecoView) findViewById(R.id.dynamicArcView);
            var_GPA = bundle.getFloat("GPA");
            pass_score = bundle.getFloat("SCORE");
            distinction = bundle.getFloat("DISTINCTION");

            createBackSeries();

            if (var_GPA >= 0 && var_GPA < pass_score) {
                var_temp_myGpa1 = pass_score - var_GPA;
                var_temp_myGpa2 = distinction - var_GPA;

                if (var_temp_myGpa1 > var_GPA) {
                    createDataSeries3();
                    createDataSeries2();
                    createDataSeries1();
                } else if (var_temp_myGpa2 > var_GPA) {
                    createDataSeries3();
                    createDataSeries1();
                    createDataSeries2();
                } else if (var_temp_myGpa2 > var_temp_myGpa1) {
                    createDataSeries1();
                    createDataSeries3();
                    createDataSeries2();
                } else {
                    createDataSeries1();
                    createDataSeries2();
                    createDataSeries3();
                }
                var_Flag = 3;
                setColorBox(3, "Current GPA", "To Achieve " + pass_score, "To Achieve " + distinction);

            } else if (var_GPA >= pass_score && var_GPA < 3.75) {
                var_temp_myGpa1 = distinction - var_GPA;
                var_temp_myGpa2 = (float) 4.0 - var_GPA;

                createDataSeries1();
                createDataSeries3();
                createDataSeries2();
                var_Flag = 3;

                setColorBox(3, "Current GPA", "To Achieve " + distinction, "To Achieve 4.0");

            } else if (var_GPA >= distinction && var_GPA < 4.0) {
                createDataSeries1();
                createDataSeries2();
                var_Flag = 2;

                setColorBox(2, "Current GPA", "To Achieve 4.0", "");

            } else if (var_GPA == 4.0) {
                createDataSeries1();
                var_Flag = 1;
                setColorBox(1, "", "Current GPA", "");
            }


            if (var_GPA >= 0 && var_GPA < pass_score) {
                if (var_GPA == pass_score) {
                    var_Temp_GPA1 = distinction - var_GPA;
                    var_Temp_GPA2 = (float) 4.0 - var_GPA;
                } else {
                    var_Temp_GPA1 = pass_score - var_GPA;
                    var_Temp_GPA2 = distinction - var_GPA;

                }
                createEvents((float) (var_GPA / 4.0) * 100, (float) (var_Temp_GPA1 / 4.0) * 100, (float) (var_Temp_GPA2 / 4.0) * 100);

            } else if (var_GPA >= pass_score && var_GPA < distinction) {

                var_temp_myGpa1 = distinction - var_GPA;
                var_temp_myGpa2 = (float) 4.0 - var_GPA;

                createEvents((float) (var_GPA / 4.0) * 100, (float) (var_temp_myGpa1 / 4.0) * 100, (float) (var_temp_myGpa2 / 4.0) * 100);
            } else if (var_GPA >= distinction && var_GPA < 4.0) {

                var_temp_myGpa1 = (float) 4.0 - var_GPA;
                createEvents((float) (var_GPA / 4.0) * 100, (float) (var_temp_myGpa1 / 4.0) * 100, 0);
            } else if (var_GPA == 4.0) {
                createEvents(100, 0, 0);
            }


        } catch (Exception ex) {
            Log.d("OnCrExceptionsShowRe", ex.toString());
        }

    }


    private void createBackSeries() throws Exception {
        SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#FF02ECC9"))
                .setRange(0, mSeriesMax, 0)
                .setInitialVisibility(true)
                .build();

        mBackIndex = mDecoView.addSeries(seriesItem);
    }       //Show circle

    private void createDataSeries1() throws Exception {
        final SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#FF03C8EF"))
                .setRange(0, mSeriesMax, 0)
                .setInitialVisibility(false)
                .build();

        seriesItem.addArcSeriesItemListener(new SeriesItem.SeriesItemListener() {
            @Override
            public void onSeriesItemAnimationProgress(float percentComplete, float currentPosition) {
                float percentFilled = ((currentPosition - seriesItem.getMinValue()) / (seriesItem.getMaxValue() - seriesItem.getMinValue()));
                currentPercentage.setText(String.format("%.2f%%", percentFilled * 100f));
                currentGPA.setText(String.valueOf(numberFormat.twoPlaces(currentPosition / 25)));
            }

            @Override
            public void onSeriesItemDisplayProgress(float percentComplete) {

            }
        });

        mSeries1Index = mDecoView.addSeries(seriesItem);
    }       //Show my current GPA

    private void createDataSeries2() throws Exception {
        final SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#FFFFBB00"))
                .setRange(0, mSeriesMax, 0)
                .setInitialVisibility(false)
                .build();

        seriesItem.addArcSeriesItemListener(new SeriesItem.SeriesItemListener() {
            @Override
            public void onSeriesItemAnimationProgress(float percentComplete, float currentPosition) {
                float percentFilled = ((currentPosition - seriesItem.getMinValue()) / (seriesItem.getMaxValue() - seriesItem.getMinValue()));
                Percentage1.setText(String.format("%.2f%%", percentFilled * 100f));
                GPA1.setText(String.valueOf(numberFormat.twoPlaces(currentPosition / 25)));
            }

            @Override
            public void onSeriesItemDisplayProgress(float percentComplete) {

            }
        });

        mSeries2Index = mDecoView.addSeries(seriesItem);
    }       //Need to achieve 3.3

    private void createDataSeries3() throws Exception {
        final SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#FFF95F00"))
                .setRange(0, mSeriesMax, 0)
                .setInitialVisibility(false)
                .build();

        seriesItem.addArcSeriesItemListener(new SeriesItem.SeriesItemListener() {
            @Override
            public void onSeriesItemAnimationProgress(float percentComplete, float currentPosition) {
                float percentFilled = ((currentPosition - seriesItem.getMinValue()) / (seriesItem.getMaxValue() - seriesItem.getMinValue()));
                Percentage2.setText(String.format("%.2f%%", percentFilled * 100f));
                GPA2.setText(String.valueOf(numberFormat.twoPlaces(currentPosition / 25)));
            }

            @Override
            public void onSeriesItemDisplayProgress(float percentComplete) {

            }
        });

        mSeries3Index = mDecoView.addSeries(seriesItem);
    }       //Need to achieve 3.7

    private void createEvents(float percentage1, float percentage2, float percentage3) throws Exception {
        mDecoView.executeReset();
        mDecoView.addEvent(new DecoEvent.Builder(mSeriesMax)
                .setIndex(mBackIndex)
                .setDuration(1000)
                .setDelay(100)
                .build());

        if (var_Flag == 1) {
            mDecoView.addEvent(new DecoEvent.Builder(DecoDrawEffect.EffectType.EFFECT_SPIRAL_OUT)
                    .setIndex(mSeries1Index)
                    .setDuration(2000)
                    .setDelay(800)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(percentage1)
                    .setIndex(mSeries1Index)
                    .setDelay(3250)
                    .build());

        } else if (var_Flag == 2) {

            mDecoView.addEvent(new DecoEvent.Builder(DecoDrawEffect.EffectType.EFFECT_SPIRAL_OUT)
                    .setIndex(mSeries1Index)
                    .setDuration(2000)
                    .setDelay(800)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(percentage1)
                    .setIndex(mSeries1Index)
                    .setDelay(3250)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(DecoDrawEffect.EffectType.EFFECT_SPIRAL_OUT)
                    .setIndex(mSeries2Index)
                    .setDuration(1000)
                    .setEffectRotations(1)
                    .setDelay(7000)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(percentage2)
                    .setIndex(mSeries2Index)
                    .setDelay(8500)
                    .build());

        } else if (var_Flag == 3) {

            mDecoView.addEvent(new DecoEvent.Builder(DecoDrawEffect.EffectType.EFFECT_SPIRAL_OUT)
                    .setIndex(mSeries1Index)
                    .setDuration(2000)
                    .setDelay(800)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(percentage1)
                    .setIndex(mSeries1Index)
                    .setDelay(3250)
                    .build());


            mDecoView.addEvent(new DecoEvent.Builder(DecoDrawEffect.EffectType.EFFECT_SPIRAL_OUT)
                    .setIndex(mSeries2Index)
                    .setDuration(1000)
                    .setEffectRotations(1)
                    .setDelay(7000)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(percentage2)
                    .setIndex(mSeries2Index)
                    .setDelay(8500)
                    .build());


            mDecoView.addEvent(new DecoEvent.Builder(DecoDrawEffect.EffectType.EFFECT_SPIRAL_OUT)
                    .setIndex(mSeries3Index)
                    .setDuration(1000)
                    .setEffectRotations(1)
                    .setDelay(12500)
                    .build());

            mDecoView.addEvent(new DecoEvent.Builder(percentage3).setIndex(mSeries3Index).setDelay(14000).build());

        }

    }

    private void setColorBox(int flagValue, String Tfirst, String Tmid, String Tlast) throws Exception {
        if (flagValue == 1) {
            imgMid.setBackgroundColor(Color.parseColor("#FF03C8EF"));
            imgMid.setVisibility(View.VISIBLE);
            mid.setText(Tmid);
        } else if (flagValue == 2) {
            imgFirst.setBackgroundColor(Color.parseColor("#FF03C8EF"));
            imgMid.setBackgroundColor(Color.parseColor("#FFFFBB00"));
            imgFirst.setVisibility(View.VISIBLE);
            imgMid.setVisibility(View.VISIBLE);
            first.setText(Tfirst);
            mid.setText(Tmid);
        } else if (flagValue == 3) {
            imgFirst.setBackgroundColor(Color.parseColor("#FF03C8EF"));
            imgMid.setBackgroundColor(Color.parseColor("#FFFFBB00"));
            imgLast.setBackgroundColor(Color.parseColor("#FFF95F00"));
            imgFirst.setVisibility(View.VISIBLE);
            imgMid.setVisibility(View.VISIBLE);
            imgLast.setVisibility(View.VISIBLE);
            first.setText(Tfirst);
            mid.setText(Tmid);
            last.setText(Tlast);
        }
    }

    protected void overridePendingTransitionExit() {
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}
