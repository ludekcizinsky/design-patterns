## Description
Objects need to be able to react on changes of other objects. Observer patterns enables this by decoupling the relationship between subject and observer since the subject
only depends on the abstract interface which is then implemented by concrete observer.

## Pros and cons
The pros are:
- given subject can have arbitrary number of observers while only depending on abstract interface and not on particular observer implementation

The cons are:
- feels like work around due to the programming language shortcoming
- it may be harder to debug given that there might be many observers that my cause the problem
- further, if there is many observers, it can slow down the system