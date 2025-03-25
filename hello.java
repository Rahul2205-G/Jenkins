import java.util.Scanner;

 class hello {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius of the circle
        System.out.print("Enterr the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        
        // Close the scanner object
        scanner.close();
    }
}

