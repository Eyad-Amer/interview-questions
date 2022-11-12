import string

#---------------------------------------
# A password is said to be strong if it satisfies all the following criteria:

# It has at least 8 characters.
# It contains at least one lowercase letter.
# It contains at least one uppercase letter.
# It contains at least one digit.
# It contains at least one special character. 
#  special characters: !@#$%^&*()-+
# It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).

# Given a string password, return true if it is a strong password. Otherwise, return false
#---------------------------------------
 
def StrongPasswordChecker(password: str):
    '''
    :type password: str
    :rtype: bool
    '''

    lower = upper = digit = special = False # bool
    
    for i in range (0, len(password)):
         # if the length of the password less then 8 or it's null
        if (len(password) < 8) or not password:
            return False
        
        # if it contain 2 of the same character in adjacent positions
        if i != len(password)-1 and password[i] ==  password[i+1]:
            return False

        # if the password contain a lowercase letter
        if password[i].islower():
            lower = True

        # if the password contain a uppercase letter
        if password[i].isupper():
            upper = True

        # if the password contain a digit
        if password[i].isdigit():
            digit = True

        # if the password contain a special character
        if any((c in "!@#$%^&*()-+") for c in password[i]):
            special = True

    if lower and upper and digit and special:
        return True

    return False
      

# main function
if __name__ == '__main__':
    print(StrongPasswordChecker("abG7adE7+"))



