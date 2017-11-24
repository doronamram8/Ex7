package com.example.madaim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void onButtonClick(View view) {

        EditText firstname=   (EditText) findViewById(R.id.ed);
        EditText lastname=   (EditText) findViewById(R.id.ed2);
        RadioGroup rg= (RadioGroup) findViewById(R.id.radioGroup);
        int gender= rg.getCheckedRadioButtonId();
        RadioButton rb=(RadioButton) findViewById(gender);
        String genderS=rb.getText().toString();
        String striingToPassBack=firstname.getText().toString();
        String striingToPassBack2=lastname.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("firstName",striingToPassBack);
        intent.putExtra("lastName",striingToPassBack2);
        intent.putExtra("gender",genderS);
        setResult(RESULT_OK,intent);
        finish();




    }


}
