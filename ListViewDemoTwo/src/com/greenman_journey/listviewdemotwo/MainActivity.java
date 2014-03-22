package com.greenman_journey.listviewdemotwo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	//local variables.
	private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
    
        /*Data structure to populate in list view.For example we use country names.*/
		ArrayList<String> arrayListToDisplay = new ArrayList<String>();
		arrayListToDisplay.add("IceLand");
		arrayListToDisplay.add("India");
		arrayListToDisplay.add("Japan");
		arrayListToDisplay.add("Jordan");
		arrayListToDisplay.add("Mexico");
		arrayListToDisplay.add("Monaco");
		arrayListToDisplay.add("Netherlands");
		arrayListToDisplay.add("Norway");
		arrayListToDisplay.add("Oman");
		arrayListToDisplay.add("Peru");

		/*Initialize the array adapter with context of calling activity , a layout resource and a data source.*/
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arrayListToDisplay);
		/*Set adapter to the list*/
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> view, View arg1, int position,
					long arg3) {
				
				/*Fetch the object at selected position from list view.*/
				String selectedCountryString =	(String) listView.getAdapter().getItem(position);
			
				/*Display the selected String.*/
				Toast.makeText(MainActivity.this, "Selected Country is "+selectedCountryString, Toast.LENGTH_LONG).show();

				
			}
		});
		
    
    }

}
