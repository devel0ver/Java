//given an array, remove duplicate values from it. Do it in place (do not create a new array to do this with). If you're having difficulty, its okay to try an baby step it first by using a new array and making it work that way.


function removeDupes(arr){
    //you can use an object to keep track of values (hint)
    let object = {};
    for (var i=0; i<arr.length; i++){
        console.log(arr[i]);
        //each iteration of the loop, check IF the object contains a key that is === to the current value in this current iteration
        if(object[arr[i]]){ //if the object has a key of arr[i]
            //i represents the index where the duplicate occurs. So we want to remove a value at index i from the array
            arr.splice(i, 1);   // i represents the index number
            i-- // fixes the bug where the dupes are back to back
        }else{  //the object doest not have a key of arr[i]
            //save that value into an object as a key 
            object[arr[i]] = true
        }
    }
    console.log(object)
    console.log(arr)
}

console.log(removeDupes([3,6,7,3,2,7,7,9,0,1])) //output-> [3,6,7,2,9,0,1]