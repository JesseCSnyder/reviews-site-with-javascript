package reviewssitefullstack;

import org.springframework.data.repository.CrudRepository;

public interface TagRepo extends CrudRepository<Tag, Long> {

	Tag findByTagName(String tagName); 

	


}
