public class User {
    public Long id;
    public String username;
    private String email;

    public User(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Sobrescrevendo o método toString para facilitar a exibição
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
