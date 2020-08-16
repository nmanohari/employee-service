package com.mypack.employee.controller;

import com.mypack.employee.entity.Employee;
import com.mypack.employee.service.EmployeeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/emp/{empNum}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable Long empNum) {
        log.info("Fetching Employee details for id :" + empNum);
        return employeeService.getEmployeeById(empNum);
    }

    @GetMapping(value = "/emp/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees() {
        log.info("fetching all employees");
        return employeeService.getEmployees();
    }

    @DeleteMapping(value = "/emp/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteEmployeeById(@PathVariable(value = "id") Long empNum) {
        employeeService.deleteEmployeeByID(empNum);
        return "Employee with EmpId:" + empNum + "is deleted";
    }

    @PostMapping(value = "/emp/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
