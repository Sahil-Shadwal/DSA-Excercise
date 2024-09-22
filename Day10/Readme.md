# Question

# Gear Rotation Problem

## Question 1

During an expedition in the shipwreck near the coast, an archaeologist found an artifact with gears inside it. Later it was referred to as the Antikythera Mechanism. You got the X-ray of the mechanism. From that, you found it has a lot of gears coupled in complicated ways. To understand the working of this mechanism, you are going to study the effects of gears in action.

You will be given the position and size of each gear in order. Find how many times the last gear rotates for each time the first gear rotates. It is not necessary that all the gears are coupled to the first one, including the last one.

### Gear Details

The gear details will be given like:

```
X Y Rr
```

- `X`, `Y` => coordinates of the center of the gear
- `Rr` => The reference radius of the gear

A gear will rotate another gear if the imaginative circles made by the radius `Rr` from their respective centers touch externally at a point.

### Gear Chain

Now consider a gear chain of `N` gears. Also consider:

- Gear 1 with `Rr` of `r1` units
- Gear 2 of `r2` units
- Gear 3 of `r3` units and so on

The relation between `Rr` and rotation is given by:

```
n1 * r1 = n2 * r2
```

where `n1` is the number of times gear 1 rotates and `n2` is the number of times gear 2 rotates.

`n2` can be calculated using the formula:

```
n2 = (n1 * r1) / r2
```

Continuing for gear 2 and gear 3:

```
n2 * r2 = n3 * r3
```

We can calculate `n3` (number of times the third gear will rotate) using:

```
n3 = (n2 * r2) / r3
```

By substituting the value calculated for `n2`, one can calculate `n3`, i.e., the number of times gear 3 rotates with respect to `n1`. If we continue like this till the last gear, one can calculate `nN`, i.e., the number of times gear `N` rotates given `n1`, i.e., the number of rotations of gear 1.

At every step, the direction of rotation will change. If gear 1 is rotating in a clockwise direction, then gear 2 will rotate in an anti-clockwise direction. If gear 1 and gear `N` rotate in the same direction, print the output as a positive integer. Otherwise, print a negative integer.

### Processing Failures

The possible cases where processing fails are as follows:

- Gear 1 and Gear `N` connect to two or more other gears.
- Gear 1 or Gear `N` are not connected to any gear.
- Any gear in the chain between Gear 1 and Gear `N` is connected to more than two gears.
- Any gear in the chain between Gear 1 and Gear `N` is connected to less than two gears.

You will be given `N` gears. It may consist of a gear chain between Gear 1 and Gear `N` and may also have gears that are not part of the gear chain.

If a gear chain exists between Gear 1 and Gear `N`, then:

- Print the number of times Gear `N` rotates. This number can be positive or negative depending on the direction as explained earlier.

Else print "Could Not Process".

### Constraints

- `0 < N < 50`
- `0 < X < 100`
- `0 < Y < 100`
- `0 < Rr < 10`

### Input

- First line contains an integer `N` which gives the total number of gears.
- Next lines will have three integers `X Y Rr` separated by space representing gear details as mentioned above.

The input may consist of gears that are not in the gear chain between Gear 1 and Gear `N`. Gears will not overlap each other.

### Output

Print a single float value up to two decimal places denoting the number of times Gear `N` will rotate if Gear 1 rotates one time. Else print "Could Not Process".

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
4
1 1 1
4 1 2
1 4 1
4 4 1
```

**Output:**

```
1.00
```

**Explanation:**

Input consists of 4 gears. `X Y` coordinates and the reference radius are provided in the input. Upon computation, it is clear that a chain of gears exists between Gear 1 and Gear 4. The gear chain would be Gear 1, Gear 2, and Gear 4.

- Gear 1 is connected directly to Gear 2. Here `Rr` of Gear 1 is 1 and the `Rr` of Gear 2 is 2. So given gear 1 is rotated 1 time in a clockwise direction, gear 2 will rotate 0.5 times in an anti-clockwise direction.
- Next, Gear 2 is connected to Gear 4, i.e., Gear `N`. Gear 2 rotating 0.5 times in an anti-clockwise direction will make Gear 4 rotate 1 time in a clockwise direction because the reference radius of Gear 4 is 1.

Since Gear 4 and Gear 1 both rotate in the same direction, the output is a positive number. Since Gear 4's rotation is 1, the output has to be printed as 1.00. Note that Gear 3 is not in the gear chain between Gear 1 and Gear 4.

#### Example 2

**Input:**

```
5
4 9 2
7 9 1
9 9 1
7 7 1
6 4 1
```

**Output:**

```
Could Not Process
```

**Explanation:**

Gear 1, Gear 3, and Gear 4 are connected to Gear 2. This violates the criteria, and since there is no other gear chain that can reach from Gear 1 to Gear 5 without constraint violation, the output should be printed as "Could Not Process".

## Question 2

Consider a set of web pages, numbered from 1 to N. Each web page has links to one or more web pages. Clicking on a link in a page takes one to the other web page. You are provided numbers of two web pages viz, starting web page and end web page. Your task is to find the minimum number of clicks required to reach the end page from the start page. If the end page cannot be reached from the start page, print -1 as the output. For better understanding refer to the Examples section.

### Constraints

- `0 < N <= 100`
- `0 < L < 10`

### Input

- First line contains an integer `N` denoting the number of web pages.
- Next `N` lines contain `L` space-separated integers depicting linked webpage number(s) from that webpage.

### Output

Print the minimum number of clicks required to open the end page from the start page. If not possible, print -1 as output.

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
5
2 4
1
1 5
2 3
5
2 3
```

