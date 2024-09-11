# Questions

## Question 1

### Problem Statement

Ayush is working on a strange algorithm where he wants to convert a string from A to B, both the strings of equal length N.

Below are the rules which can be performed to convert a string:

- String A and B are of equal length.
- Both of them are in lower case.
- Choose a subset X from the string A, between the index 1 and N.
- Let ‘s’ be the letter which alphabetically comes before all other letters in the subset. Let ‘s’ be called the ‘smallest element’ in the subset.
- Replace all the elements of subset with the letter ‘s’.
- Find the minimum number of moves which is required to perform the conversion. If it is not possible to convert the string from A to B then return -1.

Let us try to understand it with examples:

Suppose there are 2 strings:

A = abcab

B = aabab

**Operation 1:**

- Now we have chosen a subset S, let us say we have taken index 2,3,5 from A.
- Then the subset S becomes [bcb].
- Next, we have to choose the smallest element, which is b here in b & c.
- Next, we have to replace all the other elements in subset with this element. So ‘b’ will replace everything in [bcb], which becomes [bbb].
- Now we will place all the respective elements back to their respective index. This will update the original string as [abbab].

**Operation 2:**

- Original string [abbab].
- Now we have chosen a subset S, let say we have taken index 1,2,4 from A.
- Then the subset becomes [aba].
- Next, we have to choose the smallest element, which is a here in a & b.
- Next, we have to replace the smallest with all the other elements in subset. So ‘a’ will replace everything in [aba].
- Now we will place all the respective elements back to their respective index. This will update the original string as [aabab].

This is exactly same as String B. Hence it is possible to convert string A to B, with 2 operations. So, the answer is 2.

#### Example 1

**Input:**

2 -> Input integer, N

de -> Input string, A

cd -> Input string, B

**Output:**

-1

**Explanation:**

In the above example we can clearly see that there is an alphabet in A which is completely different from B. Hence it is not possible to convert A to B. So the answer is -1.

#### Example 2

**Input:**

4 -> Input integer, N

abab -> Input string, A

abaa -> Input string, B

**Output:**

1

**Explanation:**

**Operation 1:**

- Now we have chosen a subset S, let say we have taken index 3,4 from A.
- Then the subset becomes [ab].
- Next, we have to choose the smallest element, which is a here in a & b.
- Next, we have to replace the smallest with all the other elements in subset. So ‘a’ will replace everything in [ab], which becomes [aa].
- Now we will place all the respective elements back to their respective index. This will update the original string as [abaa].

This is exactly same as String B. Hence it is possible to convert string A to B, with 1 operation. So, the answer is 1.

### Constraints

- 1 <= N <= 1000
- N is an integer.
- Only lower case letters of the English alphabet.
- Length of A, B = N.

### Input Format for Testing

The candidate has to write the code to accept 3 inputs:

1. First input: Accept value of Integer, N.
2. Second input: Accept value of string, A (Next Line).
3. Third input: Accept value of string, B (Next Line).

### Output Format for Testing

The output is an integer as per above logic. (Check the output in Example 1, Example 2).

Additional messages in output will cause the failure of test cases.

### Instructions

- System doesn’t allow any kind of hard coded input value/values.
- Written program code by the candidate will be verified against the inputs which are supplied from the system.

## Question 2

### Problem Statement

Jack is a sports teacher at St. Patrick’s School. He makes games not only to make the students fit but also smart.

So, he lined up all the N number of students in his class. At each position, he has fixed a board with an integer number printed on it. Each of the numbers is unique and is in exactly the range of N. Let us say there are 10 students, then the boards will be printed with numbers from 1 to 10 in a random order given by the sequence A[].

As a rule, all students wear a jersey with their numbers printed on it. So if there are students, each will have a unique jersey number just like a football team.

Now, in the beginning, all the students will stand as per the increasing order of their jersey numbers, from left to right. The only difference will be their respective board number which is placed at their respective location. The board location is fixed and cannot be changed. We can consider the arrangement as below. Suppose there are students, and the board is placed in the order of [2, 3, 1, 5, 4]:

