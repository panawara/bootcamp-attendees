package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
public class Post extends Content {
	@Id
	private Category mainCategory;
	@Entity
	private Set<Category> categories;
	@Id
	private Set<Comment> comments;
	@Entity
	public Category getMainCategory() {
		return mainCategory;
	}
	@Id
	public void setMainCategory(Category mainCategory) {
		this.mainCategory = mainCategory;
	}
	@Entity
	public Set<Category> getCategories() {
		return categories;
	}
	@Id
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	@Entity
	public Set<Comment> getComments() {
		return comments;
	}
	@Id
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
}
