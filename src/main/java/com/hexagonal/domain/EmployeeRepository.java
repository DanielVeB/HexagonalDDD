package com.hexagonal.domain;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getActiveEmployees();
}
