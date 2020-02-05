package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;
//    @JoinColumn(name = "employer_id")
    
//    @ManyToMany(mappedBy = "jobs")
    @ManyToMany(mappedBy = "jobs")
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

//    public void addSkills(List<Skill> skills) {
//
//        this.skills.addAll(skills);
//        skills.ge
//    }
    public void addSkills(Skill skill) {
        
        this.skills.add(skill);
        skill.getJobs().add(this);
    }
    
    @Override
    public String toString() {
        return "Job{" +
                "employer=" + employer +
                ", skills=" + skills +
                '}';
    }
}
