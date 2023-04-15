/*Write a program that generates all of the permutations of a given string.
*/
function permute(str) {
   
    if (str.length <= 1) {
      return [str];
    }
    
    let permutations = [];
    
    for (let i = 0; i < str.length; i++) {
      let substring = str.substring(0, i) + str.substring(i + 1);
      let substringPermutations = permute(substring);
      
      for (let j = 0; j < substringPermutations.length; j++) {
        permutations.push(str[i] + substringPermutations[j]);
      }
    }
    
    return permutations;
  }
  
  const str = "abc";
  const result = permute(str);
  console.log(result); 
  