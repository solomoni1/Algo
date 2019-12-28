import java.util.Stack;

public class Z18_DFS {
	public static void dfs(int a) {
		
	}
	public static void main(String[] args) {
		int[][] G = {   //그래프에서 연결된 정점들의 간선 정보를 저장
				{},
				{2,3},
				{1,4,5},
				{1,7},
				{2,6},
				{2,6},
				{4,5,7},
				{3,6},
		};
		int[] stack = new int[10];
		int top = -1;// 스택의 인덱스를 관리할 변수
		boolean[] visit = new boolean[8];//0은 안씀
		
		//시작정점 하나를 결정 후 방문, 스택에 넣고, 반복을 시작
		int v = 1;//시작 정점 A를 의미
		System.out.print(v+" ");//방문해서 할 일
		//방문 여부 체크
		visit[v]=true;
		stack[++top] = v;//마지막 갈림길을 확인하기 위해 지나가는 정점들을 저장
		
		//반복, 스택에서 값을 꺼내서 인접한 정점 중 방문 안한 정점을 찾아서 방문
		while(top>-1) {//반복 종료: 스택이 비워지면 종료
			v = stack[top];//마지막 정점을 읽어옴(삭제는 안함)
			int w= -1;//다음 정점, 플래그 변수 역할
			for (int i = 0; i < G[v].length; i++) {//인접한 정점만큼 반복
				if(!visit[G[v][i]]) {
					w = G[v][i];//다음 정점을 저장
					System.out.print(w+" ");
					visit[w]=true;
					stack[++top]=w;
					break;
				}
			}
			if(w==-1) {//인접한 정점중 방문 안한 정점이 없음
				top--;
			}
		}
		
		
	}// end of main
}// end of class
