package Model;

public class User {
    private String name;
    private int age;
    private String id;


    public User() {
    }

    public User(String name, int age, String code) {
        this.name = name;
        this.age = age;
        this.id = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code='" + id + '\'' +
                '}';
    }

    public void remove(User user) {
        user.remove(user);
    }
}
