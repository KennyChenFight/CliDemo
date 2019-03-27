package com.kenny;

public class GnuCommandLine implements CommandLine {

    private String[] args;
    private Options options;

    public GnuCommandLine(String[] args, Options options) {
        this.args = args;
        this.options = options;
    }

    @Override
    public boolean hasOption(String option) {
        for (String arg : args) {
            if (("--" + options.getOption(option).name).equals(arg)) {
                return true;
            }
        }
        return false;
    }
}
