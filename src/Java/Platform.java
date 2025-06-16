package Java;

import java.util.List;

public class Platform {
    List<User> users;
    List<Course> courses;

    void addUser(User user) {
        users.add(user);
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    String searchCourses(String keyword) {
        return null;
    }

    void getAllCourses() {
        for (Course course : courses) {
            System.out.println(course.getTitle() + "\n" + course.getDescription());
        }
    }

    void getAllUsers() {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}