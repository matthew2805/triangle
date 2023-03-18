class Triangle {
    double a;
    double b;
    double c;
    Point centroidPoint;
    public Triangle(Point a, Point b, Point c) {
        var line1 = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
                Math.pow(b.getY() - a.getY(), 2));
        var line2 = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) +
                Math.pow(c.getY() - b.getY(), 2));
        var line3 = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) +
                Math.pow(a.getY() - c.getY(), 2));
        if (line1 + line2 > line3 &&
                line2 + line3 > line1 &&
                line3 + line1 > line2) {
            this.a = line1;
            this.b = line2;
            this.c = line3;
            this.centroidPoint =
                    new Point((a.getX() + b.getX() + c.getX()) / 3,
                            (a.getY() + b.getY() + c.getY()) / 3 );
        }
        else throw new IllegalArgumentException();
    }

    public double area() {
       var p = (this.a + this.b + this.c) / 2.0;
       return Math.sqrt(p * (p-this.a) * (p-this.b) * (p-this.c));
    }

    public Point centroid(){
        return centroidPoint;
    }

}
