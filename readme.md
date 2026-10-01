# HackerRank 3rd Sem Algorithm Portfolio

## Student Details

| Detail                   | Information                                                          |
| ------------------------ | -------------------------------------------------------------------- |
| **Name**                 | Pranav Ethapay                                                       |
| **USN / Student ID**     | R25EQ058                                                             |
| **Semester**             | 3rd Semester                                                         |
| **Programming Language** | Java                                                                 |
| **HackerRank Profile**   | https://www.hackerrank.com/profile/pranavethapay201                  |
| **GitHub Repository**    | https://github.com/pranave2007/HackerRank-3rdSem-Algorithm-Portfolio |

---

## About This Portfolio

This repository contains my solutions to the **HackerRank 3rd Semester Algorithm Portfolio** activity. The activity focuses on developing problem-solving skills using fundamental algorithmic techniques such as array processing, searching, sorting, greedy algorithms, and Binary Search Tree operations.

All five required problems were successfully solved and **accepted on HackerRank** using Java.

The solutions are organized into separate folders with readable source code and algorithmic analysis.

---

## Problems Completed

| No. | Problem                     | Technique                    | Time Complexity | Auxiliary Space | Status   |
| --- | --------------------------- | ---------------------------- | --------------- | --------------- | -------- |
| 1   | Mini-Max Sum                | Minimum/Maximum Tracking     | O(N)            | O(1)            | Accepted |
| 2   | Birthday Cake Candles       | Maximum & Frequency Counting | O(N)            | O(1)            | Accepted |
| 3   | Insertion Sort – Part 1     | Insertion / Shifting         | O(N)            | O(1)            | Accepted |
| 4   | Binary Search / BST Problem | Tree Traversal / Searching   | O(H)            | O(1) / O(H)*    | Accepted |
| 5   | Mark and Toys               | Greedy + Sorting             | O(N log N)      | O(1)**          | Accepted |

* Complexity depends on the specific implementation used.

** Sorting may use additional internal memory depending on the Java implementation.

---

# 1. Mini-Max Sum

### Problem Summary

Given an array of five integers, calculate the minimum and maximum sums that can be obtained by adding exactly four of the five integers.

### Approach

Instead of sorting the array, the solution calculates the total sum while simultaneously finding the minimum and maximum values.

* Minimum sum = Total sum − Maximum value
* Maximum sum = Total sum − Minimum value

This avoids unnecessary sorting and provides a linear-time solution.

### Complexity

* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)

### Why This Approach?

A single traversal is sufficient to find the minimum, maximum, and total sum. This is more efficient than sorting the array, which would require O(N log N) time.

---

# 2. Birthday Cake Candles

### Problem Summary

Given the heights of candles on a birthday cake, find how many candles have the maximum height.

### Approach

The solution traverses the list once while maintaining:

* The maximum candle height
* The number of candles having that maximum height

Whenever a larger height is found, the maximum is updated and the count is reset. If the current height equals the maximum, the count is increased.

### Complexity

* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)

### Why This Approach?

There is no need to sort the candle heights. A single traversal can find both the maximum height and its frequency.

---

# 3. Insertion Sort – Part 1

### Problem Summary

The problem demonstrates the insertion step of Insertion Sort. The last element of the array must be inserted into its correct position while shifting larger elements to the right.

### Approach

The last element is stored as the value to be inserted. The elements before it are compared with this value from right to left.

If an element is larger than the value, it is shifted one position to the right. Once the correct position is found, the value is inserted.

### Complexity

* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)

### Why This Approach?

The problem specifically focuses on the insertion step. Shifting elements rather than creating another array keeps the algorithm memory efficient.

---

# 4. Binary Search / Tree Searching Problem

### Problem Summary

The solution involves searching within a Binary Search Tree and determining the appropriate node based on the values being searched.

### Approach

The Binary Search Tree property is used:

* If both values are smaller than the current node, move to the left subtree.
* If both values are greater than the current node, move to the right subtree.
* Otherwise, the current node is the required common point.

The implementation uses an iterative approach rather than recursion for the search operation.

