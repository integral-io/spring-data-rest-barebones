package com.example.thing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class SideProject {
    private @Id @GeneratedValue Long id;

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public SideProject(String name, LocalDate startDate, LocalDate endDate, List<Engineer> engineers) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public SideProject() {
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
