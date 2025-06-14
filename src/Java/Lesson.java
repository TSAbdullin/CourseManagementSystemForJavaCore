package Java;

public class Lesson {
    private String title;
    private String content;
    private int durationMinutes;

    public Lesson(String title, String content, int durationMinutes) {
        this.title = title;
        this.content = content;
        this.durationMinutes = durationMinutes;
    }

    String getTitle() {
        return title;
    }

    String getContent() {
        return content;
    }

    int getDurationMinutes() {
        return durationMinutes;
    }
}
