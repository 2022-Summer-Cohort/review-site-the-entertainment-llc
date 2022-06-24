package org.wecancoeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.awt.image.BufferedImage;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String imgUrl;

    @OneToMany(mappedBy = "category")
    private Collection<Destination> destinations;

    public Category(String name,String imgUrl) {

        this.name = name;
        this.imgUrl = imgUrl;
    }

    public Category(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Collection<Destination> getDestinations() {
        return destinations;
    }
}
