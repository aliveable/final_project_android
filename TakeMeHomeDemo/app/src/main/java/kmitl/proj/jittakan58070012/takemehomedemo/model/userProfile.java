package kmitl.proj.jittakan58070012.takemehomedemo.model;

import java.util.List;

/**
 * Created by 58070012 on 10/28/2017.
 */

public class userProfile {
    private String id;
    private String name;
    private String link;
    private List<NewDrivecourse> DriverCourse;

    public List<NewDrivecourse> getDriverCourse() {
        return DriverCourse;
    }

    public void setDriverCourse(List<NewDrivecourse> driverCourse) {
        DriverCourse = driverCourse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
