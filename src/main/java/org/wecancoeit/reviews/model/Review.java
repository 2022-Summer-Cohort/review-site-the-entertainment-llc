package org.wecancoeit.reviews.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String review;

    @ManyToOne
    private Destination destination;

    public Review(String review, Destination destination) {
        this.review = review;
        this.destination = destination;
    }

    public Review(){
    }

    public long getId() {
        return id;
    }

    public String getReview() {
        return review;
    }

    public Destination getDestination(){
        return destination;
    }

}