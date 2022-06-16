package org.wecancoeit.reviews.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Hashtag {
    @Id
    @GeneratedValue
    private long id;

    @ManyToMany
    private Collection<Hashtag>
}
