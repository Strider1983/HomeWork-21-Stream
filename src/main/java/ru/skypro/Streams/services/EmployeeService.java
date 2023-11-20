package ru.listset.collections.services;

import ru.listset.collections.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee add(String firstName, String lastName, Integer salary, Integer department);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Map<String, Employee> getAll();

}
