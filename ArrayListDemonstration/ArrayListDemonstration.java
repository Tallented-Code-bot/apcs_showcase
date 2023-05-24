package ArrayListDemonstration;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemonstration {
    // ArrayList
    // ArrayList methods
    // Traversing ArrayLists
    // Searching and Sorting ArrayLists

    public static void main(String[] args) {
        ArrayList<President> presidents = new ArrayList<President>();
        presidents.add(new President(1, "George Washington"));
        presidents.add(new President(2, "John Adams"));
        presidents.add(new President(3, "Thomas Jefferson"));
        presidents.add(new President(4, "James Madison"));
        presidents.add(new President(5, "James Monroe"));
        presidents.add(new President(6, "John Quincy Adams"));
        presidents.add(new President(7, "Andrew Jackson"));
        presidents.add(new President(8, "Martin Van Buren"));
        presidents.add(new President(9, "William Henry Harrison"));
        presidents.add(new President(10, "John Tyler"));
        presidents.add(new President(11, "James K. Polk"));
        presidents.add(new President(12, "Zachary Taylor"));
        presidents.add(new President(13, "Millard Fillmore"));
        presidents.add(new President(14, "Franklin Pierce"));
        presidents.add(new President(15, "James Buchanan"));
        presidents.add(new President(16, "Abraham Lincoln"));
        presidents.add(new President(17, "Andrew Johnson"));
        presidents.add(new President(18, "Ulysses S. Grant"));
        presidents.add(new President(19, "Rutherford B. Hayes"));
        presidents.add(new President(20, "James A. Garfield"));
        presidents.add(new President(21, "Chester A. Arthur"));
        presidents.add(new President(22, "Grover Cleveland"));
        presidents.add(new President(23, "Benjamin Harrison"));
        presidents.add(new President(24, "Grover Cleveland (2nd term)"));
        presidents.add(new President(25, "William McKinley"));
        presidents.add(new President(26, "Theodore Roosevelt"));
        presidents.add(new President(27, "William Howard Taft"));
        presidents.add(new President(28, "Woodrow Wilson"));
        presidents.add(new President(29, "Warren G. Harding"));
        presidents.add(new President(30, "Calvin Coolidge"));
        presidents.add(new President(31, "Herbert Hoover"));
        presidents.add(new President(32, "Franklin D. Roosevelt"));
        presidents.add(new President(33, "Harry S. Truman"));
        presidents.add(new President(34, "Dwight D. Eisenhower"));
        presidents.add(new President(35, "John F. Kennedy"));
        presidents.add(new President(36, "Lyndon B. Johnson"));
        presidents.add(new President(37, "Richard Nixon"));
        presidents.add(new President(38, "Gerald Ford"));
        presidents.add(new President(39, "Jimmy Carter"));
        presidents.add(new President(40, "Ronald Reagan"));
        presidents.add(new President(41, "George H. W. Bush"));
        presidents.add(new President(42, "Bill Clinton"));
        presidents.add(new President(43, "George W. Bush"));
        presidents.add(new President(44, "Barack Obama"));
        presidents.add(new President(45, "Donald Trump"));
        presidents.add(new President(46, "Joe Biden"));




        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println("The name of the "+number+"th president is "+getNameOfPresident(presidents,number));

    }


    private static String getNameOfPresident(ArrayList<President> presidents,int number) {
        for(President p:presidents){
            if(p.getNumber()==number){
                return p.getName();
            }
        }
        return "";
    }
}