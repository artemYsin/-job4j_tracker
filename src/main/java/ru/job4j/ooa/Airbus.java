package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("������ ��������: " + name);
    }

    public void printCountEngine() {
        if (name.equals("A380")) {
            System.out.println("���������� ���������� �����: " + COUNT_ENGINE * 2);
        } else {
            System.out.println("���������� ���������� �����: " + COUNT_ENGINE);
        }
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
