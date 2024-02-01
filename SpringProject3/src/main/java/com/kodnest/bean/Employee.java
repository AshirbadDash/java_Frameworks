package com.kodnest.bean;

public class Employee {

	String technologies;
	String project;
	String organization;

	public Employee() {
		super();

	}


	public Employee(String technologies, String project, String organization) {
		super();
		this.technologies = technologies;
		this.project = project;
		this.organization = organization;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", project=" + project + ", organization=" + organization
				+ "]";
	}
}
