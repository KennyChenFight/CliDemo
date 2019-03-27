package com.kenny;

import java.util.HashMap;
import java.util.Map;

public class Options {

    Map<String, Option> options = new HashMap<>();

    public void addOption(String name, String desc) {
        options.put(name, new Option(name, desc));
    }

    public Option getOption(String name) {
        return options.get(name);
    }
}
