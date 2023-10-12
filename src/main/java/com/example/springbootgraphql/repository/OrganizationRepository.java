package com.example.springbootgraphql.repository;

import com.example.springbootgraphql.entities.Employee;
import com.example.springbootgraphql.entities.Organization;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends
        CrudRepository<Organization, Integer>, JpaSpecificationExecutor<Organization> {
}

