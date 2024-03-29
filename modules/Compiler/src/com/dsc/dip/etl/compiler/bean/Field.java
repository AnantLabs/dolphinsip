package com.dsc.dip.etl.compiler.bean;

public class Field {

	protected String name;

	protected String type;

	protected String value;
	
	public Field() {
	}

	public Field(String name, String type, String value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Property name:" + name + "; type:" + type + ";value:" + value;
	}

}
