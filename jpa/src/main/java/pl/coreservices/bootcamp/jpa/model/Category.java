package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by BKuczynski on 2016-12-14.
 */

@Entity
public class Category {
	@Id
	private String name;
	@Entity
	private Category parent;
	@Id
	public String getName() {
		return name;
	}
	@Entity
	public void setName(String name) {
		this.name = name;
	}
	@Id
	public Category getParent() {
		return parent;
	}
	@Entity
	public void setParent(Category parent) {
		this.parent = parent;
	}
}
