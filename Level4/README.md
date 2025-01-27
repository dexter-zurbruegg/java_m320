# Book Library Management System w/ Java (Angela)


## Description
This system manages books and their associated data, 
allowing users to borrow and return books. 
It utilizes a combination of classes, interfaces, and abstract classes to demonstrate various OOP concepts.

## UML Class Diagram
![img.png](img.png)

## UML Sequence Diagram (For one Use Case)
![img_1.png](img_1.png)

This diagram is for the use case of a Regular User borrowing a book from the library.

## Reason for Design Pattern Choice

We've chosen for a Observer Design Pattern.

The Observer Pattern is a behavioral design pattern where an object 
(called the Subject) maintains a list of its dependents 
(called Observers) and notifies them of state changes, usually by calling one of their methods.

This design pattern seemed the most fitting, as it notifies Observers upon state changes, which sounded very useful and neat.


