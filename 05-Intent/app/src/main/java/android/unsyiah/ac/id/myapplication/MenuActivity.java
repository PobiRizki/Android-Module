package android.unsyiah.ac.id.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle extras = getIntent().getExtras();

        String value1 = extras.getString("key1");
        String value2 = extras.getString("key2");

        text1 = findViewById(R.id.editText1);
        text2 = findViewById(R.id.editText2);

        text1.setText(value1);
        text2.setText(value2);
    }
}
