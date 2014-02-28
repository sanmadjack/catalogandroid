package org.sanmadjack.catalog.model;

public class Field extends AModelItem<Field> {
	public long id;
	public String name;
	public String display;
	public DataType data_type;
	public String format;
	
	public static final String TABLE_NAME = "fields";
	
	public static final String DISPLAY_FIELD_NAME = "display";
	public static final String DATA_TYPE_FIELD_NAME = "data_type";
	public static final String FORMAT_FIELD_NAME = "format";
	
	public static final int FORMAT_MAX_LENGTH = 20; 
	public static final int DISPLAY_MAX_LENGTH = 255;
	
	

	
	public Field(Model model) {
		super(model);

	}

}
