class Solution{
    static List<Integer> get(int a,int b)
    {
        a = a^b;
        b = a^b;
        a = a^b;
        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        
        return result;
    }
}

This code defines a function get that takes two integers a and b  as input and returns a list containing the swapped values of a and b without using a temporary variable.
We have to swap 2 numbers without a temporary variable, so we are using this method.

a = a^b;
This line swaps the values of a and b using the bitwise XOR operation.
XORing a with b results in a value that contains the bits set in a or b, but not both.
 So, a now holds the bitwise XOR of its original value and b, effectively swapping the values.

b = a^b;
This line further swaps the values of a and b.
  Now, b holds the bitwise XOR of a (which now holds the original value of b) and b.
  Since XORing a value with itself results in 0, b now holds the original value of a.

a = a^b; 
Finally, this line swaps the values of a and b again.
Now, a holds the bitwise XOR of a (which now holds the original value of b) and b (which holds the original value of a).
This effectively swaps the values back to their original places.

List<Integer> result = new ArrayList<>();
This line initializes a list named result to store the swapped values of a and b.

result.add(a);
This line adds the value of a (which now holds the swapped value) to the list result.

result.add(b);
This line adds the value of b (which now holds the swapped value) to the list result.

EXAMPLE : 
Initial values:

a = 13
b = 9
  
a = a^b;
a = 13 ^ 9
a = 4 (because 13 in binary is 1101 and 9 in binary is 1001, so XORing them results in 0100 which is 4 in decimal)
  
b = a^b;
b = 4 ^ 9
b = 13 (because 4 ^ 9 = 1101 (13 in binary))
  
a = a^b;
a = 4 ^ 13
a = 9 (because 4 ^ 13 = 1001 (9 in binary))
  
Now, after the swapping operations:
a = 9
b = 13
The function creates a list result and adds a and b to it:

result = [9, 13]
Finally, the function returns the list result containing the swapped values of a and b
