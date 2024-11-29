## Syntax

In C programming, the syntax refers to the set of rules that define the combinations of symbols considered to be correctly structured programs. Below are some essential components of C syntax.

### 1. **Basic Structure of a C Program**

A basic C program consists of the following structure:

```c
#include <stdio.h>  // Preprocessor directive

// Function to execute the program
int main() {
    // Code block starts
    printf("Hello, World!\n");  // Output to screen
    return 0;  // Exit status
}
```

#### Explanation:
- `#include <stdio.h>`: This is a preprocessor directive that includes the Standard Input Output library.
- `int main()`: This is the main function where the execution starts.
- `{}`: Braces `{}` are used to define a block of code.
- `printf()`: This function is used to print output to the console.
- `return 0;`: This signifies the end of the program.

### 2. **C Keywords**

C has a set of reserved words that are predefined in the language. These are called **keywords**. They cannot be used as identifiers (variable names).

| Keyword    | Description                          |
|------------|--------------------------------------|
| `int`      | Used to define integer variables     |
| `float`    | Used to define floating-point variables |
| `char`     | Used to define character variables   |
| `return`   | Used to return a value from a function |
| `if`       | Conditional statement                |
| `else`     | Alternative conditional statement    |
| `for`      | Used for loops                       |
| `while`    | Used for loops                       |
| `break`    | Exits a loop                         |
| `continue` | Skips the current loop iteration     |

### 3. **Identifiers**

An **identifier** is a name given to variables, functions, arrays, etc. In C, identifiers follow these rules:

- It must start with a letter (a-z, A-Z) or an underscore `_`.
- The rest of the identifier can contain letters, digits (0-9), or underscores.
- It cannot be a keyword (reserved word).
- C is **case-sensitive**: `Variable` and `variable` are different identifiers.

**Example:**
```c
int age = 25; // 'age' is an identifier
```

### 4. **Data Types**
In C programming, data types are used to define the type of data that variables can hold. The data type of a variable determines what kind of values it can store, as well as the amount of memory it requires.

#### 4.1. **Basic Data Types**

##### 4.1.1 **int**
- The `int` data type is used to store integer (whole) numbers.
- Typically, it occupies **4 bytes** in memory (platform-dependent).
- Range of values depends on the system (usually from -32,768 to 32,767 for 16-bit systems, and from -2,147,483,648 to 2,147,483,647 for 32-bit systems).

```c
int age = 25; // Storing an integer value
```

##### 4.1.2 **float**
- The `float` data type is used to store single-precision floating-point numbers (numbers with decimals).
- Typically, it occupies **4 bytes** in memory.
- Range: Approx. -3.4E+38 to 3.4E+38 (with 6-7 decimal digits of precision).

```c
float price = 10.99; // Storing a floating-point number
```

##### 4.1.3 **double**
- The `double` data type is used to store double-precision floating-point numbers, offering more precision than `float`.
- Typically, it occupies **8 bytes** in memory.
- Range: Approx. -1.7E+308 to 1.7E+308 (with 15-16 decimal digits of precision).

```c
double pi = 3.141592653589793; // Storing a double-precision floating-point number
```

##### 4.1.4 **char**
- The `char` data type is used to store single characters.
- Typically, it occupies **1 byte** in memory.
- It stores the ASCII value of the character.

```c
char letter = 'A'; // Storing a character
```

##### 4.1.5 **void**
- The `void` data type represents the absence of type. It is typically used for functions that do not return a value.
- It can also be used for pointers to indicate an unspecified data type.

```c
void displayMessage() {
    printf("Hello, World!");
} // Function with no return type
```

#### 4.2. **Modifiers for Data Types**

In C, you can modify the size and range of basic data types by using **modifiers**. These modifiers are used before the data type.

##### 4.2.1 **short**
- The `short` modifier is used to declare a **short integer** (usually 2 bytes).
- It reduces the size of `int` data type.

```c
short int temperature = -10; // Short integer
```

##### 4.2.2 **long**
- The `long` modifier is used to declare a **long integer** (usually 8 bytes on 64-bit systems).
- It increases the size of `int` data type.

```c
long population = 7000000000; // Long integer
```

##### 4.2.3 **long long**
- The `long long` modifier is used to declare a **long long integer** (usually 8 bytes).
- It is often used when dealing with very large integers.

```c
long long distance = 123456789123456789; // Long long integer
```

##### 4.2.4 **unsigned**
- The `unsigned` modifier is used to declare variables that only store positive values (no negative values).
- It can be applied to `int`, `short`, `long`, and `char`.

