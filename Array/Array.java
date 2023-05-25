package Array;

// Arrays
// Traversing arrays
// Enhanced for loop
// algorithms


import java.util.Scanner;


public class Array {
    // ArrayList
    // ArrayList methods
    // Traversing ArrayLists
    // Searching and Sorting ArrayLists

    public static void main(String[] args) {
        President[] presidents = {
        new President(1, "George Washington"),
        new President(2, "John Adams"),
        new President(3, "Thomas Jefferson"),
        new President(4, "James Madison"),
        new President(5, "James Monroe"),
        new President(6, "John Quincy Adams"),
        new President(7, "Andrew Jackson"),
        new President(8, "Martin Van Buren"),
        new President(9, "William Henry Harrison"),
        new President(10, "John Tyler"),
        new President(11, "James K. Polk"),
        new President(12, "Zachary Taylor"),
        new President(13, "Millard Fillmore"),
        new President(14, "Franklin Pierce"),
        new President(15, "James Buchanan"),
        new President(16, "Abraham Lincoln"),
        new President(17, "Andrew Johnson"),
        new President(18, "Ulysses S. Grant"),
        new President(19, "Rutherford B. Hayes"),
        new President(20, "James A. Garfield"),
        new President(21, "Chester A. Arthur"),
        new President(22, "Grover Cleveland"),
        new President(23, "Benjamin Harrison"),
        new President(24, "Grover Cleveland (2nd term)"),
        new President(25, "William McKinley"),
        new President(26, "Theodore Roosevelt"),
        new President(27, "William Howard Taft"),
        new President(28, "Woodrow Wilson"),
        new President(29, "Warren G. Harding"),
        new President(30, "Calvin Coolidge"),
        new President(31, "Herbert Hoover"),
        new President(32, "Franklin D. Roosevelt"),
        new President(33, "Harry S. Truman"),
        new President(34, "Dwight D. Eisenhower"),
        new President(35, "John F. Kennedy"),
        new President(36, "Lyndon B. Johnson"),
        new President(37, "Richard Nixon"),
        new President(38, "Gerald Ford"),
        new President(39, "Jimmy Carter"),
        new President(40, "Ronald Reagan"),
        new President(41, "George H. W. Bush"),
        new President(42, "Bill Clinton"),
        new President(43, "George W. Bush"),
        new President(44, "Barack Obama"),
        new President(45, "Donald Trump"),
        new President(46, "Joe Biden"),
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println("The name of the " + number + "th president is " + getNameOfPresident(presidents, number));

        input.close();

    }

    private static String getNameOfPresident(President[] presidents, int number) {
        for (President p : presidents) {
            if (p.getNumber() == number) {
                return p.getName();
            }
        }
        return "not found";
    }


}
