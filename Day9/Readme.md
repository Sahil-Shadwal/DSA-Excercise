## Question

### Question 1

A picnic to a famous museum is being planned in a school for class VI. When they reached the spot, the students started quarreling among themselves in the queue. So the teacher came up with an idea of “good string” which is explained below.

Good String is provided as input. All letters in this string are good letters. Good letters need to be used in further computations as explained below. The teacher asked all the students to convert their names into good names with the help of the good string. While converting, they have to calculate the distance. Based on that, she will arrange the students in a queue.

For converting a name into a good name, for each letter `i` in the name, select the nearest letter from the good name. Distance is calculated as the differences between the ASCII values of `i` and the selected good letter. If there are two letters which are equidistant from `i`, select the letter which is nearest to the previously used good letter. In that case, distance will be the difference of ASCII value of the previously used good letter and the selected letter. If `i` is already present in the good string then no need to change it. Initially, the previous good letter will be the first letter of the good string. Calculate the total distance of the given name.

Given the name of the student who is confused about implementing this task. Help him to calculate the total distance for his name.

### Note:

Letters from the good string can be reused any number of times.

### Constraints

- 1 <= len(good string) <= 100
- 1 <= len(name) <= 10^4
- Good string will consist of lower, upper case alphabets, digits, and symbols.
- Name will consist of only space, lower and upper case alphabets.
- Characters are case sensitive.
- The ASCII values for all the characters in the good string and name will be between 32 to 126 (both inclusive).

### Input

- First line consists of good string.
- Second line consists of the name of the student who is confused to implement the task.

### Output

- Print the total distance for that name.

### Time Limit (secs)

1

### Examples

**Example 1**
Input:
abcdefghijklmnopqrstuvwxyz
Rahul Kumar

Output:
0

Explanation:
The good string contains all lowercase letters from 'a' to 'z'.
For the name "Rahul Kumar":

- 'R': Nearest letter in good string is 'r'. Distance = |ASCII('R') - ASCII('r')| = 32
- 'a': Already in good string. Distance = 0
- 'h': Already in good string. Distance = 0
- 'u': Already in good string. Distance = 0
- 'l': Already in good string. Distance = 0
- ' ': Nearest letter is 'a'. Distance = |ASCII(' ') - ASCII('a')| = 65
- 'K': Nearest letter is 'k'. Distance = |ASCII('K') - ASCII('k')| = 32
- 'u': Already in good string. Distance = 0
- 'm': Already in good string. Distance = 0
- 'a': Already in good string. Distance = 0
- 'r': Already in good string. Distance = 0

Total distance = 32 + 0 + 0 + 0 + 0 + 65 + 32 + 0 + 0 + 0 + 0 = 129

**Example 2**

Input:
aeiou
Hello World

Output:
67

Explanation:
The good string contains only vowels 'a', 'e', 'i', 'o', 'u'.
For the name "Hello World":

- 'H': Nearest letter is 'o'. Distance = |ASCII('H') - ASCII('o')| = 39
- 'e': Already in good string. Distance = 0
- 'l': Nearest letter is 'o'. Distance = |ASCII('l') - ASCII('o')| = 3
- 'l': Nearest letter is 'o'. Distance = |ASCII('l') - ASCII('o')| = 3
- 'o': Already in good string. Distance = 0
- ' ': Nearest letter is 'a'. Distance = |ASCII(' ') - ASCII('a')| = 65
- 'W': Nearest letter is 'u'. Distance = |ASCII('W') - ASCII('u')| = 23
- 'o': Already in good string. Distance = 0
- 'r': Nearest letter is 'o'. Distance = |ASCII('r') - ASCII('o')| = 3
- 'l': Nearest letter is 'o'. Distance = |ASCII('l') - ASCII('o')| = 3
- 'd': Nearest letter is 'e'. Distance = |ASCII('d') - ASCII('e')| = 1

Total distance = 39 + 0 + 3 + 3 + 0 + 65 + 23 + 0 + 3 + 3 + 1 = 140

### Question 2

You are given a binary string `B` of length `L` which contains `K` ones and remaining zeros. You are required to place the `K` ones in the binary string in such a way that the longest consecutive zeros have the least length possible. Once such a binary string is constructed, you are required to print the length of the contiguous block of zeros, which has the largest length.

### Constraints

- \(0 \leq K \leq L\)
- \(1 \leq L \leq 10^6\)

