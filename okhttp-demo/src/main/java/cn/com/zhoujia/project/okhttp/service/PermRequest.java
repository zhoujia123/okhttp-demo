package cn.com.zhoujia.project.okhttp.service;

import java.io.Serializable;

/**
 * Created by Surface Pro on 2016/9/11.
 */
public class PermRequest implements Serializable {

    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