### Complexity

* **Time Complexity:** O(H)
* **Average Time:** O(log N) for a balanced tree
* **Worst-case Time:** O(N) for a skewed tree
* **Auxiliary Space:** O(1)

Where **H** represents the height of the tree.

### Why This Approach?

The Binary Search Tree property eliminates unnecessary parts of the tree during each step, making the search more efficient than examining every node.

---

# 5. Mark and Toys

### Problem Summary

Given the prices of different toys and a fixed amount of money, determine the maximum number of toys that can be purchased.

### Approach

The prices are first sorted in ascending order.

The algorithm then purchases the cheapest toys first while the total cost remains within the available budget.

This is a greedy approach because choosing the cheapest available toy allows the budget to purchase the largest possible number of toys.

### Complexity

* **Time Complexity:** O(N log N)
* **Auxiliary Space:** O(1)*

The O(N log N) complexity comes from sorting the prices.

### Why This Approach?

To maximize the number of toys, purchasing cheaper toys first is appropriate. Sorting makes it possible to consider the prices from lowest to highest.

---

# Repository Structure

```text
HackerRank-3rdSem-Algorithm-Portfolio/
│
├── README.md
│
├── 01-Mini-Max-Sum/
│   └── solution.java
│
├── 02-Birthday-Cake-Candles/
│   └── solution.java
│
├── 03-Insertion-Sort-Part-1/
│   └── solution.java
│
├── 04-Binary-Search/
│   └── solution.java
│
└── 05-Mark-and-Toys/
    └── solution.java
```

---

# HackerRank Achievement

All five mandatory problems were successfully completed and accepted on HackerRank.

### Problem Solving Badge

I also achieved the **HackerRank Problem Solving badge** as part of my progress in algorithmic problem solving.

**HackerRank Profile:**
https://www.hackerrank.com/profile/pranavethapay201

---

# HackerRank Challenge Links

* [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum)
* [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles)
* [Insertion Sort – Part 1](https://www.hackerrank.com/challenges/insertionsort1)
* [Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys)

---

# Complexity Summary

| Problem                 | Algorithm                    |       Time | Auxiliary Space |
| ----------------------- | ---------------------------- | ---------: | --------------: |
| Mini-Max Sum            | Single-pass tracking         |       O(N) |            O(1) |
| Birthday Cake Candles   | Maximum & frequency tracking |       O(N) |            O(1) |
| Insertion Sort – Part 1 | Element shifting             |       O(N) |            O(1) |
| Binary Search / BST     | BST-based search             |       O(H) |            O(1) |
| Mark and Toys           | Greedy + sorting             | O(N log N) |           O(1)* |

---

# Reflection

Through this activity, I gained practical experience in solving algorithmic problems and understanding how the choice of an algorithm affects efficiency. The five problems introduced me to several important techniques, including array traversal, minimum and maximum tracking, counting, insertion-based sorting, tree searching, and greedy algorithms. I learned that a problem does not always require sorting; for example, the Mini-Max Sum and Birthday Cake Candles problems can be solved efficiently using a single traversal with constant auxiliary space. The Insertion Sort problem helped me understand how elements can be shifted to insert a value into its correct position. Working with a Binary Search Tree helped me understand how its ordering property can reduce unnecessary searching. The Mark and Toys problem demonstrated how sorting combined with a greedy strategy can maximize the number of items purchased within a fixed budget. Implementing these solutions in Java also improved my understanding of loops, recursion, lists, classes, and methods. Finally, uploading the solutions to GitHub helped me practice organizing source code, documenting algorithms, and maintaining a coding portfolio. Completing and getting all five solutions accepted on HackerRank gave me confidence in applying fundamental algorithms to programming problems.

---

# Conclusion

This portfolio demonstrates my implementation and analysis of five algorithmic problems using Java. All five required solutions were successfully accepted on HackerRank, and the repository provides organized source code along with complexity analysis and explanations.

**Student:** Pranav Ethapay
**USN:** R25EQ058
**Semester:** 3rd Semester
**Language:** Java
