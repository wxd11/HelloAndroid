package activity.wxd.helloandroid.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private  static String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
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
                      break;
            default:break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Log.d(TAG,"add click");
                Toast.makeText(MainActivity.this,"add",Toast.LENGTH_LONG).show();
                break;
            case R.id.search_item:
                Log.d(TAG,"search click");
                Toast.makeText(MainActivity.this,"search",Toast.LENGTH_LONG).show();
                break;
            default:break;
        }
        return  true;
    }
}
