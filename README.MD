# JaCoCo counters #
 **INSTRUCTION**: The amount of code that can be executed or missed.
 
 **LINE**: Executed when at least one instruction that is assigned to this line has been executed.
* No coverage: No instruction in the line has been executed (red background)
* Partial coverage: Only a part of the instruction in the line have been executed (yellow background)
* Full coverage: All instructions in the line have been executed (green background)
 
 **BRANCH**: The total number of branches (if and switch statements) in a method that can be executed or missed.
 * No coverage: No branches in the line has been executed (red diamond)
 * Partial coverage: Only a part of the branches in the line have been executed (yellow diamond)
 * Full coverage: All branches in the line have been executed (green diamond)
 
 **COMPLEXITY**: It used for each non-abstract method and summarizes complexity for classes, packages and groups. Cyclomatic complexity is the minimum number of paths that can, in (linear) combination, generate all possible paths through a method. Thus the complexity value can serve as an indication for the number of unit test cases to fully cover a certain piece of software. Complexity figures can always be calculated, even in absence of debug information in the class files.
 