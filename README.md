# Animal Shelter System

## Overview

The Animal Shelter System is a Java application designed to manage and organize information about animals in a shelter. This system includes classes for different types of animals, such as dogs, and provides functionality for handling their details.

## Classes

### 1. Animal

The base class representing general information about an animal.

#### Attributes:

- `name` (String): The name of the animal.
- `race` (String): The race or breed of the animal.
- `age` (int): The age of the animal.
- `weight` (double): The weight of the animal.
- `gender` (String): The gender of the animal.

### 2. Dog

A subclass of Animal, specifically for managing details related to dogs.

#### Additional Attributes:

- `tailLength` (double): The length of the dog's tail.
- `skills` (List<String>): A list of skills or abilities the dog possesses.

#### Methods:

- `getTailLength(): double`: Get the length of the dog's tail.
- `getSkills(): List<String>`: Get the list of skills the dog has.
- `setSkills(List<String> skills)`: Set the skills of the dog.
- `addSkill(List<String> skills)`: A method to add skills to the dog.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        // Create a dog with specific details
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3, 25.5, "Male", 0.5, Arrays.asList("Fetch", "Sit"));

        // Display information about the dog
        System.out.println(myDog.toString());
    }
}
