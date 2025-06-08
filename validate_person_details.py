
# The program must accept the name and age of a person as the input.
# If the length of the name is greater than 20, then the program must raise the exception
# MaximumLengthExceededException with the message:
# "name cannot contain more than 20 characters".

# If the value of the age is 0 or negative, then the program must raise the exception
# NegativeValueException with the message:
# "age cannot be negative or zero"

# Otherwise, the program must print the name and age of the person as the output.

# Please fill in the missing lines of code so that the program runs successfully.


# Example 1
# Input:  
# Hector  
# 30  

# Output:  
# Hector 30
# Example 2

# Input:  
# Catherine  
# -25  

# Output:  
# age cannot be negative or zero

# Example 3
# Input:  
# Abcdef Ghijklmnopqrst  
# -10  

# Output:  
# name cannot contain more than 20 characters


class MaximumLengthExceededException(Exception):
    pass

class NegativeValueException(Exception):
    pass

name = input().strip()
age = int(input().strip())
try:
    if len(name) > 20:
        raise MaximumLengthExceededException("name cannot contain more than 20 characters")
    if age<=0:
        raise NegativeValueException("age cannot be negative or zero")
    print(name,age)
except (MaximumLengthExceededException, NegativeValueException) as e:
    print(e)