// What's the result of OR?
// What the code below is going to output?

alert( null || 2 || undefined ); // 2


// What's the result of OR'ed alerts?
// What the code below will output?

alert( alert(1) || 2 || alert(3) ); // 1 => 2


// What is the result of AND?
// What this code is going to show?

alert( 1 && null && 2 ); // null


// What is the result of AND'ed alerts?
// What will this code show?

alert( alert(1) && alert(2) ); // 1 => undefined

// The call to alert returns undefined (it just shows a message, so there’s no meaningful return).

// Because of that, && evaluates the left operand (outputs 1), and immediately stops, because undefined is a falsy value. And && looks for a falsy value and returns it, so it’s done.


// The result of OR AND OR
// What will be the result?

alert( null || 2 && 3 || 4 ); // 

// The answer: 3.

//  alert( null || 2 && 3 || 4 );
// The precedence of AND && is higher than ||, so it executes first.

// The result of 2 && 3 = 3, so the expression becomes:

// null || 3 || 4
// Now the result is the first truthy value: 3.


// Check the range between
// Write an “if” condition to check that age is between 14 and 90 inclusively.

// “Inclusively” means that age can reach the edges 14 or 90.

let age;

if(age > 13 && age < 91) {
  alert('OK');
}


// Check the range outside
// Write an if condition to check that age is NOT between 14 and 90 inclusively.

// Create two variants: the first one using NOT !, the second one – without it.

let age2;
if(age2 < 14 || age2 > 90) alert('Ok');

// OR

let age3;
if(!(age3 >= 14 && age3 <= 90)) alert('Ok');


// A question about "if"
// Which of these alerts are going to execute?

// What will be the results of the expressions inside if(...)?

if (-1 || 0) alert( 'first' );
if (-1 && 0) alert( 'second' );
if (null || -1 && 1) alert( 'third' );


// The answer: the first and the third will execute.
// Details:

// Runs.
// The result of -1 || 0 = -1, truthy
if (-1 || 0) alert( 'first' );

// Doesn't run
// -1 && 0 = 0, falsy
if (-1 && 0) alert( 'second' );

// Executes
// Operator && has a higher precedence than ||
// so -1 && 1 executes first, giving us the chain:
// null || -1 && 1  ->  null || 1  ->  1
if (null || -1 && 1) alert( 'third' );