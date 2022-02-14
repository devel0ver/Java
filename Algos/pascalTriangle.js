function generate(numRows) {
    //     To build out this triangle, we need to take note of a few things.
        // Each row starts and ends with a 1.
        
        // Inside each row, between the 1s, each digit is the sum of the two digits immediately above it.
        // We can use this pattern to build new rows starting with row 3. But we can’t use it to build the first or second rows.
        // Each row is represented as an array; we need to output the entire triangle as an array of these rows (ie an array of arrays).

        let triangle = [[1],[1,1]];
        for(let j = 3; j<=numRows; j++){
            let prevRow = triangle[triangle.length-1];
            let newRow = [1];
            for (let i=0; i<prevRow.length-1; i++){
                // console.log(prevRow[i])
                let currentval = prevRow[i]
                let nextVal = prevRow[i+1]
                let sum = currentval + nextVal;
                newRow.push(sum)
            }
            newRow.push(1);
            //after new row is generated, insert into triangle
            triangle.push(newRow)
            // console.log("new row is this--->", newRow)
        }
        console.log(triangle)
    };
    
    
    generate(5) //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]