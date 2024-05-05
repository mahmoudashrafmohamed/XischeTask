# Implementation
- In this project I applied Clean architecture with (MVVM Pattern + State Management) to apply Separation of concerns.
- Using Modularization by features and move shared logic in core Module For ex:(Shared Enities). 
- using Coroutines to handle heavy operations on the background thread.
- Single activity architecture its recommended from google to make app consume less resources.
- Using Retrofit to implement Api calls.
- Using Room for handle offline work.  

# Clean Architecture 
![clean_architecture_reloaded_main](https://user-images.githubusercontent.com/18033003/164913756-59ce32bb-ba5a-4f5b-ba44-64b046a297f4.png)

# Clean Architecture layers 
![clean_architecture_reloaded_layers (1)](https://user-images.githubusercontent.com/18033003/164913902-7cba853b-784e-4092-8d14-317838e4b2cd.png)

## Tech stack & Open-source libraries
- Minimum SDK level 24
- Modularization.
- Clean Architecture approach.
- 100% [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) 
- [Dagger2] for dependency injection.
- [Gradle Version Catalog] makes it easy to manage dependency all module that we have.
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - construct the REST APIs.
- Room Persistence - construct database.
- [Material-Components](https://github.com/material-components/material-components-android) - Material design components.
- [ViewBinding](https://developer.android.com/topic/libraries/view-binding) reduces the amount of repetitive code you need to get Refrence from views and Binds Data to UI.
- [Gson](https://github.com/google/gson) - makes it easy to parse JSON into Kotlin objects.