### Input

Single line consisting of two space-separated integers denoting `L` and `K`.

### Output

Print a single integer denoting the length of the longest consecutive zeros as per the problem.

### Time Limit (secs)

1

### Examples

**Example 1**

**Input:**

```
3 1
```

**Output:**

```
1
```

**Explanation:**

`B` is of length 3 and it has 1 one. So the possible strings as per the problem are `010`, `001`, `100`. In the first case, the maximum length of consecutive zeros is 1 whereas in the other two cases it is 2. Hence the constructed binary string is `010` and the output is 1.

**Example 2**

**Input:**

```
3 3
```

**Output:**

```
0
```

**Explanation:**

`B` is of length 3 and it has all three ones. There is no block of zeros, hence the output is 0.

### Question 3 - Finding the Rank of a String

Finding the rank of a string is the basic concept one needs to learn to understand permutations. To understand it deeply, why don’t we reverse engineer it?

Rank is nothing but the position of a string among all the possible permutations without repetition of alphabets of length \( N \) in lexicographical order. The possible permutations without repetition of length 1 is a, b, c .. z; length 2 is ab, ac, ad .. zy; length 3 is abc, abd, abe, … bac, bad, bae … zyx, and so on. Now, given the rank of a string and its length, compute the string that can be formed with all the alphabets. Check the example section for more understanding.

### Constraints

- \( 1 \leq R \leq 26! \)
- \( 1 \leq N \leq 26 \)

### Input

- First line consists of a single integer \( R \), which denotes the rank of the string.
- Second line consists of a single integer \( N \), which denotes the length of the string.

### Output

- Print the string of length \( N \) and rank \( R \) in a single line.

**Note:** Formed string may or may not be a meaningful word.

### Time Limit (secs)

1

### Examples

**Example 1**

**Input:**

```
8
1
```

**Output:**

```
h
```

**Explanation:**

Rank and length of the string are given as 8 and 1 respectively. As the length of the string is 1, the one-lettered words that can be formed from all the alphabets a to z are a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z. When these words are ordered lexicographically, the word at the 8th position or 8th rank would be ‘h’. Hence, the output is ‘h’.

**Example 2**

**Input:**

```
29
2
```

**Output:**

```
be
```

**Explanation:**

Rank and length of the string are given as 29 and 2 respectively. As the length of the string is 2, the two-lettered words that can be formed from all the alphabets a to z are ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, ba, bc, bd, be, bf and so on till zy. When these words are ordered lexicographically, the word at the 29th position or 29th rank would be ‘be’. Hence, the output is ‘be’.

### Question 4

An online shopping store announced an offer for the upcoming festive season. In order to avail that offer, we have to collect the tokens for `n` consecutive days and using those tokens, we can buy items in the sale.

Mithra, a regular customer, wanted to claim those tokens and decided to buy something in the sale. When the tokens season began, she started claiming the tokens. Unfortunately, in between the days, she forgot claiming and missed few tokens. Now the token season is ended. Suddenly, the app gave bumper offer to all users i.e., for any `k` consecutive days, every user can claim the tokens if they were unclaimed in the token season.

Given an array `tokens` of size `n` denoting the number of tokens offered for `n` consecutive days and another array `claim` denoting the tokens are claimed or not on those particular days. If `claim[i]` is 1 then Mithra had claimed otherwise not. Another integer `k` is given denoting the number of days the bumper offer can be used. A list of items and costs are given. The only rule is that we can buy only one item using those tokens.

Help Mithra in selecting `k` consecutive days and finally print the item(s) which she can buy aiming for the minimal wastage of tokens. If there are more than one item of same cost, then print them in lexicographical (ascending) order.

### Constraints

- \(1 \leq n \leq 10^4\)
- \(0 \leq k \leq 10^4\)
- \(0 \leq tokens[i] \leq 10^4\)
- \(1 \leq \text{number of items} \leq 100\)
- `Claim[i]` is either 0 or 1
- `Tokens` and `claim` are arrays of same size

### Input

- First line contains an integer `n` denoting the size of the tokens array.
- Second line contains the array `tokens` denoting the number of tokens available for `n` consecutive days.
- Third line contains the `claim` array denoting whether Mithra claimed tokens or not, on these `n` days.
- Fourth line contains the integer `k` denoting the number of consecutive days bumper offer can be applied.
- Last line contains items denoting the items and their costs separated by colon.

### Output

