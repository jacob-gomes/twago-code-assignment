# Installing & Running Code

## Prerequisites:

#### Ensure jdk 1.8 is set in your class path
#### Clone the project to your local machine 


## Running the code on Windows(recomended):

#### Open command prompt navigate to twago-code-assignment
#### > compile_and_run_application.bat

## Running the code on linux:
#### Open command prompt navigate to twago-code-assignment
#### $ chmod +x compile_and_run_application.sh
#### $ compile_and_run_application.sh

# Algorithm Choice

## Question: please also highlight possible algorithmdesign tradeoffs and elaborate, why you choose your approach and maybe also what other solutions are possible

There were three possible ways I could solve the issue, 
Depending on their O(n) I categorized it into HIGHEST_COMPLEXITY, MEDIUM_COMPLEXITY and LOWEST_COMPLEXITY:
	
	1. HIGHEST_COMPLEXITY :
		(Implentation class - SolutionComplexityProductOfYAndMaxRange)
		The highest complexity solution has implementation of the most simplest algorithm for solving the problem. The implementation has O(n) = O(Y* (Highest difference of between i and j)). 
		
	2. MEDIUM_COMPLEXITY :
		(Implentation class - SolutionComplexitySumOfXAndY)
		The medium complexity solution has a complexity of O(n) = O(X + Y)
	
	3. LOWEST_COMPLEXITY:
		(Implentation class - SolutionComplexityProductOfYAndLogY)
		The lowest complexity solution has a complexity of O(n) = O(Y * logY)

It can be disputed that the solution with O(X + Y) is most efficient.
That is true only when the range of X and Y are almost same.

But in the task given the range of X is [1 , 10 ^7] and that of Y is  [ 1 , 2 * 10^5]

So in worst case scenario X + Y will yeild a number that is of the order 10^7
Whereas in the worst case scenario  Y * Log(Y) will yield a number of the order 10^5 (2.3* 10^5 to be precise)

Thus the later is most efficient in the given scenario.
