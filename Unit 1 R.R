# Long Vy
# Unit 1 R

num1 <- as.numeric(readline(prompt = "Please enter your first number: "))
num2 <- as.numeric(readline(prompt = "Please enter your second number: "))
num3 <- as.numeric(readline(prompt = "Please enter your third number: "))

sumTotal <- num1 + num2 + num3
avgTotal <- sumTotal / 3
 
cat("\n", "The sum of the three numbers is: ", sumTotal, "\n")
cat("The average of the three numbers is: ", avgTotal, "\n")


