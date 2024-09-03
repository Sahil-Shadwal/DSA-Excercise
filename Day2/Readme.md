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
