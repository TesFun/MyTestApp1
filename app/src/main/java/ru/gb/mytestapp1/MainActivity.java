package ru.gb.mytestapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameTV ;
    private Button changeNameButton ;

    private EditText operand1 ;
    private EditText operand2 ;
    private Button sumButton ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.new_activity);

//        operand1 = findViewById(R.id.operand1);
//        operand2 = findViewById(R.id.operand2);
//        sumButton = findViewById(R.id.sum_button);
//
//        sumButton.setOnClickListener(this);

        nameTV = findViewById(R.id.name_text_view);
        changeNameButton = findViewById(R.id.change_name_button);

        changeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTV.setText("Good Job!");

                Toast.makeText(MainActivity.this, "Glad to see you!", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        Toast.makeText(this, String.valueOf(sum(operand1.getText().toString(), operand2.getText().toString())), Toast.LENGTH_SHORT).show();
//
//    }
//
//    public int sum(String s1, String s2) {
//        return Integer.parseInt(s1) + Integer.parseInt(s2);
//    }
}