package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RevController {

	@Resource
	CategoryRepo categoryRepo;

	@Resource
	ReviewRepo reviewRepo;
	
	@Resource
	TagRepo tagRepo;

	@RequestMapping("/categories")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/category")
	public String findCategory(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping("/review")
	public String findReview(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}
	
	@RequestMapping("/tag")
	public String findTag(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}
}