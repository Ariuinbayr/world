import dataStructures. ArrayLinearList ;

public class MyArrayLinearList extends ArrayLinearList {

public 	MyArrayLinearList(int initialCapacity) {
	super(initialCapacity);
}

public 	MyArrayLinearList() {
	super(10);
}

//
public 	MyArrayLinearList(MyArrayLinearList mylist) {
	super(mylist.size());
	for(int i = 0; i < mylist.size(); i++)
		this.add(i, mylist.element[i]);
}

public 	MyArrayLinearList reverse() {
        MyArrayLinearList temp = new MyArrayLinearList(this.size());
        int j = 0;
        for(int i = this.size() - 1; i >= 0; i--)
        	temp.add(j++, this.element[i]);
        return temp;
}

public int Max()
{

	int m = (int)this.get(0);
	for(int i=0;i<this.size();i++)
		if(m < (int)this.get(i))
			m = (int)this.get(i);
	return m;
	
}
}
