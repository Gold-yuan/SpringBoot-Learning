package com.didispace.prop;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "com.didispace")
@Component
public class PostI {
	private List<P> posts;

	public static class P {

		private String title;
		private String content;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		@Override
		public String toString() {
			return "P [title=" + title + ", content=" + content + "]";
		}
	}

	public List<P> getPosts() {
		return posts;
	}

	public void setPosts(List<P> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "PostI [posts=" + posts + "]";
	}

}
