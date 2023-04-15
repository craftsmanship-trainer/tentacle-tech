/*Write a program that determines whether the given string is a palindrome or not.
*/
function isPalindrome(str) {
    str = str.toLowerCase().replace(/[^a-z0-9]/g, "");
    
    return str === str.split("").reverse().join("");
  }
  
  const str1 = "A man, a plan, a canal, Panama!";
  const str2 = "not a palindrome";
  console.log(isPalindrome(str1)); 
  console.log(isPalindrome(str2)); 
  