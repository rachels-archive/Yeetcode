var isPalindrome = function(x) {
   if (x < 0) {
       return false;
   } else {
       let reversed = 0;
       let temp = x;
       while(temp != 0) {
           let rem = temp % 10;
           reversed = (reversed * 10) + rem;
           temp = Math.floor(temp / 10);
       } return (x == reversed)
   }  
};
