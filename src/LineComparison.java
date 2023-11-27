/*
 *@desc : Line Comparison Computation Class
 */
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Computation");
        Line l1 = new Line(10 , 0 , 5, 0);
        Line l2 = new Line(10 , 0 , 5, 0);

        if(l1.equals(l2)){
            System.out.println("Lines are equal");
        }
        else{
            System.out.println("Lines are not equal");
        }
    }
}