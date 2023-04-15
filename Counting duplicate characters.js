/*
Write a program that counts duplicate characters from a given string.
*/
function duplicateCharCount(str) {
		
	if(str) {
		var obj = {};
		for(let i = 0; i < str.length; i++) {
			if(obj[str[i]]){
				obj[str[i]] += obj[str[i]];
			}else {
				obj[str[i]] = 1;
			}
		}
		console.log(obj);
	}
			
}

  
duplicateCharCount("yjtjutr");
