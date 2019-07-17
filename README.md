# refactoring_step_by_step

1. export `getAge()` package-private method.
2. replace usages of `driver.age` to `driver.getAge()`
3. make `age` be private in `Driver`.
4. simplify if-else in `Policy`'s `checkDriver` function.
5. extract constance of `18` as `MIN_ADULT_AGE`.
6. rename `checkDriver` to `isAdulthood`.  

