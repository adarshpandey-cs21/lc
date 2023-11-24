//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        Pair[] arr=new Pair[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=new Pair(start[i],end[i]);
        }
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair o,Pair s){
                return o.ei-s.ei;
            }
        });
        int count=1;
        int ei=arr[0].ei;
        for (int i = 1; i <n ; i++) {
                 if(ei<arr[i].si){
                     count++;
                     ei=arr[i].ei;
                 }
        }
        return count;
    }
    static class Pair{
        int si;
        int ei;
        public Pair(int si, int ei){
            this.si=si;
            this.ei=ei;
        }
    }
}

