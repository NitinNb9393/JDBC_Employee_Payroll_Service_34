package com.bridgelabz.JDBC_Employee_Payroll_Service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayRollTest {

	EmployeePayRoll employeePayRollService = new EmployeePayRoll();

	@Test
	public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() {
		String sql = "select * from payroll_service";
		List<EmployeePayRoll> employeePayrollDataList = employeePayRollService.queryExecute(sql);
		Assert.assertEquals(6, employeePayrollDataList.size());
	}

	@Test
	public void givenUpdatingTerisaBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
		double basic_pay = 3000000;
		String NAME = "Terisa";
		double salaryUpdated = employeePayRollService.updateBasicPay(NAME, basic_pay);
		Assert.assertEquals(basic_pay, salaryUpdated, 0.0);
	}

	@Test
	public void givenUpdatingRahulBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
		double basic_pay = 800000;
		String NAME = "abhi";
		double salaryUpdated = employeePayRollService.updateBasicPay(NAME, basic_pay);
		Assert.assertEquals(basic_pay, salaryUpdated, 0.0);
	}

}