```c
unsigned int age = 25; // Unsigned integer, only positive values
unsigned char grade = 255; // Unsigned character, storing a value between 0 and 255
```

##### 4.2.5 **signed**
- The `signed` modifier (which is the default for `int` and `char`) allows both positive and negative values.

```c
signed int balance = -500; // Signed integer, can store both positive and negative values
```

#### 4.3. **Size of Data Types**

The size of data types can vary depending on the system architecture (e.g., 32-bit vs. 64-bit). Use the `sizeof()` operator to find the size of a data type or variable.

**Example:**
```c
#include <stdio.h>

int main() {
    printf("Size of int: %lu bytes\n", sizeof(int));
    printf("Size of float: %lu bytes\n", sizeof(float));
    printf("Size of double: %lu bytes\n", sizeof(double));
    printf("Size of char: %lu bytes\n", sizeof(char));
    return 0;
}
```

Output:
```
Size of int: 4 bytes
Size of float: 4 bytes
Size of double: 8 bytes
Size of char: 1 byte
```

#### 4.4. **Type Casting**

Type casting is the process of converting one data type to another. It can be done explicitly or implicitly.

##### 4.4.1 **Implicit Type Casting (Automatic)**

Implicit casting happens when a smaller data type is automatically converted to a larger data type.

```c
int a = 5;
float b = a; // Implicit casting from int to float
```

##### 4.4.2 **Explicit Type Casting (Manual)**

Explicit casting is done using the cast operator `(type)`.

```c
float x = 10.75;
int y = (int) x; // Explicit casting from float to int
```

#### 4.5. **Constant Data Types**
Constants are fixed values that cannot be changed during program execution. You can define constants using the `const` keyword or `#define` preprocessor directive.

##### 4.5.1 **const**
```c
const int maxValue = 100; // Constant integer, value cannot be changed
```

##### 4.5.2 **#define**
```c
#define PI 3.14159  // Constant using #define preprocessor directive
```

### 5. **Statements and Expressions**
- **Statements**: A statement is an instruction that the program executes. It usually ends with a semicolon (`;`).
- **Expressions**: Expressions are combinations of variables, operators, and functions that evaluate to a value.

#### Example of a statement:
```c
int a = 10;  // This is a statement
```

#### Example of an expression:
```c
a = a + 5;  // This is an expression
```

### 6. **Comments**

Comments are used to add explanations or annotations within the code. They are ignored by the compiler.

- **Single-line comments**: 
  Use `//` for comments that extend to the end of a line.
  ```c
  // This is a single-line comment
  ```

- **Multi-line comments**: 
  Use `/*` to begin and `*/` to end the comment block.
  ```c
  /* This is a
     multi-line comment */
  ```

### 7. **Inputs**
In C programming, there are several ways to accept user input and store it in variables. The most common methods for input in C are through standard input functions like `scanf()`, `getchar()`, and `fgets()`.

#### 7.1. **Using `scanf()` Function**

The `scanf()` function is the most commonly used function to read input from the user. It allows you to read various types of data such as integers, floats, and strings.

**Syntax:**
```c
scanf("format_specifier", &variable);
```

- The `"format_specifier"` tells `scanf()` what type of data you are expecting (e.g., `%d` for integers, `%f` for floats, `%s` for strings).
- The `&variable` is the address of the variable where the input will be stored. The ampersand (`&`) is used to pass the address of the variable.

**Example:**
```c
#include <stdio.h>

int main() {
    int age;
    float salary;
    
    // Reading an integer
    printf("Enter your age: ");
    scanf("%d", &age);
    
    // Reading a float
    printf("Enter your salary: ");
    scanf("%f", &salary);

    printf("Age: %d, Salary: %.2f\n", age, salary);

    return 0;
}
```

### Format Specifiers:
- `%d` – Reads an integer
- `%f` – Reads a floating-point number
- `%c` – Reads a single character
- `%s` – Reads a string (without spaces)

---

## 2. **Using `getchar()` Function**

The `getchar()` function reads a single character from standard input (keyboard). It is commonly used when you need to read individual characters or manage user input in a more controlled manner.

### Syntax:
```c
char ch = getchar();
```

- `getchar()` reads one character at a time and returns the ASCII value of the character.

**Example:**
```c
#include <stdio.h>

int main() {
    char ch;
    
    // Reading a character
    printf("Enter a character: ");
    ch = getchar();

    printf("You entered: %c\n", ch);

    return 0;
}
```

