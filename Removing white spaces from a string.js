/*Write a program that removes
 all white spaces from the given string.*/

 function removeSpaces(str) {
    return str.replace(/\s/g, "");
  }
  
  const str = " Hello World ";
  const result = removeSpaces(str);
  console.log(result); 
  
