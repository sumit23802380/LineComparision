public class Line {
    Point p1;
    Point p2;

    Line(Point p1 , Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    /*
        @desc : find the length of line
        @params :
        @return : length of line double
     */
    public double length(){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }
    /*
        @desc : check whether these lines are equal or not
        @params : Other line
        @return : boolean value equal or not
     */
    public boolean equals(Line l){
        return true;
    }
    /*
        *@desc : Compare the lengths of line
        *@params : Other line l
        *@return : 0 -> line length are equal , - -> line instance length is smaller else greater
     */
    public int compare(Line l){
        Double length1 = this.length();
        Double length2 = l.length();
        return length1.compareTo(length2);
    }
}