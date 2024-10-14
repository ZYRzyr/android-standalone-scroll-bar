pluginManagement {
    repositories {
		maven { url=uri("https://maven.aliyun.com/repository/public") }
        maven { url=uri("https://jitpack.io") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
	    maven { url=uri("https://maven.aliyun.com/repository/public") }
        maven { url=uri("https://jitpack.io") }
        google()
        mavenCentral()
    }
}

rootProject.name = "android-standalone-scroll-bar"
include(":sample")
include(":android-standalone-scroll-bar")