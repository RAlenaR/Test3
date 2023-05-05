package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText in;
    private Button button;
    private TextView out;
    private String string, string1;
    int ticket;
    SpbHappyTicket spbHappyTicket=new SpbHappyTicket();
    private View.OnClickListener lis=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            string=in.getText().toString();

            if (spbHappyTicket.isHappyTicket(string))
            {out.setText("Билет счастливый" + spbHappyTicket.nextHappyTicket(string));}
            else  {out.setText("Билет не счастливый. Следующий счастливый: "+ spbHappyTicket.nextHappyTicket(string));}
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in=findViewById(R.id.in);
        button=findViewById(R.id.button);
        out=findViewById(R.id.out);
        button.setOnClickListener(lis);
    }
}