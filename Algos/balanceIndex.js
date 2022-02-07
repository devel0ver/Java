// Here, a balance point is on an index, not between indices.
// Return the balance index where sums are equal on either side (exclude its own value). Return -1 if none exist. Ex.: [-2,5,7,0,3] → 2 , but [9,9] → -1



//[-2,5,7,0,3] --> 2


function balanceIndex(arr){
    var num = 0;
    for (var i = 0; i < arr.length; i++){
        num += arr[i];
    }
    console.log(num);
    for (var j=0; j < arr.length[i]; j++){
        
    }
}


console.log(balanceIndex([1,2,4,9,20])) //-1 (means that there is no index where a balance occurs)
console.log(balanceIndex([4,1,2,4,9,-20,18])) //3 (means that there is a balance at index 3 occurs)
console.log(balanceIndex([-2,5,7,0,3])) // 2