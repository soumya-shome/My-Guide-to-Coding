# Basics of C


### 8. **Control Flow**

C provides several control flow statements to direct the flow of execution:

- **if-else**: Conditional statements
- **switch-case**: Switch between multiple conditions
- **for loop**: Loop with a fixed number of iterations
- **while loop**: Loop with a condition checked before each iteration
- **do-while loop**: Loop with a condition checked after each iteration

**Example: if-else**
```c
int num = 5;
if (num > 0) {
    printf("Positive number");
} else {
    printf("Non-positive number");
}
```

**Example: for loop**
```c
for (int i = 0; i < 5; i++) {
    printf("%d ", i); // Prints numbers 0 to 4
}
```

### 9. **Braces `{}` and Semicolons `;`**

- **Braces `{}`**: Used to define the start and end of a code block (like in functions, loops, conditionals).
- **Semicolon `;`**: Used to terminate a statement.

```c
int a = 10;  // statement ends with a semicolon
{
    // Code block
}
```

---
