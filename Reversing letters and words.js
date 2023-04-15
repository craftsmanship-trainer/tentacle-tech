/*Write a program that reverses the letters of each word and 
a program that reverses the letters of each word and the words themselves.*/
function reverseWords(str) {
    const words = str.split(" ");
    const reversedWords = words.map((word) => {
      const letters = word.split(""); 
      return letters.reverse().join("");
    });
    
   
    return reversedWords.join(" ");
  }
  
 
  console.log(reverseWords("hello world")); 