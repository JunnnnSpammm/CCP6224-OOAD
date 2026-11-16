### 1. What is the name of the class in this Java program? 

`JavaIO`

### 2. What should the filename of the program be saved as? 

`JavaIO.java`

### 3. What specifier replaces ‘%d’ if you wanted to print the string "one" instead of a digit?

`%s`

### 4. What is wrong with output in the last println statement? 

Instead of printing `x + y = 40`, it concatenates the numbers as strings, resulting in the incorrect output: `x + y = 1030`

### 5. How do you fix the last println statement? 

```java
System.out.println("x + y = " + (x + y));
```
