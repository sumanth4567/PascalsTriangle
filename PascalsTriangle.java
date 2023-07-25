import java .util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> row =new ArrayList<Integer>();
            row.add(1);
            int val=1;
            for(int j=1;j<i;j++){
                val=val*(i-j)/j;
                row.add(val);
            }
            ans.add(row);
        } 
        return ans;      
    }
    public static void main(String args[]){
        PascalsTriangle p=new PascalsTriangle();
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        ArrayList<ArrayList<Integer>> x=p.generate(rows);
        Iterator<ArrayList<Integer>> it = x.iterator();
        while(it.hasNext()){
            Iterator<Integer> itr = it.next().iterator();
            while(itr.hasNext()){
                System.out.print(itr.next());
            }
            System.out.println();
        }
    }
}
