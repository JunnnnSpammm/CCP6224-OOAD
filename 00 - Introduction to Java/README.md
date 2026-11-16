## Your first Java (command line) application

### 1. What is the name of the save file for this program? 

`ArgProg.java`

### 2. What is the file output of the compilation process? 

`ArgProg.class`

### 3. What does the code statement (a.length==0) tell the program? 

It checks whether any command-line arguments were passed to the program when it was executed.

* `a` is an array of strings (String[] a) representing the command-line arguments.
* `a.length == 0` evaluates to `true` if zero arguments were provided, and `false` if one or more arguments were supplied.

### 4. What happens if no arguments are passed? 

The program display:
```
Welcome to Java
```

### 5. What happens when two or more arguments are passed?

The program display:
```
This is the first Java program of [first argument]
```

## Your first Java GUI application

### 1. What is the command to compile and run the code above? 

```zsh
javac GUI.java
java GUI
```

### 2. What libraries are imported to create the application? 

1. `java.awt.*`: Abstract Window Toolkit package, used here for layout management, colors, and general window containers
2. `java.awt.event.*`: Handles GUI events
3. `javax.swing.*`: Java Swing library, provides advanced GUI components built on top of AWT, such as JFrame and JLabel

### 3. What  happens  if  you  add  another  label  “This is my first GUI application”  after “Hello  World!”? Try resizing the window and see what happens.  

* **Appearance:** Both labels will appear inside the window side-by-side or stacked depending on the available space, FlowLayout arranges components in a line, flowing naturally from left to right.

* **Resizing behavior:**
    * If the window is wide enough, both labels will sit on the same line.
    * If you resize the window to be narrower (smaller than the combined width of both labels), the second label will automatically wrap to the next line below the first one.
