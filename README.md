# SE350 — Creational Design Patterns

Example code for the creational design patterns covered in SE350 (Object-Oriented Software Development, DePaul University). Each pattern has its own package under `src/main/java/org/example/`, and most examples are a single runnable `main` class.

## Requirements

- JDK 25 (set in `pom.xml` through `maven.compiler.source`/`target`)
- Maven, or an IDE such as IntelliJ IDEA

## Build and run

```bash
mvn compile
```

To run another example, use its fully qualified class name from the table below. In IntelliJ, you can also open the class and run its `main` method.

## Patterns

| Pattern | Package | Entry point | What it shows |
|---|---|---|---|
| Simple Factory | `SimpleFactory` | `Client` | A single factory uses a `switch` on an enum to create `Hyundai` or `Toyota` cars. |
| Factory Method | `FactoryMethod.Simple` | `Client` | Each car brand has its own factory class that implements `createCar()`. |
| | `FactoryMethod.UI` | `Client` | `WindowsDialog` / `WebDialog` create the matching button. Reads the platform choice from stdin. |
| | `FactoryMethod.mower` | `MowerDriver` | `ConcreteMowerFactory` returns a `Riding` or `Push` mower. |
| Abstract Factory | `AbstractFactory.Simple` | `Client` | `ElectricFactory` / `GasFactory` produce matching Sedan + SUV families. See the [requirements note](src/main/java/org/example/AbstractFactory/Simple/readme.md). |
| Builder | `Builder.Simple` | `Client` | A fluent builder that assembles a car from doors, windows, seats and an engine. |
| | `Builder.ComputerExample` | `TestFluentBuilderPattern` | A static nested `ComputerBuilder` with required and optional parameters. |
| | `Builder.RoasterExample` | `RoasterDriver` | A `RoasterDirector` runs the build steps on the `PersonalRoaster` and `CommercialRoaster` builders. |
| Prototype | `Prototype.Bad.E1`, `Prototype.Bad.E2` | — | Copying an object by hand from outside the class, and why that is fragile. |
| | `Prototype.Good.E1` | `SimplePrototype` | A `clone()` method that calls the constructor with the object's fields. |
| | `Prototype.Good.E2` | `SimplePrototype2` | A `clone()` method that uses a copy constructor. |
| Singleton | `Singleton.Simple` | `SimpleSingleton` | Lazy `getInstance()` with a private constructor. Run with `-ea` to turn on the assertion. |
| | `Singleton.BankAccountUsecase` | `AccountDriver` | A second account request returns the account that already exists. |
| Exercise | `Exercise.Part1` | `Client` | Starter code for a class exercise (a simple factory for `Kia` / `Toyota`). |

## Project layout

```
src/main/java/org/example/
├── AbstractFactory/Simple/
├── Builder/{Simple, ComputerExample, RoasterExample}/
├── Exercise/Part1/
├── FactoryMethod/{Simple, UI, mower}/
├── Prototype/{Bad/E1, Bad/E2, Good/E1, Good/E2}/
├── SimpleFactory/
└── Singleton/{Simple, BankAccountUsecase}/
```
