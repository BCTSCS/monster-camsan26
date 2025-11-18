package ChatBot;
public class Magpie {
   public String getGreeting()  {return "Hello, let's talk.";}
   public String getResponse(String statement) {
     String response = "";
     if (statement.indexOf("no") >= 0) {
       response = "Why so negative?";
     } else if (statement.indexOf("mother") >= 0
                 || statement.indexOf("father") >= 0
                 || statement.indexOf("sister") >= 0
                 || statement.indexOf("brother") >= 0) {
       response = "Tell me more about your family.";
     } else if (statement.contains("crochet") || statement.contains("instrument") || statement.contains("bake")) {
        response = "Those are really cool hobbies!";
     } else if (statement.contains("dog") || statement.contains("cat") || statement.contains("bird") || statement.contains("fish")) {
        response = "Tell me more about your pet. That's so cool!";
     } else {
       response = getRandomResponse();
     }
     return response;
   }
   private String getRandomResponse() {
     final int NUMBER_OF_RESPONSES = 8;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0) {
       response = "Interesting, tell me more.";
     } else if (whichResponse == 1) {
       response = "Hmmm.";
     } else if (whichResponse == 2) {
       response = "Do you really think so?";
     } else if (whichResponse == 3) {
       response = "You don't say.";
     } else if (whichResponse == 5) {
        response = "Mindblowing!!";
     } else if (whichResponse == 6) {
        response = "You go girl!";
     }
     return response;
    }
  }

