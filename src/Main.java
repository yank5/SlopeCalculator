import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinearEquation obj = new LinearEquation();
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

        if(d1==d3){
            System.out.println("These points are on a vertical line: x="+d1);
            System.exit(0);
        }
        if(d2==d4){
            System.out.println("These points are on a horizontal line: x="+d2);
            System.exit(0);
        }


        obj.test(d1,d2,d3,d4);

        System.out.println(obj.lineInfo());


        System.out.print("enter an x value: ");
        Double cc = ab.nextDouble();
        System.out.println(obj.coordinateForX(cc));

    }
}