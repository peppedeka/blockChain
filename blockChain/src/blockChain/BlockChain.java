package blockChain;

import java.io.IOException;

import it.unimi.dsi.webgraph.BVGraph;

public class BlockChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BVGraph graph;
		
		try {
			graph = BVGraph.load("./blockChain/bvtime0.graph");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
