package blockChain;

import java.io.IOException;

import it.unimi.dsi.webgraph.BVGraph;

public class BlockChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BVGraph graph = null;
		
		try {
			graph = BVGraph.load("./bvtime0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("stop");
		int ws = graph.windowSize();
	};
	
}
