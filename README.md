# Inheritance Example: Horse and RaceHorse

## Overview

This repository contains a Java program that demonstrates the concept of inheritance using a simple example with two classes: `Horse` and `RaceHorse`. The program showcases how inheritance allows for extending functionality and creating specialized versions of a base class.

## Features

- **`Horse` Class**: Represents a basic horse with attributes for name, color, and year of birth.
- **`RaceHorse` Class**: Inherits from `Horse` and adds additional functionality for race-related information.
- **Inheritance**: Demonstrates how a subclass (`RaceHorse`) can extend and enhance the functionality of a superclass (`Horse`).

## How It Works

1. **`Horse` Class:**
   - **Attributes**: `name`, `color`, `dataoB` (year of birth).
   - **Methods**: Getters and setters for each attribute to manage the state of a horse.

2. **`RaceHorse` Class:**
   - **Inheritance**: Extends the `Horse` class, inheriting its attributes and methods.
   - **Additional Attribute**: `raceN` (number of races).
   - **Methods**: Inherits getters and setters from `Horse` and adds its own for the new attribute.

3. **`Inheritance` Class:**
   - **Demonstration**: Creates instances of `Horse` and `RaceHorse`, and displays their information to show how inheritance is utilized.

 Horse Class:
Represents a basic horse with attributes name, color, and dataoB (year of birth).
Provides getters and setters to access and modify these attributes.
RaceHorse Class:

Inheritance: Inherits from Horse, gaining its attributes and methods.
Additional Attribute: Adds raceN to keep track of the number of races.
Constructor: Initializes both inherited and new attributes.
Getters/Setters: Provides additional methods specific to RaceHorse.
Inheritance Class:

Demonstrates creating and using objects of both Horse and RaceHorse.
Displays their attributes to illustrate how RaceHorse extends Horse.

Notes
This example highlights the basic principles of object-oriented programming, specifically inheritance.
The RaceHorse class shows how to build upon an existing class to add more specialized functionality.
