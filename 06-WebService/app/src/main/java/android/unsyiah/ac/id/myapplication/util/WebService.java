package android.unsyiah.ac.id.myapplication.util;

import android.unsyiah.ac.id.myapplication.POJO.ResponPOJO;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ASUS on 4/12/2018.
 */

public interface WebService {

    @FormUrlEncoded
    @POST(Konstanta.TAMBAH_USER)
    public Call<ResponPOJO> tambahUser(
            @Field("email") String email,
            @Field("password") String password
    );

}
