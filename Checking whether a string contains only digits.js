/*Write a program that checks whether the given string contains only digits.
*/


function containsOnlyDigits(str) {
    
    for (let i = 0; i < str.length; i++) {
      if (isNaN(parseInt(str[i]))) {
        return false;
      }
    }
    
    return true;
  }
  
 
  console.log(containsOnlyDigits("12345")); 
  console.log(containsOnlyDigits("abc123")); 
  