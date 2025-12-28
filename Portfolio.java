public class Portfolio {
    private String name;
    private String description;

    // Constructor
    public Portfolio(String name) {
        this.name = name;
    }    


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
