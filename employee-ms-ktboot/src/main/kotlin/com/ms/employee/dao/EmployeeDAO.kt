package com.ms.employee.dao

import com.ms.employee.entity.Employee
import java.util.HashMap
import kotlin.jvm.JvmStatic
import org.springframework.stereotype.Component

@Component("empDao")
class EmployeeDAO {

	companion object {
		@JvmStatic
		var employeeMap = HashMap<Int, Employee>()
		
	}

	fun addOrUpdate(employee: Employee): Employee? {
		employeeMap.put(employee.empID, employee)
		return employee
	}

	fun get(empId: Int): Employee? {
		return employeeMap.get(empId)
	}

	fun delete(empId: Int) {
		employeeMap.remove(empId)
	}

	fun getAll(): HashMap<Int, Employee> {
		return employeeMap
	}

}