package com.github.piaozaiguang.shell;

import javax.validation.constraints.Size;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Commands {

    private boolean run = false;

    @ShellMethod(key = "version", value = "Show version", group = "Basic")
    public String version() {
        return "1.0.0";
    }

    @ShellMethod(key = "hello", value = "Say hello to {0}.", group = "Input")
    public String hello(@ShellOption(defaultValue = "world", help = "Input a string.") final String to) {
        return String.format("Hello, %s !", to);
    }

    @ShellMethod(key = "echo", value = "Echo arity", group = "Input")
    public String echo(@ShellOption(arity = 3, help = "Input 3 numbers.") final int[] nums) {
        return String.format("a = %d, b = %d, c = %d", nums[0], nums[1], nums[2]);
    }

    @ShellMethod(key = "echo2", value = "Prefixed echo", group = "Input")
    public PrefixedResult echo2(@ShellOption(help = "Input a string, min = 3.") @Size(min = 3) final String value) {
        return new PrefixedResult("DEMO", value);
    }

    @ShellMethod(key = "run", value = "Unavailable command", group = "Special")
    public void run() {
        System.out.println("!");
    }

    public Availability runAvailability() {
        return run ? Availability.available() : Availability.unavailable("This is unavailable command.");
    }


}
