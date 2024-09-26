## Long Vy
## Unit 2 R



# Items 1-3

# Get user input for the score
# grade <- as.numeric(readline(prompt = "Please Enter Score: "))

# Determine the letter grade using if/else statements
# if (grade >= 90 && grade <= 100) {
#    print("Your letter grade is: A")
# } else if (grade >= 80 && grade <= 89) {
#    print("Your letter grade is: B")
# } else if (grade >= 70 && grade <= 79) {
#    print("Your letter grade is: C")
# } else if (grade >= 60 && grade <= 69) {
#    print("Your letter grade is: D")
# } else {
#    print("Your letter grade is: F")
# }



cat("***********************************\n")
cat("*    1. Science Fiction         *\n*")
cat("     *   2. Computer and Technology  *\n")
cat("*    3. Cooking                  *\n")
cat("*    4. Business                 *\n")
cat("*    5. Comics                   *\n")
cat("*    6. Exit                     *\n")
cat("**********************************\n")

choice <- as.numeric(readline(prompt = "Please enter a choice (1-6)"))
