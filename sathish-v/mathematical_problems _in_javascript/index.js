// basic arithemetic operators (question 1)
let m = 5;
let n = 5;
let value = ((n * m) / 2) % 7;
console.log(value);

// to check odd or even  (Exercise 1)
const number = 5;

if (number % 2 === 0) {
  console.log("The number is even.");
} else {
  console.log("The number is odd.");
}

//roman Numbers
function romanToInt(s) {
  const romanValues = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  let result = 0;

  for (let i = 0; i < s.length; i++) {
    const currentValue = romanValues[s[i]];
    const nextValue = romanValues[s[i + 1]];

    if (nextValue && nextValue > currentValue) {
      result -= currentValue;
    } else {
      result += currentValue;
    }
  }

  return result;
}
console.log(romanToInt("III"));

//Armstrong Numbers

function isArmstrongNumber(num) {
  const numString = num.toString();
  const numDigits = numString.length;
  let sum = 0;

  for (let i = 0; i < numDigits; i++) {
    const digit = parseInt(numString[i]);
    sum += Math.pow(digit, numDigits);
  }

  return sum === num;
}
console.log(isArmstrongNumber(153));
