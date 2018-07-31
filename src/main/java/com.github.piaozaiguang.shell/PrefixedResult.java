package com.github.piaozaiguang.shell;

public class PrefixedResult {

    private final String prefix;

    private final String result;

    public PrefixedResult(String prefix, String result) {
        this.prefix = prefix;
        this.result = result;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getResult() {
        return result;
    }
}
