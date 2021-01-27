# Milestone 2

Course Project from SWE262P

## Getting Started

These instructions will show you how to run this project using Intellij Idea.


### Installing

I have pushed the lastest org.json library in the repository, dependency is also added in pom.xml as well. Simply importing the project in Intellij should work fine.

### Running

* Two utility features have been implemented according to the requirement, which starts from either line 844 or 920
* One validation check and one error check have been added for each of the function in `XMLTest.java`, which are called `shouldHandleValidJSONPointer`, `shouldHandleInvalidJSONPointer`, `shouldHandleValidJSONPointerReplacement`, `shouldHandleInvalidJSONPointerReplacement` respectively
* Do `cd yourpath-to-this-project` and then `mvn install`, `mvn compile` and `mvn clean test` to run the unit test
* Test files are named: `books.xml`, `books2.xml` and `books.json`
* JSONPath example: `/key1/key2/key3` or `/key1/0/key2` for JSONArray indexing
- Function1: return the inner key-value pair of the path leads to a non-json object, otherwise returns the json object, return empty jsonobject if path invalid
- Function2: replace the value given the jsonpath with the given json object, return the original jsonobject if path invalid

### Comments
* For function1, I stopped the parsing as soon as one key on the path is not found, so the performance should be better.
* For function2, I don't think we can improve the performance since we have to parse the whole xml file to replace the unwanted part, and return the whole xml file as json. So in anyway we have to parse the whole file.