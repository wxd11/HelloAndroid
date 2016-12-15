package nju.wxd.helloAndroid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import activity.wxd.helloandroid.helloandroid.R;


public class ThirdActivity extends AppCompatActivity implements OnClickListener {

    private String TAG="ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(this);
        Intent intent=getIntent();
        String data=intent.getStringExtra("test");
        Log.i(TAG,data);
    }


    @Override
    public void onClick(View view) {
          switch (view.getId()){
              case R.id.button4:
                  Intent intent=new Intent(this,MainActivity.class);
                  String data="test data";
                  intent.putExtra("extraData",data);
                  startActivity(intent);
                  break;
              default:break;
          }
    }
}
