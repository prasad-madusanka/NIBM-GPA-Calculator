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
import android.widget.Toast;

/**
 * Created by Prasad on 4/12/17.
 */

public class dcsd161 extends AppCompatActivity {

    private common commonAtt;
    private TableLayout layoutCustomCredit;
    private CheckBox chkCustomCredit;
    private Button calculate;
    private Spinner Rics,Rqtc,Rpf,Rdbms,Rct,Rcpp,Rbis,Rsad, Rcs,Rca,Rss,Rit,Rjava,Rsdp;
    private Spinner Cics,Cqtc,Cpf,Cdbms,Cct,Ccpp,Cbis,Csad, Ccs,Cca,Css,Cit,Cjava,Csdp;
    private TextView txtics,txtqtc,txtpf,txtdbms,txtct,txtcpp,txtbis,txtsad, txtcs,txtca,txtss,txtit,txtjava,txtsdp;

    private boolean var_onChange=false;
    private float[] resultList=new float[14];
    private int[] defaultCredits =new int[14],customCredits=new int[14];
    private final float score=(float) 3.3,distinction=(float)3.80;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(dcsd161.this,MainActivity.class));
        overridePendingTransitionExit();
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dcsd161);


        try {

            initialize();
            commonAtt =new common();

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


            Rics.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[0] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rqtc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[1] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rpf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[2] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rdbms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[3] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rct.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[4] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[5] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rcpp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[6] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rsad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[7] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rcs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[8] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[9] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[10] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[11] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rjava.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[12] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rsdp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[13] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });



            Cics.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[0] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cqtc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[1] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cpf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[2] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cdbms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[3] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cct.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[4] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[5] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Ccpp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[6] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Csad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[7] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Ccs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[8] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[9] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Css.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[10] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[11] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cjava.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[12] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Csdp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[13] = commonAtt.returnCredit(position);
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

                        float semesterOne = commonAtt.sumOfResult(resultList,defaultCredits,0,3);
                        float semesterTwo = commonAtt.sumOfResult(resultList,defaultCredits,4,8);
                        float semesterThree = commonAtt.sumOfResult(resultList,defaultCredits,9,13);
                        result=(semesterOne+semesterTwo+semesterThree)/53;

                    } else if (var_onChange == true) {
                        float semesterOne = commonAtt.sumOfResult(resultList,customCredits,0,3);
                        float semesterTwo = commonAtt.sumOfResult(resultList,customCredits,4,8);
                        float semesterThree = commonAtt.sumOfResult(resultList,customCredits,9,13);
                        result = (semesterOne + semesterTwo + semesterThree) / commonAtt.creditSum(customCredits);
                    }

                    startActivity(new Intent(dcsd161.this, showResult.class).putExtra("GPA",commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
                    overridePendingTransitionEnter();
                }


            });


        }catch(Exception ex) {
            Log.d("OnCrExceptionsDCSD15", ex.toString());
        }
    }

    private void initializeSpinnerResult()throws Exception{

        Rics=(Spinner)findViewById(R.id.spinResultICS);
        Rqtc=(Spinner)findViewById(R.id.spinResultQTC);
        Rpf =(Spinner)findViewById(R.id.spinResultPF);
        Rdbms=(Spinner)findViewById(R.id.spinResultDBMS);

        Rct=(Spinner)findViewById(R.id.spinResultCT);
        Rcpp=(Spinner)findViewById(R.id.spinResultCPP);
        Rbis=(Spinner)findViewById(R.id.spinResultBIS);
        Rsad=(Spinner)findViewById(R.id.spinResultSAD);
        Rcs =(Spinner)findViewById(R.id.spinResultCS);

        Rca=(Spinner)findViewById(R.id.spinResultCA);
        Rss=(Spinner)findViewById(R.id.spinResultSS);
        Rit=(Spinner)findViewById(R.id.spinResultIT);
        Rjava=(Spinner)findViewById(R.id.spinResultJAVA);
        Rsdp=(Spinner)findViewById(R.id.spinResultSDP);

    }

    private void initializeTextViews()throws Exception{
        txtics = (TextView)findViewById(R.id.txtICS);
        txtqtc = (TextView)findViewById(R.id.txtQTC);
        txtpf = (TextView)findViewById(R.id.txtPF);
        txtdbms = (TextView)findViewById(R.id.txtDBMS);
        txtct = (TextView)findViewById(R.id.txtCT);
        txtcpp = (TextView)findViewById(R.id.txtCPP);
        txtbis = (TextView)findViewById(R.id.txtBIS);
        txtsad = (TextView)findViewById(R.id.txtSAD);
        txtcs = (TextView)findViewById(R.id.txtCS);
        txtca = (TextView)findViewById(R.id.txtCA);
        txtss = (TextView)findViewById(R.id.txtSS);
        txtit = (TextView)findViewById(R.id.txtIT);
        txtjava = (TextView)findViewById(R.id.txtJAVA);
        txtsdp = (TextView)findViewById(R.id.txtSDP);

    }

    private void onClickTextView(TextView tView, final String subj)throws Exception{
        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.dcsd161),subj, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void showSubjectNames()throws Exception{
        onClickTextView(txtics,"Introduction to Computer Science");
        onClickTextView(txtqtc,"Quantitative Techniques for Computing");
        onClickTextView(txtpf,"Programming Fundamentals");
        onClickTextView(txtdbms,"Database Management System");
        onClickTextView(txtct,"Computer Technology");
        onClickTextView(txtcpp,"OOP with C++");
        onClickTextView(txtbis,"Business Information System");
        onClickTextView(txtsad,"System Analysis and Design");
        onClickTextView(txtcs,"C# .Net programming");
        onClickTextView(txtca,"Computer Architecture and Networking");
        onClickTextView(txtss,"System Software");
        onClickTextView(txtit,"Internet Technology");
        onClickTextView(txtjava,"Programming in Java");
        onClickTextView(txtsdp,"Computer System Design Project");
    }

    private void defaultCreditInitialization()throws Exception{
        defaultCredits[0]=3;
        defaultCredits[1]=2;
        defaultCredits[2]=3;
        defaultCredits[3]=3;

        defaultCredits[4]=3;
        defaultCredits[5]=2;
        defaultCredits[6]=3;
        defaultCredits[7]=5;
        defaultCredits[8]=3;

        defaultCredits[9]=4;
        defaultCredits[10]=4;
        defaultCredits[11]=5;
        defaultCredits[12]=3;
        defaultCredits[13]=10;
    }

    private void initializeSpinnerCredit()throws Exception{
        layoutCustomCredit=(TableLayout)findViewById(R.id.tLayoutCustomCredit);

        Cics=(Spinner)findViewById(R.id.spinCreditICS);
        Cqtc=(Spinner)findViewById(R.id.spinCreditQTC);
        Cpf =(Spinner)findViewById(R.id.spinCreditPF);
        Cdbms=(Spinner)findViewById(R.id.spinCreditDBMS);
        Cct=(Spinner)findViewById(R.id.spinCreditCT);
        Ccpp=(Spinner)findViewById(R.id.spinCreditCPP);
        Cbis=(Spinner)findViewById(R.id.spinCreditBIS);
        Csad=(Spinner)findViewById(R.id.spinCreditSAD);
        Ccs =(Spinner)findViewById(R.id.spinCreditCS);
        Cca=(Spinner)findViewById(R.id.spinCreditCA);
        Css=(Spinner)findViewById(R.id.spinCreditSS);
        Cit=(Spinner)findViewById(R.id.spinCreditIT);
        Cjava=(Spinner)findViewById(R.id.spinCreditJAVA);
        Csdp=(Spinner)findViewById(R.id.spinCreditSDP);

        layoutCustomCredit.setVisibility(View.INVISIBLE);

    }

    private void setCustomToDefault()throws Exception{
        Cics.setSelection(1);
        Cqtc.setSelection(0);
        Cpf.setSelection(1);
        Cdbms.setSelection(1);

        Cct.setSelection(1);
        Cbis.setSelection(0);
        Ccpp.setSelection(1);
        Csad.setSelection(3);
        Ccs.setSelection(1);

        Cca.setSelection(2);
        Css.setSelection(2);
        Cit.setSelection(3);
        Cjava.setSelection(1);
        Csdp.setSelection(8);
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