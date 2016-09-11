package cn.com.zhoujia.project.okhttp.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Surface Pro on 2016/9/11.
 */
public class AdInfo implements Serializable{

    @JsonProperty("ad_id")
    private Integer adId;

    @JsonProperty("ad_img")
    private String adImg;

    @JsonProperty("ad_link")
    private String adLink;

    @JsonProperty("ad_name")
    private String adName;

    @JsonProperty("position_id")
    private Integer positionId;

    @JsonProperty("position_name")
    private String positionName;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "AdInfo{" +
                "adId=" + adId +
                ", adImg='" + adImg + '\'' +
                ", adLink='" + adLink + '\'' +
                ", adName='" + adName + '\'' +
                ", positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
