package co.edu.escuelaing.cvds.lab7.repository;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Método para crear un nuevo empleado
    void createEmployee(Employee employee);

    // Método para obtener todos los empleados
    List<Employee> getAllEmployees();

    // Método para obtener un empleado por su ID
    Employee getEmployeeById(Long employeeId);

    // Método para actualizar la información de un empleado
    void updateEmployee(Employee employee);

    // Método para eliminar un empleado
    void deleteEmployee(Employee employee);
}
