import java.util.Scanner;

/**
 * Created by fmkam on 19.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();

        System.out.printf("Please provide your sentence \n");
        Scanner fromUser = new Scanner(System.in);
        String sentence = fromUser.nextLine();
        String result = stringReverse.reversal(sentence);
        System.out.printf("The sentence you provided is: " + "\"" + sentence + "\"");
        System.out.printf("\nThe reversed sentence is: " + "\""+ result + "\""+"\n");
    }
}
