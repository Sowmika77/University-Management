package com.codegnan.university.management;

import java.util.ArrayList;

import java.util.List;

public class Student {
	
	private String name; //name of the student
	private List<Course>enrolledCourses; //list to hold courses that student is enrolled in
	
	public Student(String name) {
		this.name = name;
		this.enrolledCourses = new ArrayList<>();
	}
	public String getName() {
		return name;
		
	}
	  public void enrollInCourse(Course course) {
	        // Check if the course is not already in the list of enrolled courses
	        if (!enrolledCourses.contains(course)) {
	            enrolledCourses.add(course); // Add the course to the list
	        }
	    }

	    // Getter method to retrieve the list of courses the student is enrolled in
	    public List<Course> getEnrolledCourses() {
	        return enrolledCourses; // Return the list of enrolled courses
	    }

	    // Override toString method to provide a string representation of the student
	    @Override
	    public String toString() {
	        return name; // Return the student's name as the string representation
	    }

}
