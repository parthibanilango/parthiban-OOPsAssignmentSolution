package com.greatlearning.department;

import com.greatlearning.constant.Constants;

/**
 * 
 * Department
 * This is a superclass to all Departments
 * @author Parthiban Ilango
 *
 */
public class Department {

	protected final String GREETING = "Welcome to ";

	/**
	 * @return department name as String
	 */
	public String departmentName() {
		return Constants.STR_DEPARTMENT_NAME_SUPER + Constants.STR_SINGLE_SPACE + Constants.STR_DEPARTMENT;
	}

	/**
	 * @return todays work as String
	 */
	public String getTodaysWork() {
		return "No Work as of now";

	}

	/**
	 * @return Work deadline as String
	 */
	public String getWorkDeadline() {
		return " Nil ";

	}

	/**
	 * @return whether today is a holiday
	 */
	public String isTodayAHoliday() {
		return "Today is not a holiday";

	}

	/**
	 * String with greetings and functionalities,deadline,activity,holiday
	 * information
	 * 
	 * @return String with greetings and information
	 */
	public String displayGreetingAndInformation() {
		StringBuilder sb = new StringBuilder(GREETING);
		sb.append(departmentName());
		sb.append(System.lineSeparator());
		sb.append(getTodaysWork());
		sb.append(System.lineSeparator());
		sb.append(getWorkDeadline());
		sb.append(System.lineSeparator());
		sb.append(isTodayAHoliday());
		return sb.toString();
	}

}
