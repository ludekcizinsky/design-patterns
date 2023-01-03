## Description
The adapter design pattern proposes a way on how to connect classses with incompatible interfaces. In particular, on one side, there is a class
that needs to perform `targetAction`. This action happens to be implemented in some other class, however, here the `targetAction` has unfortunatelly different signature. The solution is to use `adapterClass` that connects these two classes. Very importantly, the `adapterClass` should implement/extend an abtract class with the given `targetAction` method. This way, if for some reason there might be different ways on how to do the adaption, it will not matter for the client since it depends on a abstraction. Therefore, the concrete implementations can be replaced.

## Pros and cons
Pro(s) are:
- Allows to use already existing functionality despite incompatible interfaces
- It decouples the client from the adaptee so client can work independently of how adaptee is implemented

Cons are:
- Subclasses of Adaptee are hard to handle elegantly
- It may make the code more complicated since you are adding additional wrapper class
- As a result of the previous con, it may not be the most efficient solution as it introduces another level of indirection