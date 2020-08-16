package com.mypack.employee.service;

import com.mypack.employee.dao.EmployeeDao;
import com.mypack.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public void deleteEmployeeByID(Long empNum) {
        employeeDao.deleteById(empNum);
    }

    public Employee getEmployeeById(Long empNum) {
        return employeeDao.findById(empNum).orElse(new Employee());
    }

    public List<Employee> getEmployees() {
        return employeeDao.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }
}
