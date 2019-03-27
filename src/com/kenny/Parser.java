package com.kenny;

public class Parser {

    public CommandLine parse(String[] args, Options options) {
        if (args.length != 0 && args[0].startsWith("-")) {
            return new POSIXCommandLine(args, options);
        }
        throw new RuntimeException("unknown commandline style");
    }
}
