public class Assembler {
  public static void main(String[] args) {

    Portfolio defaultPortfolio = new Portfolio("Default", "This is the portfolio for projects without a portfolio");
    Portfolio port1 = new Portfolio("Mastesr", "This Contains all the projects related to the masters course");

    System.out.println(port1.getName());
    System.out.println(port1.getDescription());
    System.out.println(port1.getCreatedAt());
    System.out.println(port1.getUpdatedAt());

    port1.setName("New Mastesr");
    System.out.println(port1.getUpdatedAt());
    port1.setDescription("New Description");
    System.out.println(port1.getName());
    System.out.println(port1.getDescription());


    



  }
}
