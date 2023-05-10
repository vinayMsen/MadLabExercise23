package com.example.milesalert_8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_vinay)
                        .setTitle("Be Alert!")
                                .setMessage("Follow Vinay Sen")
                                        .setNeutralButton("ok",new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int which) {
                                             Toast.makeText(getApplicationContext(),"Hello", Toast.LENGTH_SHORT).show();
                                            }
                                        }).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}