package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
public class SignedComment extends Comment {
	@Id
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
