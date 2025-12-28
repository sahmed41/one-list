public class Assembler {
  public static void main(String[] args) {

    Portfolio defaultPortfolio = new Portfolio("Default");
    Portfolio port1 = new Portfolio("Mastesr");

    System.out.println(port1.getName());
    port1.setName("MST");
    System.out.println(port1.getName());

    System.out.println("===============================================================");
    System.out.println("Project with Portfolio");
    System.out.println("----------------------");

    // ---------------------------------------------
    Project proj1 = new Project("Software Engineering 2", port1);
    System.out.println(proj1.getName());
    System.out.println(proj1.getPortfolio().getName());

    Portfolio port2 = new Portfolio("Higher Education");
    proj1.setName("Software Architecture");
    proj1.setPortfolio(port2);
    System.out.println(proj1.getName());
    System.out.println(proj1.getPortfolio().getName());

    // --------------------------------------------------

    System.out.println("===============================================================");
    System.out.println("Project without Portfolio");
    System.out.println("-------------------------");

    Project proj2 = new Project("SVV", defaultPortfolio);
    System.out.println(proj2.getName());
    System.out.println(proj2.getPortfolio().getName());

    proj2.setName("Software Validation and Verification");
    proj2.setPortfolio(port2);
    System.out.println(proj2.getName());
    System.out.println(proj2.getPortfolio().getName());



  }
}
