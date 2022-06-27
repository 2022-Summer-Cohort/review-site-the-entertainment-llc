package org.wecancoeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.model.Category;
import org.wecancoeit.reviews.model.Destination;
import org.wecancoeit.reviews.model.Hashtag;
import org.wecancoeit.reviews.repos.CategoryRepository;
import org.wecancoeit.reviews.repos.DestinationRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;

@Component
public class Populator implements CommandLineRunner {
    private CategoryRepository categoryRepo;
    private DestinationRepository destinationRepo;
    private HashtagRepository hashtagRepo;

    public Populator(CategoryRepository categoryRepo, DestinationRepository destinationRepo, HashtagRepository hashtagRepo) {
        this.categoryRepo = categoryRepo;
        this.destinationRepo = destinationRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Hashtag fun = new Hashtag("#fun");
        hashtagRepo.save(fun);
        Category coaster = new Category("Roller Coaster", "/images/large/rollercoasterLG.jpg","A roller coaster is a type of amusement ride that employs a form of elevated railroad track designed with tight turns, steep slopes, and sometimes inversions. Passengers ride along the track in open cars.");
        categoryRepo.save(coaster);
        Destination cedarPoint = new Destination("Cedar Point", "Cedar Point Dr. Sandusky, OH 44870","This place is absolutely wild!", 4.5,coaster,"/images/large/CedarPointLG.jpg","Day Ticket $49.99/Season Pass $150","https://www.cedarpoint.com/",fun);
        destinationRepo.save(cedarPoint);

        Hashtag thriller = new Hashtag("#thriller");
        hashtagRepo.save(thriller);
        Destination sixFlags = new Destination("Six Flags", "13710 Central Ave, Bowie, MD 20721","Great roller coasters for kids and adults!", 4.5,coaster,"/images/large/SixFlagsMDLG.jpg","Day $34.99/Season Pass $90","https://www.sixflags.com/america",thriller);
        destinationRepo.save(sixFlags);

        Category waterPark = new Category("Water Parks", "/images/large/waterparkLG.jpg","A water park is an amusement park that features water play areas such as swimming pools, water slides, splash pads, water playgrounds, and lazy rivers, as well as areas for floating, bathing, swimming, and other barefoot environments.");
        categoryRepo.save(waterPark);
        Destination zoombezi = new Destination("Zoombezi Bay", "4850 Powell Rd, Powell, OH 43065","Great place for family and children outing.", 4.5,waterPark,"/images/large/ZoombeziBayLG.jpg","Day $42.99/Season Pass $119.99","https://zoombezibay.columbuszoo.org/",fun);
        destinationRepo.save(zoombezi);
        Destination bigSplash = new Destination("Big Splash", "2831 Southwest Blvd, Grove City, 43123","Good place with a decent price.", 4.2,waterPark,"/images/large/BigSplashLG.jpg","Guest of Season Pass Holder $5/Season Pass $100","https://www.grovecityohio.gov/parks-and-recreation/parks-facilities/the-big-splash/",thriller);
        destinationRepo.save(bigSplash);

        Hashtag competitions = new Hashtag("#Competitive");
        hashtagRepo.save(competitions);
        Category fairs = new Category("Fairs", "/images/large/fairsLG.jpg","A state fair is an annual competitive and recreational gathering of a U.S. state's population, usually held in late summer or early fall. Includes a variety of local & international cuisines, live shows, contests, & rides.");
        categoryRepo.save(fairs);
        Destination ohioStateFair = new Destination("Ohio State Fair", "717 E 17th Ave, Columbus, OH 43211","It’s no Pawnee Harvest Festival, but it’ll do!", 3.0,fairs,"/images/large/OhioStateFairLG.jpg","Day $10","https://www.ohiostatefair.com/",competitions);
        destinationRepo.save(ohioStateFair);

        Hashtag globalCuisine = new Hashtag("#GlobalCuisine");
        hashtagRepo.save(globalCuisine);
        Destination minnisotaStateFair = new Destination("Minnesota State Fair", "1265 Snelling Ave N, St Paul, MN 55108","Only place that’s not Las Vegas where you can get married, ride a roller coaster,  and win a hot dog eating contest on the same day!", 4.0,fairs,"/images/large/MinnesotaStateFairLG.jpg","Day $17","https://www.mnstatefair.org/",globalCuisine);
        destinationRepo.save(minnisotaStateFair);

        Hashtag entertaining = new Hashtag("#Entertaining");
        hashtagRepo.save(entertaining);
        Category circuses = new Category("Circuses", "/images/large/circusLG.jpg","A circus is a company of performers who put on diverse entertainment shows. May include clowns, acrobats, trained animals, trapeze acts, tightrope walkers, jugglers, & magicians, as well as other object manipulation & stunt-oriented artists.");
        categoryRepo.save(circuses);
        Destination gardenBrothers = new Destination("Garden Brothers Circus", "Myakka City, FL 34251","I liked the horse and elephant shows the best, but the motorcycle act was incredible, and the acrobats were all great.", 1.5,circuses,"/images/large/GardenBrosCircusLG.jpg","$60","https://www.gardenbrosnuclearcircus.com/",thriller);
        destinationRepo.save(gardenBrothers);

        Hashtag familyFriendly = new Hashtag("#familyfriendly");
        hashtagRepo.save(familyFriendly);
        Category safariParks = new Category("Safari Parks", "/images/large/safariLG.jpg","A safari park, sometimes known as a wildlife park, is a drive-in tourist attraction where visitors can observe freely roaming animals. It's larger than a zoo & smaller than a game reserve.");
        categoryRepo.save(safariParks);
        Destination theWilds = new Destination("The Wilds", "14000 International Rd, Cumberland, OH 43732","Exceeds all expectations. Must visit, out of this world rare and unforgettable experience!", 4.8,safariParks,"/images/large/TheWildsSafariLG.jpg","Day $40/Season Pass $59","https://thewilds.columbuszoo.org/home",familyFriendly);
        destinationRepo.save(theWilds);

        Hashtag budgetFriendly = new Hashtag("#budgetfriendly");
        hashtagRepo.save(budgetFriendly);
        Destination safariWest = new Destination("Safari West", "3115 Porter Creek Rd, Santa Rosa, CA 95404","Great experience! Definitely worth it", 4.5,safariParks,"/images/large/SafariWestLG.jpg","Day $108","https://www.safariwest.com/",budgetFriendly);
        destinationRepo.save(safariWest);

        Hashtag animals = new Hashtag("#Animals");
        hashtagRepo.save(animals);
        Category zoo = new Category("Zoo", "/images/large/zooLG.jpg","A zoo is a facility in which animals are housed within enclosures, cared for, displayed to the public, and in some cases bred for conservation purposes.");
        categoryRepo.save(zoo);
        Destination columbusZoo = new Destination("Columbus Zoo", "4850 W Powell Rd, Powell, OH 43065","The bears gave me a weird look, but I’ll still come back!", 5.0,zoo,"/images/large/ColumbusZooLG.jpg","Day $18.99/Season Pass $69","https://columbuszoo.org/home",animals);
        destinationRepo.save(columbusZoo);

        Hashtag beautiful = new Hashtag("#beautiful");
        hashtagRepo.save(beautiful);
        Destination clevelandMetroParksZoo = new Destination("Cleveland Metro Parks Zoo", "3900 Wildlife Way, Cleveland, OH 44109","I want to come back year after year!", 4.0,zoo,"/images/large/ClevelandMetroparksZooLG.jpg","Day $18/Season Pass $94","https://www.clevelandmetroparks.com/zoo",beautiful);
        destinationRepo.save(clevelandMetroParksZoo);




















    }
}