Note: `getchar()` can sometimes leave the newline character (`\n`) in the input buffer after reading a character, which may interfere with subsequent inputs.

---

## 3. **Using `fgets()` Function**

The `fgets()` function is used to read a string (including spaces) from standard input. It is safer than `scanf()` for reading strings because it allows you to specify the maximum number of characters to read, preventing buffer overflow.

### Syntax:
```c
fgets(string, size, stdin);
```

- `string` – The character array where the input will be stored.
- `size` – The maximum number of characters to read (including the null terminator).
- `stdin` – Standard input stream (keyboard).

**Example:**
```c
#include <stdio.h>

int main() {
    char name[50];
    
    // Reading a string with spaces
    printf("Enter your name: ");
    fgets(name, sizeof(name), stdin);

    printf("Hello, %s", name);

    return 0;
}
```

### Notes:
- `fgets()` reads the newline character (`\n`) at the end of the input, so you might need to remove it if it's unwanted.
- It is safer than `scanf("%s")` for reading strings, as it prevents buffer overflow by limiting the input size.

---

## 4. **Using `scanf()` to Read a String**

While `scanf()` can also read strings, it only works well for strings without spaces. If you use `%s` with `scanf()`, it will stop reading at the first whitespace character (space, tab, or newline).

### Syntax:
```c
scanf("%s", string);
```

**Example:**
```c
#include <stdio.h>

int main() {
    char name[50];
    
    // Reading a string without spaces
    printf("Enter your name: ");
    scanf("%s", name);

    printf("Hello, %s!\n", name);

    return 0;
}
```

### Note:
- `scanf("%s")` does not handle spaces well. It will read only the first word before a space, tab, or newline.
- To read strings with spaces, `fgets()` should be preferred.

---

## 5. **Using `getch()` (Non-Standard Function)**

`getch()` is a non-standard function that reads a single character from the keyboard, similar to `getchar()`, but it does not echo the character to the console. It is often used in specific environments or in legacy programs.

### Syntax:
```c
#include <conio.h>  // Header file required in Turbo C or older compilers
char ch = getch();
```

- `getch()` is often used in old compilers like Turbo C (not part of the C standard library).

**Example:**
```c
#include <conio.h>
#include <stdio.h>

int main() {
    char ch;
    
    printf("Enter a character: ");
    ch = getch(); // Character will not be echoed to the console
    
    printf("\nYou entered: %c\n", ch);

    return 0;
}
```

**Note**: `getch()` is not part of the C standard library and may not be available in modern compilers. It is mainly used in DOS-based compilers.

---

## 6. **Using `fscanf()` for File Input**

The `fscanf()` function is used to read formatted input from a file (or other input streams).

### Syntax:
```c
fscanf(file_pointer, "format_specifier", &variable);
```

- `file_pointer` is the file pointer obtained from `fopen()`.
- `format_specifier` specifies the type of data you want to read.
- `&variable` is the address where the data will be stored.

**Example:**
```c
#include <stdio.h>

int main() {
    FILE *file = fopen("input.txt", "r");
    int number;
    
    if (file != NULL) {
        // Reading an integer from the file
        fscanf(file, "%d", &number);
        printf("Number from file: %d\n", number);
        fclose(file);
    } else {
        printf("Unable to open file.\n");
    }

    return 0;
}
```

### Notes:
- `fscanf()` works similarly to `scanf()`, but instead of standard input, it reads from a file.
- Always remember to close the file using `fclose()` after reading.

---

### Summary

- **`scanf()`**: Used to read formatted input from the user.
- **`getchar()`**: Reads a single character from the user.
- **`fgets()`**: Reads a string (including spaces) from the user.
- **`getch()`**: Reads a single character without echoing to the console (non-standard).
- **`fscanf()`**: Reads formatted input from a file.

Each of these functions has its use case, and it's important to choose the right one based on your requirements, such as reading single characters, strings, or formatted input.


### 7. **Operators**

Operators are symbols that perform operations on variables and values. They are categorized into several types:

- **Arithmetic operators**: `+`, `-`, `*`, `/`, `%` (modulo)
- **Relational operators**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Logical operators**: `&&` (AND), `||` (OR), `!` (NOT)
- **Assignment operators**: `=`, `+=`, `-=`, `*=`, `/=`
- **Increment/Decrement operators**: `++`, `--`

```c
int x = 5;
x++; // Increment by 1
x--; // Decrement by 1
```
