import java.util.Objects;

class User {

    private long id = 0;
    private final String userName;
    private final String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        id++;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName);
    }
}
