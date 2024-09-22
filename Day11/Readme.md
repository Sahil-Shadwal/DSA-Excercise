# Vaccination Scheduling Problem

## Problem Statement

Imagine you are an MLA of a district and there are N number of villages in your constituency.

Your job is to vaccinate all the people in your constituency in the minimum amount of time. There are two centres where vaccination is going on. The first centre takes `m1` minutes as average time for vaccinating one person and the second centre takes `m2` minutes as average time.

The population of every village is known to you prior to the vaccination drive. Schedule all the villagers to any centre such that the overall time for vaccinating all the people of all the villages will be minimum. Assume that there is no wait time in between vaccinating two people. Also, people belonging to the same village will need to be vaccinated in the same centre.

### Example

First centre takes 2 min as average time.  
Second centre takes 4 min as average time.  
Population data of 3 villages is known: 10, 30, 20.

Number of people in 3 villages is given:

- `v1 = 10`
- `v2 = 30`
- `v3 = 20`

Consider if the schedule is drawn by distributing an equal number of people to both centres, then:

- First centre: 10, 20 total time = (10 + 20) \* 2 = 60 min
- Second centre: 30 total time = (30) \* 4 = 120 min

Hence, the minimum time required to vaccinate all the people will be = 120 min.  
i.e., Maximum of time taken in the first centre or second centre.

But if it is scheduled like this:

### Constraints

- `0 < m1, m2 <= 20`
- `0 < N < 10^3`
- `0 < Population of village <= 100`

### Input

1. First line contains an integer `m1` which is the average time in minutes taken for vaccination by the first centre.
2. Second line contains an integer `m2` which is the average time in minutes taken for vaccination by the second centre.
3. Third line contains an integer `N` which is the number of villages in the constituency.
4. Fourth line contains `N` space-delimited integers denoting the population of villages.

### Output

Single integer value denoting the maximum time taken in minutes to vaccinate all villagers from all villages in your constituency.

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
2
3
5
10 50 20 30 40
```

**Output:**

```
180
```

**Explanation:**

Given the data of centre1 and centre2:

- First centre takes 2 min as average time.
- Second centre takes 3 min as average time.
- Your constituency has 5 villages.

Number of people in each of the 5 villages is given: 50, 10, 20, 30, 40.

- `v1 = 50`
- `v2 = 10`
- `v3 = 20`
- `v4 = 30`
- `v5 = 40`

If the schedule looks like this:

- First centre: 10, 50 total time = (10 + 50) \* 2 = 120 min
- Second centre: 30, 40, 20 total time = (20 + 40 + 20) \* 3 = 240 min

Minimum time required to vaccinate all the people will be = 240 min.

But if the schedule is drawn like this:

- First centre: 10, 30, 50 total time = (10 + 30 + 50) \* 2 = 180 min
- Second centre: 40, 20 total time = (40 + 20) \* 3 = 180 min

Minimum time required to vaccinate all the people will be = 180 min.

#### Example 2

**Input:**

```
1
2
3
100 90 70
```

**Output:**

```
180
```

**Explanation:**

Given the data of centre1 and centre2:

- First centre takes 1 min as average time.
- Second centre takes 2 min as average time.
- There are 3 villages in your constituency.

Number of people in each of the 3 villages is given: 100, 90, 70.

- `v1 = 100`
- `v2 = 90`
- `v3 = 70`

If the schedule looks like this:

- First centre: 100, 90 total time = (100 + 90) \* 1 = 190 min
- Second centre: 70 total time = (70) \* 2 = 140 min

Minimum time required to vaccinate all the people will be = 190 min.

But if the schedule is drawn like this:

- First centre: 100, 70 total time = (100 + 70) \* 1 = 170 min
- Second centre: 90 total time = (90) \* 2 = 180 min

Minimum time required to vaccinate all the people will be = 180 min. Hence the output is 180.

## Math Game with Prime Numbers

A math game is introduced in a school competition to test the skills of students. The game deals with prime numbers. The game rules are as follows:

From the given set of distinct natural numbers as input, consider the smallest natural number as `q`. Your task is to compute the smallest prime number (`p`) such that when `p` is divided by all the distinct numbers in the input, except `q`, it should result in `q` as the remainder.

### Constraints

- `1 < n < 11`
- `p < 10^10`

### Input

Input consists of `n+1` distinct natural numbers separated by spaces.

### Output

Print a single integer `p` if such a `p` exists, else print "None".

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
4
3 4 5 1
```

