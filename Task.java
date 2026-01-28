import java.time.LocalDateTime;

public class Task {
    private int id;
    private String name;
    private String description;
    private User asignee;
    private LocalDateTime dead_line;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;


    // Setters
    public Task (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAsignee(User asignee) {
        this.asignee = asignee;
    }

    public void setDeadLine(LocalDateTime dead_line) {
        this.dead_line = dead_line;
    }

    

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getAsignee() {
        return asignee;
    }

    public LocalDateTime getDeadLine() {
        return dead_line;
    }

    

    
    
}
