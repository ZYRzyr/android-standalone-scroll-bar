// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.android.library") version "8.1.2" apply false
}

extra["group_id"] = "com.hieupt.android"
extra["artifact_id"] = "standalonescrollbar"
extra["version_name"] = "1.1.4"
extra["version_code"] = 6