**Output:**

```
3
```

**Explanation:**

- First line conveys that there are a total of 5 pages.
- Second line conveys that there are links from page 1 to pages 2 and 4.
- Third line conveys that there is a link from page 2 to page 1.
- Fourth line conveys that there are links from page 3 to pages 1 and 5.
- Fifth line conveys that there are links from page 4 to pages 2 and 3.
- Sixth line conveys that there is a link from page 5 to page 5 itself.
- Seventh line conveys that the starting page is 2 and the ending page is 3.

From page 2, we can open only page 1. From page 1, we can open page 4. From page 4, we can open page 3. So, a minimum of 3 clicks are required, and this is the output.

#### Example 2

**Input:**

```
3
2
1
1
2 3
```

**Output:**

```
-1
```

**Explanation:**

- First line conveys that there are a total of 3 pages.
- Second line conveys that there are links from page 1 to page 2.
- Third line conveys that there is a link from page 2 to page 1.
- Fourth line conveys that there are links from page 3 to page 1.

Since there is no way to reach from page 2 to page 3, print -1 as output.

## Question 3

Imagine you are a video games developer. You are developing a game which requires the player to collect coins and cross hurdles. Let’s call the character in your video game Mario. As Mario moves to collect coins and cross hurdles, the game keeps a count of relevant metrics. Write code to implement this flow.

Mario will run from left to right and jump from ground in the air to collect coins or cross hurdles. The Game Screen will be provided as input in form of a matrix comprising of three characters viz {0, C and H}, where:

- `0` – denotes empty space
- `C` – denotes coins to be collected
- `H` – denotes hurdles to be crossed

All coins are of the same type, whereas there are two types of hurdles – simple hurdle and ring hurdle. Simple hurdle is referred to as Hurdle hereafter.

A Hurdle always begins from the ground and a series of letter `H` stacked vertically make up the height of the hurdle.

A Ring Hurdle on the other hand, has a hole in it i.e., between `H` characters there will be exactly one hole denoted by `0` character. This hole is big enough for Mario to jump through it to cross that hurdle.

### Input Details

The screen will be depicted in the input as a `M * N` matrix. The index of row and columns of this matrix begin from zero.

- The left bottom cell of this matrix is (0, 0). As we move right and up, the row and column indices increase.
- Row zero is considered as Ground and anything above row zero is considered as Air.
- Coins will always be in air, whereas hurdles will always manifest from the ground.
- Hurdle will never be so tall that Mario cannot cross it.
- Once Mario crosses all the columns, the game is over.

### Game Mechanics

- To collect coins Mario will jump vertically in the column where the coin is. Mario always jumps to the highest point where a coin is, on the screen. On his way down from that point, he grabs all coins lower in height in that column. Thus, one jump in one column is enough to fetch all coins in that column.
- Jumping consumes energy. Jumping one row consumes 2 calories. Similarly, if Mario jumps `R` rows in a column, his calorific expenditure is `2 * R`.
- Mario never jumps unless he must collect coins or cross a hurdle.
- When crossing a ring hurdle, the calories consumed in clearing it is `2 * height of the hole in the ring hurdle`.
- Walking i.e., moving from one column to another consumes no energy.

Your task is to keep a track of how many coins Mario collects and how many calories are expended in collecting them.

### Example

Consider a screen(grid) of size `5 * 10`:

```
0000000000
0CCC00000H
0CCC0H0000
00000H0H0H
00000H0H0H
```

We can see that we have coins on the screens at column 1, 2 and 3.

