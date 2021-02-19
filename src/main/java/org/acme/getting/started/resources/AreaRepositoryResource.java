package org.acme.getting.started.resources;

import java.util.UUID;

import org.acme.getting.started.entities.Area;
import org.acme.getting.started.repositories.AreaRepository;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "area")
public interface AreaRepositoryResource extends PanacheRepositoryResource<AreaRepository, Area, UUID> {

}
