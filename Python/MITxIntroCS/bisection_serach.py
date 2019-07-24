print('Please think of a number between 0 and 100!')

# At the start of the highest number could be 100 and the lowest is 0
high = 100
low = 0
guessed = False

# Loop until we guessed it correctly!
while not guessed:
    # Bisection search: guess the midpoint of our current high and low guesses
    guess = (high + low) // 2
    print('Is your secret number ' + str(guess) + "?")
    user_inp = input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly.")

    if user_inp == 'c':
        # We got it right!
        guessed = True
    elif user_inp == 'h':
        # Guess was too high. make it our current high value
        high = guess
    elif user_inp == 'l':
        # Guess was too low. make it our current low value
        low = guess
    else:
        print('Sorry, I did not understand your input.')

print('Game over. Your secret number was: ', str(guess))