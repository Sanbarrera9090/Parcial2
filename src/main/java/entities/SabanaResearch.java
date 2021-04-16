package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;
    private List<Course> courses;
    private List<Student> students;


    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }


    public Summary createSummaryEntry()
    {
        int count=0;
        for(int i=0;groups.size()<i;i++) {
            count = (groups.get(i).CountActiveProjects());
        }
        Summary summary= new Summary(count,LocalDate.now());
        summaries.add(summary);
        return summary;
    }
}