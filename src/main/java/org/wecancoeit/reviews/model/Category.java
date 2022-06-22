package org.wecancoeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private Collection<Destination> destinations;

    public Category(String name) {

        this.name = name;
    }

    public Category(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Destination> getDestinations() {
        return destinations;
    }
}
