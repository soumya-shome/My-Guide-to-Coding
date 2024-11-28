import java.lang.Math; //Import Math class
import java.util.Scanner; //Import Scanner class


public class Basics {
    public static void main(String[] args) {

        //Declare variables
        int a;
        double b;
        char c;
        String d;

        //Assign values to variables
        a = 5;
        b = 5.5;
        c = 'c';
        d = "Hello World";

        //Print variables
        System.out.println(a); //5
        System.out.println(b); //5.5
        System.out.println(c); //c
        System.out.println(d); //Hello World

        //Print variables with text
        System.out.println("a = " + a); //a = 5
        System.out.println("b = " + b); //b = 5.5
        System.out.println("c = " + c); //c = c
        System.out.println("d = " + d); //d = Hello World

        //Print variables with text and format
        System.out.printf("a = %d\n", a); //a = 5
        System.out.printf("b = %f\n", b); //b = 5.500000
        //System.out.printf("b = %0.2f \n", b); //b = 5.50
        System.out.printf("c = %c\n", c); //c = c
        System.out.printf("d = %s\n", d); //d = Hello World

        
        //Print Hello World 
        System.out.println("Hello World 1"); //Hello World 1
        System.out.print("Hello World 2"); //Hello World 2
        System.out.printf("Hello World %d \n", 3); //Hello World 3
        System.out.format("Hello World %d \n", 4); //Hello World 4

        //Punctuators
        // ? : ; , . ( ) [ ] { } @ ->

        //Separators
        // ' " \ / # < > % & * + - ^ | ~

        //Escape sequences
        System.out.println("Hello_\t_World"); //Hello_	_World
        System.out.println("Hello_\n_World"); //Hello_
                                              //_World
        System.out.println("Hello_\r_World"); //_World
        System.out.println("Hello_\b_World"); //Hello_World
        System.out.println("Hello_\'_World"); //Hello_'_World
        System.out.println("Hello_\"_World"); //Hello_"_World
        System.out.println("Hello_\\_World"); //Hello_\_World
        System.out.println("Hello_\f_World"); //Hello_♀_World
        System.out.println("Hello_\0_World"); //Hello_ _World

        //Arithmetic operations
        System.out.println("5 + 5 = "+(5 + 5)); //5 + 5 = 10
        System.out.println("5 - 5 = "+(5 - 5)); //5 - 5 = 0
        System.out.println("5 * 5 = "+(5 * 5)); //5 * 5 = 25
        System.out.println("5 / 5 = "+(5 / 5)); //5 / 5 = 1
        System.out.println("5 % 5 = "+(5 % 5)); //5 % 5 = 0
        System.out.println("5 ^ 5 = "+(Math.pow(5, 5))); //5 ^ 5 = 3125.0

        //Increment and decrement
        int x = 5; 
        System.out.println("x = "+x); //x = 5
        System.out.println("x++ = "+(x++)); //x++ = 5
        System.out.println("x = "+x); //x = 6
        System.out.println("++x = "+(++x)); //++x = 7
        System.out.println("x = "+x); //x = 7
        System.out.println("x-- = "+(x--)); //x-- = 7
        System.out.println("x = "+x); //x = 6
        System.out.println("--x = "+(--x)); //--x = 5
        System.out.println("x = "+x); //x = 5

        //Assignment operators
        int y = 5; 
        System.out.println("y = "+y); //y = 5
        System.out.println("y += 5 = "+(y += 5)); //y += 5 = 10
        System.out.println("y = "+y); //y = 10
        System.out.println("y -= 5 = "+(y -= 5)); //y -= 5 = 5
        System.out.println("y = "+y); //y = 5
        System.out.println("y *= 5 = "+(y *= 5)); //y *= 5 = 25
        System.out.println("y = "+y); //y = 25
        System.out.println("y /= 5 = "+(y /= 5)); //y /= 5 = 5
        System.out.println("y = "+y); //y = 5
        System.out.println("y %= 5 = "+(y %= 5)); //y %= 5 = 0
        System.out.println("y = "+y); //y = 0
        System.out.println("y ^= 5 = "+(y ^= 5)); //y ^= 5 = 5
        System.out.println("y = "+y); //y = 5

        //Relational operators
        System.out.println("5 == 5 = "+(5 == 5)); //5 == 5 = true
        System.out.println("5 != 5 = "+(5 != 5)); //5 != 5 = false
        System.out.println("5 > 5 = "+(5 > 5)); //5 > 5 = false
        System.out.println("5 < 5 = "+(5 < 5)); //5 < 5 = false
        System.out.println("5 >= 5 = "+(5 >= 5)); //5 >= 5 = true
        System.out.println("5 <= 5 = "+(5 <= 5)); //5 <= 5 = true

        //Logical operators
        System.out.println("true && true = "+(true && true)); //true && true = true
        System.out.println("true && false = "+(true && false)); //true && false = false
        System.out.println("false && true = "+(false && true)); //false && true = false
        System.out.println("false && false = "+(false && false)); //false && false = false
        System.out.println("true || true = "+(true || true)); //true || true = true
        System.out.println("true || false = "+(true || false)); //true || false = true
        System.out.println("false || true = "+(false || true)); //false || true = true
        System.out.println("false || false = "+(false || false)); //false || false = false
        System.out.println("!true = "+(!true)); //!true = false
        System.out.println("!false = "+(!false)); //!false = true

        //Bitwise operators
        System.out.println("5 & 5 = "+(5 & 5)); //5 & 5 = 5
        System.out.println("5 | 5 = "+(5 | 5)); //5 | 5 = 5
        System.out.println("5 ^ 5 = "+(5 ^ 5)); //5 ^ 5 = 0
        System.out.println("~5 = "+(~5)); //~5 = -6
        System.out.println("5 << 5 = "+(5 << 5)); //5 << 5 = 160
        System.out.println("5 >> 5 = "+(5 >> 5)); //5 >> 5 = 0
        System.out.println("5 >>> 5 = "+(5 >>> 5)); //5 >>> 5 = 0

        //Ternary operator
        System.out.println("5 > 5 ? true : false = "+(5 > 5 ? true : false)); //5 > 5 ? true : false = false
        System.out.println("5 < 5 ? true : false = "+(5 < 5 ? true : false)); //5 < 5 ? true : false = false

        //Type casting
        int i1 = 5;
        double j = 5.5;
        System.out.println("i = "+i1); //i = 5
        System.out.println("j = "+j); //j = 5.5
        System.out.println("i + j = "+(i1 + j)); //i + j = 10.5
        System.out.println("i + (int)j = "+(i1 + (int)j)); //i + (int)j = 10
        System.out.println("(double)i + j = "+((double)i1 + j)); //(double)i + j = 10.5

        //String concatenation
        String s = "Hello";
        String t = "World";
        System.out.println("s = "+s); //s = Hello
        System.out.println("t = "+t); //t = World
        System.out.println("s + t = "+(s + t)); //s + t = HelloWorld

        //--------------------------Arrays----------------------------

        //Array declaration
        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = new int[]{1, 2, 3, 4, 5};

        //Array initialization
        for(int i = 0; i < arr1.length; i++)
            arr1[i] = i + 1;

        //Array traversal
        for(int i = 0; i < arr1.length; i++)
            System.out.println("arr1["+i+"] = "+arr1[i]);

        //Array length
        System.out.println("arr1.length = "+arr1.length); //arr1.length = 5

        //--------------------------Inputs----------------------------

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a1 = sc.nextInt();
        System.out.println("Number = "+a1);

        System.out.print("Enter a string: ");
        String b1 = sc.next();
        System.out.println("String = "+b1);

        System.out.print("Enter a double: ");
        double c1 = sc.nextDouble();
        System.out.println("double = "+c1);

        System.out.print("Enter a boolean: ");
        boolean d1 = sc.nextBoolean();
        System.out.println("boolean = "+d1);

        System.out.print("Enter a character: ");
        char e1 = sc.next().charAt(0);
        System.out.println("character = "+e1);

        System.out.print("Enter a line: ");
        String f1 = sc.nextLine();
        System.out.println("line = "+f1);

        sc.close();

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int a2 = Integer.parseInt(br.readLine());
        System.out.println("Number = "+a2);

        System.out.print("Enter a string: ");
        String b2 = br.readLine();
        System.out.println("String = "+b2);

        System.out.print("Enter a double: ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("double = "+c2);

        System.out.print("Enter a boolean: ");
        boolean d2 = Boolean.parseBoolean(br.readLine());
        System.out.println("boolean = "+d2);

        System.out.print("Enter a character: ");
        char e2 = br.readLine().charAt(0);
        System.out.println("character = "+e2);

        System.out.print("Enter a line: ");
        String f2 = br.readLine();
        System.out.println("line = "+f2);

        br.close();
        
        //--------------------------Control Flow----------------------------

        //If-else
        int x1 = 5;
        if(x1 > 5) {
            System.out.println("x is greater than 5");
        } else if(x1 < 5) {
            System.out.println("x is less than 5");
        } else {
            System.out.println("x is equal to 5");
        }

        //Switch
        int x2 = 5;
        switch(x2){
            case 1:
                System.out.println("x is 1");
            break;
            
            case 2:
                System.out.println("x is 2");
            break;
            
            case 3:
                System.out.println("x is 3");
            break;

            case 4:
                System.out.println("x is 4");
            break;

            case 5:
                System.out.println("x is 5");
            break;

            default:
                System.out.println("x is not 1, 2, 3, 4 or 5");
        }

        //For loop
        for(int i = 0; i < 5; i++) {
            System.out.println("i = "+i); //i = 0, 1, 2, 3, 4
        }

        //While loop
        int i2 = 0;
        while(i2 < 5) {
            System.out.println("i = "+i2); //i = 0, 1, 2, 3, 4
            i2++;
        }

        //Do-while loop
        int i3 = 0;
        do {
            System.out.println("i = "+i3); //i = 0, 1, 2, 3, 4
            i3++;
        } while(i3 < 5);

        //Break
        for(int i = 0; i < 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println("i = "+i); //i = 0, 1, 2
        }

        //Continue
        for(int i = 0; i < 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println("i = "+i); //i = 0, 1, 2, 4
        }

        //Return
        
        /*
        public static int add(int a, int b) {
            return a + b;
        }
        */
        
    }
}