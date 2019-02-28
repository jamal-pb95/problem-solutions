// Will alert be shown?

if ("0") {
  alert( 'Hello' );  // Hello
}


// The name of JavaScript
// Using the if..else construct, write the code which asks: ‘What is the “official” name of JavaScript?’

// If the visitor enters “ECMAScript”, then output “Right!”, otherwise – output: “Didn’t know? ECMAScript!”

let value = prompt("What is the official name of JavaScript?");

if(value === "ECMAScript") {
  alert("Right");
} else {
  alert("You Don't know? ECMAScript!");
}


// Show the sign
// Using if..else, write the code which gets a number via prompt and then shows in alert:

// 1, if the value is greater than zero,
// -1, if less than zero,
// 0, if equals zero.
// In this task we assume that the input is always a number.

let number = Number(prompt("Input an integer value!"));

if(number > 0) alert(1);
else if (number < 0) alert(-1);
alert(0);


// Check the login
// Write the code which asks for a login with prompt.

// If the visitor enters "Admin", then prompt for a password, if the input is an empty line or Esc – show “Canceled.”, if it’s another string – then show “I don’t know you”.

// The password is checked as follows:

// If it equals “TheMaster”, then show “Welcome!”,
// Another string – show “Wrong password”,
// For an empty string or cancelled input, show “Canceled.”


// Please use nested if blocks. Mind the overall readability of the code.

// Hint: passing an empty input to a prompt returns an empty string ''. Pressing ESC during a prompt returns null.

let user = prompt("Enter your ID");

if(user === "Admin") {
  let pass = prompt("Enter password");

  if(pass === "TheMaster") {
    alert("Welcome!");
  } else {
    alert("Wrong password");
  }
} else if(user === "" || user === null) {
  alert("Canceled");
} else {
  alert("I don't know you");
}

// Rewrite this if using the ternary operator '?':

if (a + b < 4) {
  result = 'Below';
} else {
  result = 'Over';
}

// ternary
result = a + b < 4 ? "Below" : "Over";


// Rewrite 'if..else' into '?'
// Rewrite if..else using multiple ternary operators '?'.

// For readability, it’s recommended to split the code into multiple lines.

let message;

if (login == 'Employee') {
  message = 'Hello';
} else if (login == 'Director') {
  message = 'Greetings';
} else if (login == '') {
  message = 'No login';
} else {
  message = '';
}

// ternary
message = login === 'Employee' ? 'Hello' :
          login === 'Director' ? 'Greetings' :
          login === '' ? 'No login' : '';
