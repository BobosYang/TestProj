package com.yqb.basic.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    //自定义比较类，先比较长，长升序排列，若长相等再比较宽，宽降序
    static Comparator<Node> cNode=new Comparator<Node>() {
        public int compare(Node o1, Node o2) {
            if(o1.chang!=o2.chang)
                return o1.chang-o2.chang;
            else
                return o2.kuan-o1.kuan;
        }
    };
    
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		
		Queue<Node> q = new PriorityQueue<>(cNode);
		Node n1 = new Node(1, 2);
		Node n2 = new Node(2, 5);
		Node n3 = new Node(2, 3);
		Node n4 = new Node(1, 2);
		q.add(n1);
		q.add(n2);
		q.add(n3);
		q.add(n4);
		Node n;
		while(!q.isEmpty()){
			n = q.poll();
			System.out.println("长: " + n.chang + " 宽：" + n.kuan);
		}
		/**
	　　 输出结果
	　　 长: 1 宽：2
	　　 长: 2 宽：5
	　　 长: 2 宽：3
		 */
	}
}

class Node{
    public Node(int chang,int kuan)
    {
        this.chang=chang;
        this.kuan=kuan;
    }
    int chang;
    int kuan;
}
