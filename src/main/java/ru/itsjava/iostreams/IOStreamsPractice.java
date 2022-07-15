package ru.itsjava.iostreams;

import java.io.*;

public class IOStreamsPractice {

    public static void main(String[] args) {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        //tru with resources
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src/main/resources/file.txt");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("String 1");
            printWriter.println("String 2");
            printWriter.println("String 3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
