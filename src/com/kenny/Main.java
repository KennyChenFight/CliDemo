package com.kenny;

public class Main {

    public static void main(String[] args) {
//        String[] arguments = {"-help", "-version"};
        commandLine(args);
    }

    public static void commandLine(String[] arguments)  {
        Options options = new Options();
        options.addOption("help", "show help messages");
        options.addOption("version", "show version messages");

        Parser parser = new Parser();

        CommandLine cmd = parser.parse(arguments, options);

        if(cmd.hasOption("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("Help", options);
        }

        if(cmd.hasOption("version")) {
            System.out.println("show version");
        }
    }
}
