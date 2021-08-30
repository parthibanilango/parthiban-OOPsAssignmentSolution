package com.greatlearning.department;

import com.greatlearning.constant.Constants;

/**
 * AdminDepartment
 * This class has methods which defines different functionalities of AdminDepartment
 * @author Parthiban Ilango
 *
 */
public class AdminDepartment extends Department {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#departmentName()
	 */
	@Override
	public String departmentName() {
		return Constants.STR_DEPARTMENT_NAME_ADMIN + Constants.STR_SINGLE_SPACE + Constants.STR_DEPARTMENT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#getTodaysWork()
	 */
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
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
		sb.append(isTodayAHoliday());
		return sb.toString();
	}

}
