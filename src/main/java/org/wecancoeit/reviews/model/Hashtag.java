package org.wecancoeit.reviews.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

public class Hashtag {
    @Id
    @GeneratedValue
    private long id;

    @ManyToMany
    private Collection<Hashtag>
}
