package com.prasadmad.nibmgpa;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Prasad on 4/30/17.
 */

public class custom extends AppCompatActivity {

    private Bundle bundle;
    private common commonAtt;

    private TableRow row5,row6,row7,row8,row9,row10,row11,row12,row13,row14,row15,row16,row17,row18,row19,row20;
    private Spinner sr1,sr2,sr3,sr4,sr5,sr6,sr7,sr8,sr9,sr10,sr11,sr12,sr13,sr14,sr15,sr16,sr17,sr18,sr19,sr20;
    private Spinner sc1,sc2,sc3,sc4,sc5,sc6,sc7,sc8,sc9,sc10,sc11,sc12,sc13,sc14,sc15,sc16,sc17,sc18,sc19,sc20;
    private Button calculate;
    private EditText passScore,classScore;
    private TextView warningText;
    private float[] results =new float[20];
    private int[] credits =new int[20];
    private int nSubs=6;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(custom.this,MainActivity.class));
        overridePendingTransitionExit();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);

        try {

            bundle=getIntent().getExtras();
            nSubs=bundle.getInt("SUBS");
            initialize(nSubs);
            commonAtt=new common();

            sc1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[0] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[1] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[2] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[3] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[4] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[5] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[6] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[7] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[8] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[9] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[10] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[11] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[12] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[13] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[14] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[15] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[16] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[17] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[18] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sc20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    credits[19] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            sr1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[0] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[1] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[2] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[3] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[4] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[5] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[6] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[7] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[8] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[9] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[10] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[11] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[12] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[13] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[14] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[15] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[16] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[17] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[18] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            sr20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    results[19] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        calculate();
                    } catch (Exception ex) {
                        Log.d("OnCrExceptionsCustom",ex.toString());
                    }
                }
            });

        }catch (Exception ex){
            Log.d("OnCrExceptionsCustom",ex.toString());
        }

    }


    private void initializeTableRow()throws Exception{

        row5=(TableRow)findViewById(R.id.row5);
        row6=(TableRow)findViewById(R.id.row6);
        row7=(TableRow)findViewById(R.id.row7);
        row8=(TableRow)findViewById(R.id.row8);
        row9=(TableRow)findViewById(R.id.row9);
        row10=(TableRow)findViewById(R.id.row10);
        row11=(TableRow)findViewById(R.id.row11);
        row12=(TableRow)findViewById(R.id.row12);
        row13=(TableRow)findViewById(R.id.row13);
        row14=(TableRow)findViewById(R.id.row14);
        row15=(TableRow)findViewById(R.id.row15);
        row16=(TableRow)findViewById(R.id.row16);
        row17=(TableRow)findViewById(R.id.row17);
        row18=(TableRow)findViewById(R.id.row18);
        row19=(TableRow)findViewById(R.id.row19);
        row20=(TableRow)findViewById(R.id.row20);
    }

    private void visibility(TableRow tableRow)throws Exception{
        tableRow.setVisibility(View.GONE);
    }

    private void initializeSpinnerResult()throws Exception{
        sr1=(Spinner)findViewById(R.id.sr1);
        sr2=(Spinner)findViewById(R.id.sr2);
        sr3=(Spinner)findViewById(R.id.sr3);
        sr4=(Spinner)findViewById(R.id.sr4);
        sr5=(Spinner)findViewById(R.id.sr5);
        sr6=(Spinner)findViewById(R.id.sr6);
        sr7=(Spinner)findViewById(R.id.sr7);
        sr8=(Spinner)findViewById(R.id.sr8);
        sr9=(Spinner)findViewById(R.id.sr9);
        sr10=(Spinner)findViewById(R.id.sr10);
        sr11=(Spinner)findViewById(R.id.sr11);
        sr12=(Spinner)findViewById(R.id.sr12);
        sr13=(Spinner)findViewById(R.id.sr13);
        sr14=(Spinner)findViewById(R.id.sr14);
        sr15=(Spinner)findViewById(R.id.sr15);
        sr16=(Spinner)findViewById(R.id.sr16);
        sr17=(Spinner)findViewById(R.id.sr17);
        sr18=(Spinner)findViewById(R.id.sr18);
        sr19=(Spinner)findViewById(R.id.sr19);
        sr20=(Spinner)findViewById(R.id.sr20);
    }

    private void initializeSpinnerCredit()throws Exception{
        sc1=(Spinner)findViewById(R.id.credit1);
        sc2=(Spinner)findViewById(R.id.credit2);
        sc3=(Spinner)findViewById(R.id.credit3);
        sc4=(Spinner)findViewById(R.id.credit4);
        sc5=(Spinner)findViewById(R.id.credit5);
        sc6=(Spinner)findViewById(R.id.credit6);
        sc7=(Spinner)findViewById(R.id.credit7);
        sc8=(Spinner)findViewById(R.id.credit8);
        sc9=(Spinner)findViewById(R.id.credit9);
        sc10=(Spinner)findViewById(R.id.credit10);
        sc11=(Spinner)findViewById(R.id.credit11);
        sc12=(Spinner)findViewById(R.id.credit12);
        sc13=(Spinner)findViewById(R.id.credit13);
        sc14=(Spinner)findViewById(R.id.credit14);
        sc15=(Spinner)findViewById(R.id.credit15);
        sc16=(Spinner)findViewById(R.id.credit16);
        sc17=(Spinner)findViewById(R.id.credit17);
        sc18=(Spinner)findViewById(R.id.credit18);
        sc19=(Spinner)findViewById(R.id.credit19);
        sc20=(Spinner)findViewById(R.id.credit20);
    }

    private void initialize(int value)throws Exception{
        initializeTableRow();
        initMethod(value);
        initializeSpinnerResult();
        initializeSpinnerCredit();
        calculate=(Button)findViewById(R.id.btnCalculate);
        passScore=(EditText)findViewById(R.id.passLimit);
        classScore=(EditText)findViewById(R.id.classLimit);
        warningText=(TextView)findViewById(R.id.warningText);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN
        );
    }

    private void initMethod(int value)throws Exception{

        if(value==4) {
            visibility(row5);
            visibility(row6);
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
        }else if(value==5) {
            visibility(row6);
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
        }else if(value==6){
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
        } else if(value==7){
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
        }else if(value==8){
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
        }else if(value==9){
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
        }else if(value==10){
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==11){
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==12){
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==13){
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==14){
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==15){
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==16){
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==17){
            visibility(row18);
            visibility(row19);
            visibility(row20);

        }else if(value==18){
            visibility(row19);
            visibility(row20);

        }else if(value==19){
            visibility(row20);

        }
    }

    private void warning()throws Exception{
        warningText.setTextColor(Color.RED);
    }

    private void calculate() throws Exception{
        float result, score=0, distinction=0;
        String sc=passScore.getText().toString();
        String dis=classScore.getText().toString();

        if (sc.length()<=4 && dis.length()<=4) {

            try{
                score=Float.valueOf(sc);
                distinction=Float.valueOf(dis);
            }catch (Exception ex){
                Log.d("ConvertingStringToFloat",ex.toString());
            }

            if (score<=3.9 && score>0.1 && distinction<=3.9 && distinction>0.1){
                result = commonAtt.sumOfResult(results,credits,0,nSubs-1)/ commonAtt.creditSumCustom(credits, nSubs);
                startActivity(new Intent(custom.this,showResult.class).putExtra("GPA", commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
                overridePendingTransitionEnter();
            }else{
                warning();
            }
        }else{
            warning();
        }

    }

    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    protected void overridePendingTransitionExit() {
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}