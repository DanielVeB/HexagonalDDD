package com.hexagonal.infrastructure;

import com.hexagonal.domain.Employee;
import com.hexagonal.domain.EmployeeRepository;

import java.util.List;

public class SqlEmployeeRepository implements EmployeeRepository {

    @Override
    public List<Employee> getActiveEmployees() {
        return null;
    }

}
