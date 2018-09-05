package com.ms.employee.controllers

import org.springframework.beans.factory.annotation.Autowired
import com.ms.employee.services.EmployeeService
import com.ms.employee.entity.Employee
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.DeleteMapping

@RestController
class EmployeeController {

	@Autowired
	lateinit var employeeService: EmployeeService


	@GetMapping(value = "/employees")
	@ResponseBody
	fun getEmployes(): ResponseEntity<ArrayList<Employee>> {
		var responseEntity = ResponseEntity<ArrayList<Employee>>(employeeService.getEmployess(), HttpStatus.OK);
		return responseEntity
	}

	@GetMapping("/employees/{id}")
	@ResponseBody
	fun getEmplyee(@PathVariable id: Int): Employee? {
		return employeeService.getEmplyee(id)
	}

	@PostMapping("/employess")
	fun addEmployee(@RequestBody emp: Employee) {
		employeeService.addEmployee(emp)
	}

	@DeleteMapping("/employees/{id}")
	fun deleteEmployee(@PathVariable id: Int) {
		var emp = Employee("", "", "", id)
		employeeService.deleteEmployee(emp)
	}


}
