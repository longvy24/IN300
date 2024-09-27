## Long Vy
## Unit 2 Python

"""
Items 1-3

grade = int(input("Please enter your score: "))

if grade >= 90 and grade <= 100:
   print("Your letter grade is: A" ) 
elif grade >= 80 and grade <= 89:
    print("Your letter grade is: B")
elif grade >= 70 and grade <= 79:
    print("Your letter grade is: C")
elif grade >= 60 and grade <= 69:
    print("Your letter grade is: D")
else: 
    print("Your letter grade is: F")
    
""" 

"""Items 4-6"""

print("**********************************")
print("*    1. Science Fiction          *")
print("*    2. Computer and Technology  *")
print("*    3. Cooking                  *")
print("*    4. Business                 *")
print("*    5. Comics                   *")
print("*    6. Exit                     *")
print("**********************************""\n")

choice = 0

while choice != 6:
    choice = int (input("Please make a choice (1-6): "))
    
    if choice == 1:
            print("You have selected Science Fiction. Watch out for the Aliens")
    elif(choice == 2):
            print("You have selected Computers and Technology. Don't listen to the Matrix")
    elif(choice == 3):
            print("You have selected Cooking. Cook me something first.")
    elif(choice == 4):
            print("You have selected Business. Business is business")
    elif(choice == 5):
            print("You have selected Comics. DC or Marvel?")
    elif(choice == 6):
            print("Exit Program")
    else:
            print("ERROR! Please enter a valid choice. (1-6)")

