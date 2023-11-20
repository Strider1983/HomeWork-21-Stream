package ru.skypro.Streams.services;

import ru.skypro.Streams.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee add(String firstName, String lastName, Integer salary, Integer department);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Map<String, Employee> getAll();

}
