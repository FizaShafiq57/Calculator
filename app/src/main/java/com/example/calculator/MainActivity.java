package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Build;
//import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnMul,btnDiv,btnSub,btnAdd;
    Button btnDot,btnClear,btndelete,btnEqual;
    EditText edit1;
  boolean ADD,SUB,MUL,DIV;
    float result1 ;
    float result2;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        edit1 = (EditText)findViewById(R.id.btnText);
        edit1.setShowSoftInputOnFocus(false);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnClear = (Button)findViewById(R.id.btnclear);
        btndelete = (Button)findViewById(R.id.btndelete);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        btnDot = (Button)findViewById(R.id.btnDot);
        edit1 = (EditText)findViewById(R.id.btnText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { edit1.setText(edit1.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1 == null)
                {
                    edit1.setText("");
                }
                else
                {
                    result1 = Float.parseFloat(edit1.getText() + "");
                    ADD = true;
                    edit1.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1 == null)
                {
                    edit1.setText("");
                }
                else
                {
                    result1 = Float.parseFloat(edit1.getText() + "");
                    SUB = true;
                    edit1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1 == null)
                {
                    edit1.setText("");
                }
                else
                {
                    result1 = Float.parseFloat(edit1.getText() + "");
                    MUL = true;
                    edit1.setText(null);
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1 == null)
                {
                    edit1.setText("");
                }
                else
                {
                    result1 = Float.parseFloat(edit1.getText() + "");
                    DIV = true;
                    edit1.setText("");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 = Float.parseFloat(edit1.getText() + "");
                if(ADD == true)
                {
                    edit1.setText((int) (result1 + result2)) ;
                    ADD = false;
                }

                if(SUB == true)
                {
                    edit1.setText((int) (result1 - result2));
                    SUB = false;
                }

                if(MUL == true)
                {
                    edit1.setText((int) (result1 * result2));
                    MUL = false;
                }

                if(DIV == true)
                {
                    edit1.setText((int) (result1 / result2));
                    DIV = false;
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit1.setText("");
            }
        });
        //btndelete.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //int cursorPos = edit1.getSelectionStart();
        //int textln = edit1.getText().length();
        //if(cursorPos !=0 && textln !=0)
        //{
        //  SpannableStringBuilder selection = (SpannableStringBuilder) edit1.getText();
        //    int start;
        //      selection.replace(start,cursorPos-1, cursorPos, "");
        //    }
        //  }
        //});
    }
}