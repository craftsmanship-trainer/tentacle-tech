/*Write a program that joins the given
 strings by the given delimiter.*/

 function joinStrings(arr, delimiter) {
    return arr.join(delimiter);
  }
  
 
  const strings = ["apple", "banana", "cherry"];
  const delimiter = ", ";
  const result = joinStrings(strings, delimiter);
  console.log(result); 
  
