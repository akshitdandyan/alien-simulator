## Task 03: Alien Simulator – New Packages

### My thought process for this Task

As discussed in our lecture also, to integrate 3rd party code that we can't change, we should use Adapter Design PAttern in such case.

I created AlienAdapter to use AlienFromNY and made separate adapters for the visit behaviors too, like NeutralVisitAdapter and AggressiveVisitAdapter. I made sure everything still worked with the Strategy pattern from Task 02. It was actually kind of cool to see both patterns work together — one to allow flexible behavior, the other to reuse weird external code.

I messed up a couple UML arrow types and naming at first, but I corrected them after double-checking. Everything is properly wired now(I hope so).
