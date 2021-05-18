Everything this plugin does is to provide the Kotlin stdlib and all common kotlinx libraries at runtime. This way you
won't have to shade these Kotlin dependencies into your .jar file. This avoids conflicts and reduces the file size.

Add this dependency to your Gradle project:

```kotlin
compileOnly("net.axay:spigot-language-kotlin:VERSION")
```

Make sure that you declare the dependency in your plugin.yml:

```yaml
depend: [ spigot-language-kotlin ]
```

If you are using the Gradle shadow plugin anyways, you can exclude **all** Kotlin dependencies from the shadow task by
configuring it this way:

```kotlin
shadowJar {
    dependencies {
        exclude { it.moduleGroup == "org.jetbrains.kotlin" || it.moduleGroup == "org.jetbrains.kotlinx" }
    }
}
```
