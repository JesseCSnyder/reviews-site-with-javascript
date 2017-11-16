package reviewssitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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

	protected Review() {
	}

	public Review(String title, Category category, String image, String description) {
		this.title = title;
		this.category = category;
		this.image = image;
		this.description = description;
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

}
