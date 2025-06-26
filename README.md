
**UiText Library**  

A lightweight Kotlin library for handling UI text without Android framework dependencies in core layers (e.g., ViewModels). Inspired by [Philipp Lackner’s solution](https://youtu.be/mB1Lej0aDus).  

**Features**:  
- `UiText` sealed class (`DynamicString` and `StringResource`)  
- Android-context-free text resolution for business logic  
- Composable support via `stringResource()` in Jetpack Compose  
- Simplifies unit testing by decoupling text resources  

**Modules**:  
1. **core**: Plain Kotlin module (no Android dependency)  
2. **compose**: Jetpack Compose extension  
