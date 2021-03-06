package mljoin;

import java.util.ArrayList;

public class GMMOutput2 implements Output2 {
	private static final long serialVersionUID = -6887772726150300326L;

	private ArrayList<GMMDelta2> tuples;
	
	public GMMOutput2() {
		tuples = new ArrayList<>();
	}
	
	public void addTuple(GMMDelta2 tuple) {
		tuples.add(tuple);
	}
	
	public ArrayList<GMMDelta2> getTuples() {
		return tuples;
	}
	
	public String toString() {
		String res = "";
		for (GMMDelta2 tuple : tuples) {
			double[] data = tuple.getData();
			for (int i = 0; i < data.length; i++) {
				if (i == 0)
					res += "[" + data[i];
				else
					res += ", " + data[i];
			}
			res += "]\n";
		}
		return res;
	}
	
}
