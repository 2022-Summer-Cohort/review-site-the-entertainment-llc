package org.wecancoeit.reviews.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Destination {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String address;

    @OneToMany(mappedBy = "destination")
    private Collection<Review> reviews;

    private double rating;
    private String imgUrl;
    private String ticketPriceSeasonPrice;
    private String destinationUrl;


    @ManyToOne
    private Category category;
    @ManyToMany
    private Collection<Hashtag> hashtags;

    public Destination(String title, String address, double rating, Category category, String imgUrl, String ticketPriceSeasonPrice, String destinationUrl, Hashtag...hashtags) {
        this.title = title;
        this.address = address;
        this.rating = rating;
        this.category = category;
        this.hashtags = Arrays.asList(hashtags);
        this.imgUrl = imgUrl;
        this.ticketPriceSeasonPrice = ticketPriceSeasonPrice;
        this.destinationUrl = destinationUrl;

    }

    public Destination(){
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public double getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getTicketPriceSeasonPrice() {
        return ticketPriceSeasonPrice;
    }

    public String getDestinationUrl() {
        return destinationUrl;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public void addHashtag(Hashtag hashtag){
        hashtags.add(hashtag);
    }
    public void addReview(Review review){
        reviews.add(review);
    }
}
