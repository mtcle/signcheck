package com.mtcle.app.signcheck;

import android.graphics.drawable.Drawable;

/**
 * Created by mtcle on 2017/11/14.
 */

public class AppInfo {
    private String appName;
    private String packageName;
    private String versionName;
    private int versionCode;
    private Drawable appIcon;

    private String signMd5;
    private String signSha1;
    private String signInfo;

    public String getSignInfo() {
        return signInfo;
    }

    public void setSignInfo(String signInfo) {
        this.signInfo = signInfo;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public String getSignMd5() {
        return signMd5;
    }

    public void setSignMd5(String signMd5) {
        this.signMd5 = signMd5;
    }

    public String getSignSha1() {
        return signSha1;
    }

    public void setSignSha1(String signSha1) {
        this.signSha1 = signSha1;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "appName='" + appName + '\'' +
                ", packageName='" + packageName + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionCode=" + versionCode +
                ", appIcon='" + appIcon + '\'' +
                '}';
    }
}
