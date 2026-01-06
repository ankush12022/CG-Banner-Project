import java.util.*;
class oopsbanner {

    public static String[] getOPattern() {
        return new String[] {
            " ***** ",
            " *   * ",
            " *   * ",
            " *   * ",
            " ***** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     "
        };
    }

    public static String[] getSPattern(){
        return new String[]{
            " ***** ",
            " *     ",
            " ***** ",
            "     * ",
            " ***** "
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/* 
        System.out.println("OOPS BANNER");
        String output = "Oops Banner";
        String arr[] = { "OOPS" , "Banner" };

        //This is a OOPS BANNER 
        //With some string literals

        String pattern[] = {
            " *****   *****   *****   ***** ",
            " *   *   *   *   *   *   *     ",
            " *   *   *   *   *****   ***** ",
            " *   *   *   *   *           * ",
            " *****   *****   *       ***** "
        };

        for(String line: pattern){
            System.out.println(line);
        }
*/    
String[] oPattern = getOPattern();
String[] pPattern = getPPattern();
String[] sPattern = getSPattern();

for (int i = 0; i < oPattern.length; i++) {
    System.out.println(
        oPattern[i] + "  " +
        oPattern[i] + "  " +
        pPattern[i] + "  " +
        sPattern[i]
    );
}


    }
}
