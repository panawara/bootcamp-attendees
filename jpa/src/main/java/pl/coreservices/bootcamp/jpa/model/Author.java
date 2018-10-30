package pl.coreservices.bootcamp.jpa.model;

import java.util.Set;
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Component
import java.util.*
import javax.persistence.*
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Path

/*
 * Created by BKuczynski on 2016-12-14.
 */

@Entity

@AttributeOverride(
		AttributeOverride(name = "id", column = Column(name = "AUTHOR_ID") ),
		AttributeOverride(name = "version", column = Column(name = "AUTHOR_VERSION")),
)
@Table(name = Author)
public class Author {
	@EmbeddedId
	private String name;
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "content")
	private Set<Content> articles;
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "content")
	public String getName() {
		return name;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "content")
	public void setName(String name) {
		this.name = name;
	}
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "content")
	public Set<Content> getArticles() {
		return articles;
	}
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "content")
	public void setArticles(Set<Content> articles) {
		this.articles = articles;
	}
}
