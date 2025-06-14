package Java;

import java.util.List;

public class Teacher extends User {
    private List<Course> createdCourses;

    public Teacher(String name, String email, List<Course> createdCourses) {
        setName(name);
        setEmail(email);
        this.createdCourses = createdCourses;
    }


    @Override
    String getRoleDescription() {
        return "Teacher";
    }

    void createCourse(String title, String description) {
        createdCourses.add(new Course(title, description));
    }
}
