package edu.ccm.contactsappthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ContactActivity extends AppCompatActivity {

    public static final String CONTACT_NUMBER = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Intent intent = getIntent();
        int contactId = intent.getIntExtra(CONTACT_NUMBER, MainActivity.mContactNumber);

        // Select the radio button matching the color ID
        if(contactId == 1){

        }
        else if(contactId == 2){

        }
        else if(contactId == 3){

        }

    }

    public void backButtonClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}