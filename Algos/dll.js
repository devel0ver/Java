class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.next = null;
        this.prev = null;
    }
}


class DLL {
    constructor(){
        this.head = null;
        this.tail = null;
    }

    addToBack(valueInput){
        //create a new node with the valueInput
        let newNode = new Node(valueInput)

        //check if the dll is empty 
        if(this.head == null){
            //if the dll list is empty we can set the head and tail to be the same node 
            this.head = newNode
            this.tail = newNode
        }else{
            //point the newNode's previous property to what the tail currently is 
            newNode.prev = this.tail
            //else set the tail.next to equal to newNode
            this.tail.next = newNode
            //update tail to the newNode 
            this.tail = newNode
        }
    }

    addToFront(valueInput){

    }

    removeFromBack(){

    }

    removeFromFront(){
        //create a variable to hold current head 
        let temp = this.head
        //set the head to be the next node 
        this.head = this.head.next
        //set previous head to point to null 
        this.head.prev = null
        //have temp point to null 
        temp.next = null
    }




    display(){
        let result = "";

        //use runner to traverse the SLL
        let runner = this.head;
        while(runner != null){ //while runner is pointing at a node
            result += `${runner.value} -->`
            runner = runner.next //this is how you increment runner to go to the next node
        }

        console.log(result)
    }

        
    }


let dll1 = new DLL();

dll1.addToBack(21)
dll1.addToBack(18)
dll1.addToBack(34)
dll1.removeFromFront()
dll1.display()
