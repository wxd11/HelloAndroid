package nju.wxd.helloAndroid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import activity.wxd.helloandroid.helloandroid.R;

public class SecondActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                Intent intent=new Intent();
                intent.putExtra("return","hello,mainActivity");
                setResult(RESULT_OK,intent);
                finish();
                break;
            default:break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("return","hello,mainActivity 2");
        setResult(RESULT_OK,intent);
        finish();
    }
}
