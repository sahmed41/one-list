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
    }    


    // Setter
    public void setName(String name) {
        this.name = name;
        
    }

    public void setDescription(String description) {
        this.description = description;
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
