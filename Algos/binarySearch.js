let x = [2,4,5,7,8,12,22,24,27,45,55,56,58,66,67,68,90,100];


//create  a function that accepts an array and a value to search for. It will return true if value is found in input array. False if it isnt. Use binary search strategy
function binarySearch(arr, value){
    var start = 0;
    var end = arr.length - 1;
    
    while(start < end){
        var middle = Math.floor((start+end)/2);
        if(value == arr[middle]){
            console.log("start: " + start + " middle: " + middle + " end: " + end)
            return true;
        }else if(value > arr[middle]){
            start = middle + 1;
        }else{
            end = middle - 1;
        }
    }
    return false
    //pick a point in the middle of array and compare the value to find with the value in middle
    //if the value to find is greater than the value in middle, we know to look to the right of the middle point
    //repeat this process until the value is found or until the array has been fully looked through

}


console.log(binarySearch(x, 68)); //true
console.log(binarySearch(x, 51)); //false