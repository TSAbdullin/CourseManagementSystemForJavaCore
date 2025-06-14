package Java;

public class Review {
    private int rating;
    private String text;
    private Student author;
    private Course course;

    public Review(int rating, String text, Student author, Course course) {
        this.rating = rating;
        this.text = text;
        this.author = author;
        this.course = course;
    }

    String getText() {
        return text;
    }

    Student getAuthor() {
        return author;
    }

    int getRating() {
        return rating;
    }
}
