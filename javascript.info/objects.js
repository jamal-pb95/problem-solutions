// Hello, object
// Write the code, one line for each action:

// Create an empty object user.
// Add the property name with the value John.
// Add the property surname with the value Smith.
// Change the value of the name to Pete.
// Remove the property name from the object.

const user = {};
user.name = 'John';
user.surename = 'Smith';
user.name = 'Pete';
delete user.name;



// Check for emptiness
// Write the function isEmpty(obj) which returns true if the object has no properties, false otherwise.

// Should work like that:

let schedule = {};

alert( isEmpty(schedule) ); // true

schedule["8:30"] = "get up";

alert( isEmpty(schedule) ); // false


// answer
function isEmpty(obj) {
  return Object.keys(obj).length === 0;
}

// ES6
const isEmpty = (obj) => Object.keys(obj).length === 0;



// Constant objects?
// Is it possible to change an object declared with const, how do you think?

const user = {
  name: "John"
};

// does it work?
user.name = "Pete";

// Yes it is possible



// Sum object properties
// We have an object storing salaries of our team:

let salaries = {
  John: 100,
  Ann: 160,
  Pete: 130
}

// Write the code to sum all salaries and store in the variable sum. Should be 390 in the example above.

// If salaries is empty, then the result must be 0.

const sum = obj => Object.values(obj).reduce((acc, cur) => acc + cur, 0);


// Multiply numeric properties by 2
// Create a function multiplyNumeric(obj) that multiplies all numeric properties of obj by 2.

// For instance:

// before the call
let menu = {
  width: 200,
  height: 300,
  title: "My menu"
};

multiplyNumeric(menu);

// after the call
menu = {
  width: 400,
  height: 600,
  title: "My menu"
};

// Please note that multiplyNumeric does not need to return anything. It should modify the object in-place.

// P.S. Use typeof to check for a number here.

function multiplyNumeric(obj) {
  for (let key in obj) {
    if (typeof obj[key] == 'number') {
      obj[key] *= 2;
    }
  }
}