A single line of item(s) that Mithra can buy with the tokens. If there are more than one, print them in the lexicographical (ascending) order.

### Time Limit (secs)

1

### Examples

**Example 1**

**Input:**

```
8
7 5 0 2 8 6 12 1
1 0 1 1 0 1 1 0
2
Bucket:8 Cot:32 Chair:27 Cooker:37 Gas:45 Fan:34 Mug:3 Ac:100
```

**Output:**

```
Fan
```

**Explanation:**

Of the 8 days of token season, 5 days are already claimed. So, she has to claim from days where a claim is not yet made (wherever the value is 0 in the claim array). By virtue of this she already has 7+2+6+12 = 27 tokens.
Suppose Mithra decided to use the bumper offer for the days 4,5 or 5,6 then the total number of tokens she gains will be 7+2+8+6+12=35. Among all the given items, she can buy a fan which will result in the wastage of only 1 token. Other than fan, buying any items will result in the wastage of a greater number of tokens.

**Example 2**

**Input:**

```
12
8 3 6 22 5 0 11 1 0 4 9 6
0 1 0 1 1 0 1 0 1 0 0 0
3
Bucket:8 Cot:32 Geyser:45 Chair:27 Cooker:38 Gas:45 Fan:34 Mug:3 Ac:100 Bulb:15
```

**Output:**

```
Gas Geyser
```

**Explanation:**

Of the 12 days of token season, 5 days are already claimed. So, she has to claim from days where a claim is not yet made (wherever the value is 0 in the claim array). By virtue of this she already has 3+22+5+11 = 41 tokens.
Suppose Mithra decided to use the bumper offer for the days 10,11,12 then the number of tokens she gains will be 3+22+5+11+4+9+6=60. Among all the given items, she can buy gas or geyser which will result in the wastage of only 15 tokens. Other than these, buying any items will result in the wastage of a greater number of tokens.

### Question 5

In a supermarket, we will find many variations of the same product. In the same way, we can find many types of rice bags which differ in their quantity, price, brand, and type of rice in them. Many variations of the same products exist in a supermarket. Consider rice, for example. We get it in varying quantities (q) and at different prices (p). Thus, a rice bag is a unique combination of {q, p}. Customers want to buy the rice bags of their own choices. Each bag has two attributes: price and the quantity of rice. The customers have some conditions for buying the rice bags; they have a specific price and quantity that have to be compared with the rice bags before buying them. If the price of the rice bag is less than or equal to the customer’s preference and if the quantity is more than the given preference, then he/she will buy it. There is only one bag of each type, and each customer can buy at most one bag. Given `n` and `m` representing the number of customers and rice bags respectively, along with the variations of rice bags available in the market and the preferences of customers, find the maximum number of bags that can be sold by the end of the day.

### Constraints

- \(1 \leq n, m \leq 1000\)
- \(1 \leq a, b \leq 10^5\)
- \(1 \leq p, q \leq 10^5\)

### Input

- The first line contains two space-separated integers `n` and `m` denoting the number of customers and the number of rice bags respectively.
- Next `n` lines consist of two space-separated integers `a` and `b` denoting customer’s preferences viz. customer’s quantity and cost preferences, respectively.
- Lastly, the next `m` lines consist of two space-separated integers `q` and `p` denoting the bags' quantity and cost, respectively.

### Output

- Print the maximum number of rice bags that can be sold.

### Time Limit (secs)

1

### Examples

**Example 1**

**Input:**

```
5 4
35 2400
70 5500
87 6000
20 1700
12 500
50 2500
75 4875
100 7000
25 1250
```

**Output:**

```
2
```

**Explanation:**

Since the price of the bag should be less than or equal to the customer’s preference and the quantity should be greater than the preferred quantity, customer 2 can buy bag 2 and customer 4 can buy bag 4. So, in total, 2 bags can be sold to the customers.

**Example 2**

**Input:**

```
4 7
32 1500
58 5000
87 6200
45 3000
20 1200
60 4500
100 6000
80 5500
35 1400
40 2000
50 2800
```

**Output:**

```
4
```

**Explanation:**

Since the price of the bag should be less than or equal to the customer’s preference and the quantity should be greater than the preferred quantity, customer 1 can buy bag 5, customer 2 can buy bag 2, customer 3 can buy bag 3, and customer 4 can buy the 7th bag. So, in total, 4 bags can be sold to the customers.
