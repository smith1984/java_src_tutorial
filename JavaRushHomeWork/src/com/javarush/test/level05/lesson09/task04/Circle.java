package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centrX, centrY, radius, width;
    private String color;

    public Circle (int centrX, int centrY, int radius){
        this.centrX = centrX;
        this.centrY = centrY;
        this.radius = radius;
    }

    public Circle (int centrX, int centrY, int radius, int width){
        this.centrX = centrX;
        this.centrY = centrY;
        this.radius = radius;
        this.width = width;
    }

    public Circle (int centrX, int centrY, int radius, int width, String color){
        this.centrX = centrX;
        this.centrY = centrY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
