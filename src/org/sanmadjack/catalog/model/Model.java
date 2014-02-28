package org.sanmadjack.catalog.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Model extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1; 
	private static final String DATABASE_NAME = "objects";
	
	public Model(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
	}
	
	private static final String CREATE_FIELDS_TABLE_SQL = 
			"CREATE TABLE " + Field.TABLE_NAME + "(" + 
					Field.ID_FIELD_NAME + " INTEGER PRIMARY KEY, " +
					Field.NAME_FIELD_NAME + " TEXT NOT NULL UNIQUE, " +
					Field.DISPLAY_FIELD_NAME + " TEXT NOT NULL, " +
					Field.DATA_TYPE_FIELD_NAME + " TEXT NOT NULL, " +
					Field.FORMAT_FIELD_NAME + " TEXT)";
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
	}

}
