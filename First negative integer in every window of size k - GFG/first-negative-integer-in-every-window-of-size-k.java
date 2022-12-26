//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int k)
    {
        long[] ans = new long[N-k+1];
        Arrays.fill(ans,-1);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            if(A[i]<0)
            q.add(i);
        }
        int i=0;
        int j=k-1;
        if(!q.isEmpty())
        ans[0] = A[q.peek()];
        else
        ans[0] = 0;
        int K = 1;
        while(K<(N-k+1))
        {
            if(!q.isEmpty() && i==q.peek())
                q.remove();
            i++;j++;
            if(A[j]<0)
                q.add(j);
            if(!q.isEmpty())
            ans[K++] = A[q.peek()];
            else
            ans[K++] = 0;
        }
        return ans;
    }
}