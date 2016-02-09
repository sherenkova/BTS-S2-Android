package com.example.a9alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView txtViewInfo;
    private EditText editTextInput;
    private Button btnShow;
    private Button btnStartTerv;
    private Button btnStartBoundServ;
    private Button btnStartIntServ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        this.txtViewInfo = (TextView) this.findViewById(txtViewInfo);
        this.editTextInput = (EditText) this.findViewById(editTextInput);
        this.btnShow = (Button) this.findViewById(btnShow);
        this.btnStartTerv = (Button) this.findViewById(btnStartTerv);
        this.btnStartBoundServ = (Button) this.findViewById(btnStartBoundServ);
        this.btnStartIntServ = (Button) this.findViewById(btnStartIntServ);

    }

    @Override
    public void onClick() {



    }


}
