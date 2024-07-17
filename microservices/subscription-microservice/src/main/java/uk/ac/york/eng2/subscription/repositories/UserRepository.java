package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.dto.UserDTO;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	Optional<UserDTO> findOne(long id);
}
