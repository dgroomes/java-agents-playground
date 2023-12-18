plugins {
    `java-library`
}

tasks {
    jar {
        manifest {
            // The `java` launcher relies on the "Premain-Class" attribute to know which class it should invoke the
            // "premain" method on.
            attributes("Premain-Class" to "dgroomes.agent.Agent")
        }
    }
}
