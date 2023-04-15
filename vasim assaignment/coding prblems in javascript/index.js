//### 1)FIND THE DUBLICATE VALUE IN A ARRAY
// let arr = [1, 2, 3, 4, 5, 5, 5, 4, 2, 1];
// function removeDuplicate(arr) {
//   return [...new Set(arr)];
// }
// console.log(removeDuplicate(arr));

// ###3)Reversing letters and words
// function reverseString(string) {
//   var newstring = "";
//   for (let i = string.length - 1; i >= 0; i--) {
//     newstring += string[i];
//   }
//   return newstring;
// }
// console.log(reverseString("tentacle technology"));

// ###4)Checking whether a string contains only digits

// function containsOnlyDigits(str) {
//   return /^\d+$/.test(str);
// }

// // Usage example
// console.log(containsOnlyDigits("12345")); // true
// console.log(containsOnlyDigits("12a345")); // false

// 5)Counting vowels and consonants
// function countVowelsAndConsonants(str) {
//   let vowelsCount = 0;
//   let consonantsCount = 0;
//   str = str.toLowerCase();
//   for (let i = 0; i < str.length; i++) {
//     let char = str[i];

//     if (
//       char == "a" ||
//       char == "e" ||
//       char == "i" ||
//       char == "o" ||
//       char == "u"
//     ) {
//       vowelsCount++;
//     } else if (char >= "a" && char <= "z") {
//       consonantsCount++;
//     }
//   }
//   return { vowels: vowelsCount, consonants: consonantsCount };
// }
// let result = countVowelsAndConsonants("Hello World!");
// console.log(result);

// 6)Counting occurrences of a certain character:
// let str = "Hello world";
// let char = "l";
// let count = str.split(char).length - 1;
// console.log(count);

// 8)Removing white spaces from a string
// let str = "   remove    all   spaces   ";
// str = str.trim();
// console.log(str);

// 11)Checking whether a string is a palindrome:

// function isPalindrome(str) {
//   return str === str.split("").reverse().join("");
// }
// console.log(isPalindrome("malayalam"));
// console.log(isPalindrome("hello"));

// 12)removing dublicate charecters
// const string = "malayalam";
// const uniqueString = [...new Set(string)].join("");
// console.log(uniqueString);

// 13)removing given character

// const str = "wasim aslam";
// const charsToRemove = "a";
// let result = "";
// for (let i = 0; i < str.length; i++) {
//   if (!charsToRemove.includes(str[i])) {
//     result += str[i];
//   }
// }
// console.log(result);

// 15)Sorting an array of strings by length

// const strings = [
//   "apple",
//   "wasumaslam",
//   "banana",
//   "cherry",
//   "date",
//   "elderberry",
// ];
// strings.sort((a, b) => a.length - b.length);
// console.log(strings);

//  7)Converting String into int, long, float, or double
// const variable = "108";
// let integernumber = parseFloat(variable); //float
// console.log(integernumber);

// let numberint = "1000000000000000000"; //long
// let longNumber = BigInt(numberint);
// console.log(longNumber);

// let numberdouble = "1000000000000000000";
// let doubleNumber = Number(numberdouble); //double
// console.log(doubleNumber);

// let stringNumber = "10";
// let integerNumber = parseInt(stringNumber); //int
// console.log(integerNumber);

// 9)Joining multiple strings with a delimiter
// const strings = ["wasim", "aslam", "satrhish"];
// const delimiter = "+ ";
// const result = strings.join(delimiter);
// console.log(result);