**Output:**

```
61
```

**Explanation:**

Here the `n+1` numbers are 3, 4, 5, and 1 where `q=1` (the least of the numbers). The smallest number that leaves remainder 1 when divided by 3, 4, and 5 is 61 and is prime. Hence, the output is 61.

#### Example 2

**Input:**

```
4
3 4 5 2
```

**Output:**

```
None
```

**Explanation:**

Here `q=2`. Any number that when divided by 4 leaving remainder 2 must be an even number (e.g., 6, 10, 14, etc.). Hence, it can’t be prime. Therefore, the output is "None".

## Jug Filling Problem

Consider a Jug of capacity `L` liters. Given `N` cups of different capacities `Ci` (in liters), fill the Jug with the help of cups according to the specification.

### Specifications

1. Cups can be used an integral number of times (i.e., zero or more times), but never partially (e.g., a cup of 1L can be used 0, 1, 2, etc. times, but never 0.5, 1.5, 2.5, etc. times).
2. The Jug must not overflow because of cup filling.
3. The number of distinct cups (i.e., different cup sizes) used to fill the Jug must be maximized.
4. The summation of the number of times all cups are used must be minimized.

Consider point 3 to be more important than point 4 when meeting the optimization goals.

### Constraints

- `0 < N < 10`
- `0 < L <= 100`
- `0 < Ci < L`

### Input

1. First line contains an integer `N` denoting the number of cups available.
2. Second line contains `N` space-separated integers denoting the capacity of the cups.
3. Third line contains an integer `L` which denotes the capacity of the Jug in liters.

### Output

Output consists of two lines:

1. First line must comprise of `N` or fewer space-delimited integers, in ascending order of cup size, for the cups used to fill the Jug.
2. Second line must comprise of an equal number of space-delimited integers which denote the frequency (i.e., the number of times the corresponding cup in the first line is used to fill the Jug).

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
4
3 7 10 11
88
```

**Output:**

```
3 7 10 11
1 2 6 1
```

**Explanation:**

The first and second lines indicate that you are provided with 4 cups of capacities – 3 liters, 7 liters, 10 liters, and 11 liters. The third line indicates that the capacity of the Jug is 88 liters.

One possible solution for filling the Jug is:

```
7 10 11
5 2 3
```

i.e., one can use the 7L cup 5 times to get 35L. Next, one can use the 10L cup twice. After that, the Jug will contain 55L. Finally, one can use the 11L cup thrice. Thus, the Jug will be filled. However, this solution uses cups of only 3 different capacities when 4 different capacities are available. Hence, the Jug is perhaps not filled according to the specification. Let’s see if we can achieve our objective by using all 4 cup sizes.

We can use all the available cups if we use them as follows:

```
3 7 10 11
1 2 6 1
```

Hence, this is our final solution which adheres to the specification.

#### Example 2

**Input:**

```
3
2 5 10
50
```

**Output:**

```
2 5 10
5 2 3
```

**Explanation:**

The first and second lines indicate that you are provided with 3 cups of capacities – 2 liters, 5 liters, and 10 liters. The third line indicates that the capacity of the Jug is 50 liters.

Here one can easily fill the Jug by using the 10L cup 5 times. However, this does not obey the specifications. According to the specifications, one must use all available cups of capacity 2L, 5L, and 10L. If there are multiple ways in which the Jug can be filled by using the maximum number of distinct sized cups, then as per specifications one needs to minimize the summation of the number of times cups are used.

Consider the following solutions:

**Solution 1:**

```
2 5 10
15 2 1
```

**Solution 2:**

```
2 5 10
5 2 3
```

Both solutions use all available cups. However, the sum of frequencies in Solution 1 is 18 (15 + 2 + 1), whereas the sum of frequencies in Solution 2 is 10 (5 + 2 + 3). Solution 2 minimizes the summation of the number of times any cup is used. This is also a requirement as per the specification. Hence, Solution 2 is the correct answer.
