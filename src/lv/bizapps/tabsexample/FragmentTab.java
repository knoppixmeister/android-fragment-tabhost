package lv.bizapps.tabsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTab extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout, container, false);
        TextView tv = (TextView)v.findViewById(R.id.text);
        tv.setText(this.getTag()+" Content");

        if(this.getTag().equals("tab1")) {
	        for(int i=0; i<50; i++) {
	        	tv.append(Html.fromHtml(i+") df dsfsdfdsfdsfdsfs df<br/>"));
	        }
        }
        
        return v;
    }
}