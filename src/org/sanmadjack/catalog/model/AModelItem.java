package org.sanmadjack.catalog.model;


public abstract class AModelItem<T> {
	protected Model model;
	
	public static final String ID_FIELD_NAME = "id";
	public static final String NAME_FIELD_NAME = "name";
	
	public static final int NAME_MAX_LENGTH = 20;

	
	public AModelItem(Model model) {
		this.model = model;
	}
	
	public abstract T Create();
	
	public abstract void Request();
	
	public abstract void Update();

}
