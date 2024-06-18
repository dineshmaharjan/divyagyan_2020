package edu.divyagyan.loginsignupexample;



import static edu.divyagyan.loginsignupexample.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity  extends AppCompatActivity {

    private EditText fullNameEditText;
    private  EditText addressEditText;
    private  EditText mobileNumber;
    private  EditText passwordEditText;
    private RadioGroup genderRadioGroup;
    private Spinner countrySpinner;
    private CheckBox termsAndConditionCheckBox;
    private Button signupButton;
    private String selectedGender;
    private boolean isCheck;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullNameEditText = findViewById(R.id.fulNameEditText);
        addressEditText = findViewById(R.id.addressEditText);
        mobileNumber = findViewById(R.id.mobileNumber);
        passwordEditText = findViewById(R.id.passwordEditText);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        countrySpinner = findViewById(R.id.countrySpinner);
        termsAndConditionCheckBox = findViewById(R.id.termsAndConditionCheckBox);
        signupButton = findViewById(id.signupButton);
        
        
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String fullName=  fullNameEditText.getText().toString().trim();
              String address = addressEditText.getText().toString().trim();
              
              //mobile number and password
                
                
            }
        });
        
        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.maleRadioButton){
                    selectedGender = "Male";
                }else if(checkedId == id.femaleRadioButton){
                    selectedGender = "Female";
                }else{
                    selectedGender = "Others";
                }
                
            }
        });


        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        termsAndConditionCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isCheck = isChecked;
            }
        });


    }


//    void signup(View view){
//        Toast.makeText(this, "Work", Toast.LENGTH_LONG).show();;
//
//    }
}
