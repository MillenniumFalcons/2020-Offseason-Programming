# Lesson_07 - Object Oriented Programmming

## Types
The type of a variable is something that is very central to how programming works. You cannot add an integer and a string for example, what does that even mean? So far we have been limited by what we can do, we have to represent everything with numbers and strings, so for the same reason we used enums in the last lesson, we can make our own types to represent things that are more than just numbers.

## Making your own types
In a new .java file you need to define a new class, this is like the the plan for that type, it defines what that type has and what it can do. Keep in mind that the name of the file has to match the name of the class.
So If your class is in a file called ```Square.java``` the class declaration would be something like this:

```
public class Square {

}
```

## Instantiating Classes
That's it! Now we can go over to our main file and type ```Square sqaure1 = new Square();``` and we're done.. Well not so fast.

## What can we do with classes?
On its own this square class can't do anything. In order to make this useful we need to actually tell java that this ```Square``` class is representing a square. It isn't magic.

What does a square have? the only thing defining a square is its sidelength, so we know that the square class has to have a variable for sidelength, which is a number so it should probably be a double as well.

```
public class Square {
	double sideLength;
}
```

Now when we do ```Square sqaure1 = new Square();``` we can reference that sideLength variable using the "dot-notation" ```square1.sideLength = 5.3;```. This is already better than have variables called ```double square1_sideLength = 5.4;``` since that variable is double, so every function that takes in a double can accept a square, that doesn't make sense, think about Math.toDegrees().

Other than this, we can store more than one variable in an object, all we need to do is define it in the class.

```
public class Square {
	double sideLength;
	double area;
}
```

We as humans know, that the area of a square is the sideLength squared, but the computer doesn't, we need to tell it. So that situations like this don't occur:

```
Square square = new Square();
square.sideLength = 4.0;
square.area = 16.0;
//lots of code...
square.sideLength = 3.2;
System.out.println("A square with side length: " + square.sideLength + " has area: " + square.area);
```

So if the java knows that the are should at all times be the sideLength square, we should not even need to give the square both values, it should be able to figure it out on its own. How do we make sure that someone doesn't just change the variable sideLength without updating the area?

```
public class Square {
	private double sideLength;
	private double area;
	
	public void setSideLength(double newSideLength) {
		sideLength = newSideLength;
		area = sideLength * sideLength;
	}
}
```

The ```private``` keyword makes it impossible for somone to access the variable directly, so all of the code before would give you an error something like ```sideLength is not visible``` or something.

Now we make sure that you can't just change the sideLength without updating the area as well. But we have a different problem, we can't get to sideLength at all, even if we just wanted to print it. For this we need a method called a "getter" it's nothing special but very useful.

```
public class Square {
	private double sideLength;
	private double area;
	
	public void setSideLength(double newSideLength) {
		sideLength = newSideLength;
		area = sideLength * sideLength;
	}
	
	public void getSideLength() {
		return sideLength;
	}
	
	public void getArea() {
		return area;
	}
}
```

Now we would use the class like so:

```
Square square = new Square();
square.setSideLength(7.2);

System.out.println("A square with side length: " + square.getSideLength() + " has area: " + square.getArea());
```
