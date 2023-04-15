/*Write a program that removes the duplicate characters from the given string.
*/
function removeDuplicates(str) {
    let result = "";
    let seen = {};
    
    for (let i = 0; i < str.length; i++) {
      let char = str[i];
            if (!seen[char]) {
        result += char;
        seen[char] = true;
      }
    }
    
    return result;
  }
  
  const str = "Hello, world!";
  const result = removeDuplicates(str);
  console.log(result); 
  