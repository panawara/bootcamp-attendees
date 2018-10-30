package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class AnonymousComment extends Comment{

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Id
	private String authorName;
}
