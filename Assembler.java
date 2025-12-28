public class Assembler {
  public static void main(String[] args) {
    Portfolio port1 = new Portfolio("Mastesr");

    System.out.println(port1.getName());
    port1.setName("MST");
    System.out.println(port1.getName());
  }
}
