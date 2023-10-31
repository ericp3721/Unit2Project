public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double distance() {
        return (Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) * 100.0) / 100.0);
    }

    public double yIntercept() {
        return Math.round((double)(x2 * y1 - x1 * y2) / (x2 - x1) * 100.0) / 100.0;
    }
    public double slope() {
        return Math.round((double) (y2 - y1) / (x2 - x1) * 100.0) / 100.0;
    }
    public String equation() {
        double real_slope =  Math.round((double) (y2 - y1) / (x2 - x1) * 100.0) / 100.0;
        double slope1 = (double) (y2 - y1);
        double slope2 = ((x2 - x1) * 100.0) / 100.0;
        String slope = slope1 + "/" + slope2;
        double yIntercept = yIntercept();
        if (real_slope == 1) {
            return "y = x + " + (yIntercept);
        } else if (real_slope == -1) {
            return "y = -x + " + (yIntercept);
        } else if (real_slope == 0) {
            return "y = " + (yIntercept);
        } else if (yIntercept == 0) {
            return "y = " + (slope) + "x";
        } else {
            return "y = " + (slope) + "x + " + (yIntercept);
        }
    }

    public String coordinateForX(double x) {
        double y = yIntercept() + slope() * x;
        return "(" + x + ", " + y + ")";
    }

    public String lineInfo() {
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n";
        info += "The equation of the line between these points is: " + equation() + "\n";
        info += "The slope of this line is: " + slope() + "\n";
        info += "The y-intercept of this line is: " + yIntercept() + "\n";
        info += "The distance between these points is: " + distance();
        return info;
    }
}