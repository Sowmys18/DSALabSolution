package com.greatLearning;
import java.util.*;




public class BSTcreate {
	static class Node {
		int nodeData;
		Node leftNode, rightNode;
		};
		// creation of new node
		static Node NewNode(int nodeData) 
		{
			Node temp = new Node();
			temp.nodeData = nodeData;
			temp.leftNode = null;
			temp.rightNode = null;
			return temp;
			}
		//insert values in node
		public Node insert(Node root, int key) 
		{
			if(root == null)
				return NewNode(key);
			if(key < root.nodeData)
				root.leftNode = insert(root.leftNode, key);
			else
				root.rightNode = insert(root.rightNode, key);
			return root;
		}
		//finding pairs 
		public boolean findpairUtil(Node root, int sum, HashSet<Integer> set)
		{
			if(root == null)
				return false;
			if(findpairUtil(root.leftNode,sum,set))
				return true;

			if (set.contains(sum - root.nodeData)) {
				System.out.println("Pair is found ("
						+ (sum - root.nodeData) + ", "
						+ root.nodeData + ")");
				return true;
//				set.add(root.nodeData);
			}
			else
				set.add(root.nodeData);

			return findpairUtil(root.rightNode, sum, set);
		}
		//finding pair with sum given
		public void findPairWithGivenSum(Node root, int sum) {
			HashSet<Integer> set = new HashSet<Integer>();
			if (!findpairUtil(root,sum,set))
				System.out.print("Pairs do not exit"
						+ "\n");
		}
		//main
		public static void main(String[] args) {
		  Node root = null;
		  BSTcreate findSP = new BSTcreate();
		  root = findSP.insert(root,40);
		  root = findSP.insert(root,20);
		  root = findSP.insert(root,60);
		  root = findSP.insert(root,10);
		  root = findSP.insert(root,30);
		  root = findSP.insert(root,50);
		  root = findSP.insert(root,70);
		  
		  int sum = 60;
		  findSP.findPairWithGivenSum(root,sum);
		}
		
		
		}


