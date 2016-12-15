package activity.wxd.helloandroid.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    private  static String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2=(Button)findViewById(R.id.button3);
        button2.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                      Log.d(TAG,"button click");
                      Toast.makeText(MainActivity.this,"toast",Toast.LENGTH_LONG).show();
                      Intent intent2=new Intent(this,ThirdActivity.class);
                      intent2.putExtra("test"," test intent ");
                      startActivity(intent2);
                      //finish();
                      break;
            case R.id.button3:
                      Toast.makeText(MainActivity.this,"toast",Toast.LENGTH_LONG).show();
                      Intent intent=new Intent(Intent.ACTION_VIEW);
                      intent.setData(Uri.parse("http://www.baidu.com"));
                      startActivity(intent);
            default:break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Log.d(TAG,"add click");
                Toast.makeText(MainActivity.this,"add",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.search_item:
                Log.d(TAG,"search click");
                Toast.makeText(MainActivity.this,"search",Toast.LENGTH_LONG).show();
                Intent intent2=new Intent("activity.wxd.ACTION_START");
                startActivity(intent2);
                break;
            default:break;
        }
        return  true;
    }
}
