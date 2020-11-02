package pl.edu.uwm.po.lab05;

public class IntegerSet {
    private boolean[] array;
    public IntegerSet() {
        this.array = new boolean[100];
    }
    public static IntegerSet union(IntegerSet a,IntegerSet b) {
        IntegerSet temp = new IntegerSet();
        for(int i=0;i<100;i++) {
            if(a.array[i] || b.array[i]) {
                temp.array[i]=true;
            }
        }
        return temp;
    }
    public static IntegerSet intersection(IntegerSet a,IntegerSet b) {
        IntegerSet temp = new IntegerSet();
        for(int i=0;i<100;i++) {
            if(a.array[i] && b.array[i]) {
                temp.array[i]=true;
            }
        }
        return temp;
    }
    public void insertElement(int n) {
        this.array[n-1]=true;
    }
    public void deleteElement(int n) {
        this.array[n-1]=false;
    }
    public String toString(){
        StringBuilder elementy = new StringBuilder();
        for(int i=0;i<100;i++){
            if(this.array[i]){
                elementy.append(i+1);
                elementy.append(" ");
            }
        }
        return elementy.toString();
    }
    public boolean equals(IntegerSet temp) {
        return this.toString().equals(temp.toString());
    }
}
