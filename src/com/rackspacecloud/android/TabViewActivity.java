/**
 * 
 */
package com.rackspacecloud.android;

import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.os.Bundle;

/**
 * @author Mike Mayo - mike.mayo@rackspace.com - twitter.com/greenisus
 *
 */
public class TabViewActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TabHost tabs = getTabHost();
		
		TabHost.TabSpec spec = tabs.newTabSpec("tab1");		
		spec.setContent(new Intent(this, ListServersActivity.class));
		spec.setIndicator("Cloud Servers", getResources().getDrawable(R.drawable.cloudservers_icon));
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tab2");
		spec.setContent(new Intent(this, ListContainerActivity.class));
		spec.setIndicator("Cloud Files", getResources().getDrawable(R.drawable.cloudfiles));
		tabs.addTab(spec);
	}
	
}
