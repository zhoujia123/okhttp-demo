package cn.com.zhoujia.project.okhttp.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

import java.util.Map;

/**
 * Created by Surface Pro on 2016/9/11.
 */
public interface PermService {

    @POST("api/app/auth_api.php?act=get_staff_auth")
    Call<Map<String,Object>> getPerms(@Body PermRequest uid);
}
