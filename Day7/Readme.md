## Question 1

### Problem Statement

You are given an array A of size N. Your friend gave an amazing task for you.

Your friend likes one type of sequence. So, he called that type of sequence a fair sequence.

You should select a fair sequence of maximum length from an array.

Here a fair sequence is nothing but you have to select elements in a pattern like positive element, negative element, positive element… (negative element, positive element, negative element, to form sequence).

Your task is to print the maximum sum of elements possible by selecting a fair subsequence with maximum length.

Ex: If array A = [-1, 18, 13, 18, 2, 16, -1, -213, 11]. Here your minimum length can be which subsequences -1, 18, -1, 11. Sum is 27, which is the maximum. Your friend also kept a timer of 15 min. If you solve it within the time, you win.

Your task is to print the maximum sum of elements possible by selecting a fair subsequence with maximum length.

Ex: If array A = [-1, 18, 13, 18, 2, 16, -1, -213, 11]. Here your minimum length can be 6. The fair subsequence is -1, 18, -1, 11. The sum is 27 which is the maximum possible.

Your friend also kept a timer of 15 min. You will win, will you be able to do it?

**NOTE:** You should select the elements in a fair sequence only.

### Example 1

**Input:**

5 – N (Number of elements in an array)

21 12 13 -21 -2 – Array A consists of N elements

**Output:**

19

**Explanation:**

Here you can select 21, -2 subsequences of maximum length 2. The sum is 19 which is the maximum possible for a fair subsequence of length 2.

### Example 2

**Input:**

-153 -689

**Output:**

-153

**Explanation:**

Here you can select -153 as the only element in the fair subsequence. The sum is -153 which is the maximum possible for a fair subsequence of length 1.

## Question 2

### Problem Statement

Vijay, an industrialist, recently opened a fuel industry. There are N numbers of different categories of fuel and each fuel is stored in a fixed size of container. The size of the container can vary from fuel to fuel. Hari, a fuel merchant, visited Vijay’s industry and he wanted to purchase fuels for his shop. Hari has a limited amount of money (K) and wants to buy fuel. Hari will not buy more than one container of any fuel category. Hari wants to maximize the overall volume i.e., sum of volume of fuels he buys. Your task is to get the maximum overall volume of fuels which Hari can purchase.

Given the number of categories of fuels (N), money units (K) price of container of each category of fuel and volume contained in container for each category.

**NOTE:** Quantity (volume) of container will be given in the same order as volume of price.

**Hint:** Break problems into parts and get the overall volume for smaller N and smaller K.

### Example 1

**Input:**

5, 105 -> N = 5, K=105

10 10 40 50 90 -> price of container of each fuel category.

10 20 20 50 150 -> volume of container of each fuel Category.

**Output:**

170

**Explanation:**

There are 5 fuel categories and Hari has 105 units of money. To have maximum fuel volume Hari can buy oil at 2nd and 5th position. Total cost= 10 + 90 = 100 and it is less than 105 (money which Hari has). Total volume = 20 + 150 = 170. It’s the max volume Hari can get; no other combination can get more volume than this.

### Example 2

**Input:**

5, 100 -> N = 5, K=100

10 20 30 40 100 -> price of container of each fuel category.

10 20 30 40 100 -> volume of container of each fuel

**Output:**

100

**Explanation:**

Hari can buy either the first four categories or only the 5th category of fuel. In either case, the total amount will be 100 and the volume will be 100 (which is the maximum volume possible).
