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

public class hdbm extends AppCompatActivity {
    
    private common commonAtt;
    private TableLayout layoutCustomCredit;
    private CheckBox chkCustomCredit;
    private Button calculate;
    private Spinner Rmm, Rhrm, Rle, Rfm, Rem, Rom, Rlm, Rqm, Rcpd, Rsm, Rbpit;
    private Spinner Cmm, Chrm, Cle, Cfm, Cem, Com, Clm, Cqm, Ccpd, Csm, Cbpit;
    private TextView txtmm, txthrm, txtle, txtfm, txtem, txtom, txtlm, txtqm, txtcpd, txtsm, txtbpit;

    private boolean var_onChange=false;
    private float[] resultList=new float[11];
    private int[] defaultCredits =new int[2],customCredits=new int[11];
    private final float score=(float) 2.0,distinction=(float) 3.8;



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(hdbm.this,MainActivity.class));
        overridePendingTransitionExit();
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hdbm);

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


            Rmm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[0] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rhrm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[1] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[2] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rfm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[3] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[4] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[5] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rlm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[6] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rqm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[7] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rcpd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[8] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rsm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[9] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbpit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[10] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            Cmm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[0] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Chrm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[1] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[2] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cfm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[3] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[4] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Com.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[5] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Clm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[6] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cqm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[7] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Ccpd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[8] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Csm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[9] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbpit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[10] = commonAtt.returnCredit(position);
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
                        float semesterOne = (resultList[0] * defaultCredits[0] + resultList[1] * defaultCredits[0] + resultList[2] * defaultCredits[0] + resultList[3] * defaultCredits[0] + resultList[4] * defaultCredits[0]);
                        float semesterTwo = (resultList[5] * defaultCredits[0] + resultList[6] * defaultCredits[0] + resultList[7] * defaultCredits[0] + resultList[8] * defaultCredits[0] + resultList[9] * defaultCredits[0] + resultList[10] * defaultCredits[1]);
                        result = (semesterOne + semesterTwo) / 42;

                    } else if (var_onChange == true) {
                        float semesterOne =commonAtt.sumOfResult(resultList,customCredits,0,4);
                        float semesterTwo = commonAtt.sumOfResult(resultList,customCredits,5,10);
                        result = (semesterOne + semesterTwo) / commonAtt.creditSum(customCredits);
                    }
                    startActivity(new Intent(hdbm.this, showResult.class).putExtra("GPA", commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
                    overridePendingTransitionEnter();
                }
            });


        }catch (Exception ex){
        Log.d("OnCrExceptionsHDBM",ex.toString());
        }
    }

    private void initializeSpinnerResult()throws Exception{

        Rmm =(Spinner)findViewById(R.id.spinResultMM);
        Rhrm =(Spinner)findViewById(R.id.spinResultHRM);
        Rle =(Spinner)findViewById(R.id.spinResultLE);
        Rfm =(Spinner)findViewById(R.id.spinResultFM);
        Rem =(Spinner)findViewById(R.id.spinResultEM);

        Rom =(Spinner)findViewById(R.id.spinResultOM);
        Rlm =(Spinner)findViewById(R.id.spinResultLM);
        Rqm =(Spinner)findViewById(R.id.spinResultQM);
        Rcpd =(Spinner)findViewById(R.id.spinResultCPD);
        Rsm =(Spinner)findViewById(R.id.spinResultSM);
        Rbpit =(Spinner)findViewById(R.id.spinResultBPIT);

    }

    private void defaultCreditInitialization()throws Exception{
        defaultCredits[0]=4;
        defaultCredits[1]=2;
    }

    private void initializeSpinnerCredit()throws Exception{
        layoutCustomCredit=(TableLayout)findViewById(R.id.tLayoutCustomCredit);

        Cmm =(Spinner)findViewById(R.id.spinCreditMM);
        Chrm =(Spinner)findViewById(R.id.spinCreditHRM);
        Cle =(Spinner)findViewById(R.id.spinCreditLE);
        Cfm =(Spinner)findViewById(R.id.spinCreditFM);
        Cem =(Spinner)findViewById(R.id.spinCreditEM);

        Com =(Spinner)findViewById(R.id.spinCreditOM);
        Clm =(Spinner)findViewById(R.id.spinCreditLM);
        Cqm =(Spinner)findViewById(R.id.spinCreditQM);
        Ccpd =(Spinner)findViewById(R.id.spinCreditCPD);
        Csm =(Spinner)findViewById(R.id.spinCreditSM);
        Cbpit =(Spinner)findViewById(R.id.spinCreditBPIT);

        layoutCustomCredit.setVisibility(View.INVISIBLE);

    }

    private void initializeTextViews()throws Exception{
        txtmm = (TextView)findViewById(R.id.txtMM);
        txthrm = (TextView)findViewById(R.id.txtHRM);
        txtle = (TextView)findViewById(R.id.txtLE);
        txtfm = (TextView)findViewById(R.id.txtFM);
        txtem = (TextView)findViewById(R.id.txtEM);
        txtom = (TextView)findViewById(R.id.txtOM);
        txtlm = (TextView)findViewById(R.id.txtLM);
        txtqm = (TextView)findViewById(R.id.txtQM);
        txtcpd = (TextView)findViewById(R.id.txtCPD);
        txtsm = (TextView)findViewById(R.id.txtSM);
        txtbpit = (TextView)findViewById(R.id.txtBPIT);
    }

    private void onClickTextView(TextView tView, final String subj)throws Exception{
        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.hdbm),subj, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void showSubjectNames()throws Exception{
        onClickTextView(txtmm,"Marketing Management");
        onClickTextView(txthrm,"Human Resource Management");
        onClickTextView(txtle,"Legal Environment");
        onClickTextView(txtfm,"Financial Management");
        onClickTextView(txtem,"Environmental Management");
        onClickTextView(txtom,"Operations Management");
        onClickTextView(txtlm,"Logistics Management");
        onClickTextView(txtqm,"Quality Management");
        onClickTextView(txtcpd,"Continuous Professional Development");
        onClickTextView(txtsm,"Strategic Management");
        onClickTextView(txtbpit,"Business Project & Industrial Training");
    }

    private void setCustomToDefault()throws Exception{
        Cmm.setSelection(2);
        Chrm.setSelection(2);
        Cle.setSelection(2);
        Cfm.setSelection(2);
        Cem.setSelection(2);

        Com.setSelection(2);
        Clm.setSelection(2);
        Cqm.setSelection(2);
        Ccpd.setSelection(2);
        Csm.setSelection(2);
        Cbpit.setSelection(0);
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