package android.unsyiah.ac.id.a01_layoutandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickButtonSatu(View view) {

        /*Toast.makeText(this, "Button di click", Toast.LENGTH_SHORT).show();*/

        ImageView img = findViewById(R.id.imageView);

        img.setImageResource(R.drawable.matgaming);

    }
}
