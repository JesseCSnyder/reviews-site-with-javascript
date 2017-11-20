package reviewssitefullstack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	@ManyToOne
	private Category category;
	private String image;
	@Lob
	private String description;
	@ManyToMany
	private Set<Tag> tags;

	protected Review() {
	}

	public Review(String title, Category category, String image, String description, Tag... tags) {
		this.title = title;
		this.category = category;
		this.image = image;
		this.description = description;
		this.tags = new HashSet<>(Arrays.asList(tags));
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Category getCategory() {
		return category;
	}

	public String getImage() {
		return image;
	}

	public String getDescription() {
		return description;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void addTag(Tag newTag) {
		tags.add(newTag);
	}

	public void removeTag(Tag tagBeingRemoved) {
		tags.remove(tagBeingRemoved);
	}
}
