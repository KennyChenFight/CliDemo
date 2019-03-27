package com.kenny;

public class HelpFormatter {

    public void printHelp(String title, Options options) {
        System.out.println(title);
        options.options.forEach((name, option) -> {
            System.out.printf("\t%-10s\t%s%n", option.name, option.description);
        });
    }
}
