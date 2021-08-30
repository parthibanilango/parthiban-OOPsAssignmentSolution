package com.greatlearning.department;

import com.greatlearning.constant.Constants;

/**
 * 
 * TechDepartment
 * This class has methods which defines different functionalities of TechDepartment
 * @author Parthiban Ilango
 *
 */
public class TechDepartment extends Department {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#departmentName()
	 */
	@Override
	public String departmentName() {
		return Constants.STR_DEPARTMENT_NAME_TECH + Constants.STR_SINGLE_SPACE + Constants.STR_DEPARTMENT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#getTodaysWork()
	 */
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#getWorkDeadline()
	 */
	@Override
	public String getWorkDeadline() {
		return Constants.STR_COMPLETE_BY_EOD;
	}

	/**
	 * @return Tech stack information as String
	 */
	public String getTechStackInformation() {
		return "Core Java";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#displayGreetingAndInformation()
	 */
	@Override
	public String displayGreetingAndInformation() {
		StringBuilder sb = new StringBuilder(GREETING);
		sb.append(departmentName());
		sb.append(System.lineSeparator());
		sb.append(getTodaysWork());
		sb.append(System.lineSeparator());
		sb.append(getWorkDeadline());
		sb.append(System.lineSeparator());
		sb.append(getTechStackInformation());
		sb.append(System.lineSeparator());
		sb.append(isTodayAHoliday());
		return sb.toString();
	}

}
