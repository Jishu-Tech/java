import java.util.Scanner;

interface Speaker {
    void speak(String text);
}

interface Translator {
    void translate(String text, String language);
}

class AIAssistant implements Speaker, Translator {

    public void speak(String text) {
        System.out.println("Speaking: " + text);
    }

    public void translate(String text, String language) {
        System.out.println("Translating '" + text + "' to " + language);

        if (language.equals("Spanish")) 
        {
            System.out.println("Translated: Hola means Hello");
        } 
        else if (language.equals("French")) 
        {
            System.out.println("Translated: Bonjour means Hello");
        } 
        else
        {
            System.out.println("Translated text: " + text + " in " + language);
        }
    }
}

class AiAss
{
  public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   AIAssistant ai = new AIAssistant();
   System.out.print("Enter text: ");
   String text = sc.nextLine();
   System.out.print("Enter language to translate: ");
   String lang = sc.nextLine();
   System.out.println("\n--- AI Assistant ---");
   ai.speak(text); 
   ai.translate(text, lang);  
  }
}