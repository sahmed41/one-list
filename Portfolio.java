public class Portfolio {
    private int id;
    private String name;
    private String description;

    // Constructor
    public Portfolio(String name) {
        this.name = name;
    }    


    // Setter
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

    public int getId() {
        return id;
    }

    /*
     */


}
