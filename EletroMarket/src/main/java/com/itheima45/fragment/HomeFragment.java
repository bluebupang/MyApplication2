package com.itheima45.fragment;

import java.util.ArrayList;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.itheima45.adapter.MyBaseAdapter;
import com.itheima45.application.utils.UIUtils;
import com.itheima45.holder.BaseHolder;
import com.mwqi.ui.widget.LoadingPager.LoadResult;

public class HomeFragment extends BaseFragment {

	private ArrayList<String> mDatas;

	@Override
	protected View createLoadedView() {

		ListView mListView = new ListView(UIUtils.getContext());
		HomeAdapter adapter = new HomeAdapter(mDatas);
		mListView.setAdapter(adapter);
		return mListView;
	}

	@Override
	protected LoadResult Load() {

		mDatas = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			mDatas.add("我是item" + i);
		}

		return check(mDatas);
	}

	private class HomeAdapter extends MyBaseAdapter {

		private ViewHolder holder;

		public HomeAdapter(ArrayList<String> mDatas) {
			super(mDatas);
		}

		@Override
		protected BaseHolder getHolder() {
			return new ViewHolder();
		}

	}

	private class ViewHolder extends BaseHolder<String> {

		TextView tv;

		@Override
		protected View initView() {
			// 创建并返回布局文件
			tv = new TextView(UIUtils.getContext());
			return tv;
		}

		@Override
		protected void refreshView() {
			tv.setText(getData());
		}
	}
}
