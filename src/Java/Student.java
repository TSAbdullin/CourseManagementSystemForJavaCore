package Java;

import java.util.List;

public class Student extends User{
    private List<Course> enrolledCourses;
    private List<Review> writtenReviews;

    public Student(String name, String email, List<Course> enrolledCourses, List<Review> writtenReviews) {
        this.enrolledCourses = enrolledCourses;
        this.writtenReviews = writtenReviews;
        setEmail(email);
        setName(name);
    }


    @Override
    String getRoleDescription() {
        return "Student";
    }

    void addReview(Course course, Review review) {
        course.addReview(review);
    }
}