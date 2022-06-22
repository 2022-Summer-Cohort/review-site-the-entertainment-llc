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
    private String review;
    private double rating;


    @ManyToOne
    private Category category;
    @ManyToMany
    private Collection<Hashtag> hashtags;

    public Destination(String title, String address, String review, double rating, Category category, Hashtag...hashtags) {
        this.title = title;
        this.address = address;
        this.review = review;
        this.rating = rating;
        this.category = category;
        this.hashtags = Arrays.asList(hashtags);
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

    public String getReview() {
        return review;
    }

    public double getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public void addHashtag(Hashtag hashtag){
        hashtags.add(hashtag);
    }
}
