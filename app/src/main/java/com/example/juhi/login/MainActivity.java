package com.example.juhi.login;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;         // For Toast Message
public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;
    TextView tx1,tx2,tx3;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        b2 = (Button)findViewById(R.id.button2);
        tx1 = (TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);
        tx2 = (TextView)findViewById(R.id.textView2);
        tx2.setVisibility(View.GONE);
        tx3 = (TextView)findViewById(R.id.textview4);
        tx3.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("juhi") &&
                        ed2.getText().toString().equals("juhi")) {
                    //Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();    // For Toast Message
                    tx1.setBackgroundColor(Color.GREEN);
                    tx3.setVisibility(View.VISIBLE);
                    tx3.setText("Login Successful");
                    tx3.setBackgroundColor(Color.GREEN);
                }else{
                    //Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();   // For Toast Message
                    tx2.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    tx3.setVisibility(View.VISIBLE);
                    tx3.setText("Wrong Credentials");
                    tx3.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));
                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}