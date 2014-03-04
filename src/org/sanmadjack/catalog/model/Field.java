package org.sanmadjack.catalog.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Field extends AModelItem<Field> {
	private String name;
	private String display;
	private DataType data_type;
	private String format;
	
	private static final String TABLE_NAME = "fields";
	
	private static final String DISPLAY_FIELD_NAME = "display";
	private static final String DATA_TYPE_FIELD_NAME = "data_type";
	private static final String FORMAT_FIELD_NAME = "format";
	
	private static final String[] ALL_COLUMNS = { 
		Field.ID_FIELD_NAME,
		Field.DISPLAY_FIELD_NAME,
		Field.DATA_TYPE_FIELD_NAME,
		Field.FORMAT_FIELD_NAME
		};
	
	private static final int FORMAT_MAX_LENGTH = 20; 
	private static final int DISPLAY_MAX_LENGTH = 255;
	
	public static final String CREATE_TABLE_SQL = 
			"CREATE TABLE " + Field.TABLE_NAME + "(" + 
					Field.ID_FIELD_NAME + " INTEGER PRIMARY KEY, " +
					Field.NAME_FIELD_NAME + " TEXT NOT NULL UNIQUE, " +
					Field.DISPLAY_FIELD_NAME + " TEXT NOT NULL, " +
					Field.DATA_TYPE_FIELD_NAME + " TEXT NOT NULL, " +
					Field.FORMAT_FIELD_NAME + " TEXT)";
	

	public Field(Model model) {
		super(model);
	}

	
	public Field(Model model, long field_id) {
		super(model, field_id);
	}
	
	
	@Override
	protected void SaveInternal()  {
		ContentValues values = new ContentValues();
		values.put(NAME_FIELD_NAME, this.name);
		values.put(DISPLAY_FIELD_NAME, this.display);
		values.put(DATA_TYPE_FIELD_NAME, this.data_type.toString());
		values.put(FORMAT_FIELD_NAME, this.format);
		
		SQLiteDatabase db = null;
		try {
			db = this.model.getWritableDatabase();
		
			if(this.id==-1) {
				this.id = db.insert(TABLE_NAME, null, values);
			} else {
				db.update(TABLE_NAME, values, Field.ID_FIELD_NAME + " = " + this.id , null);
			}
		} finally {
			if(db!=null) {
				db.close();
			}
		}
		
	}


	@Override
	protected void Load(long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void ValidateFields() throws ValidationException {
		// TODO Auto-generated method stub
		if(this.display.length() > Field.DISPLAY_MAX_LENGTH) {
			throw new ValidationException("Display name is too long, max is " + Field.DISPLAY_MAX_LENGTH);
		}

		if(this.format.length() > Field.FORMAT_MAX_LENGTH) {
			throw new ValidationException("Format string is too long, max is " + Field.FORMAT_MAX_LENGTH);
		}

		if(this.name.length() > Field.NAME_MAX_LENGTH) {
			throw new ValidationException("Name is too long, max is " + Field.NAME_MAX_LENGTH);
		}

	}

}
