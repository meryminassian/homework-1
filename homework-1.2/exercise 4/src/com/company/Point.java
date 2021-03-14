package com.company;
/*4 Design a class named Point (կետ); properties -->coordinateX,coordinateY
	methods --> distance()  (from 0:0 coordinate)
	- distance(Point point) ( Overloaded method to get the distance between 2 points )
	*/
public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point(){}

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double distance() {
        return Math.sqrt(Math.pow(getCoordinateX(), 2) + Math.pow(getCoordinateY() , 2));
    }

    public double distance(Point point){
        double distance_x = point.getCoordinateX() - coordinateX;
        double distance_y = point.getCoordinateY() - coordinateY;

        return Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2));

    }

}
