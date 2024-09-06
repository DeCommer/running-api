package com.decommer.running_api;

import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RunData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String weekday;
	private String month;
	private int dom;
	private String year;
	private String avgPace;
	private double distance;
	private LocalTime duration;
	private int calories;
	
	public RunData() {
		
	}
	
	public RunData(int id, String weekday, String month, int dom, 
		String year, String avgPace, double distance,
		LocalTime duration, int calories) {
		super();
		this.id = id;
		this.weekday = weekday;
		this.month = month;
		this.dom = dom;
		this.year = year;
		this.avgPace = avgPace;
		this.distance = distance;
		this.duration = duration;
		this.calories = calories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDom() {
		return dom;
	}

	public void setDom(int day) {
		this.dom = day;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAvgPace() {
		return avgPace;
	}

	public void setAvgPace(String avgPace) {
		this.avgPace = avgPace;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Runs [id=" + id 
				+ ", weekday=" + weekday 
				+ ", month=" + month 
				+ ", dom=" + dom 
				+ ", year=" + year
				+ ", avgPace=" + avgPace 
				+ ", distance=" + distance 
				+ ", duration=" + duration 
				+ ", calories=" + calories 
				+ "]";
	}
}
