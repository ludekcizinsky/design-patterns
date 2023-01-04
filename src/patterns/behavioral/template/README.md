## Description
In the case where general steps of an algorithm are know ahead, you may let client implement specific step of the algorithm.

## Pros and cons
The pros are:
- if the developer decides to shuffle the steps, client can still use the algorithm
- in general provides a better modularity. For instance, a file system might be implemented with the abstract methods `write` and `read` which are
then implemented by the client.

The cons are:
- You need to know the steps of the algorithm including the return types in advance