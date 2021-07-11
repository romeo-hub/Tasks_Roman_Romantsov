package com.senla.course.tasks.task3;

import static com.senla.course.tasks.task3.Vector.*;

public class OperationsWithVector {

    public static void main(String[] args) {
        System.out.println("Вектор 1");
        Vector vector1 = new Vector(1, 2, 3);
        showVector(vector1);
        System.out.println("Вектор 2");
        Vector vector2 = new Vector(4, -5, 6);
        showVector(vector2);
        System.out.println("Длина вектора 1 " + "\n" + getVectorLength(vector1));
        System.out.println("Длина вектора 2 " + "\n" + getVectorLength(vector2));
        Vector vector3 = multiplyVector(vector1, vector2);
        System.out.println("Вектор 3");
        showVector(vector3);
        Vector vector4 = multiplyVector(vector2, vector1);
        System.out.println("Вектор 4");
        showVector(vector4);
    }

    public static Vector multiplyVector(Vector vector1, Vector vector2) {
        return new Vector(
                vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY(),
                vector1.getZ() * vector2.getX() - vector1.getX() * vector2.getZ(),
                vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX()
        );
    }
}

