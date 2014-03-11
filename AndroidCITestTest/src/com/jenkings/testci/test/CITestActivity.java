package com.jenkings.testci.test;

import com.jenkings.testci.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.TextView;

import com.jenkings.testci.R;

public class CITestActivity extends
		ActivityInstrumentationTestCase2<MainActivity> {


	
	public CITestActivity() {
		super("",MainActivity.class);
		// TODO Auto-generated constructor stub
	}
	public CITestActivity(Class<MainActivity> activityClass) {
		super(activityClass);
		// TODO Auto-generated constructor stub
	}

	private TextView result;



	@Override
	protected void setUp() throws Exception {
		super.setUp();
		MainActivity mainActivity = getActivity();
		result = (TextView) mainActivity.findViewById(R.id.welcome);
	}

	@UiThreadTest
	public void testPreConditions() {
		assertTrue(true);

	}
}
