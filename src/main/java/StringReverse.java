/**
 * Created by fmkam on 19.06.2017.
 */
public class StringReverse {

    public String reversal(String sentence){

        String rev = new StringBuffer(sentence).reverse().toString();
        String[] wordsSplit = rev.split(" ");
        StringBuffer result = new StringBuffer();

        for (int i = wordsSplit.length - 1; i >= 0; i--) {
            if(i == 0) {
                result.append(wordsSplit[i]);
            }
            else {
                result.append(wordsSplit[i] + " ");
            }
        }
        return result.toString();
    }

}
