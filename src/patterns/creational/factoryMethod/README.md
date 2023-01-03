## Description
Leave instation of given class on sub-classes while still being able to initiate the initialization in the superclass. In my [SimpleExample](SimpleExample.java), I have two `abstract classes`:
1. [Concatenator](implementation/Concatenator.java): class that includes the `concat` algorithm as part of which I initiate the initilization of the other `abstract` class via `factory` method called `createConcatenator`.

2. [StringConcat](implementation/StringConcat.java): class that defines api of the needed functionality

The subclasses [MethodConcatenator](implementation/MethodConcatenator.java) and [OperatorConcatenator](implementation/OperatorConcatenator.java) then only implement the factory method with the proper class.

## Pros and cons
The pros are:
- easy to add new types, e.g., if there is another way how to concat two strings
- allows customization of class data/behaviour withou vioalating customization

The cons:
- very slight increase in complexity