# QUESTION 10

---

## Discussing improvements and flaws

---
A UML Domain design is a visual model that extends code concepts of a particular project.

A small improvement that can be added to the domain model is adding descriptions to the relationships. The main purpose of this is to capture and represent all the concepts and explaining the relationships in a domain.This would make us as a team and the end user understand much better. Another small confusion with the UML would be making the composition classes complex by having attributes with the type of object. It would have much more sense if it was an aggregation relationship because as a rule of thumb that if country is deleted then the sub-object city will also have to be deleted. And that would leave the entire project being tightly coupled.

When it comes to our solution a few improvements can be made starting with making our code a bit more optimal. We could test different cases when it comes to those classes that inherit from each other, so instead of having those classes test for the same case it could be changed. Another improvement that could be done is grouping those entities with primary keys from a specific other entity into a particular package and having their own builtin helper methods and doing this would avoid any chance of different entities clashing because certain entities will not require certain dependencies for a helper method and this can cause fights between entities when having to do your test cases. 

As proven a few changes can be made to make the entire process of this project better from the UML design up until how methods are implemented. But not to take away anything from how good the solution and UML design is but as IT students we realize that there is always room for improvement even when you think everything is perfect there is always something that can be done to improve. 