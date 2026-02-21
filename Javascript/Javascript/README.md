Here’s a **Markdown guide** that teaches **JavaScript from the basics**, organized **topic by topic** for beginners. You can copy this into any Markdown editor (like Obsidian, Notion, or VSCode) for a clean, readable study guide.

---

# 📘 JavaScript Basics — A Beginner’s Guide

JavaScript is one of the **core technologies of the web**, along with HTML and CSS. It allows you to make web pages **interactive**, **dynamic**, and **functional**.

---

## 🧩 Introduction to JavaScript

### What is JavaScript?

* JavaScript (JS) is a **programming language** that runs in web browsers.
* It can:

  * Manipulate HTML & CSS
  * Handle user interactions
  * Communicate with servers
  * Create dynamic effects

### How to Add JavaScript

You can include JS in an HTML file in three ways:

```html
<!-- 1. Inline -->
<button onclick="alert('Hello!')">Click Me</button>

<!-- 2. Internal -->
<script>
  console.log('Hello from internal JS!');
</script>

<!-- 3. External -->
<script src="app.js"></script>
```

---

## ✨ Variables and Data Types

### Declaring Variables

You can declare variables using:

```js
var name = "John";   // old way
let age = 25;        // preferred
const PI = 3.1416;   // constant
```

### Data Types

| Type      | Example                     | Description         |
| --------- | --------------------------- | ------------------- |
| String    | `"Hello"`                   | Text                |
| Number    | `42`, `3.14`                | Numeric values      |
| Boolean   | `true`, `false`             | Logic values        |
| Array     | `[1, 2, 3]`                 | Collection of items |
| Object    | `{ name: "John", age: 25 }` | Key-value pairs     |
| Null      | `null`                      | Empty value         |
| Undefined | `undefined`                 | Not assigned yet    |

---

## 🧮 Operators

### Arithmetic Operators

```js
let x = 10;
let y = 5;

console.log(x + y); // 15
console.log(x - y); // 5
console.log(x * y); // 50
console.log(x / y); // 2
console.log(x % y); // 0
```

### Comparison Operators

```js
x == y    // equal (value)
x === y   // equal (value + type)
x != y    // not equal
x > y     // greater than
x <= y    // less than or equal
```

### Logical Operators

```js
&& // AND
|| // OR
!  // NOT
```
Perfect — here’s how you can **add one clear, beginner-friendly section** to your JavaScript markdown guide that covers **Operator Precedence** and the **Ternary Operator** 👇

### 🧩 Operator Precedence

Operator precedence determines **which operations are performed first** in an expression.
For example:

```js
let result = 10 + 5 * 2;
console.log(result); // 20 (not 30)
```

✅ **Why?**
Because multiplication (`*`) has **higher precedence** than addition (`+`).

### Common Precedence Order (from high to low)

| Precedence | Operator                 | Example       | Description               |    |   |    |            |
| ---------- | ------------------------ | ------------- | ------------------------- | -- | - | -- | ---------- |
| 1          | `()`                     | `(2 + 3) * 4` | Parentheses first         |    |   |    |            |
| 2          | `**`                     | `2 ** 3`      | Exponentiation            |    |   |    |            |
| 3          | `*`, `/`, `%`            | `10 / 2`      | Multiply, Divide, Modulus |    |   |    |            |
| 4          | `+`, `-`                 | `5 + 2`       | Add, Subtract             |    |   |    |            |
| 5          | `<`, `>`, `<=`, `>=`     | `x > 10`      | Comparison                |    |   |    |            |
| 6          | `==`, `===`, `!=`, `!==` | `a === b`     | Equality                  |    |   |    |            |
| 7          | `&&`                     | `a && b`      | Logical AND               |    |   |    |            |
| 8          | `                        |               | `                         | `a |   | b` | Logical OR |
| 9          | `=`                      | `x = 10`      | Assignment (last)         |    |   |    |            |

👉 Use **parentheses** to make your expressions clearer:

```js
let value = (10 + 5) * 2; // 30
```

---

## 🔁 Control Flow

### If...Else

```js
let age = 18;

if (age >= 18) {
  console.log("Adult");
} else {
  console.log("Minor");
}
```

### Switch

```js
let day = "Monday";

switch (day) {
  case "Monday":
    console.log("Start of the week!");
    break;
  case "Friday":
    console.log("Weekend soon!");
    break;
  default:
    console.log("Midweek vibes.");
}
```

### Loops

```js
// For loop
for (let i = 0; i < 5; i++) {
  console.log(i);
}

// While loop
let n = 0;
while (n < 3) {
  console.log(n);
  n++;
}
```


### ❓ Ternary Operator (`? :`)

The **ternary operator** is a shorthand way to write an `if...else` statement.

**Syntax:**

```js
condition ? expressionIfTrue : expressionIfFalse;
```

**Example:**

```js
let age = 20;
let message = age >= 18 ? "Adult" : "Minor";

console.log(message); // "Adult"
```

**Nested Example:**

```js
let score = 85;
let grade = score >= 90 ? "A" :
             score >= 80 ? "B" :
             score >= 70 ? "C" : "F";
console.log(grade); // "B"
```

**When to use it:**
✅ For short, simple conditions
❌ Avoid it for complex logic — use `if...else` for readability.

---

## 🧰 Functions

### Function Declaration

```js
function greet(name) {
  return `Hello, ${name}!`;
}
console.log(greet("Alice"));
```

### Arrow Functions

```js
const add = (a, b) => a + b;
console.log(add(3, 4)); // 7
```

---

## 📦 Arrays

### Creating and Using Arrays

```js
let fruits = ["apple", "banana", "cherry"];

console.log(fruits[0]);  // apple
console.log(fruits.length); // 3
```

### Common Array Methods

```js
fruits.push("orange");    // add to end
fruits.pop();             // remove last
fruits.shift();           // remove first
fruits.unshift("mango");  // add to start
fruits.includes("banana"); // true/false
```

---

## 🏗️ Objects

```js
let person = {
  name: "John",
  age: 25,
  greet: function() {
    console.log("Hello, " + this.name);
  }
};

console.log(person.name);
person.greet();
```

---

## 🧠 8. DOM Manipulation

### Selecting Elements

```js
const heading = document.getElementById("title");
const buttons = document.querySelectorAll(".btn");
```

### Changing Content or Styles

```js
heading.textContent = "New Title!";
heading.style.color = "blue";
```

### Handling Events

```js
const btn = document.querySelector("#clickMe");

btn.addEventListener("click", () => {
  alert("Button clicked!");
});
```

---

## 🌐 Fetch API (Getting Data)

```js
fetch("https://jsonplaceholder.typicode.com/users")
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error("Error:", error));
```

---

## ⚙️ ES6+ Features

### Destructuring

```js
const user = { name: "Alice", age: 22 };
const { name, age } = user;
```

### Spread Operator

```js
const nums = [1, 2, 3];
const newNums = [...nums, 4, 5];
```

### Template Literals

```js
let greeting = `Hello, ${name}! You are ${age} years old.`;
```

---

## 🧩 11. Practice Ideas

Try building:

* A **To-Do List App**
* A **Counter**
* A **Digital Clock**
* A **Weather Fetch App**
* A **Simple Quiz Game**

---

## 🧭 12. Learning Resources

* [MDN JavaScript Guide](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide)
* [JavaScript.info](https://javascript.info/)
* [freeCodeCamp JavaScript Course](https://www.freecodecamp.org/)
