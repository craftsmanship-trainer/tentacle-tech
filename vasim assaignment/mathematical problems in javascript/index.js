// 1)basic arithemetic operators?
// let m = 3;
// let n = 4;
// let ans = ((n * m) / 2) % 7;
// console.log(ans);

// 4)prime number
// function isPrime(num) {
//   if (num <= 1) return false;
//   for (let i = 2; i < num; i++) {
//     if (num % i === 0) {
//       return false;
//     }
//   }
//   return true;
// }
// console.log(isPrime(27));

// 9)armstrong Number
// let number;
// number = prompt("Enter a number !");
// let n = number.length;
// let sum = 0;
// let i = 0;
// while (i < n) {
//   let digit = number[i];
//   sum = sum + Math.pow(digit, n);
//   i++;
// }
// if (sum == number) {
//   console.log(number, "is an Armstrong Number");
// } else {
//   console.log(number, "is not an Armstrong Number");
// }
// 1c)to check odd or even
// const number = prompt("enter the number");

// if (number % 2 === 0) {
//   console.log(number + " is even number true");
// } else {
//   console.log(number + " is odd number treu");
// }

// let satish = 2;
// let ans = satish.map((nums) => nums % 2 === 0);
// console.log(ans);

// 3)to check perfect number
// function isPerfectNumber(num) {
//   let sum = 0;
//   for (let i = 1; i < num; i++) {
//     if (num % i === 0) {
//       sum = sum + i;
//     }
//   }
//   return sum === num;
// }
// console.log(isPerfectNumber(6));
// console.log(isPerfectNumber(5));
