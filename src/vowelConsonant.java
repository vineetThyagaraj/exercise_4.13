import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String letter =  scanner.nextLine();

        if(letter.length() == 1 && Character.isLetter(letter.charAt(0))){
            String l = letter.toUpperCase();
            if((l.endsWith("A")) || (l.equals("E")) || (l.equals("I")) || (l.equals("O")) || (l.equals("U"))){
                System.out.println(letter + " is a vowel");
            }else{
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
        scanner.close();
    }
}
