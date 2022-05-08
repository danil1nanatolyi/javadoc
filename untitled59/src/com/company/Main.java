package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger log = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


            Logger log = Logger.getLogger("Main");
            FileHandler fileHandler = new FileHandler("logFile.log");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            log.addHandler(fileHandler);

            System.out.println("Введите значение в КилоБайтах:");
            double kiloBytes = scanner.nextDouble();
            System.out.println("Введите значение в Байтах:");
            double bytes = scanner.nextDouble();

            double convert = kiloBytes * 1024;
            System.out.println(kiloBytes + " Кб = " + convert + " Б");
            log.info(kiloBytes + " Кб = " + convert + " Б");

            convert = bytes / 1024;
            System.out.println(bytes + " Б = " + convert + " Кб");
            log.info(bytes + " Б = " + convert + " Кб");

    }

}