package android.unsyiah.ac.id.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           //gambar res
           ImageView iv = findViewById(R.id.image1);
           iv.setImageResource(R.drawable.matgaming);

        //gambar assets
        ImageView iv2 = findViewById(R.id.image2);
        try {
            InputStream stream = getAssets().open("matgaming.jpg");
            Drawable drawable = Drawable.createFromStream(stream, null);
            iv2.setImageDrawable(drawable);
        } catch (Exception e) {
            Log.e("Error Image", e.getMessage());
        }
    }
}
