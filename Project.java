public class Project {
    private int id;
    private String name;
    private Portfolio portfolio;

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

    // Getters
    public String getName() {
        return name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
    
}
