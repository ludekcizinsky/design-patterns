## Description
A tree-structure is a common structure in the computer science field. As such, it is a common design challenge to solve, i.e., how to represent such structure programatically. Composite design pattern answers this question. It is based on the idea of a `Component` which is an `abstract class` with `abstract` common method which needs to be implemented by all subclasses. In my [SimpleExample](SimpleExample.java), this common method is `getSize()`. Then there can be two kinds of sub-classes: `Leaf` (e.g. File) and `Composite` (e.g. Directory). As the name suggests, `Composite` may consist of other `Entries` that maybe either of type `Leaf` or also `Composite`.

## Pros and Cons
Pros are:
- The pattern is easily extensible for various types of composite and leaves. In other words, there might be several classes that implement the abstract component class and act as leaves. Similarly, for the composite nodes.
- It allows you to treat the Leaf and Composite uniformly since they both inherit from the abstract component class

Cons are:
- It becomes complicated to implement when one type can be both Leaf and Composite without multiple inheritance
- Hard to debug given the nested structure