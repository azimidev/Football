package uk.ac.kingston.ci5100.football.pair2.utils;

/**
 *
 * @author Hassan Azimi
 */
public class Convertors {

    /**
     *
     * @param a gets the result as an array
     * @return the result separated by space in between
     */
    public static String getArrayAsString(String[] a) {
        String result = "";

//        for(int i = 0; i< a.length; i++)
//        {
//            result += a[i] +" ";
//        }
        for (String s : a) {
            result += s + " ";
        }

        result = result.trim();
        return result;
    }

    /**
     *
     * @param a creates an array for the result
     * @param delimiter gets and adds it to the array
     * @return the result which is the array and the string added
     */
    public static String getArrayAsString(String[] a, String delimiter) {
        String result = "";

//        for(int i = 0; i< a.length; i++)
//        {
//            result += a[i] +" ";
//        }
        for (String s : a) {
            result += s + delimiter;
        }

        result = result.trim();
        return result;
    }

    /**
     *
     * @param s gets the result as a string
     * @param delimiter splits the result
     * @return the result
     */
    public static String[] getStringAsArray(String s, String delimiter) {
        String[] result = s.split(delimiter);
        return result;

    }
}
