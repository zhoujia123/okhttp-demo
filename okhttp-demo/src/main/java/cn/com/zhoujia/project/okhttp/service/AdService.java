package cn.com.zhoujia.project.okhttp.service;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Surface Pro on 2016/9/11.
 */
public interface AdService {

    @GET("api/app/app_get_ads_by_rand.php")
    Call<AdInfo> getAd();
}
