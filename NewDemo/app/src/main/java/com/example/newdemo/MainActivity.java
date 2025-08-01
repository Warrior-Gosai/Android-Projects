package com.example.newdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnsubmit;
    CheckBox chkdinner, chkcoding, chkreading, chkgaming;
    TextView completetask, notcompletetask;

    StringBuilder strctask, strnoctask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkdinner = findViewById(R.id.chkdinner);
        chkcoding = findViewById(R.id.chkcoding);
        chkreading = findViewById(R.id.chkreading);
        chkgaming = findViewById(R.id.chkgaming);

        btnsubmit = findViewById(R.id.btnSubmit);

        completetask = findViewById(R.id.completedtask);
        notcompletetask = findViewById(R.id.notcompletedtask);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                // Using IF-ELSE Statement
//                if (chkdinner.isChecked())
//                    strctask.append(chkdinner.getText().toString() +", ");
//                else
//                    strnoctask.append(chkdinner.getText().toString() +", ");
//
//
//                if (chkcoding.isChecked())
//                    strctask.append(chkcoding.getText().toString() +", ");
//                else
//                    strnoctask.append(chkcoding.getText().toString() +", ");
//
//
//                if (chkreading.isChecked())
//                    strctask.append(chkreading.getText().toString() +", ");
//                else
//                    strnoctask.append(chkreading.getText().toString() +", ");
//
//
//                if (chkgaming.isChecked())
//                    strctask.append(chkgaming.getText().toString() +", ");
//                else
//                    strnoctask.append(chkgaming.getText().toString() +", ");



//                // Using Ternary Operator
                // For Checking whether checkbox is checked or not :)
                strctask.append( chkdinner.isChecked() ? chkdinner.getText().toString() +", " : "" );
                strnoctask.append( !chkdinner.isChecked() ? chkdinner.getText().toString() +", " : "" );

                strctask.append( chkcoding.isChecked() ? chkcoding.getText().toString() +", " : "" );
                strnoctask.append( !chkcoding.isChecked() ? chkcoding.getText().toString() +", " : "" );

                strctask.append( chkreading.isChecked() ? chkreading.getText().toString() +", " : "" );
                strnoctask.append( !chkreading.isChecked() ? chkreading.getText().toString() +", " : "" );

                strctask.append( chkgaming.isChecked() ? chkgaming.getText().toString() +", " : "" );
                strnoctask.append( !chkgaming.isChecked() ? chkgaming.getText().toString() +", " : "" );


                completetask.setText(strctask.toString());
                notcompletetask.setText(strnoctask.toString());
            }
        });
    }
}









