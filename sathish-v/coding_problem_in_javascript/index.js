//Reversing letters and words: (3rd question)
let words = "sathish mani wasim";
function namess(wordss) {
  var revesing = "";
  for (let j = wordss.length - 1; j >= 0; j--) {
    revesing += wordss[j];
  }
  return revesing;
}
console.log(namess(words));

//Checking whether a string contains only digits:  (4 th question)

function containsOnlyDigits(str) {
  for (let i = 0; i < str.length; i++) {
    if (str[i] < "0" || str[i] > "9") {
      return false;
    }
  }
  return true;
}

console.log(containsOnlyDigits("1234")); // true
console.log(containsOnlyDigits("abc123")); // false

// Counting vowels and consonants: (5th qution)

let text = "aed  D dd";
text = text.toLowerCase();
text = text.split(" ").join("");
let vowels = 0;
let consonants = 0;
for (let kow of text) {
  let results = "aeiou".includes(kow) ? (vowels += 1) : (consonants += 1);
}
console.log(`vowelcount:${vowels} consonantCount:${consonants}`);
//Counting occurrences of a certain character:  (question 6)

let str = "Hello world";
let char = "l";
let count = 0;
for (let i = 0; i < str.length; i++) {
  if (str[i] === char) {
    count++;
  }
}
console.log(count);

//Removing white spaces from a string: (question 8)

let prg = "the term oject mean by goal to be achieved.";
let ans = prg.split(" ").join("");
console.log(ans);

// Joining multiple strings with a delimiter (question 9)
const strings = ["hello", "every", "one"];
const delimiter = "+ ";
const result = strings.join(delimiter);
console.log(result);

// Checking whether a string is a palindrome (question 11)

function isPalindrome(str) {
  return str === str.split("").reverse().join("");
}
console.log(isPalindrome("malayalam"));
console.log(isPalindrome("amma"));

//Removing given characters  (question 13)

let sss = "Hello how are sathish im fine  world!";
let charsToRemove = "a";
let newStr = sss
  .split("")
  .filter((char) => !charsToRemove.includes(char))
  .join("");
console.log(newStr);

function ddd(...sathish) {
  for (let sss of sathish) {
    console.log(sss);
  }
}
ddd("sathish", "dfsf");

// Sorting an array of strings by length (question 15)

const word = ["apple", "wasumaslam", "banana", "cherry", "date", "elderberry"];
word.sort((a, b) => a.length - b.length);
console.log(word);

//Counting duplicate characters (question 1)

let strs = "tentacle";

let counte = 0;

for (let i = 0; i < strs.length - 1; i++) {
  for (let j = i + 1; j < strs.length; j++) {
    if (strs[i] === strs[j]) {
      counte++;
    }
  }
}

console.log("Number of duplicate characters in the string: " + counte);
