## Task 07: Registry

### My thought process for this Task

I knew how the registry pattern works — just store stuff in a static map and grab it later by name. So I made a simple FactoryRegistry with register and get, no overthinking. Since the task only wanted it for Predator factories, I didn’t bother making it generic. Later I used it into the simulator, and it just worked. It works fine for now, and I feel like it’ll be useful later if we have multiple preconfigured factories — like one for basic predators, one for upgraded ones, or if we ever let users switch configurations at runtime. Just makes things more flexible and modular.
