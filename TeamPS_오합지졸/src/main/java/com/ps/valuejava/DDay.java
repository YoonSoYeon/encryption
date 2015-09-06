package com.ps.valuejava;

public class DDay {
int year, month, day;
String title;
public DDay(){}
public DDay(int year, int month, int day, String title) {
	super();
	this.year = year;
	this.month = month;
	this.day = day;
	this.title = title;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}


}
