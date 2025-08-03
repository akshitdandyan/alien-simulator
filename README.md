## Task 08: Dependency Injection

### My thought process for this Task

At first I didn’t know anything about Guice, but once I got how the binding and injector worked, it actually made the code cleaner. I removed all the new calls from inside the Predator factory and let Guice handle it using a module. I liked how flexible it felt — I could just swap parts in one place without touching the factory again. Also added it to the registry to keep everything reusable.
