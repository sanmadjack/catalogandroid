package org.sanmadjack.catalog;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import org.sanmadjack.catalog.model.Field;
import org.sanmadjack.catalog.model.Model;
import android.widget.EditText;
import android.widget.Spinner;

public class FieldEditActivity extends Activity {
	private Field field = null;
	private Model model = null;
	
	private EditText txtName;
	private EditText txtDisplay;
	private Spinner selectDataType;
	private EditText txtFormat;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_field_edit);
		
		txtName   = (EditText)findViewById(R.id.txtName);
		txtDisplay   = (EditText)findViewById(R.id.txtName);
		txtFormat   = (EditText)findViewById(R.id.txtName);
		selectDataType = (Spinner)findViewById(R.id.selectDateType);
		
		model = new Model(this);

		
		Bundle extras = getIntent().getExtras();
		if(extras!=null) {
			long field_id = extras.getLong("field_id",-1);
			if(field_id!=-1) {
				this.field = new Field(model,field_id);
				
				

			} else {
				this.field = new Field(model);
			}
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.field_edit, menu);
		return true;
	}
	
}
