package com.mtcle.app.signcheck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public abstract  class CommonBaseAdapter<T> extends BaseAdapter {

	
	protected Context mContext;

	public List<T> getmDatas() {
		return mDatas;
	}

	public void setmDatas(List<T> mDatas) {
		this.mDatas = mDatas;
	}

	protected List<T> mDatas;
	protected LayoutInflater mInflater;
	private int layoutId;

	public CommonBaseAdapter(Context context,/*int layoutId, */List<T> datas )
	{
		this.mContext = context;
		mInflater = LayoutInflater.from(context);
		this.mDatas = datas;
		this.layoutId = getLayoutId();
	}

	@Override
	public int getCount()
	{
		return mDatas.size();
	}

	@Override
	public T getItem(int position)
	{
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ViewHolder holder = ViewHolder.get(mContext, convertView, parent,
				layoutId, position);
		convert(holder, getItem(position),position);
		return holder.getConvertView();
	}
	public void clearAndAppendData(List<T> datas){
		this.mDatas.clear();
		appendDatas(datas);
	}

	public void removeData(T mData){
		this.mDatas.remove(mData);
		notifyDataSetChanged();
	}

	public void removeData(int position){
		T mData = mDatas.get(position);
		this.mDatas.remove(mData);
		notifyDataSetChanged();
	}

	public void appendData(T mData){
		this.mDatas.add(mData);
		notifyDataSetChanged();
	}
	public void appendDatas(List<T> datas){
		this.mDatas.addAll(datas);
		notifyDataSetChanged();
	}

	public void clearDatas(){
		this.mDatas.clear();
		notifyDataSetChanged();
	}

	public void appendDataNoNotify(T mData){
		this.mDatas.add(mData);
	}
	public void appendDatasNoNotify(List<T> datas){
		this.mDatas.addAll(datas);
	}
	public void clearDatasNoNotify(){
		this.mDatas.clear();
	}

	/**
	 * 分页用
	 * 每页加载数据条数
	 */
	protected int pageSize = 10;//TODO 先改为2条方便测试
	/**
	 * 分页用
	 * 加载数据索引（1开始）
	 */
	protected int pageIndex = 1;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public void pageIndexAscending() {
		this.pageIndex += 1;
	}
	/**
	 * 描述：加载数据索引（1开始）
	 * 创建时间：2014-8-5 下午12:58:23
	 */
	public void initPageIndex(){
		this.pageIndex = 1;
	}
	public abstract void convert(ViewHolder holder, T t,int index);

	public abstract int getLayoutId();
}
