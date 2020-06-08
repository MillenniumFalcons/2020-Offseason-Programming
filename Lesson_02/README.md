# Lesson_02 #

## Printing ##
Print statements are used to display data onto the java console so that the user can see the output of their code. In Java, we print by saying ```System.out.println();```.

So for example, if you type:
```System.out.println("Hello World!");```

The result would be:
```Hello World!```


An example of when we use print statements in our robot is when we want to test out our ultra sonic sensors and see if they are working.
```
public void testSonicSensors()
{
	System.out.println("Ultra Sonic Sensor Value: " + sensors.getUltraSonic());
}
```
If you would like to learn about print statements from a video, please click [here](https://www.youtube.com/watch?v=l7cf4mT0htE).

## Variables ##
In programming, variables are like a storage location that can contain any type of data. Variables are used so that the stored data can be used on later for doing useful stuff. There are a lot of different types of data that can be stored in a variable. Here are a few examples: 
* ```boolean```: Boolean is a data type that can hold two types of values. ```true``` or ```false```.
* ```byte```: Byte is a data type that can hold integers with a storage capacity of fewer than 8 bits.
* ```int```: Int is a data type that can hold integers with a storage capacity of fewer than 32 bits.
* ```float```: Float is a data type that can hold decimals with a storage capacity of fewer than 32 bits.
* ```double```: Double is a data type that can hold decimals with a storage capacity of fewer than 64 bits.
* ```String```: String is a data type that can hold a sequence of characters.

An example of when we use variables in our robot is when we would like to describe the values of a joystick.
```
boolean rightBumper;
boolean leftBumper;
boolean buttonA;
boolean buttonB;
boolean buttonX;
boolean buttonY;
double rightTrigger;
double leftTrigger;	
double leftJoySticky;
double rightJoyStickx;
double rightJoySticky;
double leftJoyStickx;
```

If you would like to learn about variables from a video, please click [here](https://youtu.be/XX77ZI9E0IE).

## Arithmetic Operations ##
In programming, Arithmetic Operators can be used to perform calculations in a program. Some examples are:
* ```+```: The addition operator is used to add numbers.
* ```-```: The subtraction operator is used to subtract numbers.
* ```*```: The multiplication operator is used to multiply numbers.
* ```/```: The division operator is used to divide numbers.
* ```%```: The remainder operator is used to output the remainder of the quotient.

Here are some examples of when we use operators in our robot program:
```
leftMotor.set(((speed+turn)));
rightMotor.set(((-speed+turn)));
```

```
turn = .5*(rightValue);
```

If you would like to learn about arithmetic operators from a video, please click [here](https://youtu.be/RmFbY14OvdA).

## Conditional Statements ##
### If and Else statements ###
In programming, conditional statements support decisions depending on if a certain condition is met or not. So for example, if you state:
```
boolean iAmAwesome = true;
if(iAmAwesome)
{
  System.out.println("I am awesome");
}
else
{
  System.out.println("I guess, I'm not that awesome");
}
```
The result will be: ```I am awesome```. But you can also see that your result totally relies on the ```iAmAwesome``` variable. If you set the variable to false: ```boolean iAmAwesome = false```, the result will change to ```I guess, I'm not that awesome```.

If you would like to learn about if and else statements from a video, please click [here](https://youtu.be/iMeaovDbgkQ).
### Else If statements ###
There is also something called an ```else if``` statement. We usually use an else if statement when there are more than 2 conditions. We usually use ```else if```s to specify a new condition to test, if the first condition is false. For example: 
```
if(condition)
{
    //executed only if "condition" is true
}
else if (other condition)
{
    //executed only if "condition" was false and "other condition" is true
}
else
{
    //executed only if both "condition" and "other condition" were false
}
```

An example of when we use conditional statements in our robot is when we want to determine whether the robot should shoot balls using the variable ```buttonA```.
```
if(buttonA)
{
	startShootingTheBall();
}
else
{
	stopShootingTheBall();
}
```

If you would like to learn about else if statements from a video, please click [here](https://youtu.be/C0YRYVn_BeI).

## Relational and Logical Operators ##
Relational and Logical Operators are operators used to manipulate and compare variables. Here are some examples: 
* ```==``` The equals to operator is to check if the value of 2 variables are equal or not, if yes then the condition becomes true
* ```!=``` The not equals to operator is to check if the value of 2 variables are not equal or equal, if they are not equal then the condition becomes true
* ```>``` The greater than operator is to check if the value of the left variable is greater than the right variable, if yes then the condition becomes true
* ```>=``` The greater than or equal to operator is to check if the value of the left variable is greater than or equal to the right variable, if yes then the condition becomes true
* ```<``` The less than operator is to check if the value of the left variable is less than the right variable, if yes then the condition becomes true
* ```<=``` The less than or equal to operator is to check if the value of the left variable is less than or equal to the right variable, if yes then the condition becomes true
* ```&&``` The logical AND operator is used to check if 2 or more conditions are satisfied at the same time, if yes then the condition becomes true
* ```||``` The logical OR operator is used to check if either one of more than many conditions are satisfied at the same time, if yes then the condition becomes true
* ```!``` The logical NOT  operator is used to reverse a logical state of a condition.

If you would like to learn about relational and logical operators from a video, please click [here](https://youtu.be/W-JvzG_prfg).
