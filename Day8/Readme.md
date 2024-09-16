## Question

## Question 1

### Problem Statement

Alice and her friends are playing a game of verbal Kho-Kho. Alice is acting as a mediator, and the rest of the N friends are seated on N chairs, one each. Alice starts by providing a paper with a single-digit number to the friend present at number 1. Let’s denote friends by F, where F will be of size N. F[1]…F[N] represents friends seated respectively. After receiving the paper with a digit, F[1] will enact and try to tell F[2] without speaking. Similarly, F[2] will communicate to the next person i.e., F[3]. This continues until the last person F[N] understands the digit. Finally, the last person will write the digit on a separate paper and give it to Alice to compare both papers. If the digits are similar then, Alice will give a T-shirt to each friend. However, if the digits do not match, Alice will ask each friend’s digits, and she will offer the T-shirts to only those who understood the digits correctly.

Given N number of friends and digit array D, denoting the digit understood by each friend F. finds out how many of Alice’s friends have not enacted well OR did not understand the enactment by the previous friend correctly.

### Example 1:

**Input:**
3 -> N, number of friends  
4 4 4 – array D. denoting digit understanding by N friends

**Output:**
0

**Explanation:**
All of them understood the digits correctly.

### Example 2:

**Input:**
5  
1 2 3 2 2

**Output:**
4

**Explanation:**
1st, 2nd, 3rd, and 4th friends could not enact OR understand the enactment.

## Question 2

### Problem Statement

Tina was given a piece of silk cloth. There are already a few points or coordinates mentioned on it. She is creating something which needs an exact square shape cloth. Help Tina to find out how many minimum points she can add, to cut the perfect square from the given cloth. There are already a few points marked on one cloth, Tina has to include the most number of points from the given points and should try to include the minimum number of points or coordinates from her side.

Find the minimum number of coordinates to achieve the perfect square. Also, try to get as bigger cloth as possible. Let us try to understand it with an example. Let’s say there are 3 points given means N=3. These points are:

We can have 2 additional coordinates:

- (2,0) & (0,2)
- OR
- (3,0) & (0,3)

Tina doesn’t want to lose a good deal here, so better if she would go with (3,0) & (0,3). Hence 2 additional coordinates were required to cut a perfect square from that piece of cloth. Hence the answer is 2.

### Example 1:

**Input:**
5 -> Input integer, N  
0 0 -> Input integer, x[i], y[i]  
100 100 -> Input integer, x[i], y[i]  
200 200 -> Input integer, x[i], y[i]  
100 0 -> Input integer, x[i], y[i]  
0 100 -> Input integer, x[i], y[i]

**Output:**
0 -> Output

**Explanation:**
In the above scenario, we can already make a square from the given coordinates:  
P1: (0, 0)  
P2: (100, 0)  
P3: (0, 100)  
P4: (100, 100)  
Hence no need for any additional coordinates here. So the answer is 0.

### Example 2:

**Input:**
3 -> Input integer, N  
0 0 -> Input integer, x[i], y[i]  
2 2 -> Input integer, x[i], y[i]  
3 3 -> Input integer, x[i], y[i]

**Output:**
2 -> Output

**Explanation:**
In the above scenario, we can have 2 additional coordinates:  
(2,0) & (0,2)  
OR  
(3,0) & (0,3)  
Tina doesn’t want to lose a good deal here so better if she would go with (3,0), (0,3). Hence 2 additional coordinates were required to cut a perfect square from that piece of cloth. Hence the answer is 2.

## Question 3: John's Mathematics Class

### Problem Statement

John is a mathematics teacher in one of the classes of Dale's school. The class has N students. Today is their yearly exam, and John is very strict on the answers. As per John, no one is allowed to cheat. He will find it out from the final marks of two adjacent students.

The marks of N students are mentioned in M[ ], with index 1 to N. All of the students are seated one behind the other based on their roll numbers, which is from 1 to N.

