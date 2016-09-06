package net.dreamersnet.quadraticequation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCalc = (Button) findViewById(R.id.btnCalc);
        if (btnCalc != null) {
            btnCalc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView txtXans = (TextView) findViewById(R.id.txtXans);
                    EditText EditTextA = (EditText) findViewById(R.id.editTextA);
                    EditText EditTextB = (EditText) findViewById(R.id.editTextB);
                    EditText EditTextC = (EditText) findViewById(R.id.editTextC);
                    Double a,b,c,x,x2;
                    a = Double.valueOf( EditTextA.getText().toString());
                    b = Double.valueOf( EditTextB.getText().toString());
                    c = Double.valueOf( EditTextC.getText().toString());
                    x = ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                    x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                    if (x.isNaN() || x2.isNaN())
                    {
                        Toast.makeText(MainActivity.this, R.string.error_toast, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, R.string.toast, Toast.LENGTH_SHORT).show();
                    }
                    txtXans.setText("{" + x + "," + x2 + "}");

                }
            });
        }
    }

}
