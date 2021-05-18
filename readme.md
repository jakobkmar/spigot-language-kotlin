Everything this plugin does is to provide the Kotlin stdlib and all common kotlinx libraries at runtime.
This way you won't have to shade these Kotlin dependencies into your .jar file.
This avoids conflicts and reduces the file size.

Add this dependency to your Gradle project:
```kotlin
implementation("net.axay:spigot-language-kotlin:VERSION")
```

Make sure that you declare the dependency in your plugin.yml:
```yaml
depend: [spigot-language-kotlin]
```
