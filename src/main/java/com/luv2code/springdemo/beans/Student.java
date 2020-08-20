package com.luv2code.springdemo.beans;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;

	public Student() {
	}

	public String getFirstName() {
		System.out.println("Student : inside -getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Student : inside -setFirstName()");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("Student : inside -getLastName()");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("Student : inside -setLastName()");
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
