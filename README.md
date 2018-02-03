# ITS-Floyd-Cycle-Detection
Hash collision detecting algorithm based on Floyd cycle detection. Created at the University as the project within IT Security classes in 2016. The purpose of this task was to learn how hash functions works and become aware of IT security threats.

## Purpose
Program finds a collision of the hash function constructed in the following way: hash(x) = first_56_bits (MD5(MD5(x))).  
  
Collision example:  
MD5(MD5("79fd67d181aab976")) = 0xbfc78d1b307942b0b3c747c800fdb990  
MD5(MD5("f1918392e76ee966")) = 0xbfc78d1b307942b0a32f9ee4bf2ec017  
  
Another notation:  
MD5(MD5(0x37396664363764313831616162393736)) = 0xbfc78d1b307942b0b3c747c800fdb990  
MD5(MD5(0x66313931383339326537366565393636)) = 0xbfc78d1b307942b0a32f9ee4bf2ec017  

## How it works?
Create a list of elements of the appropriate length (so that a collision can occur). The search will the set list by using the Floyd algorithm to find the cycle. Finding the cycle in the same place in the list gives a information that should be search again (collisions of two of the same elements found) - the turtle and the hare are in the same place. Finding a cycle using the Floyd algorithm in various elements of the list gives a collision. It should also be remembered that the elements of the list are cyclically modified - in order to get longer the same substrings.

### Result example
tortoise: ebb4f439f4cf15  
hare: c0139cb4a1fc60  
hex: 433d5b1cb0886f  

