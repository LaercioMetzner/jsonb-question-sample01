package org.acme.getting.started.repositories;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.acme.getting.started.entities.Employee;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepositoryBase<Employee, UUID> {

}
