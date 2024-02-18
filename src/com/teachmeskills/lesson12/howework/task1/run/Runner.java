package com.teachmeskills.lesson12.howework.task1.run;

import com.teachmeskills.lesson12.howework.task1.service.RegexService;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        Default line:
//        String str = "USA's GDP growth, driven by tech giants like IBM, Microsoft, and APPLE, is a key factor in global economics.";
        scanner.close();
        RegexService.getAllAbbreviationsFromString(str);
    }
}
