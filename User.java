import java.util.UUID;

public class User {
    private UUID user_id;
    private String first_name;
    private String last_name;
    private String user_name;

    public User(UUID user_id, String first_name, String last_name, String user_name) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
    }

    public User(String first_name, String last_name, String user_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
    }

    // Setters
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    // Getters
    public UUID getUserId() {
        return user_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getUserName() {
        return user_name;
    }

    

    

    
    
}
