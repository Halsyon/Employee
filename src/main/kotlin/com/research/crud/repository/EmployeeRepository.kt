package com.research.crud.repository

import com.research.crud.model.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository :CrudRepository<Employee, Long> {
}