package org.vep.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Protocol is a series of subjects for specific purpose, may 
 */

@Entity
public class Protocol {
    @Id
    @GeneratedValue private long id;
    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST})
    private List<Patient> patients;

    public Protocol() {
    }

    public Protocol(String name) {
        this.name = name;
        this.patients = new ArrayList<Patient>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> exams) {
        this.patients = exams;
    }
}
