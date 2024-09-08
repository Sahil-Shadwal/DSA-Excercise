# Questions

## Question 1

### Problem Statement

A City Bus is a Ring Route Bus which runs in a circular fashion. That is, the bus once starts at the Source Bus Stop, halts at each Bus Stop in its route, and at the end, it reaches the Source Bus Stop again. If there are `n` number of stops and if the bus starts at Bus Stop 1, then after the `n`th Bus Stop, the next stop in the route will be Bus Stop number 1 always.

If there are `n` stops, there will be `n` paths. One path connects two stops. Distances (in meters) for all paths in the Ring Route are given in the array `Path[]` as given below:
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]

Fare is determined based on the distance covered from source to destination stop. The distance between the input source and destination stops can be measured by looking at values in the array `Path[]` and the fare can be calculated as per the following criteria:

- If `d <= 1000` meters, then fare = 5 INR
- When calculating fare for others, the calculated fare containing any fraction value should be ceiled. For example, for distance 900 meters when fare initially calculated is 4.5, it must be ceiled to 5.

The path is circular in function. The value at each index indicates the distance till the current stop from the previous one. Each index position can be mapped with values at the same index in the `BusStops[]` array, which is a string array holding abbreviations of names for all stops as:

- “THANERAILWAYSTN” = ”TH”
- “GAONDEVI” = “GA”
- “ICEFACTORY” = “IC”
- “HARINIWASCIRCLE” = “HA”
- “TEENHATHNAKA” = “TE”
- “LUISWADI” = “LU”
- “NITINCOMPANYJUNCTION” = “NI”
- “CADBURRYJUNCTION” = “CA”

Given, `n=8`, where `n` is the number of total BusStops.
BusStops = [“TH”, ”GA”, ”IC”, ”HA”, ”TE”, ”LU”, ”NI”,”CA”]

Write a code with function `getFare(String Source, String Destination)` which takes input as source and destination stops (in the format containing the first two characters of the name of the Bus Stop) and calculates and returns the travel fare.

#### Example 1

**Input:**
ca
Ca

**Output:**
INVALID OUTPUT

#### Example 2

**Input:**
NI
HA

**Output:**
23.0 INR

### Input Format for Testing

The candidate has to write the code to accept 2 inputs:

1. First input: Accept the source stop (String).
2. Second input: Accept the destination stop (String).

### Output Format for Testing

The output should display the travel fare in the format "XX.0 INR".

### Constraints

- The input should not be case sensitive.
- The output should be in the format "XX.0 INR".

## Question 2

### Problem Statement

There are total `n` number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If every Monkey can eat `k` Bananas and `j` Peanuts. If total `m` number of Bananas and `p` number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
At a time one Monkey gets down and finishes eating and goes to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
Monkey can either eat `k` Bananas or `j` Peanuts. If for the last Monkey there are less than `k` Bananas left on the ground or less than `j` Peanuts left on the ground, only that Monkey can eat Bananas (<`k`) along with the Peanuts (<`j`).
Write code to take inputs as `n`, `m`, `p`, `k`, `j` and return the number of Monkeys left on the Tree.
Where,

- `n` = Total number of Monkeys
- `k` = Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than `k` Bananas)
- `j` = Number of eatable Peanuts by single Monkey (Monkey that jumped down last may get less than `j` Peanuts)
- `m` = Total number of Bananas
- `p` = Total number of Peanuts

Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of `k` and `j` having a value zero.

#### Example 1

**Input Values:**
20
2
3
12
12

**Output Values:**
Number of Monkeys left on the tree: 10

Note: Kindly follow the order of inputs as `n`, `k`, `j`, `m`, `p` as given in the above example. And output must include the same format as in the above example (Number of Monkeys left on the Tree:).
For any wrong input display INVALID INPUT.

## Question 3

### Problem Statement

Chain Marketing Organization has a scheme for income generation, through which its members generate income for themselves. The scheme is such that suppose A joins the scheme and makes R and V join this scheme, then A is the Parent Member of R and V who are Child Members. When any member joins the scheme, the parent gets a total commission of 10% from each of its child members. Child members receive a commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets a commission of 5%.

Take the names of the members joining the scheme as input. Display how many members joined the scheme including the parent member. Calculate the total commission gained by each member in the scheme. The fixed amount for joining the scheme is Rs.5000 on which commission will be generated.

SchemeAmount = 5000

#### Example 1: When there are more than one child member

**Input:**
Amit
Y
Rajesh,Virat

**Output:**
TOTAL MEMBERS: 3
COMMISSION DETAILS
Amit: 1000 INR
Rajesh: 250 INR
Virat: 250 INR

Example 2: When there is only one child member in the hierarchy

**Input:**
Amit
Y
Rajesh

**Output:**
Total Members: 2
Commission Details
Amit: 500 INR
Rajesh: 250 INR
