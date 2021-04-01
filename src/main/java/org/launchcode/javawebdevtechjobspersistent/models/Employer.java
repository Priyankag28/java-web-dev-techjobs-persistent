package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "location is required")
    private String location;

    @OneToMany(mappedBy="employer",cascade=CascadeType.ALL)
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public Employer(String loc) {
        super();
        this.location = loc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
