import com.example.RemoveNthChar;

public class App {

    public static void removeNthChar(){
        RemoveNthChar rc = new RemoveNthChar();
        System.out.println("Answer (abcpqr)"+ rc.remChar("abcxpqr", "x"));
        System.out.println("There is no x in string "+ rc.remChar("abcpqr", "x"));
        System.out.println("Invalid String"+ rc.remChar("", "x"));
        System.out.println("Specify the character to be removed"+ rc.remChar("abcxpqr", ""));
        System.out.println("Answer (ab) "+ rc.remChar("axb", "x"));
        System.out.println("Answer (nothing remains) "+ rc.remChar("x", "x"));
        System.out.println("Answer (x) "+ rc.remChar("xx", "x"));
        System.out.println("Answer (abcpqr)"+ rc.remChar("axbcxpqr", "x"));

    }

    public static void main(String[] args) {
        removeNthChar();
    }
}
