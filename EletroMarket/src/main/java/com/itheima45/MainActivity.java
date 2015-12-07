package com.itheima45;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

import com.itheima45.application.utils.UIUtils;
import com.itheima45.fragment.BaseFragment;
import com.itheima45.fragment.FragmentFactory;
import com.mwqi.ui.widget.PagerTab;

public class MainActivity extends BaseActivity implements OnPageChangeListener {

	private PagerTab tabs;
	private ViewPager pager;
	private ViewPageAdapeter adapter;

	@Override
	protected void initActionbar() {

	}

	@Override
	protected void initView() {
		setContentView(R.layout.activity_main);
		tabs = (PagerTab) findViewById(R.id.tabs);
		pager = (ViewPager) findViewById(R.id.pager);

		adapter = new ViewPageAdapeter(getSupportFragmentManager());
		// 设置数据
		pager.setAdapter(adapter);
		// 横着滚动的title和下面的fragement绑定在一起
		tabs.setViewPager(pager);

		tabs.setOnPageChangeListener(this);

	}

	@Override
	protected void init() {

	}

	private class ViewPageAdapeter extends FragmentStatePagerAdapter {

		// title 的名字
		private String[] tab_names;

		public ViewPageAdapeter(FragmentManager fm) {
			super(fm);
			tab_names = UIUtils.getStringArray(R.array.tab_names);
		}

		// 获取到title
		@Override
		public CharSequence getPageTitle(int position) {
			return tab_names[position];
		}

		@Override
		public Fragment getItem(int position) {
			return FragmentFactory.createFragment(position);
		}

		@Override
		public int getCount() {
			return tab_names.length;
		}
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

	@Override
	public void onPageSelected(int position) {
		BaseFragment fragment = FragmentFactory.createFragment(position);
		 fragment.show();
	}
}
