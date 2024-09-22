package in.ashokIt.demo.entities.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokIt.demo.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Serializable> {

}
