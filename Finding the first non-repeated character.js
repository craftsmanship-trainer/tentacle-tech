/*
 Write a program that returns the first non-repeated character from a given string.
*/

function firstNonRepeatedCharacter(str) {
    const charCount = {}; 
    for (let i = 0; i < str.length; i++) {
      const char = str[i];
      charCount[char] = (charCount[char] || 0) + 1;
    }
    
    
    for (let i = 0; i < str.length; i++) {
      const char = str[i];
      if (charCount[char] === 1) {
        return char;
      }
    }
    
    return null;
  }
  
  console.log(firstNonRepeatedCharacter("hello world")); 