package com.newcape.mtcle.app.signcheck;

import android.content.Context;

import java.util.List;

/**
 * Created by mtcle on 2017/11/14.
 */

public class ListAdapter extends CommonBaseAdapter<AppInfo> {
    public ListAdapter(Context context, List<AppInfo> datas) {
        super(context, datas);
    }

    @Override
    public void convert(ViewHolder holder, AppInfo appInfo, int index) {
        holder.setImageDrawable(R.id.iv_icon,appInfo.getAppIcon());
        holder.setText(R.id.tv_name, appInfo.getAppName());
        holder.setText(R.id.tv_package, "包名:"+appInfo.getPackageName());
        holder.setText(R.id.tv_version, "版本:"+appInfo.getVersionName() + "(" + appInfo.getVersionCode() + ")");
        holder.setText(R.id.tv_sign_info,"签名:"+appInfo.getSignInfo());
        holder.setText(R.id.tv_sign_md5, "md5:"+appInfo.getSignMd5());
        holder.setText(R.id.tv_sign_sha1,"sha1:"+appInfo.getSignSha1());
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_sign;
    }
}