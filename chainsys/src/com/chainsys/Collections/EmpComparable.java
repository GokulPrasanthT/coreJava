package com.chainsys.Collections;
public class EmpComparable implements Comparable<EmpComparable>{
    private final int id;
    public String Name;
    public EmpComparable (int v1) {
        this.id = 0;}
    public int getID() {
    return id;
    }
    public boolean equals (Object obj)
    {
        return false;
        }
    public int hashCode () {
        return id;}
    @Override
    public int compareTo (EmpComparable other)
    {
    int result=0;
    result=Integer.compare (this.getID(), other.getID());
    return result;

}
}
