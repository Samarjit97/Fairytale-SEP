package model;

import java.io.Serializable;
import java.util.ArrayList;

public class BorrowerList implements Serializable {
    private ArrayList<Borrower> borrowerList;

public BorrowerList(){
borrowerList=new ArrayList<>();
}

public int size(){
return borrowerList.size();
}

public void addBorrower(Borrower borrower){
borrowerList.add( borrower);

}

public Borrower getIndex(int index){
if (index< borrowerList.size()){
return  borrowerList.get(index);
}
else{
    return null;
}

}
public void removeBorrower(Borrower borrower){
ArrayList<Borrower> remove=new ArrayList<>();
for (int i=0; i< borrowerList.size(); i++){


}

}

}
