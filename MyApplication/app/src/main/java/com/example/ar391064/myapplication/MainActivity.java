package com.example.ar391064.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText emailIDEditBox, password, retypepassword;
    public String UserNameReset,NewPassWordReset1,editText9;
    Button resetPassword;
    DatabaseHelper db;
    boolean reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing Views
        Button resetPassword = (Button) findViewById(R.id.resetPassword);
        db = new DatabaseHelper(this);
        emailIDEditBox = (EditText) findViewById(R.id.UserNameReset);
        password = (EditText) findViewById(R.id.NewPassWordReset1);
        retypepassword = (EditText) findViewById(R.id.editText9);


        //Attaching listener to button
        resetPassword.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                getEmailID();
                CheckDetails();
                matchingPass();
                boolean update = db.updateData(emailIDEditBox.getText().toString(),
                        password.getText().toString(),
                        retypepassword.getText().toString());
                if (update == true)
                    Toast.makeText(MainActivity.this, " Password Reset Successful", Toast.LENGTH_LONG).show();
                else {
                    Toast.makeText(MainActivity.this, "Password not reset", Toast.LENGTH_LONG).show();
                }


            }
        });
        }

        ////////////////////////////////// This Section is to get the ID from db ///////////////////////////////////////////////
        private String getEmailID(){
            String empty = "";
            EditText emailIdEditBox = (EditText) findViewById(R.id.UserNameReset);
            UserNameReset = emailIdEditBox.getText().toString();
            String emailCheck = db.searchEmailID(UserNameReset);
            if (TextUtils.isEmpty(UserNameReset)){
                Toast.makeText(MainActivity.this, "Password enter username", Toast.LENGTH_LONG).show();
                return "please enter username";

            } else if (!emailCheck.equals(UserNameReset)){
                Toast.makeText(MainActivity.this, "Please enter a valid username", Toast.LENGTH_LONG).show();

            }
            return "please enter valid username";
        }
//////////////////////////////// This section is to check the username againt the Database//////////////////////////////////////////////////
public void CheckDetails(){
    String emailIDEditBox = db.searchEmailID(UserNameReset);
    if (emailIDEditBox.equals(UserNameReset)){
        if ( password.equals(retypepassword)){
            Toast.makeText(MainActivity.this, "Password Reset", Toast.LENGTH_LONG).show();
        }
        else if (!TextUtils.isEmpty(UserNameReset)){
            Toast.makeText(MainActivity.this, "incorrect data login", Toast.LENGTH_LONG).show();
        }
        }
    }
    ///////////////////////////// This section is for verification//////////////////////////////////////////////////////////
    public boolean matchingPass (){
        UserNameReset = emailIDEditBox.getText().toString().trim();
        NewPassWordReset1 = password.getText().toString().trim();
        editText9 = retypepassword.getText().toString().trim();


       
        if (!editText9.equals(NewPassWordReset1)){
            retypepassword.setError("Passwords do not Match");
            return false;
        }
        if (NewPassWordReset1.isEmpty() || editText9.isEmpty()){
            password.setError("Enter in this field");
            retypepassword.setError("Enter in this field");
            return false;

        }
        return true;
    }


    }







