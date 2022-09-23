public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(150, 200);
        Rectangle r2Sq = new Rectangle(100);
        Rectangle r3Def = new Rectangle();
// changing widths
        r1.setWidth(125);
        r2Sq.setWidth(125);
        r2Sq.setLength(125);
        r3Def.setWidth(125);
// calculating perimeters
        int r1Perimeter = r1.calculatePerimeter();
        int r2Perimeter = r2Sq.calculatePerimeter();
        int r3Perimeter = r3Def.calculatePerimeter();
        int totalPerimeter = r1Perimeter + r2Perimeter + r3Perimeter;
// calculating areas
        int r1Area = r1.calculateArea();
        int r2Area = r2Sq.calculateArea();
        int r3Area = r3Def.calculateArea();
        int totalArea = r1Area + r2Area + r3Area;

        System.out.println("You will need " + totalPerimeter + " feet in fencing to enclose all three plots of land and " + totalArea + " square feet of seeding.");



    }
}
