package com.aguja.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aguja.app.Entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
