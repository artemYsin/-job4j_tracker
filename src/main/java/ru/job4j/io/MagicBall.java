package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("� ������� ������. ��� �� ������ ������? ");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("��");
                break;
            case 1:
                System.out.println("���");
                break;
            default:
                System.out.println("����� ����");
                break;
        }
    }
}
