package lv.bizapps.tabsexample;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends ActionBarActivity {
	private FragmentTabHost mTabHost;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab 1", getResources().getDrawable(R.drawable.ic_launcher)), FragmentTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab 2", null), FragmentTab.class, null);
        //mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Tab 3", null), FragmentTab.class, null);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(1, 1, 1, "Menu item #1");
		menu.add(1, 2, 2, "Menu item #2");

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Log.e("AAA", "ITEM ID: "+item.getItemId());

		return super.onOptionsItemSelected(item);
	}
}