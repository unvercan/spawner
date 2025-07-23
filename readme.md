# Game Object Spawner – Prototype Pattern Demo

A modular Java-based spawner system implemented using the **Prototype Design Pattern**.
It demonstrates efficient and flexible creation of **players**, **enemies**, and **items** via deep cloning from registered prototypes.

---

## Features

* `GenericSpawnerImpl<T>` for:

    * Registering (`addPrototype`) and removing (`removePrototype`) game object templates
    * Spawning (`spawn`) new object clones based on name
* `Prototype<T>` interface ensures deep cloning with `T clone()`
* Specialized spawner classes:

    * `PlayerSpawnerImpl`, `EnemySpawnerImpl`, `ItemSpawnerImpl`
* Supports objects like:

    * `Player`, `Orc`, `Bandit`, `Sword`, `HealthPotion`, etc.
* Default values & validation via `GameConfig`
* Exception handling via `PrototypeNotRegistered`

---

## Technologies

* Java 17
* Maven
* Lombok (for concise models and configs)
