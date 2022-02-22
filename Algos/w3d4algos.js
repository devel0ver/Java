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
        let nToAdd = new Node(valueInput);

        if(this.root==null){
            this.root=nToAdd;
            return this;
        }
        else{

            let searchToken = this.root;

            while(searchToken !=null){

                if(searchToken.value>nToAdd.value){
                    if(searchToken.left==null){
                        searchToken.left=nToAdd;
                        return this ;
                    }
                    else{
                        searchToken = searchToken.left;
                    }
                }
                else if ( searchToken.value<nToAdd.value){
                    if(searchToken.right ==null){
                        searchToken.right=nToAdd;
                        return this;
                    }
                    else{
                        searchToken=searchToken.right;
                    }
                }else if(searchToken.value == nToAdd.value ){
                    if(searchToken.left==null){
                        searchToken.left=nToAdd;
                        return this;
                    }
                    else{
                        searchToken = searchToken.left;
                    }
                }
            }
        }
    }


}


let bst1 = new BST()

bst1.insert(5)

console.log(bst1)