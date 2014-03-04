package org.sanmadjack.catalog.model;


public abstract class AModelItem<T> {
	public long id = -1;
	
	protected Model model;
	
	public static final String ID_FIELD_NAME = "id";
	public static final String NAME_FIELD_NAME = "name";
	
	public static final int NAME_MAX_LENGTH = 20;


	public AModelItem(Model model) {
		this.model = model;
	}

	public AModelItem(Model model, long id) {
		this.model = model;
		this.Load(id);
	}

	public void Save() throws ValidationException {
		this.ValidateFields();
		this.SaveInternal();
	}
	
	protected abstract void ValidateFields() throws ValidationException;
	
	protected abstract void  SaveInternal(); 
	
	protected abstract void Load(long id);
	

}
