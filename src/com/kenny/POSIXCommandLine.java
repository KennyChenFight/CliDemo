package com.kenny;

public class POSIXCommandLine implements CommandLine {

    private String[] args;
    private Options options;

    public POSIXCommandLine(String[] args, Options options) {
        this.args = args;
        this.options = options;
    }

    @Override
    public boolean hasOption(String option) {
        for (String arg : args) {
            if (("-" + options.getOption(option).name).equals(arg)) {
                return true;
            }
        }
        return false;
    }
}
