// Matrix Search
// Jenny digs image and wants to make a JavaScript imaging library like PIL for python. She is given 2 different two-dimensional arrays, containing integers between 0 and 65535. Each two dimensional array represents a grey-scale image, where each integer value is a pixel. The second image might be somewhere inside the larger one. Return whether it is.
// Given Array: [ [12, 34, 45, 56],    And Array: [ [67, 78],      return: true
//                [98, 87, 76, 65],                 [43, 32] ];   
//                [56, 67, 78, 89],
//                [54, 43, 32, 21] ];


let x = [
    [12, 34, 45, 56],
    [98, 87, 76, 65],
    [56, 67, 78, 89],
    [54, 43, 32, 21]
]

let y = [
    [67, 78],
    [43, 32]
]


let z = [
    [67, 77],
    [43, 32]
]


function matrixSearch(bigArr, smallArr){
    var start = smallArr[0][0];
    var found = false;
    for(var x = 0; x<bigArr.length; x++){
        for(var i=0; i<bigArr[x].length; i++){
            // console.log(bigArr[x][i])
            if (bigArr[x][i] == start){ //when the start (67) is found in big array.  x and i represent the coordinates of the start value found in the big array
                found = true;
                for (var j=0; j<smallArr.length; j++){
                    for(var z=0; z<smallArr[j].length; z++){
                        // console.log("small array value: ", smallArr[j][z]);
                        // console.log("big array corresponding values ", bigArr[x+j][i+z])
                        //if smallarray at it corresponding indeces does not equal the big array at it's corresponding indices, then set exists to be false
                        if(smallArr[j][z] != bigArr[x+j][i+z]){
                            found = false;
                        }
                    }
                }
            }
        }
    }
    return found;
}

// console.log(matrixSearch(x,y)) //true
console.log(matrixSearch(x,z)) //false