/*Write a program that counts the number of vowels and 
consonants in a given string. Do this for the English 
language, which has five vowels (a, e, i, o, and u).*/

function countVowelsAndConsonants(str) {
    let vowelCount = 0;
    let consonantCount = 0;
    
    for (let i = 0; i < str.length; i++) {
      const char = str[i].toLowerCase();
      if (/[aeiou]/.test(char)) {
        vowelCount++;
      } else if (/[a-z]/.test(char)) {
        consonantCount++;
      }
    }
    
    return { vowels: vowelCount, consonants: consonantCount };
  }
  
  
  const result = countVowelsAndConsonants("Hello World");
  console.log(result); 
  