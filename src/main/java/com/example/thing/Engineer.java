package com.example.thing;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Engineer {
    private @Id @GeneratedValue Long id;
    private String name;
    private @OneToMany
    List<SideProject> sideProjects;

    public Engineer() {
    }

    public Engineer(String name, List<SideProject> sideProjects) {
        this.name = name;
        this.sideProjects = sideProjects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SideProject> getSideProjects() {
        return sideProjects;
    }

    public void setSideProjects(List<SideProject> sideProjects) {
        this.sideProjects = sideProjects;
    }

}
