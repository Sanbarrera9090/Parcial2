package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;

    private Group group;
    private Student leader;
    private List<Student> members;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);

    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public Duration getDuration() throws SabanaResearchException {
        return Duration.ofDays(0);
    }
    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }


    public boolean isActive() {
        if(LocalDate.now().isAfter(dateEnd) || iterations.size()==0) {
            return false;
        }
        return true;
    }

}



