package com.hwjoo.opencvsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectActivity extends AppCompatActivity {

    @BindView(R.id.sample_btn)
    Button sampleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sample_btn)
    void onSampleBtnClick(){
        startActivity(new Intent(SelectActivity.this, SampleActivity.class));
    }
}
