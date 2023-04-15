/* Write a program that counts 
the occurrences of a certain character in a given string.*/

function countOccurrences(str, char) {
    let count = 0;
    
    for (let i = 0; i < str.length; i++) {
      if (str[i] === char) {
        count++;
      }
    }
    
    return count;
  }
  
  const str = "Hello World";
  const char = "l";
  const count = countOccurrences(str, char);
  console.log(count); 
  
