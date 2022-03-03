class Node{
    constructor(valueInput){
        this.value = valueInput;
        this.left = null;
        this.right = null;
    }
}


class BST{
    constructor(){
        this.root = null;
    }


    insert(valueInput){
        //create a node with thee value input and insert it into the tree using the rules of a bst
        let newNode = new Node(valueInput)
        //if the root is null we want to insert a new node and make it the valueInput.
        if(this.root == null){
            //make root equal to new node
            this.root = newNode
            return this
        }
        //else if the root is not null we want to see if valueInput is greater than or less than the value of the root
        //create a variable to iternate through the tree called current and set it equal to the root 
            //while current is pointing to node, traverse (go from one node to another) through the tree. 
                //if the valueInput is greater than the value of the current node
                    //if the current.right=null then set current.right to equal to newNode
                    //else set current to equal to current.right 
                // if the valuueInput is less than the value of current node 
                    //if the current.left=null then set current.left to equal to newNode
                    ////else set current to equal to current.left
        else {
            let current = this.root
            while(current != null){
                if(valueInput > current.value){
                    if(current.right == null){
                        current.right = newNode
                        return this
                    }else{
                        current = current.right
                    }
                }
                else{
                    if(current.left == null){
                        current.left = newNode
                        return this
                    }else{
                        current = current.left
                    }
                }
            }
        }
        return this
    }

    findMin(){
        //create a variable called current node and start it at the root
        let currentNode = this.root 
        //move current until current.left is null 
        //while current.left is not null move current to the left node
        while(currentNode.left != null){
            currentNode = currentNode.left
        }
        //after the while loop is done, current will be at the node containing the minimum value, then return current.value
        return currentNode.value

    }

    findMax(){
        //create a variable called current node and start it at the root
        let currentNode = this.root
        //move current until current.right is null
        //while current.right is not null move current to the right node 
        while(currentNode.right != null){
            currentNode = currentNode.right
        }
        //after the while loop is done, current will be at the node containing the maximum value, then currentNode.value
        return currentNode.value
    }

    contains(valToFind){
        //your code here
        let currentNode = this.root
        //while current is pointing to a node
        while(currentNode != null){
            // check if the current.value is equal to valToFind return true 
            //else if the valToFind is greater than the current value, then set current to equal to current.right
            //else if the valToFind is less than the current value, then set current to equal to current.left
            if(currentNode.value == valToFind){
                return true
            }
            else if (valToFind > currentNode.value){
                currentNode = currentNode.right
            }
            else {
                currentNode = currentNode.left
            }
        }
        //if while loop finishes and we have not found true then return false 
        return false;
    }

    totalSize(node = this.root){
        //base case- simple case for the problem
        //if node is equal to nuill, then it will return zero
        if(node == null){
            return 0;
        }else {
            //if the node is not empty then we need to recursively go from node to node
            console.log("this is the current node -->", node.value)
            // this.totalSize(node.left)
            // this.totalSize(node.right)
            // console.log(1+ this.totalSize(node.left) + this.totalSize(node.right))
            return 1+ this.totalSize(node.left) + this.totalSize(node.right);
        }
    }

    isFull(node = this.root){ //return true if the tree is full (every node either has 0 children or 2 children). Return false if tree is not full (at least one node in the tree has only one child)
        console.log("1")

        let flagleft;
        let flagright;

        if(node.right != null && node.left != null){ //if it has 2 children
            // console.log("2")
            // flagleft=this.isFull(node.left)
            // console.log("3")
            // flagright = this.isFull(node.right)
            //if flagleft and flagright are true, then return true, otherwise return false
            // if(flagleft && flagright){
        //     return true
        // }else{
            //     return false
            // }
            return this.isFull(node.left) && this.isFull(node.right)
        }else if(node.left == null && node.right == null){
            return true;
        }else{
            return false;
        }

    }
}

let bst1 = new BST()


bst1.insert(5).insert(3).insert(12).insert(10).insert(1).insert(4).insert(7).insert(14).insert(2)

// console.log(bst1)

// bst1.findMax();
// bst1.findMin();

// console.log(bst1)


bst1.contains(14) //true
bst1.contains(88) //false

// console.log(bst1.totalSize())

console.log(bst1.isFull());