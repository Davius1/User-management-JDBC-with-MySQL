package domain;

//author DAVIUS1

public class User {
    private int id_User;
    private String username;
    private String password;

    public User() {
    }

    public User(int id_User) {
        this.id_User = id_User;
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id_User, String username, String password) {
        this.id_User = id_User;
        this.username = username;
        this.password = password;
    }

    public int getIdUser() {
        return id_User;
    }

    public void setIdUser(int id_User) {
        this.id_User = id_User;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id_User=" + id_User + ", username=" + username + ", password=" + password + '}';
    }
    
    
}
