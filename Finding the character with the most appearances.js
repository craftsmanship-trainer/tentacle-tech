/*Write a program that finds the character 
with the most appearances in the given string.*/

function findMostFrequentChar(str) {
    let charMap = {};
    let maxChar = "";
    let maxCount = 0;
    
    for (let i = 0; i < str.length; i++) {
      let char = str[i];
      
      if (charMap[char]) {
        charMap[char]++;
      } else {
        charMap[char] = 1;
      }
      
      if (charMap[char] > maxCount) {
        maxCount = charMap[char];
        maxChar = char;
      }
    }
    
    return maxChar;
  }
  
  const str = "Hello, world!";
  const result = findMostFrequentChar(str);
  console.log(result); 
  
