package org.acme.getting.started.resources;

import java.util.UUID;

import org.acme.getting.started.entities.Employee;
import org.acme.getting.started.repositories.EmployeeRepository;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "employee")
public interface EmployeeRepositoryResource extends PanacheRepositoryResource<EmployeeRepository, Employee, UUID> {

}
