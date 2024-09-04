# Questions

## Question 1

### Problem Statement

At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.

Note: If there is more than one colour which is odd in number, then the first colour in the array which is present odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the array. If all the inputs are even in number, display the message “All are even”.

#### Example 1

**Input:**
7 -> Value of N
[r,g,b,b,g,y,y] -> B[] Elements B[0] to B[N-1], where each input element is separated by a new line.

**Output:**
r -> [r,g,b,b,g,y,y] -> “r” colour balloon is present odd number of times in the bunch.

**Explanation:**
From the input array above:

- r: 1 balloon
- g: 2 balloons
- b: 2 balloons
- y: 2 balloons

Hence, r is the only balloon which is odd in number.

#### Example 2

**Input:**
10 -> Value of N
[a,b,b,b,c,c,c,a,f,c] -> B[], elements B[0] to B[N-1] where each input element is separated by a new line.

**Output:**
b -> ‘b’ colour balloon is present odd number of times in the bunch.

**Explanation:**
From the input array above:

- a: 2 balloons
- b: 3 balloons
- c: 4 balloons
- f: 1 balloon

Here, both ‘b’ and ‘f’ have odd number of balloons. But ‘b’ colour balloon occurs first. Hence, b is the output.

### Input Format for Testing

The candidate has to write the code to accept 2 inputs:

1. First input: Accept value for number of N (Positive integer number).
2. Second Input: Accept N number of character values (B[]), where each value is separated by a new line.

### Output Format for Testing

The output should be a single literal (Check the output in example 1 and example 2).

### Constraints

- 3 <= N <= 50
- B[i] = {a-z} or {A-Z}

## Question 2

### Problem Statement

There is a JAR full of candies for sale at a mall counter. The JAR has the capacity N, meaning it can contain a maximum of N candies when full. At any point in time, the JAR can have M number of candies where M <= N. Candies are served to the customers. The JAR never remains empty; when the last k candies are left, the JAR is refilled with new candies to make it full again.

Write a code to implement the above scenario. Display the JAR at the counter with the available number of candies. The input should be the number of candies one customer can order at a point in time. Update the JAR after each purchase and display the JAR at the counter.

The output should give the number of candies sold and the updated number of candies in the JAR.

If the input is more than the candies in the JAR, return: “INVALID INPUT”.

#### Example 1

**Given:**

- N = 10 (NUMBER OF CANDIES AVAILABLE)
- k <= 5 (minimum number of candies that must be inside the JAR ever)

**Input:**
3

**Output:**
NUMBER OF CANDIES SOLD: 3
NUMBER OF CANDIES AVAILABLE: 7

#### Example 2

**Given:**

- N = 10 (NUMBER OF CANDIES AVAILABLE)
- k <= 5 (minimum number of candies that must be inside the JAR ever)

**Input:**
0

**Output:**
INVALID INPUT
NUMBER OF CANDIES LEFT: 10

### Input Format for Testing

The candidate has to write the code to accept 2 inputs:

1. First input: Accept value for N (Positive integer number representing the capacity of the JAR).
2. Second input: Accept value for k (Positive integer number representing the minimum number of candies that must be inside the JAR ever).

### Output Format for Testing

The output should display the number of candies sold and the updated number of candies in the JAR, or "INVALID INPUT" if the input is more than the candies in the JAR.

### Constraints

- 1 <= N <= 100
- 0 <= k <= N
- 0 <= M <= N

## Question 3

### Problem Statement

Selection of MPCS exams includes a fitness test which is conducted on the ground. There will be a batch of 3 trainees, appearing for a running test on track for 3 rounds. You need to record their oxygen level after every round. After the trainees are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select the one with the highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.

#### Note:

- The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
- If the calculated maximum average oxygen value of trainees is below 70, then declare the trainees as unfit with a meaningful message as “All trainees are unfit.”
- Average Oxygen Values should be rounded.

#### Example 1:

**Input Values:**
95
92
95
92
90
92
90
92
90

**Output Values:**
Trainee Number: 1
Trainee Number: 3

#### Note:

Input should be 9 integer values representing oxygen levels entered in order as:

**Round 1:**

- Oxygen value of trainee 1
- Oxygen value of trainee 2
- Oxygen value of trainee 3

**Round 2:**

- Oxygen value of trainee 1
- Oxygen value of trainee 2
- Oxygen value of trainee 3

**Round 3:**

- Oxygen value of trainee 1
- Oxygen value of trainee 2
- Oxygen value of trainee 3

Output must be in the given format as in the above example. For any wrong input, the final output should display “INVALID INPUT”.

## Question 4

### Problem Statement

The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet. For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on. To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.

The key is the number of OFFSET to shift the cipher alphabet. The key can have basic shifts from 1 to 25 positions as there are 26 total alphabets. As we are designing a custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places. For example, if a given plain text contains any digit with values 5 and key = 2, then 5 will be replaced by 7. The “-” (minus sign) will remain as it is. A key value less than 0 should result in “INVALID INPUT”.

#### Example 1

**Input:**
Enter your PlainText: All the best
Enter the Key: 1

**Output:**
The encrypted Text is: Bmm uif Cftu

### Input Format for Testing

The candidate has to write the code to accept 2 inputs:

1. First input: Accept the plain text (String).
2. Second input: Accept the key (Positive integer number representing the shift).

### Output Format for Testing

The output should display the encrypted text.

### Constraints

- 1 <= Key <= 25
- Plain text can contain alphabets (both uppercase and lowercase), digits (0-9), and spaces.

## Question 5

### Problem Statement

We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as:

1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior Wall in units of square feet
4. Surface Area of each Exterior Wall in units of square feet

If a user enters zero as the number of walls, then skip Surface area values as the user may not want to paint that wall.

Calculate and display the total cost of painting the property.

#### Example 1

**Input:**
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00

**Output:**
Total estimated Cost: 1847.4 INR

### Input Format for Testing

The candidate has to write the code to accept 4 inputs:

1. First input: Accept the number of Interior walls (Positive integer number).
2. Second input: Accept the number of Exterior walls (Positive integer number).
3. Third input: Accept the surface area of each Interior wall (Floating point numbers).
4. Fourth input: Accept the surface area of each Exterior wall (Floating point numbers).

### Output Format for Testing

The output should display the total estimated cost of painting the property.

### Constraints

- 0 <= Number of Interior walls <= 100
- 0 <= Number of Exterior walls <= 100
- 0.0 <= Surface area of each wall <= 10000.0
