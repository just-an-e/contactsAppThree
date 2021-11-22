package edu.ccm.contactsappthree;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int mContactNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void detailsButtonOneClick(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        mContactNumber = 1;
        intent.putExtra(ContactActivity.CONTACT_NUMBER, mContactNumber);
        mColorResultLauncher.launch(intent);
    }

    public void detailsButtonTwoClick(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        mContactNumber = 2;
        intent.putExtra(ContactActivity.CONTACT_NUMBER, mContactNumber);
        mColorResultLauncher.launch(intent);
    }

    public void detailsButtonThreeClick(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        mContactNumber = 3;
        intent.putExtra(ContactActivity.CONTACT_NUMBER, mContactNumber);
        mColorResultLauncher.launch(intent);
    }

    private final ActivityResultLauncher<Intent> mColorResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                }
            });
}