If any two adjacent (one behind the other) students have the same marks, then it will be considered as cheating, and the latter student will be removed from the merit list. The student sitting behind is considered as the cheater.

At the next level is the process of re-evaluation, which is performed by another department. The re-evaluation can impact marks of K students. The re-evaluation will update their marks and then again, the final merit list will be declared.

The re-evaluation will be in the format of X Y. Here 'X' is the index of the student whose marks need to be changed from the original value to Y. Each re-evaluation is independent, and the merit list is updated after each re-evaluation.

After each re-evaluation, the merit list is updated, where the cheater is filtered out if there is any.

Your task is to find the maximum number of students that were part of the merit list after each re-evaluation.

Only the final merit list is visible to all students.

### Example

**Input:**
5 2
1 1 2 5 2
1 3
4 2

Now as per the teacher’s rule, no two students should have the same marks; otherwise, they will all be removed from the merit list.

Let’s consider the first re-evaluation: the marks of M[1], which is currently 1, will now be updated to 3. So, the marks will look something like = [3, 1, 2, 5, 2]. Clearly, no two adjacent students have the same marks; hence all the students who participated will be in the merit list. So, the answer is 5.

In the second re-evaluation: the marks of M[4], which is currently 5, will now be updated to 2. So, the marks will look something like = [3, 1, 2, 2, 2]. Clearly, M[3], M[4], and M[5] have all the same marks. But only the students sitting behind will be considered cheaters. So, M[4] and M[5] will be taken out from the merit list. Now the merit list consists of only 3 students: M[1], M[2], and M[3]. So, the answer is 3 for this re-evaluation.

## Question 4: String Game

### Problem Statement

Jack and Jill are playing a string game. Jack has given Jill two strings A and B.

Jill has to derive a string C from A, by deleting elements from string A, such that string C does not contain any element of string B.

Jill needs help to do this task. She wants a program to do this as she is lazy.

Given strings A and B as input, give string C as Output.

### Example 1

**Input:**
tiger -> input string A
ti -> input string B

**Output:**
ger -> Output string C

**Explanation:**
After removing "t" and "i" from "tiger", we are left with "ger".
So, the answer is "ger".

### Example 2

**Input:**
processed -> input string A
esd -> input string B

**Output:**
proc -> Output string C

**Explanation:**
After removing "e" "s" and "d" from "processed", we are left with "proc".
So, the answer is "proc".

### Example 3

**Input:**
talent -> input string A
tens -> input string B

**Output:**
al -> Output string C

**Explanation:**
After removing "t" "e" and "n" from "talent", we are left with "al".
So, the answer is "al".

## Question 3: Checkers Game

### Problem Statement

Mahesh and Suresh are playing a new game called "Checkers". This is a simple game that becomes challenging with expert players.

Game description and rules:

- The game is played by 2 players.
- It consists of an N\*M matrix.
- Each cell is background lit by lights, either Green (1) or Black (0).
- Green cells need to be captured, while Black cells cannot be captured.
- Players aim to capture the maximum number of cells possible.
- In a single turn, a player can capture all adjacent cells sharing an edge.
- The turn ends when there are no more adjacent cells to capture.
- Mahesh always starts the game, followed by Suresh.
- Both players play optimally.

The task is to determine how many cells Suresh captures.

### Input Format

- First line: Two integers N and M, representing the size of the matrix
- Next N lines: M integers each, representing the matrix A[i][j] where 1 ≤ i ≤ N and 1 ≤ j ≤ M

### Output Format

A single integer representing the number of cells Suresh captures.

### Example 1

**Input:**
Input:
2 2 -> Input integer, N, M
1 1 -> Input integer, A[i]
1 1 -> Input integer, A[N]
Output:
0 -> Output
Explanation:
In the above scenario, it is very clear that if Mahesh plays first, he will capture all the cells as all the cells are adjacent to each other.
There will be nothing left for Suresh. Hence the cells captured by Suresh will be 0.
Hence the answer is 0.
