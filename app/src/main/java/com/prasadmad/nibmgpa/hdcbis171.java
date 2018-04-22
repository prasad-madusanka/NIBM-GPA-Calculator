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
 * Created by Prasad on 4/12/17.
 */

public class hdcbis171 extends AppCompatActivity {

    private common commonAtt;
    private TableLayout layoutCustomCredit;
    private CheckBox chkCustomCredit;
    private Button calculate;
    private Spinner Rmp, Rdsa, Rse, Rss, Radms, Rca, Read, Rsqa, Rdwdm, Rmad, Rbsit, Ror, Rsdp, Rit;
    private Spinner Cmp, Cdsa, Cse, Css, Cadms, Cca, Cead, Csqa, Cdwdm, Cmad, Cbsit, Cor, Csdp, Cit;
    private TextView txtmp, txtdsa, txtse,txtss, txtadms, txtca, txtead, txtsqa, txtdwdm, txtmad, txtbsit, txtor, txtsdp, txtit;

    private boolean var_onChange=false;
    private float[] resultList=new float[14];
    private int[] defaultCredits =new int[14],customCredits=new int[14];
    private final float score=(float) 3.3,distinction=(float)3.75;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(hdcbis171.this,MainActivity.class));
        overridePendingTransitionExit();
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hdcbis171);

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


            Rmp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[0] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rdsa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[1] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            Rse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[2] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[3] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Radms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[4] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[5] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Read.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[6] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rsqa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[7] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rdwdm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[8] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rmad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[9] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Rbsit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[10] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Ror.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

            Rit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    resultList[13] = commonAtt.returnGPA(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            Cmp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[0] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cdsa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[1] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[2] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Css.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[3] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cadms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[4] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[5] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cead.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[6] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Csqa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[7] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cdwdm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[8] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cmad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[9] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cbsit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    customCredits[10] = commonAtt.returnCredit(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            Cor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

            Cit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        float semesterOne = commonAtt.sumOfResult(resultList,defaultCredits,0,6);
                        float semesterTwo = commonAtt.sumOfResult(resultList,defaultCredits,7,13);
                        result = (semesterOne + semesterTwo) / 50;

                    } else if (var_onChange == true) {
                        float semesterOne = commonAtt.sumOfResult(resultList,customCredits,0,6);
                        float semesterTwo = commonAtt.sumOfResult(resultList,customCredits,7,13);
                        result = (semesterOne + semesterTwo) / commonAtt.creditSum(customCredits);
                    }
                    startActivity(new Intent(hdcbis171.this, showResult.class).putExtra("GPA", commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
                    overridePendingTransitionEnter();
                }
            });

        }catch (Exception ex){
            Log.d("OnCrExceptionsHDCBIS",ex.toString());
        }

    }
    private void initializeSpinnerResult()throws Exception{

        Rmp =(Spinner)findViewById(R.id.spinResultMP);
        Rdsa =(Spinner)findViewById(R.id.spinResultDSA);
        Rse =(Spinner)findViewById(R.id.spinResultSE);
        Rss =(Spinner)findViewById(R.id.spinResultSS);
        Radms =(Spinner)findViewById(R.id.spinResultADMS);
        Rca =(Spinner)findViewById(R.id.spinResultCA);
        Read =(Spinner)findViewById(R.id.spinResultEAD);

        Rsqa =(Spinner)findViewById(R.id.spinResultSQA);
        Rdwdm =(Spinner)findViewById(R.id.spinResultDWDM);
        Rmad =(Spinner)findViewById(R.id.spinResultMAD);
        Rbsit =(Spinner)findViewById(R.id.spinResultBSIT);
        Ror =(Spinner)findViewById(R.id.spinResultOR);
        Rsdp =(Spinner)findViewById(R.id.spinResultSDP);
        Rit =(Spinner)findViewById(R.id.spinResultIT);

    }

    private void initializeTextViews()throws Exception{
        txtmp = (TextView)findViewById(R.id.txtMP);
        txtdsa = (TextView)findViewById(R.id.txtDSA);
        txtse = (TextView)findViewById(R.id.txtSE);
        txtss = (TextView)findViewById(R.id.txtSS);
        txtadms = (TextView)findViewById(R.id.txtADMS);
        txtca = (TextView)findViewById(R.id.txtCA);
        txtead = (TextView)findViewById(R.id.txtEAD);
        txtsqa = (TextView)findViewById(R.id.txtSQA);
        txtdwdm = (TextView)findViewById(R.id.txtDWDM);
        txtmad = (TextView)findViewById(R.id.txtMAD);
        txtbsit = (TextView)findViewById(R.id.txtBSIT);
        txtor = (TextView)findViewById(R.id.txtOR);
        txtsdp = (TextView)findViewById(R.id.txtSDP);
        txtit = (TextView)findViewById(R.id.txtIT);
    }

    private void onClickTextView(TextView tView, final String subj)throws Exception{
        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.hdcbis171),subj, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void showSubjectNames()throws Exception{
        onClickTextView(txtmp,"Management Practices");
        onClickTextView(txtdsa,"Data Structures and Algorithms");
        onClickTextView(txtse,"Software Engineering");
        onClickTextView(txtss,"Software Security");
        onClickTextView(txtadms,"Advanced Database Management Systems");
        onClickTextView(txtca,"Computer Architecture");
        onClickTextView(txtead,"Enterprise Application Development");
        onClickTextView(txtsqa,"Software Quality Assurance");
        onClickTextView(txtdwdm,"Data Warehouse and Data Mining");
        onClickTextView(txtmad,"Mobile Application Development");
        onClickTextView(txtbsit,"Business Statistics for IT");
        onClickTextView(txtor,"Operational Research");
        onClickTextView(txtsdp,"Software Development Project");
        onClickTextView(txtit,"Industrial Training");
    }

    private void defaultCreditInitialization()throws Exception{
        defaultCredits[0]=3;
        defaultCredits[1]=3;
        defaultCredits[2]=3;
        defaultCredits[3]=3;
        defaultCredits[4]=4;
        defaultCredits[5]=3;
        defaultCredits[6]=3;

        defaultCredits[7]=3;
        defaultCredits[8]=4;
        defaultCredits[9]=3;
        defaultCredits[10]=3;
        defaultCredits[11]=3;
        defaultCredits[12]=6;
        defaultCredits[13]=6;
    }

    private void initializeSpinnerCredit()throws Exception{
        layoutCustomCredit=(TableLayout)findViewById(R.id.tLayoutCustomCredit);

        Cmp =(Spinner)findViewById(R.id.spinCreditMP);
        Cdsa =(Spinner)findViewById(R.id.spinCreditDSA);
        Cse =(Spinner)findViewById(R.id.spinCreditSE);
        Css =(Spinner)findViewById(R.id.spinCreditSS);
        Cadms =(Spinner)findViewById(R.id.spinCreditADMS);
        Cca =(Spinner)findViewById(R.id.spinCreditCA);
        Cead =(Spinner)findViewById(R.id.spinCreditEAD);
        Csqa =(Spinner)findViewById(R.id.spinCreditSQA);
        Cdwdm =(Spinner)findViewById(R.id.spinCreditDWDM);
        Cmad =(Spinner)findViewById(R.id.spinCreditMAD);
        Cbsit =(Spinner)findViewById(R.id.spinCreditBSIT);
        Cor =(Spinner)findViewById(R.id.spinCreditOR);
        Csdp =(Spinner)findViewById(R.id.spinCreditSDP);
        Cit =(Spinner)findViewById(R.id.spinCreditIT);

        layoutCustomCredit.setVisibility(View.INVISIBLE);

    }

    private void setCustomToDefault()throws Exception{
        Cmp.setSelection(1);
        Cdsa.setSelection(1);
        Cse.setSelection(1);
        Css.setSelection(1);
        Cadms.setSelection(2);
        Cca.setSelection(1);
        Cead.setSelection(1);

        Csqa.setSelection(1);
        Cdwdm.setSelection(2);
        Cmad.setSelection(1);
        Cbsit.setSelection(1);
        Cor.setSelection(1);
        Csdp.setSelection(4);
        Cit.setSelection(4);
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