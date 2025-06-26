[![](https://jitpack.io/v/Reyst/uitext-library.svg)](https://jitpack.io/#Reyst/uitext-library)

**UiText Library**  

A lightweight Kotlin library for handling UI text without Android framework dependencies in core layers (e.g., ViewModels). Inspired by [Philipp Lackner’s solution](https://youtu.be/mB1Lej0aDus).  

**Features**:  
- `UiText` sealed class (`DynamicString` and `StringResource`)  
- Android-context-free text resolution for business logic  
- Composable support via `stringResource()` in Jetpack Compose  
- Simplifies unit testing by decoupling text resources  

**How to use:**
<pre>
  dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
      mavenCentral()
      maven { url = uri("https://jitpack.io") }
    }
  }
</pre>

For View-based projects:
<pre>
  dependencies {
    implementation("com.github.Reyst.uitext-library:uitext-core:[version]")
  }
</pre>

For Jetpack Compose projects:
<pre>
  dependencies {
    implementation("com.github.Reyst.uitext-library:uitext-composable:[version]")
  }
</pre>

