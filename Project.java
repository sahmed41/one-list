
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Project {
    private int id;
    private String name;
    private Portfolio portfolio;

    private LocalDate star_date;
    private LocalDate target_end_date;
    private LocalDate actual_end_date;

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

    public void setStarDate(LocalDate star_date) {
        this.star_date = star_date;
    }

    public void setTartgetEndDate(LocalDate target_end_date) {
        this.target_end_date = target_end_date;
    }

    public void setActualEndDate(LocalDate actual_end_date) {
        this.actual_end_date = actual_end_date;
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

    public LocalDate getStar_date() {
        return star_date;
    }
    
    public LocalDate getTarget_end_date() {
        return target_end_date;
    }

    public LocalDate getActual_endDate() {
        return actual_end_date;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public LocalDateTime getUpdatedAt() {
        return updated_at;
    }   
    
}
