package reviewssitefullstack;

import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private CategoryRepo categoryRepo;

	@Resource
	private TagRepo tagRepo;

	@Resource
	private ReviewRepo reviewRepo;

	@Override
	public void run(String... args) throws Exception {

		Category japanesePunkRock = new Category("Japanese Punk Rock");
		categoryRepo.save(japanesePunkRock);
		Category electronic = new Category("Electronic");
		categoryRepo.save(electronic);
		Category surfRevival = new Category("90's Surf Revival");
		categoryRepo.save(surfRevival);
		Category postPunk = new Category("Post-Punk");
		categoryRepo.save(postPunk);

		Tag punk = new Tag("Punk");
		tagRepo.save(punk);
		Tag rock = new Tag("Rock");
		tagRepo.save(rock);
		Tag electro = new Tag("Electronic");
		tagRepo.save(electro);
		Tag surf = new Tag("Surf");
		tagRepo.save(surf);
		Tag instrumental = new Tag("Instrumental");
		tagRepo.save(instrumental);
		Tag vocals = new Tag("Vocals");
		tagRepo.save(vocals);
		Tag guitar = new Tag("Guitar");
		tagRepo.save(guitar);
		Tag dance = new Tag("Dance");
		tagRepo.save(dance);

		Review guitarWolf = new Review("Guitar Wolf", japanesePunkRock, "/images/guitarwolf.jpg",
				"Guitar Wolf is a Japanese garage rock power trio founded in Nagasaki in 1987. The band is known for songs with "
						+ "piercing vocals and an extremely loud style of noise-influenced punk which emphasizes heavy distortion and feedback. - "
						+ "Wikipedia ",
				punk, rock, vocals, guitar);
		reviewRepo.save(guitarWolf);
		Review teengenerate = new Review("Teengenerate", japanesePunkRock, "/images/teengenerate.jpg",
				"Teengenerate were a Japanese punk rock band from 1993 to 1996, known for their fun style of playing garage punk "
						+ "with a sense of humor and often incomprehensible English lyrics. - Wikipedia",
				punk, rock, vocals, guitar);
		reviewRepo.save(teengenerate);
		Review five678s = new Review("The 5,6,7,8's", japanesePunkRock, "/images/5678s.jpg",
				"The 5.6.7.8's are a Japanese rock trio, whose music is reminiscent of American surf music, rockabilly and garage rock."
						+ " They frequently cover songs from American rock and roll. "
						+ "All members are from Tokyo, Japan. - Wikipedia",
				punk, rock, vocals, guitar);
		reviewRepo.save(five678s);
		Review amonTobin = new Review("Amon Tobin", electronic, "/images/amonTobin.jpg",
				"Amon Adonai Santos de Araújo Tobin (born February 7, 1972), known as Amon Tobin, "
						+ "is a Brazilian musician, composer and producer of electronic music. - Wikipedia",
				electro, instrumental);
		reviewRepo.save(amonTobin);
		Review blockhead = new Review("Blockhead", electronic, "/images/blockhead.jpg",
				"Tony Simon, better known by his stage name Blockhead, is an American hip hop record producer "
						+ "and disc jockey from Manhattan, New York. - Wikipedia",
				electro, instrumental);
		reviewRepo.save(blockhead);
		Review crystalCastles = new Review("Crystal Castles", electronic, "/images/crystalCastles.jpg",
				"Crystal Castles are a Canadian electronic music group formed in 2006 in Toronto, Ontario by founding members "
						+ "songwriter/producer Ethan Kath and songwriter/vocalist Alice Glass. - Wikipedia",
				electro, vocals, dance);
		reviewRepo.save(crystalCastles);
		Review manOrAstroMan = new Review("Man...Or Astroman?", surfRevival, "/images/manOrAstroMan.jpg",
				"Man or Astro-man? is a surf rock group that formed in Auburn, Alabama, in the early 1990s and came to prominence "
						+ "over the following decade. - Wikipedia",
				surf, rock, instrumental, guitar);
		reviewRepo.save(manOrAstroMan);
		Review phantomSurfers = new Review("The Phantom Surfers", surfRevival, "/images/phantomSurfers.jpg",
				"The Phantom Surfers are a surf rock band formed in 1988. - Wikipedia", surf, rock, instrumental,
				guitar);
		reviewRepo.save(phantomSurfers);
		Review apeMen = new Review("The Ape Men", surfRevival, "/images/apeMen.jpg",
				"The Apemen is a Dutch surf rock band, comprising band-members from Tilburg and Rotterdam, with their base "
						+ "remaining in Tilburg. - Wikipedia",
				surf, rock, instrumental, guitar);
		reviewRepo.save(apeMen);
		Review bauhaus = new Review("Bauhaus", postPunk, "/images/bauhaus.jpg",
				"Bauhaus were an English post-punk band, formed in Northampton, England in 1978. - Wikipedia", vocals,
				guitar, rock);
		reviewRepo.save(bauhaus);
		Review minuteMen = new Review("The Minutemen", postPunk, "/images/minuteMen.jpg",
				"Minutemen were an American punk rock band formed in San Pedro, California in 1980. - Wikipedia", punk,
				rock, guitar, vocals);
		reviewRepo.save(minuteMen);
		Review devo = new Review("Devo", postPunk, "/images/devo.jpg",
				"Devo is an American rock band that formed in 1973, consisting of members "
						+ "from Kent and Akron, Ohio. - Wikipedia",
				punk, rock, electro, guitar, vocals);
		reviewRepo.save(devo);

	}
}