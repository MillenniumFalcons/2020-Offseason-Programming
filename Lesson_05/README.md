# Lesson_05 #

## For loops ##
In programming, a for loop is a conditional iterative statement which repeats a section of code known number of times until a certain condition is met.

So for example if you execute the following piece of code:

```
for(int i=1; i<=3; i++)
{
	  System.out.println("Hello World");
}
```
The result will be:
```
Hello World
Hello World
Hello World
```

As you can see, we were able print ```Hello World``` 3 times by using a for loop. Now lets dive into what each component of the for loop does. The ```for``` statement is used to start a for loop. The ```i =0``` part, creates a variable called ```i```. The ```i<=3``` is the condition of the for loop. In other words```System.out.println("Hello World");``` will be executed, until the ```i<=3``` condition becomes ```false```. The ```i++``` part of the code tells the variable ```i``` to increase by 1 every time the piece of code is executed. This means that in this example, the variable ```i``` starts with a value of 1. 

How the actual for loop worked: The first time the piece of code was executed, it prints ```Hello World``` and the value of variable ```i``` becomes 2 from 1, because of the ```i++``` statement. The second time it runs, it prints ```Hello World``` once again and the value of variable ```i``` becomes 3 from 2. The third time it runs, it prints ```Hello World``` one more time, and the value of variable ```i``` becomes 4 from 3. The computer doesn't run the for loop for the 4th time, because the value of ```i``` is 4, and the condition ```i<=3``` becomes false. Since the value of the condition becomes false, the compiler exits the for loop, and the program is completed.

If you would like to learn about for loops from a video, please click [here](https://youtu.be/rjkYAs6gAkk).

## System.out.println() VS System.out.print() ##
Both ```System.out.println()``` and ```System.out.print()``` are statements we use to print on to the java console. The difference between ```System.out.println()``` and ```System.out.print()``` is that the ```System.out.println("###")``` statement would print ```###``` and would move the cursor to a new line. The ```System.out.print()``` statement would print ```###```, but would not move the cursor to a new line.

So for example, If you state that: 
```
System.out.println("Programming is Awesome.");
System.out.println("Robots are Awesome.");
```
The result would be:
```
Programming is Awesome.
Robots are Awesome.
```

But, If you state: 
```
System.out.print("Programming");
System.out.print(" ");
System.out.print("is");
System.out.print(" ");
System.out.print("Awesome.");
System.out.println();
System.out.print("Robots");
System.out.print(" ");
System.out.print("are");
System.out.print(" ");
System.out.print("Awesome.");
```
The result would be the same: 
```
Programming is Awesome.
Robots are Awesome.
```
Note: The ```System.out.println();``` statement is used so that the print statements after that print in a new line.

## Nested For loops ##
Nested for loops are when loops are within other for loops. This enables us to repeat a block of code, and repeat that block of code over again which can form patterns. Let's go over a simple example:

If we state: 
```
for(int i=1; i<=7;i++) 
{
    for (int j=1; j<=i; j++) 
    {
        System.out.print("*");
    }
    System.out.println();
}
```
The result would be: 
```
*
**
***
****
*****
******
*******
```
As you can see we were able to make a pattern by using Nested For loops. Now let's dive into what each component of code and see what it does. The first for loop: ```for(int i=1; i<=7;i++)``` represents the number of rows in the pattern, and the second for loop: ```for (int j=1; j<=i; j++)``` represent the number of characters in each row. As you may have noticed, there are 7 rows in the pattern. This is because the first for loop runs 7 times. The second for loop controls how many asterisks are printed in each row. The reason why the number of asterisks changes between each row is that the number of times we print each asterisk is actually dependent on which row we are in (```j<=i```). As you may have noticed, we actually tell the program to print the asterisk ```i``` times(```j<=i```). So if we are in row 1, the asterisk gets printed once because the value of ```i``` is 1. The row number correlates with the number of times we print the asterisk.

If you would like to look at more examples, please click [here](https://www.programiz.com/java-programming/nested-loop).

If you would like to learn about nested for loops from a video, please click [here](https://youtu.be/DoUdYh9V5aQ).
