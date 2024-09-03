# Questions

## Question 1

### Problem Statement

An automobile company manufactures both a two-wheeler (TW) and a four-wheeler (FW). A company manager wants to make the production of both types of vehicles according to the given data below:

1. **Total number of vehicles (two-wheeler + four-wheeler) = V**
2. **Total number of wheels = W**

The task is to find how many two-wheelers as well as four-wheelers need to be manufactured as per the given data.

#### Example

**Input:**
Input :
200 -> Value of V
540 -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :

2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.

The input format for testing
The candidate has to write the code to accept two positive numbers separated by a new line.

First Input line – Accept value of V.
Second Input line- Accept value for W.
The output format for testing

Written program code should generate two outputs, each separated by a single space character(see the example)
Additional messages in the output will result in the failure of test case

## Question 2

### Problem Statement

Given a string S (input consisting) of '_' and '#'. The length of the string is variable. The task is to find the minimum number of '_' or '#' to make it a valid string. The string is considered valid if the number of '_' and '#' are equal. The '_' and '#' can be at any position in the string.

Note: The output will be a positive or negative integer based on the number of '\*' and '#' in the input string.

(_>#): positive integer
(#>_): negative integer
(#=\*): 0

#### Example

**Input:**
###\*\*\* -> Value of S

**Output:**
0 → number of \* and # are equal

## Question 3

### Problem Statement

Given an integer array Arr of size N, the task is to find the count of elements whose value is greater than all of its prior elements.

Note: The 1st element of the array should be considered in the count of the result.

#### Example

**Input:**
Arr[]={7,4,8,2,9}

As 7 is the first element, it will be considered in the result.
8 and 9 are also the elements that are greater than all of their previous elements.
Since a total of 3 elements are present in the array that meet the condition.

**Output:**
3

#### Example 1

**Input:**
5 -> Value of N, represents size of Arr
7 -> Value of Arr[0]
4 -> Value of Arr[1]
8 -> Value of Arr[2]
2 -> Value of Arr[3]
9 -> Value of Arr[4]

**Output:**
3

## Question 4

### Problem Statement

A parking lot in a mall has RxC number of parking spaces. Each parking space will either be empty (0) or full (1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find the index of the row (R) in the parking lot that has the most parking spaces full (1).

#### Note:

- RxC: Size of the matrix
- Elements of the matrix M should be only 0 or 1.

#### Example 1

**Input:**
3 -> Value of R (row)
3 -> Value of C (column)
[0, 1, 0, 1, 1, 0, 1, 1, 1] -> Elements of the array M[R][C] where each element is separated by a new line.

**Output:**
3 -> Row 3 has the maximum number of 1’s

#### Example 2

**Input:**
4 -> Value of R (row)
3 -> Value of C (column)
[0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1] -> Elements of the array M[R][C]

**Output:**
4 -> Row 4 has the maximum number of 1’s

## Question 5

### Problem Statement

A party has been organized on a cruise. The party is organized for a limited time (T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

#### Example 1

**Input:**
5 -> Value of T
[7, 0, 5, 1, 3] -> E[], Elements of E[0] to E[N-1], where each element is separated by a new line
[1, 2, 1, 3, 4] -> L[], Elements of L[0] to L[N-1], where each element is separated by a new line

**Output:**
8 -> Maximum number of guests on the cruise at an instance

**Explanation:**

1st hour:

- Entry: 7
- Exit: 1
- No. of guests on ship: 6

2nd hour:

- Entry: 0
- Exit: 2
- No. of guests on ship: 6 - 2 = 4

3rd hour:

- Entry: 5
- Exit: 1
- No. of guests on ship: 4 + 5 - 1 = 8

4th hour:

- Entry: 1
- Exit: 3
- No. of guests on ship: 8 + 1 - 3 = 6

5th hour:

- Entry: 3
- Exit: 4
- No. of guests on ship: 6 + 3 - 4 = 5

Hence, the maximum number of guests within 5 hours is 8.

#### Example 2

**Input:**
4 -> Value of T
[3, 5, 2, 0] -> E[], Elements of E[0] to E[N-1], where each element is separated by a new line
[0, 2, 4, 4] -> L[], Elements of L[0] to L[N-1], where each element is separated by a new line

**Output:**
6 -> Maximum number of guests on the cruise at an instance

**Explanation:**

1st hour:

- Entry: 3
- Exit: 0
- No. of guests on ship: 3

2nd hour:

- Entry: 5
- Exit: 2
- No. of guests on ship: 3 + 5 - 2 = 6

3rd hour:

- Entry: 2
- Exit: 4
- No. of guests on ship: 6 + 2 - 4 = 4

4th hour:

- Entry: 0
- Exit: 4
- No. of guests on ship: 4 + 0 - 4 = 0

Hence, the maximum number of guests within 4 hours is 6.

### Input Format for Testing

The candidate has to write the code to accept 3 inputs:

1. First input: Accept value for number of T (Positive integer number)
2. Second input: Accept T number of values, where each value is separated by a new line (E array)
3. Third input: Accept T number of values, where each value is separated by a new line (L array)

### Output Format for Testing

The output should be a positive integer number or a message as given in the problem statement (Check the output in Example 1 and Example 2).

### Constraints

- 1 <= T <= 25
- 0 <= E[i] <= 500
- 0 <= L[i] <= 500
