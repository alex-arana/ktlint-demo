rootProject.name = "ktlint-demo"

pluginManagement {
    val kotlinVersion: String by extra
    val ktlintPluginVersion: String by extra
    val springBootVersion: String by extra
    val springDependencyManagementVersion: String by extra

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.jlleitschuh.gradle.ktlint" -> useVersion(ktlintPluginVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagementVersion)
            }
        }
    }
}
