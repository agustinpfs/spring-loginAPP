package com.aguja.app.Repository;


<<<<<<< HEAD
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

=======
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aguja.app.Entity.Role;
import com.aguja.app.Entity.User;

//import com.cristianruizblog.springbootApp.entity.User;
import com.aguja.app.Entity.User;
import com.aguja.app.Entity.User;
>>>>>>> f2151a192d015687934e6b58b253f03df2e006d8
import com.aguja.app.Entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

<<<<<<< HEAD
	public Optional<User> findByUsername(String username);
 }
=======
}
>>>>>>> f2151a192d015687934e6b58b253f03df2e006d8
