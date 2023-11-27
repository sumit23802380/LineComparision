/*
 *@desc : Line Comparison Computation Class
 */
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Computation");
        Line l1 = new Line(10 , 0 , 6, 0);
        Line l2 = new Line(10 , 0 , 5, 0);

        if(l1.compare(l2) <0){
            System.out.println("Line 1 is smaller");
        }
        else if(l1.compare(l2) == 0){
            System.out.println("Line 1 and Line 2 length are equal");
        }
        else{
            System.out.println("Line 1 is greater");
        }
    }
}