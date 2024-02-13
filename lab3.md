# Lab Report 3 - Bugs and Commands

## *Part1 - Bugs*
There are different bugs in our week4 lab activity and this lab report will address bugs in ```ArrayExamples.java```\n
Failure-inducing input:
```
  @Test
  public void testReversedInPlace_invalid() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
  }
```
Input that doesn't induce a failure
```
  @Test
  public void testReversedInPlace_valid() {
    int[] input1 = {1,2,2,1};
      ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,2,1}, input1);
  }
```
Symptom:
![symptom](./screenshots/p1-lab3.png)
Bug:
Before:
```
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
After:
```
  static void reverseInPlace(int[] arr) {
    int temp = 0;
    for(int i = 0; i < arr.length/2; i += 1) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length-i-1] = temp;
    }
  }

```
Before the fix, the program does not swap values at indexs so values lost in the loop.
After the fix, the value being swapped is temporally saved to a variable so that swapping is done successfully.

## *Part2 - Researching Commands*
