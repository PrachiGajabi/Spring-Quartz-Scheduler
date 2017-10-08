package org.learning.complexspringquartzexample.scheduler;

import java.util.List;

public class MyJobInput {

	private List<String> processData;

	public List<String> getProcessData() {
		return processData;
	}

	public void setProcessData(List<String> processData) {
		this.processData = processData;
	}
}
