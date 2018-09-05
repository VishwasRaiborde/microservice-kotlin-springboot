package com.ms.employee.services

import org.springframework.beans.factory.annotation.Autowired
import com.ms.employee.dao.EmployeeDAO
import com.ms.employee.entity.Employee
import org.springframework.stereotype.Component

@Component("employeeService")
class EmployeeService {

	@Autowired
	lateinit var empDao: EmployeeDAO

	fun getEmployess():ArrayList<Employee> {

		var empMap = empDao.getAll()
		var list = ArrayList<Employee>()
		for ((key, value) in empMap) {
			list.add(value)
		}
		return list;
	}

	fun getEmplyee(empID: Int): Employee? {
		return empDao.get(empID)
	}

	fun addEmployee(emp: Employee) {
		empDao.addOrUpdate(emp)
	}

	fun deleteEmployee(emp: Employee) {
		empDao.delete(emp.empID)
	}
}