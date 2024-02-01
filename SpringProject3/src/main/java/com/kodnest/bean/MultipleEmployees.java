package com.kodnest.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MultipleEmployees {

	public ArrayList<String> technologies;
	public HashSet<String> projects;
	public HashMap<Integer, String> organizations;

	public MultipleEmployees() {
		super();

	}

	public MultipleEmployees(ArrayList<String> technologies, HashSet<String> projects,
			HashMap<Integer, String> organizations) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.organizations = organizations;
	}

	public ArrayList<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}

	public HashSet<String> getProjects() {
		return projects;
	}

	public void setProjects(HashSet<String> projects) {
		this.projects = projects;
	}

	public HashMap<Integer, String> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(HashMap<Integer, String> organizations) {
		this.organizations = organizations;
	}

	@Override
	public String toString() {
		return "MultipleEmployees" + "\n" + "technologies=" + technologies + "\n" + "projects=" + projects + "\n"
				+ "organizations=" + organizations;
	}

}
