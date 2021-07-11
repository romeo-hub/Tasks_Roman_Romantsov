package com.senla.course.tasks.task3;

/** Т.к. векторное произведение выполняется для трехмерных векторов, а если даже рассмотреть 2-мерные вектора
 *  как частный случай 3-мерных с нулевой Z компонентой, то результатом в терминах двумерного пространства будет
 *  просто скаляр, его координаты будут (0,0,z).
 *  Поэтому примем для примера трехмерный вектор с дополнительными координатами начала z1 и конца z2.
 *  Начало векторов отложим от начала координат. Тогда соответственно x1=0, y1=0, z1=0.
 *  Для получения двухмерных векторов - можно ввести в main координаты z=0.
 */

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    static double getSquare(double a){
        return a*a;
    }

    public static double getVectorLength(Vector vector) {
        return Math.sqrt(getSquare(vector.getX()) + getSquare(vector.getY()) + getSquare(vector.getZ()));
    }

    public static void showVector(Vector vector) {
        System.out.println("начало (" + 0.0 + "," + 0.0 + "," + 0.0 + ") "
                + "конец (" + vector.getX() + "," + vector.getY() + "," + vector.getZ() + ")");
    }
}
