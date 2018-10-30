package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity

@AttributeOverride(
		AttributeOverride(name = "id", column = Column(name = "BLOG_ID") ),
		AttributeOverride(name = "version", column = Column(name = "BLOG_VERSION")),
		)
@Table(name = BLOG)
public class Site extends Content {
	@Id
	private Site parent;

	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}
