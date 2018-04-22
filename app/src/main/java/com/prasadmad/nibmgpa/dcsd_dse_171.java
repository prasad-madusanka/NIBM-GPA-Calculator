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

import org.w3c.dom.Text;

/**
 * Created by Prasad on 5/5/17.
 */

public class dcsd_dse_171 extends AppCompatActivity{

    private common commonAtt;
    private TableLayout layoutCustomCredit;
    private CheckBox chkCustomCredit;
    private Button calculate;
    private Spinner Rics,Rqtc, Rpf,Rdbms, Rco, Roop1,Rsad, Rgui, Rcn,Rss, Roop2, RWebad,Rsdp;
    private Spinner Cics,Cqtc, Cpf,Cdbms, Cco, Coop1,Csad, Cgui, Ccn,Css, Coop2, CWebad,Csdp;
    private TextView txtics,txtqtc, txtpf,txtdbms, txtco, txtoop1,txtsad, txtgui, txtcn,txtss, txtoop2, txtWebad,txtsdp;

    private boolean var_onChange=false;
    private float[] resultList=new float[13];
    private int[] defaultCredits =new int[13],customCredits=new int[13];
    private final float score=(float) 3.3,distinction=(float)3.80;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(dcsd_dse_171.this,MainActivity.class));
        overridePendingTransitionExit();
        finish();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dcsd_dse_171);

        try{
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

            Rco.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[4] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Roop1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[5] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rsad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[6] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rgui.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[7] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rcn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[8] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[9] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Roop2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[10] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            RWebad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[11] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rsdp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[12] = commonAtt.returnGPA(position);
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

            Cco.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[4] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Coop1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[5] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Csad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[6] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cgui.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[7] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Ccn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[8] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Css.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[9] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Coop2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[10] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            CWebad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[11] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Csdp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[12] = commonAtt.returnCredit(position);
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
                        float semesterTwo = commonAtt.sumOfResult(resultList,defaultCredits,4,7);
                        float semesterThree = commonAtt.sumOfResult(resultList,defaultCredits,8,12);
                        result = (semesterOne + semesterTwo + semesterThree) /45;

                    } else if (var_onChange == true) {
                        float semesterOne = commonAtt.sumOfResult(resultList,customCredits,0,3);
                        float semesterTwo = commonAtt.sumOfResult(resultList,customCredits,4,7);
                        float semesterThree = commonAtt.sumOfResult(resultList,customCredits,8,12);
                        result = (semesterOne + semesterTwo + semesterThree) / commonAtt.creditSum(customCredits);
                    }
                    startActivity(new Intent(dcsd_dse_171.this, showResult.class).putExtra("GPA", commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
                    overridePendingTransitionEnter();
                }
            });



        }catch (Exception ex){
            Log.d("OnCrExceptionsDCSD16",ex.toString());
        }
    }

    private void initializeSpinnerResult()throws Exception{

        Rics=(Spinner)findViewById(R.id.spinResultICS);
        Rqtc=(Spinner)findViewById(R.id.spinResultQTC);
        Rpf =(Spinner)findViewById(R.id.spinResultPF);
        Rdbms=(Spinner)findViewById(R.id.spinResultDBMS);

        Rco =(Spinner)findViewById(R.id.spinResultCO);
        Roop1 =(Spinner)findViewById(R.id.spinResultOOP1);
        Rgui =(Spinner)findViewById(R.id.spinResultGUI);
        Rsad=(Spinner)findViewById(R.id.spinResultSAD);

        Rcn =(Spinner)findViewById(R.id.spinResultCN);
        Roop2 =(Spinner)findViewById(R.id.spinResultOOP2);
        Rss=(Spinner)findViewById(R.id.spinResultSS);
        RWebad =(Spinner)findViewById(R.id.spinResultWebAD);
        Rsdp=(Spinner)findViewById(R.id.spinResultSDP);

    }

    private void initializeTextViews()throws Exception{
        txtics = (TextView)findViewById(R.id.txtICS);
        txtqtc = (TextView)findViewById(R.id.txtQTC);
        txtpf = (TextView)findViewById(R.id.txtPF);
        txtdbms = (TextView)findViewById(R.id.txtDBMS);
        txtco = (TextView)findViewById(R.id.txtCO);
        txtoop1 = (TextView)findViewById(R.id.txtOOP1);
        txtsad = (TextView)findViewById(R.id.txtSAD);
        txtgui = (TextView)findViewById(R.id.txtGUI);
        txtcn = (TextView)findViewById(R.id.txtCN);
        txtss = (TextView)findViewById(R.id.txtSS);
        txtoop2 = (TextView)findViewById(R.id.txtOOP2);
        txtWebad = (TextView)findViewById(R.id.txtWebAD);
        txtsdp = (TextView)findViewById(R.id.txtSDP);
    }

    private void onClickTextView(TextView tView, final String subj)throws Exception{
        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.dcsd_dse_171),subj, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void showSubjectNames()throws Exception{
        onClickTextView(txtics,"Introduction to Computer Science");
        onClickTextView(txtqtc,"Quantitative Techniques for Computing");
        onClickTextView(txtpf,"Programming Fundamentals");
        onClickTextView(txtdbms,"Database Management System");
        onClickTextView(txtco,"Computer Organization/Technology");
        onClickTextView(txtoop1,"Object Oriented Programming - 1");
        onClickTextView(txtsad,"System Analysis and Design/Software Engineering");
        onClickTextView(txtgui,"GUI Application Development");
        onClickTextView(txtcn,"Computer Networking/Architecture and Networking");
        onClickTextView(txtss,"System Software");
        onClickTextView(txtWebad,"Web Application Development");
        onClickTextView(txtoop2,"Object Oriented Programming - 2");
        onClickTextView(txtsdp,"Also known as Final Project");
    }


    private void defaultCreditInitialization()throws Exception{
        defaultCredits[0]=3;
        defaultCredits[1]=2;
        defaultCredits[2]=3;
        defaultCredits[3]=3;

        defaultCredits[4]=4;
        defaultCredits[5]=3;
        defaultCredits[6]=4;
        defaultCredits[7]=3;

        defaultCredits[8]=4;
        defaultCredits[9]=4;
        defaultCredits[10]=3;
        defaultCredits[11]=4;
        defaultCredits[12]=5;
    }

    private void initializeSpinnerCredit()throws Exception{
        layoutCustomCredit=(TableLayout)findViewById(R.id.tLayoutCustomCredit);

        Cics=(Spinner)findViewById(R.id.spinCreditICS);
        Cqtc=(Spinner)findViewById(R.id.spinCreditQTC);
        Cpf =(Spinner)findViewById(R.id.spinCreditPF);
        Cdbms=(Spinner)findViewById(R.id.spinCreditDBMS);

        Cco =(Spinner)findViewById(R.id.spinCreditCO);
        Coop1 =(Spinner)findViewById(R.id.spinCreditOOP1);
        Cgui =(Spinner)findViewById(R.id.spinCreditGUI);
        Csad=(Spinner)findViewById(R.id.spinCreditSAD);

        Ccn =(Spinner)findViewById(R.id.spinCreditCAN);
        Coop2 =(Spinner)findViewById(R.id.spinCreditOOP2);
        Css=(Spinner)findViewById(R.id.spinCreditSS);
        CWebad =(Spinner)findViewById(R.id.spinCreditWebAD);
        Csdp=(Spinner)findViewById(R.id.spinCreditSDP);

        layoutCustomCredit.setVisibility(View.INVISIBLE);

    }

    private void setCustomToDefault()throws Exception{
        Cics.setSelection(1);
        Cqtc.setSelection(0);
        Cpf.setSelection(1);
        Cdbms.setSelection(1);

        Cco.setSelection(2);
        Coop1.setSelection(1);
        Cgui.setSelection(1);
        Csad.setSelection(2);

        Ccn.setSelection(2);
        Coop2.setSelection(1);
        Css.setSelection(2);
        CWebad.setSelection(2);
        Csdp.setSelection(3);
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
