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
