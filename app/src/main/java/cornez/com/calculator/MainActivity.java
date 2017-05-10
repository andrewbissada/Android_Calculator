package cornez.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnC, btnCE, btnPlusMinus, btnDivide, btn7, btn8, btn9, btnPlus, btn4, btn5, btn6, btnMinus, btn1, btn2, btn3, btnMultiply, btnZero, btnDot, btnEquals;

    TextView numberTextView;

    private double displayValue;

    CalculatorEngine ce = new CalculatorEngine(12);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = (Button) findViewById(R.id.btnC);
        btnCE = (Button) findViewById(R.id.btnCE);
        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEquals = (Button) findViewById(R.id.btnEquals);

        numberTextView = (TextView) findViewById(R.id.numberTextView);



        //Look at display when sideways

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                numberTextView.setText("0");
                ce.clear();
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                numberTextView.setText("0");
                ce.clearEntry();
            }
        });

        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.toggleSign();
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                        ce.perform(Operation.DIVIDE);
                    }
                });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('7');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                        ce.insert('8');
                        displayValue = ce.getDisplayValue();
                        numberTextView.setText(Double.toString(displayValue));
                    }
                });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('9');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
                //numberTextView.setText("9");

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //valueOne = Float.parseFloat(numberTextView.getText()+"";;)
                        //addedBool = true;
                        //
                        ce.perform(Operation.ADD);
                    }
                });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('4');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                        ce.insert('5');
                        displayValue = ce.getDisplayValue();
                        numberTextView.setText(Double.toString(displayValue));
                    }
                });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('6');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                        ce.perform(Operation.SUBTRACT);
                    }
                });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('1');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ce.insert('2');
                        displayValue = ce.getDisplayValue();
                        numberTextView.setText(Double.toString(displayValue));
                    }
                });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('3');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                        ce.perform(Operation.MULTIPLY);
                    }
                });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                ce.insert('0');
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //
                        //numberTextView.setText(".");
                        ce.insert('.');
                    }
                });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //valueTwo = Float.parseFloat(numberTextView.getText()+"");
                //if(addedBool==true){ numberTextView.setText(valueOne-valueTwo+"");
                //addedBool=false;
                ce.perform(Operation.EQUALS);
                displayValue = ce.getDisplayValue();
                numberTextView.setText(Double.toString(displayValue));
            }
        });

    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("ce", ce);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ce = (CalculatorEngine) savedInstanceState.getSerializable("ce");
        displayValue = ce.getDisplayValue();
        numberTextView.setText(Double.toString(displayValue));

    }
}
