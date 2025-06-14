package Java;

public abstract class User {
    private int id;
    private String name;
    private String email;

    abstract String getRoleDescription();

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setEmail(String email) {
        this.email = email;
    }

}
