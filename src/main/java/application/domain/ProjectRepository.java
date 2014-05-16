package application.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * <p>ProjectRepository</p>
 * <p>Define Our Crud Repository</p>
 *
 * @author Joel Wickard (Object Partners Inc.)
 */
@RepositoryRestResource(collectionResourceRel = "projects", path="projects")
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
