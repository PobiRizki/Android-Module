package android.unsyiah.ac.id.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit1,edit2;
    private String input1,input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IntentActivity(View view) {

        edit1 = findViewById(R.id.text);
        edit2 = findViewById(R.id.text2);

        input1 = edit1.getText().toString();
        input2 = edit2.getText().toString();

        //explicit intens
        Intent i = new Intent(getApplicationContext(),MenuActivity.class);
        //extra data
        i.putExtra("key1",input1);
        i.putExtra("key2",input2);
        //jalankan activity intent
        startActivity(i);
        //method finish
        finish();
    }
}
