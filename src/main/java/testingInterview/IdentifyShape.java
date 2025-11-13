package testingInterview;

// Parent class
class Shape {
    // Common properties or methods for all shapes can go here (optional)
}

// Child classes
class Circle extends Shape {
    // Circle-specific logic (if any)
}

class Square extends Shape {
    // Square-specific logic (if any)
}

class Triangle extends Shape {
    // Triangle-specific logic (if any)
}

public class IdentifyShape {
    public static void main(String[] args) {

        // Suppose interviewer gives you a shape object dynamically
        Shape shape = new Square();  // Try changing this to Circle() or Triangle()

        // Identify which shape it is using instanceof
        if (shape instanceof Circle) {
            System.out.println("This is a Circle");
        }
        else if (shape instanceof Triangle) {
            System.out.println("This is a Triangle");
        }
        else if (shape instanceof Square) {
            System.out.println("This is a Square");
        }
        else {
            System.out.println("Unknown Shape");
        }

    }
}
