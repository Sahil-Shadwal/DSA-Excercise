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
