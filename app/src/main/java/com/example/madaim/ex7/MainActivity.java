package com.example.madaim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    final int registercode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goToActivity2(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivityForResult(intent, registercode);


    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == registercode  && resultCode==RESULT_OK) {
            String gender;
            Resources res = getResources();

            if (data.getStringExtra("gender").compareTo("Male") == 0) {
                gender = "Mr. ";
            }
                else
                {
                    gender = "Ms. ";
                }
                String returnString = getString(R.string.back)+" " + gender + " " + data.getStringExtra("firstName") + "," + data.getStringExtra("lastName");
                TextView textView = (TextView) findViewById(R.id.intro);
                Button b = (Button) findViewById(R.id.button);
                b.setText(R.string.bt2);
                textView.setText(returnString);

            }

        }
    }
