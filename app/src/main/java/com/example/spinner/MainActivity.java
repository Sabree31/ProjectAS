package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] days;

    private Spinner spinner;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        days=getResources().getStringArray(R.array.Days);

        spinner=findViewById(R.id.spinnerId);
        button=findViewById(R.id.buttonId);
        textView=findViewById(R.id.textId);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.sample_view,R.id.tvSampleId,days);
        spinner.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value=spinner.getSelectedItem().toString();
                textView.setText(value);

            }
        });
    }
}
