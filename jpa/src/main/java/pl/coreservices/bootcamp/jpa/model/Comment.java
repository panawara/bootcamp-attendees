package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by BKuczynski on 2016-12-14.
 */

@Entity
public class Comment {
	@Id
	private LocalDateTime postedAt;
	@Entity
	private String content;
	@Id
	private Post post;
	@Entity
	public LocalDateTime getPostedAt() {
		return postedAt;
	}
	@Id
	public void setPostedAt(LocalDateTime postedAt) {
		this.postedAt = postedAt;
	}
	@Entity
	public String getContent() {
		return content;
	}
	@Id
	public void setContent(String content) {
		this.content = content;
	}
	@Entity
	public Post getPost() {
		return post;
	}
	@Id
	public void setPost(Post post) {
		this.post = post;
	}
}
