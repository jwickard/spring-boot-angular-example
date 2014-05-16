package application.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * <p>PersonRepository</p>
 * <p>Person JPA Repository</p>
 *
 * @author Joel Wickard (Object Partners Inc.)
 */
@RepositoryRestResource(collectionResourceRel = "people", path="people")
public interface PersonRepository extends CrudRepository<Person, Long> {
}
