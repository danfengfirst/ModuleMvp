package com.df.module.index_module;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

@Route(path="/activity/index")
public class MainActivity extends AppCompatActivity {
    @BindView(R2.id.tv)
    TextView tv;
    private Unbinder unbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_activity_main);
        unbinder= ButterKnife.bind(this);
        tv.setText("index");
    }


    @OnClick({R2.id.tv,R2.id.tv2})
    public void onViewClicked(View view) {
        if (R.id.tv==view.getId()){
            Toast.makeText(getApplicationContext(),"index",Toast.LENGTH_SHORT).show();
        }else if (R.id.tv2==view.getId()){
            Toast.makeText(getApplicationContext(),"hello world",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
