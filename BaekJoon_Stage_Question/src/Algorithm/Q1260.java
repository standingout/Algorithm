package Algorithm;

import java.util.Scanner;

public class Q1260 {
	static final int MAX_VERTEX = 1001;
	
	static int edge_num;									// ������ ���� edge
	static int vertex;										// ���� vertex
	static int map[][] = new int[MAX_VERTEX][MAX_VERTEX];	// �������� �̷���������� ��Ÿ���� ������� map
	static int []visit1 = new int[MAX_VERTEX];				// �湮������ ��Ÿ���� �迭 visit 
	static int []visit2 = new int[MAX_VERTEX];				// �湮������ ��Ÿ���� �迭 visit 
	static int start;										// ������ ������ ��ȣ
	static int []queue = new int [MAX_VERTEX];
	static int front,rear;
	
	static void DepthFirstSearch(int value)
	{
		System.out.printf("%d ",value);
		visit1[value] = 1;
		for(int i=1; i<=vertex; i++)
		{
			if(map[value][i]== 1 && visit1[i]==0)
			{
				DepthFirstSearch(i);
			}
		}
	}
	
	static void BreadthFirstSearch(int value)
	{
		visit2[value] = 1;
		System.out.printf(value + " ");
		queue[rear++] = value;
		
		while(front<rear)
		{
			value = queue[front++];
			for(int i=1; i<=vertex; i++)
			{
				if(map[value][i]==1 && visit2[i]==0)
				{
					visit2[i] = 1;
					System.out.printf("%d ",i);
					queue[rear++] = i;
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		vertex = kb.nextInt(); 				// ������ ����
		edge_num = kb.nextInt();				// ������ ����
		start = kb.nextInt();
		
		for(int i=0; i<edge_num; i++)
		{
			int v1=kb.nextInt();
			int v2=kb.nextInt();
			map[v1][v2] = map[v2][v1] = 1;
		}
		
		DepthFirstSearch(start);
		System.out.println();
		BreadthFirstSearch(start);
		
		
		kb.close();

	}

}
