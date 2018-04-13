package android.unsyiah.ac.id.myapplication.RetoritHelper;

import android.unsyiah.ac.id.myapplication.util.Konstanta;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ASUS on 4/12/2018.
 */

public class RetrofitHelper {

    public static Retrofit retrofitBuilder(){

        return new Retrofit.Builder()
                .baseUrl(Konstanta.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
