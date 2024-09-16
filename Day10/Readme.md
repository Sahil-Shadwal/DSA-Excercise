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
