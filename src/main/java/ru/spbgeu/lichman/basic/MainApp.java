package ru.spbgeu.lichman.basic;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приложение содержит два файлика, введите в консоль 1 или 2: ");
        int method = scanner.nextInt();
        if (method == 1) {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\79618\\IdeaProjects\\lesson19\\src\\main\\java\\ru\\sbgeu\\lichman\\basic\\text1"))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }  else if (method == 2) {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\79618\\IdeaProjects\\lesson19\\src\\main\\java\\ru\\sbgeu\\lichman\\basic\\text2"))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }  else {
            System.out.println("У вас нет файлов ");
        }
        String data = "\nМОЙ МИР!!!";
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\79618\\IdeaProjects\\lesson19\\src\\main\\java\\ru\\sbgeu\\lichman\\basic\\text2", true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

}

