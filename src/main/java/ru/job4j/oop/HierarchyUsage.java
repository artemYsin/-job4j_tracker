package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        /* ������� ������� ������ Car. */
        Car car = new Car();
        /* ������ ���������� � ���� �������� Transport. */
        Transport tp = car;
        /* ������ ���������� � ���� �������� Object. */
        Object obj = car;
        /* ���������� ���� ��� �������� �������. */
        Object ocar = new Car();
        /* ���������� ���� �� ���� ��������� �� ��������. */
        Car carFromObject = (Car) ocar;

        /* ������ � ���������� ����. */
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle; // ��� ���������� � ������� ���������� ����� ClassCastException
    }
}