- Board: [2, 3, 1, 5, 4]
- Student’s Jersey: [1, 2, 3, 4, 5]

Now the game begins. After every beat of the drum, each student will have to move to that location (index), where his board is pointing to. In the above case, the student with jersey ##1 is standing with board #2, so now he will have to move to location #2. Similarly, all the other students will do the same. So after the first beat of the drum, the alignment will be:

- Board: [2, 3, 1, 5, 4]

This keeps going on and on until all the students are back the way they were at the beginning. So, after 6 beats of the drum, all the students will be aligned the same way as before.

Given N and the order of the board of the respective positions, find the number of beats required to bring back the students to their original position. So, for the above case, the answer is 6.

### Example 1

**Input:**

- 3 (Input integer, N)
- {1, 2, 3} (Input integer, B[], board alignment)

**Output:**

- 1 (Output)

**Explanation:**
All the students will be standing as board positions:

- Board: [1, 2, 3]
- Student’s Jersey: [1, 2, 3]

After the first beat of the drum:

- Jersey #1 will move to index 1.
- Jersey #2 will move to index 2.
- Jersey #3 will move to index 3.

Hence, they will be back in their own position in just 1 beat. So, the answer is 1.

### Example 2

**Input:**

- 5 (Input integer, N)
- {2, 3, 1, 5, 4} (Input integer, B[], board alignment)

**Output:**

- 6 (Output)

**Explanation:**
All the students will be standing as below, with the board positions:

- Board: [2, 3, 1, 5, 4]
- Student’s Jersey: [1, 2, 3, 4, 5]

After Beat-1 of the drum:

- Jersey #1 has moved to index 2.
- Jersey #2 has moved to index 3.
- Jersey #3 has moved to index 1.
- Jersey #4 has moved to index 5.
- Jersey #5 has moved to index 4.

Board: [2, 3, 1, 5, 4]
Student’s Jersey: [3, 1, 2, 5, 4]

After Beat-2 of the drum:

- Jersey #3 has moved to index 2.
- Jersey #1 has moved to index 3.
- Jersey #2 has moved to index 1.
- Jersey #5 has moved to index 5.
- Jersey #4 has moved to index 4.

Board: [2, 3, 1, 5, 4]
Student’s Jersey: [2, 3, 1, 4, 5]

After Beat-3 of the drum:

- Board: [2, 3, 1, 5, 4]
- Student’s Jersey: [1, 2, 3, 5, 4]

After Beat-4 of the drum:

- Board: [2, 3, 1, 5, 4]
- Student’s Jersey: [3, 1, 2, 4, 5]

After Beat-5 of the drum:

- Board: [2, 3, 1, 5, 4]
- Student’s Jersey: [2, 3, 1, 5, 4]

After Beat-6 of the drum:

- Board: [2, 3, 1, 5, 4]
- Student’s Jersey: [1, 2, 3, 4, 5]

Hence, they will be back in their positions after 6 beats. So, the answer is 6.

### Constraints

- 1 <= N <= 100000
- 1 <= A[i] <= N
- All A[i] will be distinct numbers
- N and A[i] are only integers.

### Input Format for Testing

1. First Input: Accept value of Integer, N.
2. Next ‘N’ Lines: Elements of sequence A[].

## Question 3

### Problem Statement

This vacation you went to visit the golden house. There are N rooms in this golden house and its owner needs someone to take care of the management of this house. As you have been unemployed for a long time, you are interested in this job. The owner of this house wanted an intelligent manager for this role, so he created one puzzle within that golden house. The person who will be able to solve that puzzle will be the manager of the golden house.

The owner of the house kept some numbers of golden coins in each room. You have to choose two rooms, one from where you will enter and the other one from where you will exit. From any room, either you can exit, or you can move to the next room. While visiting any room you will collect all the gold coins, and if you enter any room then you can’t skip collecting gold coins from that room, you have to take those coins. The owner wants to have exactly K coins when you exit the room, he guarantees that there will be at least one possible solution for this puzzle.

