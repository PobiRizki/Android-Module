package android.unsyiah.ac.id.myapplication;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "activity_main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"methode on created");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG,"Method on start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"Method on Resume");
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"Method on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG,"Method on Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG,"Method on restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG,"Method on Destroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Log.d(TAG,"potrait");
        }else{
            Log.d(TAG,"landscape");
        }
    }
}
