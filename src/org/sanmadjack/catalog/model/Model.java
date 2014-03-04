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
	
	

	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(Field.CREATE_TABLE_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
