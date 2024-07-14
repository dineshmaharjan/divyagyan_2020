package edu.divyagyan.dialogfragmentexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button logoutButton, customDialogButton, calculateButton;

    private EditText firstNumberEditText, secondNumberEditText;
    private TextView resultTextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoutButton = findViewById(R.id.logoutButton);
        customDialogButton = findViewById(R.id.customDialogButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogFragmentExample dialogFragmentExample = new AlertDialogFragmentExample();
                dialogFragmentExample.show(getSupportFragmentManager(), "Alert");

            }
        });

        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initAlertDialog();

            }
        });
    }

    private void initAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_custom, null);
        builder.setView(view);
        initComponents(view);
        onClickDialogSum();
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }

    private void initComponents(View view){
        firstNumberEditText = view.findViewById(R.id.firstInputEditText);
        secondNumberEditText = view.findViewById(R.id.secondInputEditText);
        calculateButton = view.findViewById(R.id.sumButton);
        resultTextView = view.findViewById(R.id.resultTextView);
    }

    private void onClickDialogSum(){
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());
                int sum = firstNumber + secondNumber;
                resultTextView.setText("The result is : "+ sum);
            }
        });
    }
}
