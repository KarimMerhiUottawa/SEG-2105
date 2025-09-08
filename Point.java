/**
 * Represents a point in 3D space with x, y, and z coordinates.
 * This class is used to define the center of geometric shapes.
 */
public class Point {
    private double x;
    private double y;
    private double z;

    /**
     * Constructs a new Point object with specified x and y coordinates.
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @param z the z-coordinate of the point
     */
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Returns the x-coordinate of this point.
     * @return The x-coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of this point.
     * @return The y-coordinate.
     */
    public double getY() {
    return y;
    }

    /**
     * Returns the z-coordinate of this point.
     * @return The z-coordinate.
     */
    public double getZ() {
    return z;
    }


    /**
     * Sets the x-coordinate of this point.
     * @param x The new x-coordinate.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate of this point.
     * @param y The new y-coordinate.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Sets the z-coordinate of this point.
     * @param z The new z-coordinate.
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Moves the point by the specified offsets.
     * @param xOffset The amount to move along the x-axis.
     * @param yOffset The amount to move along the y-axis.
     * @param zOffset The amount to move along the z-axis.
     */
    public void move(double xOffset, double yOffset, double zoffset) {
        this.x += xOffset;
        this.y += yOffset;
        this.z += zoffset;
    }

    /**
     * Calculates the Euclidean distance between this point and another point.
     * @param other The other point to calculate the distance to.
     * @return The distance between the two points.
     */
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) + Math.pow(this.z - other.z, 2));
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}