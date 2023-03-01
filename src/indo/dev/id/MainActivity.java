package indo.dev.id;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.content.Context;
import android.widget.TextView;
import android.content.Intent;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable(){
          @Override
          public void run(){
            Intent intent = new Intent(getBaseContext(),Ryugen.class);
            startActivity(intent);
            finish();
          }
        },3000);
    }
    
}