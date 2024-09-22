package in.ashokIt.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emp_tble")
public class Employee {
     
	@Id
	@Column(name="emp_id")
	private Integer empId;
     
	@Column(name="emp_name")
	private String empName;

	@Column(name="emp_sal")
	private Integer empSal;
}
