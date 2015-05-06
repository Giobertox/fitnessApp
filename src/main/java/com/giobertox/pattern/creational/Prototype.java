package com.giobertox.pattern.creational;

import java.util.Collections;
import java.util.List;

public class Prototype implements Cloneable {

	private String sql;
	private List<String> parameters = Collections.emptyList();
	private Record record;

	public Prototype(String sql, List<String> parameters, Record record) {
		super();
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	@Override
	public Prototype clone() {
		try {
			return (Prototype) super.clone();// shallow copy
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getSql() {
		return sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}

}
