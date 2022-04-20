var twoSum = function(nums, target) {
    let res = [];
    for(var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums [j] == target) {
                res[0] = i;
                res[1] = j;  
            }
        }
    } return res;
};
