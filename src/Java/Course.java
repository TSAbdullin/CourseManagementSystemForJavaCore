package Java;

import java.util.List;

public class Course {
    private String title;
    private String description;
    private Teacher teacher;
    private List<Lesson> lessons;
    private List<Student> enrolledStudents;
    private List<Review> reviews;

    public Course(String title, String description, Teacher teacher, List<Lesson> lessons, List<Student> enrolledStudents, List<Review> reviews) {
        this.lessons = lessons;
        this.enrolledStudents = enrolledStudents;
        this.title = title;
        this.description = description;
        this.teacher = teacher;
        this.reviews = reviews;
    }

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }


    String getTitle() { //Возвращает название курса
        return title;
    }

    String getDescription() { //Возвращает описание курса
        return description;
    }

    Teacher getTeacher() { //Возвращает учителя
        return teacher;
    }

    void addLesson(Lesson lesson) { //Добавить урок
        lessons.add(lesson);
    }

    void enrollStudent(Student student) { //Добавить студента
        enrolledStudents.add(student);
    }

    void addReview(Review review) { //Добавить отзыв
        reviews.add(review);
    }

    float getAverageRating() { //Вернуть средний рейтинг курса
        return 0f;
    }

    void getEnrolledStudents() {
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }

    void getLessons() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson.getTitle());
        }
    }
}