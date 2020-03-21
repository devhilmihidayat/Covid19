package hilmi.phonebase.com.covid19.retrofit;

/**
 * Created by User on 21/03/2020.
 */


import android.telecom.Call;

import java.util.List;

import java.util.List;

import hilmi.phonebase.com.covid19.models.ResponseCovid19;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("indonesia")
    retrofit2.Call<List<ResponseCovid19>> get_covid19_indonesia();

}
