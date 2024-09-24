pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
		jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "v2rayNG"
include(":app")