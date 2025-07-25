package module1;

public class Task_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        System.out.println("Initial value of a: " + a);
        System.out.println("Post-increment (a++): " + (a++)); // 5 (then becomes 6)
        System.out.println("After post-increment, a: " + a);  // 6
        System.out.println("Pre-increment (++a): " + (++a));  // 7
        System.out.println("After pre-increment, a: " + a);   // 7


        // 2. Bitwise Shift Operators
        int num = 8; // Binary: 1000
        System.out.println("Original number: " + num);
        System.out.println("Left Shift (num << 1): " + (num << 1));  // 16 (10000)
        System.out.println("Right Shift (num >> 1): " + (num >> 1)); // 4  (0100)


        // 3. Logical vs Bitwise AND
        boolean x = true;
        boolean y = false;

        System.out.println("Logical AND (x && y): " + (x && y));   // false
        System.out.println("Bitwise AND (x & y): " + (x & y));     // false
	}

}
