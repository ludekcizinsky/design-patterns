## Description
Ensure that the given class is instantiated only once. It is often used when it is important to have only one instance of a class for the entire application, such as for a configuration manager or an event logger. 

## Pros and Cons
The pros are:
- provides global access point to a singleton instance of given class
- it can be useful for initilization of resources that are expensive to create, e.g., database connection
- directly accesible data without reference passing to clients

The cons are:
- since it creates global data, as a result the whole system is more prone to tangling, i.e., a change in one part might as well affect the other part. Or put in other words, the system becomes more interconnected.
- it may be hard to subclass as the subclass must also adhere to the singleton pattern