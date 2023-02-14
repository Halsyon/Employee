package com.research.crud.controller

import com.research.crud.model.Employee
import com.research.crud.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/employee")
class EmployeeController {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    @PostMapping
    fun saveEmployee(@RequestBody employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable id: Long): Optional<Employee> {
        return employeeRepository.findById(id)
    }

    @GetMapping
    fun getAllEmployees(): Iterable<Employee> {
        return employeeRepository.findAll()
    }

    @PutMapping
    fun updateEmployee(@RequestBody employee: Employee) {
        employeeRepository.save(employee)
    }

    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id: Long) {
        employeeRepository.deleteById(id)
    }
}