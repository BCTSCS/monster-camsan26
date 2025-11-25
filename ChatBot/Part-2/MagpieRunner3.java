public class MagpieRunner3 {
    public static void main(String[] args) {
     Magpie3 maggie = new Magpie3();

     System.out.println(maggie.getGreeting());
     System.out.println(maggie.getResponse("My mother and I talked last night."));
     System.out.println(maggie.getResponse("I said no!"));
     System.out.println(maggie.getResponse("The weather is nice."));
     System.out.println(maggie.getResponse("Do you know my brother?"));
     System.out.println(maggie.getResponse("I went to walk my dog"));
     System.out.println(maggie.getResponse("I play an instrument"));
   }
}
