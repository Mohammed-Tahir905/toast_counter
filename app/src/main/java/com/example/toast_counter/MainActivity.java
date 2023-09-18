package com.example.toast_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int m_count=0;
    private TextView m_showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_showCount = (TextView) findViewById(R.id.show_count);
    }

    public void showCount(View view) {
        m_count++;
        m_showCount.setText(Integer.toString(m_count));
    }

    public void makeToast(View view) {
    }
}