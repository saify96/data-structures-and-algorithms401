## Challenge Summary
Write the Implementation for the quick Sort algorithm and test your implementation so you will be able to give your method an unordered array and return an ordered array
## White Board
<img src="wb.jpg" width="900"/>

## Code
- quickSort, partition and swap methods.

<img src="code.jpg" width="400"/>

## Trace
- pass the array to the quickSort function with the left and right (the idx of the first and the last elements)
- call the partition method so it will assume the pivot= 15 is the largest number
- compare the pivot with the elements of the array starting from left
- when we find element larger than 15 we will save it's idx (low)
- swap the pivot with the larger value and return the new position of the pivot

<img src="1.jpg" width="300"/>

- recursive call for the quickSort and pass to it the segment before the new posistion
- recursive call for the quickSort and pass to it the segment after the new posistion

<img src="2.jpg" width="300"/>

- after we finish the sort for the both segments we will get the orderd array

<img src="3.jpg" width="300"/>


## Approach & Efficiency
- Space O(log(n))
- Time O(nlog(n))
