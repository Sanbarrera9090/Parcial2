package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private int id;
    private LocalDate createdAt;
    private String area;

    private List<Project> projects;
    private List<Student> members;
    private List<Course> requirements;
    private Student leader;


    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public int CountActiveProjects()
    {
        int conta = 0;
        for(int i=0;projects.size()<i;i++){
            if (projects.get(i).isActive()) {
                conta++;
            }
        }
        return conta;
    }
    /**
     * adder
     */
    public void addProject(Project plan) {
        this.projects.add(plan);
    }



}
