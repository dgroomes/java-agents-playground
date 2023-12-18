package dgroomes.agent;

import static java.lang.System.out;

/**
 * Please see the README for context.
 */
public class Agent {

    /**
     * Notice that this method is called <code>premain</code> instead of <code>main</code>. <code>premain</code> is the
     * entrypoint for Java agents. It feels familiar to the <code>public static void main</code> that we are used to, but
     * it's slightly different because we're in the context of a Java agent.
     */
    public static void premain(String agentArgs) {
        out.println("Hello from the agent!");

        var className = "dgroomes.program.Runner";
        try {
            var clazz = Class.forName(className);
            out.printf("The agent was able to find a class defined in the main program: '%s'.%n", clazz.getName());
        } catch (ClassNotFoundException e) {
            out.printf("Failed to find the class: %s%n", className);
        }
    }
}
