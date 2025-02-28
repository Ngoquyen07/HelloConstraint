package com.example.helloconstraint;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int mCount = 0;
    TextView tvShowCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvShowCount = findViewById(R.id.tvShowCount);
    }
    public void showToast(View view){
        Toast.makeText( this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }
    public void countUp(View view){
        mCount ++;
        if(tvShowCount != null){
            tvShowCount.setText(Integer.toString(mCount));
        }
    }
    public void Zero(View view){
        mCount = 0;
        if(tvShowCount != null){
            tvShowCount.setText(Integer.toString(mCount));
        }
    }

}