/* Write a program that removes the given character from the given string.
*/
function removeChar(str, char) {
    let result = "";
    
    for (let i = 0; i < str.length; i++) {
      let currentChar = str[i];
      
      if (currentChar !== char) {
        result += currentChar;
      }
    }
    
    return result;
  }
  
  const str = "Hello, world!";
  const char = "l";
  const result = removeChar(str, char);
  console.log(result);
  