Given the number of rooms (N), and the number of gold coins in N rooms. You have to find room numbers from where you will start and from where you will exit. If there is more than one solution possible, then you have to provide a solution with a smaller starting room number. You can assume that room numbers will start from 1 and end at N.

Hint: Find a continuous subsequence whose sum will be exactly equal to K.

### Example 1

**Input:**

- 10 15 -> N = 10, K = 15
- 5 3 7 14 18 1 18 4 8 3 -> Number of gold coins in each room.

**Output:**

- 1 3

**Explanation:**

There are ten rooms in the house. You want to have the total sum of gold coins in a continuous sequence of rooms to be 15. There are two solutions from this i.e. [1, 3] and [8, 10]. The solution with a smaller starting room number will be printed hence [1, 3] is the output.

### Constraints

- 1 <= N <= 1000
- 1 <= K <= 1000000
- 1 <= Number of gold coins in each room <= 1000

### Input Format for Testing

The candidate has to write the code to accept 2 inputs:

1. First input: Accept values of integers, N and K.
2. Second input: Accept values of integers, the number of gold coins in each room (Next Line).

### Output Format for Testing

The output is two integers representing the starting and ending room numbers. (Check the output in Example 1).

Additional messages in output will cause the failure of test cases.

### Instructions

- System doesn’t allow any kind of hard-coded input value/values.
- Written program code by the candidate will be verified against the inputs which are supplied from the system.

## Question 4

### Problem Statement

Bob is going to bet today on horse riding. There are N horses listed in a sequence of 1 to N.

The probability of winning of each horse is different so the prices for making a bet on the horses are not the same. There is no limit on the number of horses on which he can bet, but he thinks that if he bets on a continuous sequence of horses then he has a better chance to win. Bob will get K units of money if any horse on which he bets will win. But as the award is only K units so he wants to put money less than K. Bob wants to bet on as many horses as he can. As you are his best friend, he reached out to you for help, can you please find the length of the maximum continuous sequence of horses on which Bob can make a bet, and remember he will invest money less than K units. If there are more than one possible combinations, Bob will bet randomly on any one of them.

Given the number of horses (N), reward money (K), and price of betting on N horses in order.

Hint: For each starting index of a horse, its end index in sequences will be equal to or greater than the end index of the previous starting index.

### Example 1

**Input:**

- 10 100 -> N = 10, K = 100
- 30 40 50 20 20 10 90 10 10 10 -> Price to make bet on each horse in order

**Output:**

- 3

**Explanation:**

There are 10 horses, and the reward money is 100. So, Bob will put money less than 100. There are two possible sequences of length three whose total money for betting is less than 100, i.e. [50 20 20] (sum is 90) and [10 10 10] (sum is 30). Bob will choose randomly one sequence from these two. As none of the other sequences with length greater than 3 will have a price less than 100 so the answer will be 3.

### Example 2

**Input:**

- 10 100 -> N = 10, K = 100
- 10 90 80 20 90 60 40 60 70 75 -> Price to make bet on each horse in order

**Output:**

- 1

**Explanation:**

There are no two consecutive horses for which the sum of price is less than 100. So, Bob will choose randomly any one horse. And the max length of the sequence will be 1.

### Constraints

- 2 <= N <= 10^5
- 1 <= K <= 10^9
- 1 <= A1, A2, ..., AN <= 10^9

### Input Format for Testing

The candidate has to write the code to accept 2 inputs:

1. First Input: It will contain two integers N (number of horses) and K (reward money).
2. Second Input: It will contain N integers, each separated by a space, representing the price to make a bet on each horse in order.

### Output Format for Testing

The output is an integer representing the length of the maximum continuous sequence of horses on which Bob can make a bet with the total price less than K.

Additional messages in output will cause the failure of test cases.

### Instructions

- System doesn’t allow any kind of hard-coded input value/values.
- Written program code by the candidate will be verified against the inputs which are supplied from the system.
