import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {



        Scanner ab = new Scanner(System.in);
        System.out.print("first coordinate(separate with comma): ");
        String test1 = ab.nextLine();
        int idxO = test1.indexOf(',');
        int idx1 = test1.indexOf(')');
        int idx2 = test1.indexOf('(');
        String f1 = test1.substring(idx2+1,idxO);
        String f2 = test1.substring(idxO+1,idx1);

        System.out.print("second coordinate(separate with comma): ");
        String test2 = ab.nextLine();
        int idx3 = test2.indexOf(',');
        int idx4 = test2.indexOf(')');
        int idx5 = test2.indexOf('(');
        String f3 = test2.substring(idx5+1,idx3);
        String f4 = test2.substring(idx3+1,idx4);

        int d1 = Integer.parseInt(f1.strip());
        int d2 = Integer.parseInt(f2.strip());

        int d3 = Integer.parseInt(f3.strip());
        int d4 = Integer.parseInt(f4.strip());

        System.out.println(d1+" "+d2);
        System.out.println(d3+" "+d4);

        System.out.println("points: ("+d1+", "+d2+") "+"and ("+d3+", "+d4+")");
        //slope

        double slope = (d4-d2)/(d3-d1);

        System.out.println("slope of line " +slope);

        double yint;

        if(slope*d1!=d2){
            if(slope*d1>d2){
                yint = d2-slope*d1;
            } else {
                yint = slope*d1-d2;
            }
        } else{
            yint = 0;
        }

        char DD;
        if(yint>=0){
            DD = '+';
        } else {
            DD = '-';
        }

        System.out.println("equation of line: "+slope+"x"+DD+yint);

        System.out.println("y intercept: "+yint);

        double dist = Math.sqrt(Math.pow(d3-d1,2)+Math.pow(d4-d2,2));
        System.out.println("distance between: " +dist);

        System.out.print("enter an x value: ");
        Double cc = ab.nextDouble();

        System.out.println("\nthe point on the line is: ("+cc+", "+slope*cc+")");
    }
}