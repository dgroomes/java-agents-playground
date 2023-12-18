package dgroomes.program;

import static java.lang.System.out;

/**
 * Please see the README for context.
 */
public class Runner {

    public static void main(String[] args) {
        out.println("Hello from the main program!");

        var className = "dgroomes.agent.Agent";
        try {
            var clazz = Class.forName(className);
            out.printf("The main program was able to find a class defined in the agent: '%s'.%n", clazz.getName());
        } catch (ClassNotFoundException e) {
            out.printf("Failed to find the class: %s%n", className);
        }
    }
}
