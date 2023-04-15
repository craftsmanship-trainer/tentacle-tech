
/*Write a program that sorts by the 
length of the given array of strings.*/

function sortByLength(arr) {
    arr.sort(function(a, b) {
      return a.length - b.length;
    });
    
    return arr;
  }
  
  const arr = ["hi", "hello", "world", "hey"];
  const result = sortByLength(arr);
  console.log(result); 
  