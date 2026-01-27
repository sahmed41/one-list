
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Project {
    private int id;
    private String name;
    private Portfolio portfolio;

    private LocalDate starDate;
    private LocalDate targetEndDate;
    private LocalDate actualEndDate;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    // Constructors
    public Project(String name, Portfolio portfolio) {
        this.name = name;
        this.portfolio = portfolio;
    }   


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }

    public void setTartgetEndDate(LocalDate targetEndDate) {
        this.targetEndDate = targetEndDate;
    }

    public void setActualEndDate(LocalDate actualEndDate) {
        this.actualEndDate = actualEndDate;
    }       
    
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public LocalDate getStarDate() {
        return starDate;
    }
    
    public LocalDate getTargetEndDate() {
        return targetEndDate;
    }

    public LocalDate getActualEndDate() {
        return actualEndDate;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public LocalDateTime getUpdatedAt() {
        return updated_at;
    }   
    
}
