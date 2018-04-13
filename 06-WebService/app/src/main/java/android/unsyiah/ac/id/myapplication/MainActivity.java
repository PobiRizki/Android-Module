package android.unsyiah.ac.id.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.unsyiah.ac.id.myapplication.POJO.ResponPOJO;
import android.unsyiah.ac.id.myapplication.RetoritHelper.RetrofitHelper;
import android.unsyiah.ac.id.myapplication.util.WebService;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText et = findViewById(R.id.text);
        final EditText et2 = findViewById(R.id.text2);

        Button btn = findViewById(R.id.buton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Retrofit retrofit = RetrofitHelper.retrofitBuilder();
                WebService webService = retrofit.create(WebService.class);

                Call<ResponPOJO> call = webService.tambahUser(

                        et2.getText().toString(),
                        et2.getText().toString()

                );

                call.enqueue(new Callback<ResponPOJO>() {
                    @Override
                    public void onResponse(Call<ResponPOJO> call, Response<ResponPOJO> response) {
                        Toast.makeText(MainActivity.this, response.body().pesan, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<ResponPOJO> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }

}