- Column 1 has two coins at a height of 2 and 3 respectively. So, Mario will jump 3 units high and collect the highest coin. On his way down he will collect the coin at height 2. Total calories expended in collecting both coins in Column 1 is `3 * 2 = 6` calories.
- Columns 2 and 3 are identical to Column 1. Hence Mario will have collected 6 coins and spent 18 calories in traversing the grid up to column 3.
- Column 4 is empty. So, no energy is expended traversing it. Next, there are hurdles at Column 5 and 7.
- For clearing these hurdles, he must jump over two hurdles, and by doing this he will consume `3 * 2 + 2 * 2` calories.
- Total calories burned till now: `18 + 10 = 28`
- There is also a ring hurdle at column 9.
- For clearing these hurdles, he must jump over two hurdles, and by doing this he will consume `2 * 2` calories.
- Total calories burned till now: `28 + 4 = 32`
- Total Coins grabbed: 6
- Total Calories burned: 32

### Constraints

- `0 < M <= 10`
- `10 <= N < 100`

### Input

- First line contains two space separated integers `M` and `N` which denote the size of grid (screen).
- Next `M` lines will contain string of size `N` characters. The string will be comprised of {0, C and H} characters.

### Output

Print two space delimited integers. First integer denotes the number of coins grabbed and second integer denotes the calories expended in crossing the screen.

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
5 10
0000000000
0CCC00000H
0CCC0H0000
00000H0H0H
00000H0H0H
```

**Output:**

```
6 32
```

**Explanation:**

Explained in problem description section.

#### Example 2

**Input:**

```
5 10
0000000000
000000000H
00H00H0000
00H00H0H0H
00H00H0H0H
```

**Output:**

```
0 20
```

**Explanation:**

As we can see there are two hurdles of height 3 at column 2 and column 5 (`3 * 2 * 2`), one hurdle of height of 2 at column 7(`2 * 2`) and a ring hurdle of height 2(`2 * 2`) at column 9.

Thus, total coins grabbed in 0 and total calories expended is 20.

## Question 4

It rains only on certain days in Primevilla. It is a rainy day when the number of days since a certain date is prime as well as the month is prime (i.e., month is one of Feb, Mar, May, Jul, Nov). Primevilla follows the same calendar that we use.

Given the date `d`, identify if it would ever rain on a given weekday `w` within the next given `n` days. Also, calculate the number of days `r` (where `r > 0`) after which it would rain within the next `n` days.

### Constraints

- `2 <= n <= 10^10`

### Input

Input consists of three space-delimited parts viz. `<Date, DOW, n>` where:

- `Date` is of the format `yyyymmdd`
- `DOW` is Date of the Week in `Ddd` format
- `n` is a natural number (where `n >= 2`)

### Output

Output would be one of the three formats:

- If it would rain on `Ddd`, `r` days after `d` within the next `n` days, print `Yes r`
- Else if `p` is the least prime > `n` such that it would rain on `Ddd` after `p` days, print `No p`
- Else print `No 0`, if it would never rain on `Ddd`.

### Time Limit

1 second

### Examples

#### Example 1

**Input:**

```
20211201 Sun 100
```

**Output:**

```
Yes 67
```

**Explanation:**

Starting from `20211201` we start checking for prime number days whether it would rain. The process will be as depicted below:

- `20211201 + 2` is `20211203` Fri, month 12 is not prime —> It would not rain
- `20211201 + 3` is `20211204` Sat, month 12 is not prime —> It would not rain
- ...
- `20211201 + 31` is `20220101` Sat, month 1 is not prime —> It would not rain
- ...
- `20211201 + 67` is `20220206` Sun, month 2 is prime —> It would rain

Hence it could rain on a Sunday 67 days after the given date and within the given 100 days. Hence, output is `Yes 67`.

#### Example 2

**Input:**

```
20211201 Wed 100
```

**Output:**

```
No 0
```

**Explanation:**

The given date `20211201` is itself a Wednesday.

- `20211201 + 7` is `20211208` Wed, month 12 is not prime —> It would not rain

Also, any future Wednesday would be a multiple of 7 and hence non-prime days later than `20211201`. So, it would never rain on future Wednesdays. Hence, output is `No 0`.

#### Example 3

**Input:**

```
19470815 Sat 150
```

**Output:**

```
No 197
```

**Explanation:**

If similar computation as depicted in prior examples is carried out one can figure out that it will rain on Sat, 28 Feb 1948 which is 197 days from 15 Aug 1947. However, since 197 is greater than 150 output is `No 197`.
