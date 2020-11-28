package com.dragan.model;

public class Event {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + "]";
	}
}
