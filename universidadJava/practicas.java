public class Test {
    int atributo1;
    Test(int atrib){atributo1 = atrib;}     
  public static void main (String[ ] Args) {
      Test lol = new Test(3);
      System.out.println ("Mensaje 1");
      System.out.println ("Atributo 1 vale " + lol.getAtrib1());
  }

  public int getAtrib1() {return atributo1;}
}