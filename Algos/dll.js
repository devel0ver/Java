class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.next = null;
        this.prev = null;
    }
}

class DLL{
    

    constructor(){
        this.head=null;
        this.tail=null;
    }

    addToBack(valueInput){
        //create a node object with a given value to add to the back of the list eventually 
        let newNode = new Node(valueInput)
        //if the singly linked list is empty (this mean that its head === null), then set the head of the singly linked list to be this new node
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
        this.tail.next = newNode;
        newNode.prev=this.tail;
        this.tail=newNode; 
        }
                        
        return this;
    }
        display(){
            let runner = this.head;
            let result ="Node Contains: ";
            while(runner!=null){
                result += "->"+runner.value;
                runner  = runner.next;
            }
            console.log(result);
        }

        addToFront(valueInput){

            let newNode = new Node(valueInput);
            if(this.head == null){
                this.head = newNode;
                this.tail = newNode;
            }
            else{
                newNode.next=this.head;
                this.head.prev=newNode;
                this.head = newNode;
            }

            return this;

        }

        removeFromBack(){
            if(this.tail==null){
                return
            }
            if(this.head==this.tail){
                this.head=null;
                this.tail=null;
                return;
            }
            else{
                let newBack = this.tail.prev;
                // this.tail=null;
                this.tail=newBack;
                this.tail.next=null;
            }
            

        }

        removeFromFront(){
            if(this.head==null){
                return
            }
            if(this.head==this.tail){
                this.head=null;
                this.tail=null;
                return;
            }
            else{
                let newHead = this.head.next;
                // this.head=null;
                this.head=newHead;
                this.head.prev=null;
            }
            
        }

        reverse(){
            //create a variable that we can use to iterate through the list (runner) and start it at the head 
            let runner = this.head
            //set the head to be where the tail is 
            this.head = this.tail
            //set the tail to point to the runner 
            this.tail = runner
            //While runner is point to the node
            while(runner!= null){
                //create a temp variable pointing to runner.next
                let temp = runner.next
                // set runner.next to equal to runner.prev
                runner.next = runner.prev
                //set runner.prev to equal to temp next
                runner.prev = temp 
                //set runner to equal to the temp next 
                runner = temp
            }
}

mylist = new DLL();

mylist.addToBack(10).addToBack(20).addToBack(30).addToBack(40)
mylist.display()
mylist.reverse()
mylist.display()