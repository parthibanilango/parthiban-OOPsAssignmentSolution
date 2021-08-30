package com.greatlearning.department;

import com.greatlearning.constant.Constants;

/**
 * 
 * HRDepartment
 * This class has methods which defines different functionalities of HRDepartment
 * @author Parthiban Ilango
 *
 */
public class HRDepartment extends Department {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#departmentName()
	 */
	@Override
	public String departmentName() {
		return Constants.STR_DEPARTMENT_NAME_HR + Constants.STR_SINGLE_SPACE + Constants.STR_DEPARTMENT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.greatlearning.department.Department#getTodaysWork()
	 */
	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
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
	 * @return activity as String
	 */
	public String doActivity() {
		return "team Lunch";
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
		sb.append(doActivity());
		sb.append(System.lineSeparator());
		sb.append(getTodaysWork());
		sb.append(System.lineSeparator());
		sb.append(getWorkDeadline());
		sb.append(System.lineSeparator());
		sb.append(isTodayAHoliday());
		return sb.toString();
	}

}
