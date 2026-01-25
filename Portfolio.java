import java.time.LocalDateTime;

public class Portfolio {
    private int id;
    private String name;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;   


    // Constructor
    public Portfolio(String name, String description) {
        this.name = name;
        this.description = description;
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }    


    // Setter
    public void setName(String name) {
        this.name = name;
        
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setUpdatedAt(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
    


    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public LocalDateTime getUpdatedAt() {
        return updated_at;
    }  


}
