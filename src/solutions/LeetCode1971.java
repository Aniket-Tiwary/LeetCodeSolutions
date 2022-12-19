package solutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1971 {


    public static boolean findPath(int source, int dest,HashMap<Integer,HashSet<Integer>> nodeBranches,HashSet<Integer> visited){
        if(source == dest)
            return true;
        HashSet<Integer> nodesToVisit = nodeBranches.get(source);
        if(nodesToVisit.contains(dest)){
            return true;
        }
        for(int node:nodesToVisit){
            if(!visited.contains(node)){
                visited.add(node);
                boolean res = findPath(node,dest,nodeBranches,visited);
                if(res)
                    return res;
            }
        }
        return false;
    }

    public static void addBranch(int vertex,int branch,HashMap<Integer,HashSet<Integer>> nodeBranches){
        HashSet<Integer> branches = null;
        if(nodeBranches.containsKey(vertex)){
            branches = nodeBranches.get(vertex);
        }else{
            branches = new HashSet<>();
        }
        branches.add(branch);
        nodeBranches.put(vertex,branches);
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;
        HashMap<Integer,HashSet<Integer>> nodeBranches = new HashMap<>();
        for(int[] edge:edges){
            addBranch(edge[0],edge[1],nodeBranches);
            addBranch(edge[1],edge[0],nodeBranches);
        }
        HashSet<Integer> visited = new HashSet<>();
        return findPath(source,destination,nodeBranches,visited);
    }

    public static void main(String args[]){
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        System.out.println("Is there is a path between 0 and 4 : " + validPath(6,edges,0,4));
    }
}
