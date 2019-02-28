// Last loop value
// What is the last value alerted by this code? Why?

let i = 3;

while (i) {
  alert( i-- );
} // 1

// The answer: 1.

//  let i = 3;

// while (i) {
//   alert( i-- );
// }
// Every loop iteration decreases i by 1. The check while(i) stops the loop when i = 0.

// Hence, the steps of the loop form the following sequence (“loop unrolled”):

// let i = 3;

// alert(i--); // shows 3, decreases i to 2

// alert(i--) // shows 2, decreases i to 1

// alert(i--) // shows 1, decreases i to 0

// // done, while(i) check stops the loop


// Which values shows the while?
// For every loop, write down which values it shows, in your opinion. And then compare with the answer.

// Both loops alert same values or not?

// The prefix form ++i:
let i = 0;
while (++i < 5) alert( i ); // 1, 2, 3, 4

// The postfix form i++
let i = 0;
while (i++ < 5) alert( i ); // 1, 2, 3, 4, 5


// Which values get shown by the "for" loop?
// For each loop write down which values it is going to show. Then compare with the answer.

// Both loops alert same values or not?

// The postfix form:
for (let i = 0; i < 5; i++) alert( i ); // 0, 1, 2, 3, 4

// The prefix form:
for (let i = 0; i < 5; ++i) alert( i ); // 0, 1, 2, 3, 4

// The answer: from 0 to 4 in both cases.

//  for (let i = 0; i < 5; ++i) alert( i );

// for (let i = 0; i < 5; i++) alert( i );
// That can be easily deducted from the algorithm of for:

// Execute once i = 0 before everything (begin).
// Check the condition i < 5
// If true – execute the loop body alert(i), and then i++
// The increment i++ is separated from the condition check (2). That’s just another statement.

// The value returned by the increment is not used here, so there’s no difference between i++ and ++i.



// Output even numbers in the loop
// Use the for loop to output even numbers from 2 to 10.

for (let i = 2; i < 11; i += 2) alert(i);


// Rewrite the code changing the for loop to while without altering its behavior (the output should stay same).

 for (let i = 0; i < 3; i++) {
  alert( `number ${i}!` );
}

// while 
let j = 0;

while(j < 3) {
  alert( `number ${j}!` );
  j++;
}


// Repeat until the input is correct
// Write a loop which prompts for a number greater than 100. If the visitor enters another number – ask them to input again.

// The loop must ask for a number until either the visitor enters a number greater than 100 or cancels the input/enters an empty line.

// Here we can assume that the visitor only inputs numbers. There’s no need to implement a special handling for a non-numeric input in this task.

do {
  input = prompt("Number");
} while(input < 100 && input)

// The loop do..while repeats while both checks are truthy:

// The check for num <= 100 – that is, the entered value is still not greater than 100.
// The check && num is false when num is null or a empty string. Then the while loop stops too.
// P.S. If num is null then num <= 100 is true, so without the 2nd check the loop wouldn’t stop if the user clicks CANCEL. Both checks are required.


// Output prime numbers
// An integer number greater than 1 is called a prime if it cannot be divided without a remainder by anything except 1 and itself.

// In other words, n > 1 is a prime if it can’t be evenly divided by anything except 1 and n.

// For example, 5 is a prime, because it cannot be divided without a remainder by 2, 3 and 4.

// Write the code which outputs prime numbers in the interval from 2 to n.

// For n = 10 the result will be 2,3,5,7.

// P.S. The code should work for any n, not be hard-tuned for any fixed value.

let n = 10;

nextPrime:
for (let i = 2; i <= n; i++) { // for each i...

  for (let j = 2; j < i; j++) { // look for a divisor..
    if (i % j == 0) continue nextPrime; // not a prime, go next i
  }

  alert( i ); // a prime
}