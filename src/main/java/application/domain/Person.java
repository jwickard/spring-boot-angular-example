package application.domain;

import javax.persistence.*;
import java.util.List;

/**
 * <p>Person</p>
 * <p>Entity Represents Our Person</p>
 *
 * @author Joel Wickard (Object Partners Inc.)
 */
@Entity
@Table(name="people")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@OneToMany
	private List<Project> projects;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
