// Syntax check
// What is the result of this code?

let user = {
  name: "John",
  go: function() { alert(this.name) }
}

(user.go)()

// P.S. There’s a pitfall :)

// Error!

// Try it:

 let user = {
  name: "John",
  go: function() { alert(this.name) }
}

(user.go)() // error!

// The error message in most browsers does not give understanding what went wrong.

// The error appears because a semicolon is missing after user = {...}.

// JavaScript does not assume a semicolon before a bracket (user.go)(), so it reads the code like:

// let user = { go:... }(user.go)()
// Then we can also see that such a joint expression is syntactically a call of the object { go: ... } as a function with the argument (user.go). And that also happens on the same line with let user, so the user object has not yet even been defined, hence the error.

// If we insert the semicolon, all is fine:

  let user = {
  name: "John",
  go: function() { alert(this.name) }
};

(user.go)() // John

// Please note that brackets around (user.go) do nothing here. Usually they setup the order of operations, but here the dot . works first anyway, so there’s no effect. Only the semicolon thing matters.



// Explain the value of "this"
// In the code below we intend to call user.go() method 4 times in a row.

// But calls (1) and (2) works differently from (3) and (4). Why?

let obj, method;

obj = {
  go: function() { alert(this); }
};

obj.go();               // (1) [object Object]

(obj.go)();             // (2) [object Object]

(method = obj.go)();    // (3) undefined

(obj.go || obj.stop)(); // (4) undefined



// Using "this" in object literal
// Here the function makeUser returns an object.

// What is the result of accessing its ref? Why?

function makeUser() {
  return {
    name: "John",
    ref: this
  };
};

let user = makeUser();

alert( user.ref.name ); // What's the result?


// Answer: an error.

// Try it:

 function makeUser() {
  return {
    name: "John",
    ref: this
  };
};

let user = makeUser();

alert( user.ref.name ); // Error: Cannot read property 'name' of undefined

// That’s because rules that set this do not look at object literals.

// Here the value of this inside makeUser() is undefined, because it is called as a function, not as a method.

// And the object literal itself has no effect on this. The value of this is one for the whole function, code blocks and object literals do not affect it.

// So ref: this actually takes current this of the function.

// Here’s the opposite case:

function makeUser() {
  return {
    name: "John",
    ref() {
      return this;
    }
  };
};

let user = makeUser();

alert( user.ref().name ); // John

// Now it works, because user.ref() is a method. And the value of this is set to the object before dot ..



// Create a calculator
// Create an object calculator with three methods:

// read() prompts for two values and saves them as object properties.
// sum() returns the sum of saved values.
// mul() multiplies saved values and returns the result.

let calculator = {
  // ... your code ...
};

calculator.read();
alert( calculator.sum() );
alert( calculator.mul() );


// Answer
let calculator = {
  sum() {
    return this.a + this.b;
  },

  mul() {
    return this.a * this.b;
  },

  read() {
    this.a = +prompt('a?', 0);
    this.b = +prompt('b?', 0);
  }
};

calculator.read();
alert( calculator.sum() );
alert( calculator.mul() );



// Chaining
// There’s a ladder object that allows to go up and down:

let ladder = {
  step: 0,
  up() {
    this.step++;
  },
  down() {
    this.step--;
  },
  showStep: function() { // shows the current step
    alert( this.step );
  }
};

// Now, if we need to make several calls in sequence, can do it like this:

ladder.up();
ladder.up();
ladder.down();
ladder.showStep(); // 1

// Modify the code of up and down to make the calls chainable, like this:

ladder.up().up().down().showStep(); // 1
// Such approach is widely used across JavaScript libraries.


// The solution is to return the object itself from every call.

let ladder = {
  step: 0,
  up() {
    this.step++;
    return this;
  },
  down() {
    this.step--;
    return this;
  },
  showStep() {
    alert( this.step );
    return this;
  }
}

ladder.up().up().down().up().down().showStep(); // 1
// We also can write a single call per line. For long chains it’s more readable:

ladder
  .up()
  .up()
  .down()
  .up()
  .down()
  .showStep(); // 1