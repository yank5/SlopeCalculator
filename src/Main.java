import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("first coords(separate with comma): ");
        String test = ab.nextLine();
        int idxO = test.indexOf(',');
        int idx1 = test.indexOf(')');
        int idx2 = test.indexOf('(');
        String f1 = test.substring(idx2+1,idxO);
        String f2 = test.substring(idxO+1,idx1);
        f2 = f2.strip();
        int f3 = Integer.valueOf(f1.strip());
        int f4 = Integer.valueOf(f2.strip());

        double new1 = Math.sqrt(Math.pow(f3,2)+Math.pow(f4,2));
        //System.out.println(f1+" "+f2);
    }
}