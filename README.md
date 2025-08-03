## Task 06: Configurable Factory

### My thought process for this Task

By making the Predator factory “configurable,” I believe I needed to allow external components (like drive, shield, and weapon systems) to be passed into the factory instead of hardcoding them. This way, the factory can create different types of UFOs using the injected parts. I updated the constructor to accept these components and stored them as instance variables. This made the factory more flexible and reusable.
