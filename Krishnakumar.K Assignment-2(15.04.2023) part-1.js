//ASSIGNMENT-2 (15.04.2023) name  krishnakumar.k
//1.	Counting duplicate characters: Write a program that counts duplicate characters from a given string.

let str = "tentacle";

let count = 0;

for (let i = 0; i < str.length - 1; i++) {
  for (let j = i + 1; j < str.length; j++) {
    if (str[i] === str[j]) {
      count++;
    }
  }
}

console.log("Number of duplicate characters in the string: " + count);

//2.	Finding the first non-repeated character: Write a program that returns the first non-repeated character from a given string.
function firstnonRepeatedCharacter(string) {
  for (let i = 0; i < string.length; i++) {
    let c = string.charAt(i);
    if (string.indexOf(c) == i && string.indexOf(c, i + 1) == -1) {
      return c;
    }
  }
  return null;
}

console.log(firstnonRepeatedCharacter("aabbccd")); // output: d
//3.	Reversing letters and words: Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.
function reverseLetters(string) {
  let words = string.split(" ");
  let reversedString = "";
  for (let word of words) {
    let reversedWord = "";
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i];
    }
    reversedString += reversedWord + " ";
  }
  return reversedString;
}

console.log(reverseLetters("tentacle"));

//4.	Checking whether a string contains only digits: Write a program that checks whether the given string contains only digits.
function StringDigit(str) {
  return /^\d+$/.test(str);
}

console.log(StringDigit("123456")); // true
console.log(StringDigit("453534")); //true
//5.	Counting vowels and consonants: Write a program that counts the number of vowels and consonants in a given string. Do this for the English language, which has five vowels (a, e, i, o, and u).
let string = "tentacle";
let Vowel = 0;
let Consonant = 0;

for (let i = 0; i < string.length; i++) {
  let char = string.charAt(i).toLowerCase();
  if (char == "a" || char == "e" || char == "i" || char == "o" || char == "u") {
    Vowel++;
  } else if (char >= "a" && char <= "z") {
    Consonant++;
  }
}

console.log("Number of vowels: " + Vowel);
console.log("Number of consonants: " + Consonant);
//6.	Counting occurrences of a certain character: Write a program that counts the occurrences of a certain character in a given string.
function countChar(str, char) {
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str.charAt(i) == char) {
      count++;
    }
  }
  return count;
}

let myString = "tentacle";
let myChar = "l";

let charCount = countChar(myString, myChar);

console.log(
  "The character " +
    myChar +
    " appears " +
    charCount +
    " times in " +
    myString +
    "."
);

//7.	Converting String into int, long, float, or double: Write a program that converts the given String object (representing a number) into int, long, float, or double.

//Converting String to int
let strings = "123";
let intValue = parseInt(strings);
console.log("String to int: " + intValue);
console.log(typeof intValue);

//Converting String to long
let longValue = parseInt(strings, 10);
console.log("String to long: " + longValue);
console.log(typeof longValue);

//Converting String to float
let floatValue = parseFloat(strings);
console.log("String to float: " + floatValue);
console.log(typeof floatValue);

//Converting String to double
let doubleValue = parseFloat(strings);
console.log("String to double: " + doubleValue);
console.log(typeof doubleValue);

//8. Removing white spaces from a string: Write a program that removes all white spaces from the given string. using java script.

const removeWhiteSpaces = (str) => {
  return str.replace(/\s/g, "");
};

console.log(removeWhiteSpaces("Tentacle tech nology"));

//11. Checking whether a string is a palindrome: Write a program that determines whether the given string is a palindrome or not.
function isPalindrome(str) {
  var reversedString = str.split("").reverse().join("");
  return str == reversedString;
}

console.log(isPalindrome("racecar")); // true
console.log(isPalindrome("hello")); // false

//12. Removing duplicate characters: Write a program that removes the duplicate characters from the given string.
function removeDuplicates(string) {
  let samestring = "";

  for (let i = 0; i < string.length; i++) {
    if (samestring.indexOf(string[i]) == -1) {
      samestring += string[i];
    }
  }

  return samestring;
}

console.log(removeDuplicates("tentaclete"));

//13. Removing given characters: Write a program that removes the given character from the given string.
function removeChar(str, char) {
  return str.replace(new RegExp(char, "gi"), "");
}

console.log(removeChar("duplicate", "d"));

//15. Sorting an array of strings by length: Write a program that sorts by the length of the given array of strings.
let array = ["cocanet", "apple", "mangos", "cat", "dogs"];

array.sort(function (a, b) {
  return a.length - b.length;
});

console.log(array);

//basic arithmatic problems

//  1) basic arithemetic operators?
let m = 3;
let n = 4;
let ans = ((n * m) / 2) % 7;
console.log(ans);

// 4)prime number
function isPrime(num) {
  if (num <= 1) return false;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}
console.log(isPrime(7));

//total 14 questions out of 30
