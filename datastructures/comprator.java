
package datastructures;
import java.util.*;
public class comprator {
    static class activity
    {
        int start,end;
        public activity(int s, int e)
        {
            this.start=s;
            this.end=e;
        }

        @Override
        public String toString() {
            return "Start Time:  "+start+"--->"+"End Time:  "+end; //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    static class SortByEnd implements Comparator<activity>
    {

        @Override
        public int compare(activity o1, activity o2) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o1.end-o2.end;
        }
        
    }
    public static void main(String[] args) {
        activity[] a = new activity[5];
        a[0] = new activity(10, 12);
        a[1] = new activity(5, 9);
        a[2] = new activity(2, 6);
        a[3] = new activity(6 ,7);
        a[4] = new activity(1, 11);
        for(activity e: a)
            System.out.println(e);
        //comprator c = new comprator();
        
        Arrays.sort(a,new SortByEnd());
        for(activity e: a)
            System.out.println(e);
        
    }
            
}
