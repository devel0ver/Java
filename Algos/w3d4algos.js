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
}


let bst1 = new BST()

bst1.insert(5).insert(3).insert(12).insert(10).insert(1).insert(4).insert(7).insert(14).insert(2)

console.log(bst1)
console.log(bst1.findMax())