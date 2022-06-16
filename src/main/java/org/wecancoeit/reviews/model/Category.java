package org.wecancoeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class Category {
    @GeneratedValue
    private long id;
    private long catName;

    public Category(long id, long catName) {
        this.id = id;
        this.catName = catName;
    }

    public Category(){
    }

    public long getId() {
        return id;
    }

    public long getCatName() {
        return catName;
    }

}
