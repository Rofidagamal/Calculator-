package com.example.calclautor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button zero_zero;
     Button zero;
     Button one;
     Button two;
     Button three;
     Button four;
     Button five;
     Button six;
     Button seven;
     Button eight;
     Button nine;
     Button btn_add;
     Button btn_sub;
     Button btn_mul;
     Button btn_div;
     Button btn_equal;
     Button btn_C;
     Button btn_dot;
     Button btn_del;
     Button btn_present;
     TextView info;
     TextView result;
     final char ADDITION = '+';
     final char SUBTRACTION = '-';
     final char MULTIPLICATION = '*';
     final char DIVISION = '/';
     final char PRESENT='%';
     final char EQUAL = 0;
     double val1 = Double.NaN;
     double val2;
     char ACTION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
//////////////////////////////////////////////////////////////////////////
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!info.getText().toString().contains(".")) {
                    info.setText(info.getText().toString() + ".");
                }

            }
        });
//////////////////////////////////////////////////////////////////////////
        zero_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "00");
            }
        });
//////////////////////////////////////////////////////////////////////////
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });
/////////////////////////////////////////////////////////////////////////////
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });
/////////////////////////////////////////////////////////////////////
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });
///////////////////////////////////////////////////////////////////
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });
////////////////////////////////////////
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });
/////////////////////////////////////////////////////
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });
///////////////////////////////////////////
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });
//////////////////////////////////////////////////////
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });
//////////////////////////////////////////////////////
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });
/////////////////////////////////////////////////////////////////////
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                    ACTION = SUBTRACTION;
                    if (!result.getText().toString().contains("-")) {
                        result.setText(String.valueOf(val1) + "-");
                    }                    info.setText(null);

            }
        });
////////////////////////////////////////////////////////////////////////////
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                    ACTION = ADDITION;
                    if (!result.getText().toString().contains("+")) {
                        result.setText(String.valueOf(val1) + "+");
                    }                    info.setText("");

            }
        });
////////////////////////////////////////////////////////////////////////////
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                    ACTION = MULTIPLICATION;
                    if (!result.getText().toString().contains("*")) {
                        result.setText(String.valueOf(val1) + "*");
                    }
                    info.setText("");
                }

                    });
//////////////////////////////////////////////////////////////////////////////
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                    ACTION = DIVISION;
                    if (!result.getText().toString().contains("/")) {
                        result.setText(String.valueOf(val1) + "/");
                    }                    info.setText("");
                }

        });
//////////////////////////////////////////////////////////////////////////////
        btn_present.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                ACTION =PRESENT ;
                if (!result.getText().toString().contains("%")) {
                    result.setText(String.valueOf(val1) + "%");
                }
                info.setText("");
            }
        });
///////////////////////////////////////////////////////////////////////////
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().toString().contains("+") || result.getText().toString().contains("-") || result.getText().toString().contains("/") || result.getText().toString().contains("*") || result.getText().toString().contains("%")) {
                    compute();
                    ACTION = EQUAL;
//                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                    result.setText(String.valueOf(val1));
                }
                else {
                    val1=Double.parseDouble(info.getText().toString());
                    result.setText(String.valueOf(val1));
                }



                // 5 + 4 = 9
//                info.setText("");
            }
        });
///////////////////////////////////////////////////////////////////////////
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText("");
                    result.setText("");
                }
            }
        });


///////////////////////////////////////////////////////////////////////////
        btn_C.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                val1 = Double.NaN;
                val2 = Double.NaN;
                info.setText("");
                result.setText("");

        }
    });

}
/////////////////////////////////////////////////////////////////

    private void setupUIViews(){

        zero_zero=(Button)findViewById(R.id.zero_zero);
        one = (Button)findViewById(R.id.one);
        zero = (Button)findViewById(R.id.zero);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_mul = (Button)findViewById(R.id.btn_mul);
        btn_div = (Button)findViewById(R.id.btn_div);
        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_present = (Button)findViewById(R.id.btn_present);
        btn_dot = (Button)findViewById(R.id.btn_dot);
        btn_del= (Button)findViewById(R.id.btn_del);
        btn_C=(Button)findViewById(R.id.btn_C);
        info = (TextView)findViewById(R.id.textView);
        result = (TextView)findViewById(R.id.textView2);


    }
/////////////////////////////////////////////////////////////////
    private void compute(){
        if(!Double.isNaN(val1)){
            if (ACTION=='%'){
                val2=100.0;
            }
            else {
                val2 = Double.parseDouble(info.getText().toString());
            }
            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case PRESENT:
                    val1 = val1 / val2;
                case EQUAL:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}

