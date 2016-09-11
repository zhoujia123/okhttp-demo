package cn.com.zhoujia.project.okhttp;

import cn.com.zhoujia.project.okhttp.service.AdInfo;
import cn.com.zhoujia.project.okhttp.service.AdService;
import cn.com.zhoujia.project.okhttp.service.PermRequest;
import cn.com.zhoujia.project.okhttp.service.PermService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Surface Pro on 2016/9/11.
 */
public class Main {

    private static final String url = "http://test.o-home.com:8091/";

    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        AdService adService = retrofit.create(AdService.class);

        PermService permService = retrofit.create(PermService.class);

        PermRequest permRequest = new PermRequest();
        permRequest.setUid(3);

        Call<Map<String,Object>> perms = permService.getPerms(permRequest);

        Response<Map<String,Object>> execute = perms.execute();

//        System.out.println(execute.message());

        System.out.println(execute.body());

        Call<AdInfo> ad = adService.getAd();

//        try {
            ad.enqueue(new Callback<AdInfo>() {

                public void onResponse(Call<AdInfo> call, Response<AdInfo> response) {
                    System.out.println(response.body());
                }

                public void onFailure(Call<AdInfo> call, Throwable throwable) {
                    System.out.println("失败了");
                }
            });
//            Response<AdInfo> execute = ad.execute();

//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
