package com.prasadmad.nibmgpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * Created by Prasad on 4/12/17.
 */

public class adbm extends AppCompatActivity {

    private common commonAtt;
    private TableLayout layoutCustomCredit;
    private CheckBox chkCustomCredit;
    private Button calculate;
    private Spinner Rpm, Rbmit, Rfa, Rbe, Rpe1, Rob, Rma, Rbs, Rpe2, Rbee;
    private Spinner Cpm, Cbmit, Cfa, Cbe, Cpe1, Cob, Cma, Cbs, Cpe2, Cbee;
    private TextView txtpm, txtbmit, txtfa, txtbe, txtpe1, txtob, txtma, txtbs, txtpe2, txtbee;

    private boolean var_onChange=false;
    float[] resultList=new float[10];
    int[] defaultCredits =new int[2],customCredits=new int[10];
    private final float score=(float) 2.0,distinction=(float) 3.75;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(adbm.this,MainActivity.class));
        overridePendingTransitionExit();
        finish();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adbm);

        try {
            initialize();
            commonAtt=new common();

            chkCustomCredit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        layoutCustomCredit.setVisibility(View.VISIBLE);
                    } else {
                        layoutCustomCredit.setVisibility(View.INVISIBLE);
                    }
                    var_onChange = isChecked;
                }
            });


            Rpm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[0] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbmit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[1] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rfa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[2] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[3] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rpe1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[4] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rob.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[5] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[6] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[7] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rpe2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[8] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbee.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[9] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            Cpm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[0] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbmit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[1] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cfa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[2] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[3] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cpe1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[4] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cob.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[5] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[6] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[7] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cpe2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[8] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbee.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[9] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float result = 0;

                    if (var_onChange == false) {
                        float semesterOne = (resultList[0] * defaultCredits[0] + resultList[1] * defaultCredits[1] + resultList[2] * defaultCredits[0] + resultList[3] * defaultCredits[0] + resultList[4] * defaultCredits[0]);
                        float semesterTwo = (resultList[5] * defaultCredits[0] + resultList[6] * defaultCredits[0] + resultList[7] * defaultCredits[0] + resultList[8] * defaultCredits[0] + resultList[9] * defaultCredits[0]);
                        result = (semesterOne + semesterTwo) / 42;

                    } else if (var_onChange == true) {
                        float semesterOne =commonAtt.sumOfResult(resultList,customCredits,0,4);
                        float semesterTwo =commonAtt.sumOfResult(resultList,customCredits,5,9);
                        result = (semesterOne + semesterTwo) / commonAtt.creditSum(customCredits);
                    }

                    startActivity(new Intent(adbm.this, showResult.class).putExtra("GPA", commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
                    overridePendingTransitionEnter();
                }
            });

        }catch (Exception ex){
            Log.d("OnCrExceptionsADBM",ex.toString());
        }

    }
    private void initializeSpinnerResult()throws Exception{

        Rpm =(Spinner)findViewById(R.id.spinResultPM);
        Rbmit =(Spinner)findViewById(R.id.spinResultBMIT);
        Rfa =(Spinner)findViewById(R.id.spinResultFA);
        Rbe =(Spinner)findViewById(R.id.spinResultBE);
        Rpe1 =(Spinner)findViewById(R.id.spinResultPE1);

        Rob =(Spinner)findViewById(R.id.spinResultOB);
        Rma =(Spinner)findViewById(R.id.spinResultMA);
        Rbs =(Spinner)findViewById(R.id.spinResultBS);
        Rpe2 =(Spinner)findViewById(R.id.spinResultPE2);
        Rbee =(Spinner)findViewById(R.id.spinResultBEE);

    }

    private void defaultCreditInitialization()throws Exception{
        defaultCredits[0]=4;
        defaultCredits[1]=6;
    }

    private void initializeSpinnerCredit()throws Exception{
        layoutCustomCredit=(TableLayout)findViewById(R.id.tLayoutCustomCredit);

        Cpm =(Spinner)findViewById(R.id.spinCreditPM);
        Cbmit =(Spinner)findViewById(R.id.spinCreditBMIT);
        Cfa =(Spinner)findViewById(R.id.spinCreditFA);
        Cbe =(Spinner)findViewById(R.id.spinCreditBE);
        Cpe1 =(Spinner)findViewById(R.id.spinCreditPE1);

        Cob =(Spinner)findViewById(R.id.spinCreditOB);
        Cma =(Spinner)findViewById(R.id.spinCreditMA);
        Cbs =(Spinner)findViewById(R.id.spinCreditBS);
        Cpe2 =(Spinner)findViewById(R.id.spinCreditPE2);
        Cbee =(Spinner)findViewById(R.id.spinCreditBEE);

        layoutCustomCredit.setVisibility(View.INVISIBLE);

    }

    private void initializeTextViews()throws Exception{
        txtpm = (TextView)findViewById(R.id.txtPM);
        txtbmit = (TextView)findViewById(R.id.txtBMIT);
        txtfa = (TextView)findViewById(R.id.txtFA);
        txtbe = (TextView)findViewById(R.id.txtBE);
        txtpe1 = (TextView)findViewById(R.id.txtPE1);
        txtob = (TextView)findViewById(R.id.txtOB);
        txtma = (TextView)findViewById(R.id.txtMA);
        txtbs = (TextView)findViewById(R.id.txtBS);
        txtpe2 = (TextView)findViewById(R.id.txtPE2);
        txtbee = (TextView)findViewById(R.id.txtBEE);
    }

    private void onClickTextView(TextView tView, final String subj)throws Exception{
        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.adbm),subj, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void showSubjectNames()throws Exception{
        onClickTextView(txtpm,"Principles of Management");
        onClickTextView(txtbmit,"Business Mathematics & IT");
        onClickTextView(txtfa,"Financial Accounting");
        onClickTextView(txtbe,"Business English");
        onClickTextView(txtpe1,"Principles of Economics - I Microeconomics");
        onClickTextView(txtob,"Organizational Behaviour");
        onClickTextView(txtma,"Managerial Accounting");
        onClickTextView(txtbs,"Business Statistics");
        onClickTextView(txtpe2,"Principles of Economics - II Microeconomics");
        onClickTextView(txtbee,"Business Ethics & Environment");
    }

    private void setCustomToDefault()throws Exception{
        Cpm.setSelection(2);
        Cbmit.setSelection(4);
        Cfa.setSelection(2);
        Cbe.setSelection(2);
        Cpe1.setSelection(2);

        Cob.setSelection(2);
        Cma.setSelection(2);
        Cbs.setSelection(2);
        Cpe2.setSelection(2);
        Cbee.setSelection(2);
    }

    private void initialize()throws Exception{
        chkCustomCredit =(CheckBox)findViewById(R.id.chkCustomCredit);
        calculate=(Button)findViewById(R.id.btnCalculate);
        defaultCreditInitialization();
        initializeSpinnerResult();
        initializeSpinnerCredit();
        initializeTextViews();
        showSubjectNames();
        setCustomToDefault();

    }

    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    protected void overridePendingTransitionExit() {
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}