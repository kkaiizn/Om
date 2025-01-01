public class DeleteSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        int start = 6; // Starting index of substring
        int end = 11;  // Ending index of substring (exclusive)
        
        sb.delete(start, end);
        System.out.println("After deletion: " + sb);
    }
}




import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingCharacter(str);
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; // No non-repeating character
    }
}







public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; // Table of 7
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip multiplication by 5
            }
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}





Here are simple Java codes for the mentioned tasks:


---

1. Delete a Substring from a StringBuffer:

public class DeleteSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        int start = 6; // Starting index of substring
        int end = 11;  // Ending index of substring (exclusive)
        
        sb.delete(start, end);
        System.out.println("After deletion: " + sb);
    }
}


---

2. Find the First Non-Repeating Character in a String:

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingCharacter(str);
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; // No non-repeating character
    }
}


---

3. Print a Multiplication Table but Skip Multiplication by 5:

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; // Table of 7
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip multiplication by 5
            }
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}


---

4. Benefits and Drawbacks of Static vs. Dynamic Arrays:

Static Arrays:

Benefits:

Fixed size allows for predictable memory allocation.

Simpler implementation and faster access.


Drawbacks:

Cannot change size after creation, leading to potential wastage or insufficient memory.

Inflexible for varying data sizes.



Dynamic Arrays:

Benefits:

Resizable, allowing efficient use of memory.

More flexible for changing data requirements.


Drawbacks:

Slightly slower due to resizing overhead.

Requires more complex implementation.




---

5. Determine a Student's Grade Using Else-If Ladder:

public class StudentGrade {
    public static void main(String[] args) {
        int marks = 85; // Example marks
        
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

These are straightforward implementations of the tasks you've mentioned. Let me know if you need further explanations or modifications!

public class StudentGrade {
    public static void main(String[] args) {
        int marks = 85; // Example marks
        
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

