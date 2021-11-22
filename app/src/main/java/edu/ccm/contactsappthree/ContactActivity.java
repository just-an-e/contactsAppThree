package edu.ccm.contactsappthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Intent intent = getIntent();
        int colorId = intent.getIntExtra(EXTRA_COLOR, R.color.yellow);

        // Select the radio button matching the color ID
        int radioId = R.id.radio_yellow;
        if (colorId == R.color.red) {
            radioId = R.id.radio_red;
        }
        else if (colorId == R.color.orange) {
            radioId = R.id.radio_orange;
        }
        else if (colorId == R.color.green) {
            radioId = R.id.radio_green;
        }

        RadioButton radio = findViewById(radioId);
        radio.setChecked(true);
    }

    public void backButtonClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}